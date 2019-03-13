package ru.surfstudio.android.easyadapter_sample.ui.screen.pagination

import ru.surfstudio.android.easyadapter.pagination.PaginationState
import ru.surfstudio.android.easyadapter_sample.domain.Element
import ru.surfstudio.android.easyadapter_sample.domain.datalist.DataList
import ru.surfstudio.android.easyadapter_sample.ui.common.stub.Stub
import ru.surfstudio.android.easyadapter_sample.ui.common.stub.generateStubs

data class PaginationScreenModel(
    var loadState: LoadState = LoadState.NONE,
    var paginationState: PaginationState = PaginationState.COMPLETE,
    var elements: DataList<Element> = DataList.empty<Element>(),
    val stubs: List<Stub> = generateStubs(10)
) {
    fun setNormalPaginationState() {
        paginationState = if (elements.canGetMore())
            PaginationState.READY else
            PaginationState.COMPLETE

    }

    fun setErrorPaginationState() {
        paginationState = if (elements.isEmpty())
            PaginationState.COMPLETE else
            PaginationState.ERROR
    }

    fun setNormalLoadState() {
        loadState = if (elements.isEmpty())
            LoadState.EMPTY else
            LoadState.NONE
    }

    fun setErrorLoadState() {
        loadState = if (elements.isEmpty())
            LoadState.ERROR else
            LoadState.NONE
    }

    fun hasData(): Boolean {
        return elements.isNotEmpty()
    }
}

enum class LoadState {
    LOADING,
    ERROR,
    EMPTY,
    NONE
}
