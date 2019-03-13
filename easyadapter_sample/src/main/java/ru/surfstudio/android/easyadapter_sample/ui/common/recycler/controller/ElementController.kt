package ru.surfstudio.android.easyadapter_sample.ui.common.recycler.controller

import android.view.ViewGroup
import android.widget.TextView
import ru.surfstudio.android.easyadapter.controller.BindableItemController
import ru.surfstudio.android.easyadapter.holder.BindableViewHolder
import ru.surfstudio.android.easyadapter_sample.R
import ru.surfstudio.android.easyadapter_sample.domain.Element
import ru.surfstudio.android.easyadapter_sample.ui.common.widget.ElementCoverView


class ElementController(
    val onClickListener: (element: Element) -> Unit
) : BindableItemController<Element, ElementController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    override fun getItemId(data: Element): String = data.id

    inner class Holder(parent: ViewGroup) : BindableViewHolder<Element>(parent, R.layout.element_item_layout) {
        private lateinit var data: Element
        private val nameTv: TextView
        private val coverView: ElementCoverView

        init {
            itemView.setOnClickListener { onClickListener.invoke(data) }
            nameTv = itemView.findViewById(R.id.name_tv)
            coverView = itemView.findViewById(R.id.cover_view)
        }

        override fun bind(data: Element) {
            this.data = data
            nameTv.text = data.name
            coverView.render(data.id)
        }
    }
}