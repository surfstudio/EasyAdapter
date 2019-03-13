package ru.surfstudio.android.easyadapter_sample.ui.screen.pagination

import com.agna.ferro.mvp.component.ScreenComponent
import com.agna.ferro.mvp.component.scope.PerScreen
import dagger.Component


@PerScreen
@Component
interface PaginationComponent: ScreenComponent<PaginationActivityView> {
    override fun inject(paginationActivityView: PaginationActivityView)
}
