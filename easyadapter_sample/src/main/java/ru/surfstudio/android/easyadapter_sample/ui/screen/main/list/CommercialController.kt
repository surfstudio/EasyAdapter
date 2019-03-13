package ru.surfstudio.android.easyadapter_sample.ui.screen.main.list

import android.view.ViewGroup
import ru.surfstudio.android.easyadapter.controller.NoDataItemController
import ru.surfstudio.android.easyadapter.holder.BaseViewHolder
import ru.surfstudio.android.easyadapter_sample.R

class CommercialController(
        val onClickListener: () -> Unit
) : NoDataItemController<CommercialController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    inner class Holder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.commercial_item_layout) {
        init {
            itemView.setOnClickListener { onClickListener.invoke() }
        }
    }
}