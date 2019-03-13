package ru.surfstudio.android.easyadapter_sample.ui.common.recycler.controller

import android.view.View
import android.view.ViewGroup
import ru.surfstudio.android.easyadapter.controller.NoDataItemController
import ru.surfstudio.android.easyadapter.holder.BaseViewHolder
import ru.surfstudio.android.easyadapter_sample.R

//todo merge with EmptyStateController
class ErrorStateController(
        val onReloadClickListener: () -> Unit
) : NoDataItemController<ErrorStateController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    inner class Holder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.error_state_item_layout) {
        init {
            itemView.findViewById<View>(R.id.retry_btn).setOnClickListener { onReloadClickListener.invoke() }
        }
    }
}