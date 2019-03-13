package ru.surfstudio.android.easyadapter_sample.ui.screen.main.list

import android.view.ViewGroup
import ru.surfstudio.android.easyadapter.controller.NoDataItemController
import ru.surfstudio.android.easyadapter.holder.BaseViewHolder
import ru.surfstudio.android.easyadapter_sample.R

class DeliveryController(
        val onClickListener: () -> Unit
) : NoDataItemController<DeliveryController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    inner class Holder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.delivery_item_layout) {
        init {
            itemView.setOnClickListener { onClickListener.invoke() }
        }
    }
}