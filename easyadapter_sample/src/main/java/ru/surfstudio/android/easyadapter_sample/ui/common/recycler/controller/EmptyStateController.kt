package ru.surfstudio.android.easyadapter_sample.ui.common.recycler.controller

import android.view.ViewGroup
import ru.surfstudio.android.easyadapter.controller.NoDataItemController
import ru.surfstudio.android.easyadapter.holder.BaseViewHolder
import ru.surfstudio.android.easyadapter_sample.R

class EmptyStateController : NoDataItemController<EmptyStateController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    inner class Holder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.empty_state_item_layout)
}