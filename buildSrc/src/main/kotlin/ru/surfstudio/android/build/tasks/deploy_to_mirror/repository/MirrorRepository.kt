package ru.surfstudio.android.build.tasks.deploy_to_mirror.repository

import org.eclipse.jgit.revwalk.RevCommit
import ru.surfstudio.android.build.exceptions.deploy_to_mirror.MirrorCommitNotFoundByStandardHashException
import ru.surfstudio.android.build.utils.*
import java.io.File

/**
 * Work with local mirror git repository
 */
class MirrorRepository(dirPath: String) : BaseGitRepository() {

    fun commit(commit: RevCommit): String? {
        val resultCommit = git.commit()
                .setAuthor(commit.authorIdent)
                .setMessage("${commit.shortMessage} $STANDARD_COMMIT_HASH_PREFIX${commit.shortHash}$STANDARD_COMMIT_HASH_POSTFIX")
                .call()
        return resultCommit.name
    }

    override val repositoryPath = File(dirPath)
    override val repositoryName = "Mirror"

    private val userName: String = System.getenv("surf_maven_username") ?: EMPTY_STRING
    private val password: String = System.getenv("surf_maven_password") ?: EMPTY_STRING

    fun getCommitByStandardHash(standardHash: String): RevCommit = git.log()
            .all()
            .call()
            .find { it.mirrorStandardHash == standardHash }
            ?: throw MirrorCommitNotFoundByStandardHashException(standardHash)

}