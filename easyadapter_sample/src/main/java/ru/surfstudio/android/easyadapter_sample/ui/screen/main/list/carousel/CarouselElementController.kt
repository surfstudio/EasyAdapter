package ru.surfstudio.android.easyadapter_sample.ui.screen.main.list.carousel

import android.view.ViewGroup
import ru.surfstudio.android.easyadapter.controller.BindableItemController
import ru.surfstudio.android.easyadapter.holder.BindableViewHolder
import ru.surfstudio.android.easyadapter_sample.R
import ru.surfstudio.android.easyadapter_sample.domain.Element
import ru.surfstudio.android.easyadapter_sample.ui.common.widget.ElementCoverView


class CarouselElementController(
    val onClickListener: (element: Element) -> Unit
) : BindableItemController<Element, CarouselElementController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    override fun getItemId(data: Element) = data.id

    inner class Holder(parent: ViewGroup) : BindableViewHolder<Element>(parent, R.layout.carousel_element_item_layout) {
        private lateinit var data: Element
        private val coverView: ElementCoverView

        init {
            itemView.setOnClickListener { onClickListener.invoke(data) }
            coverView = itemView.findViewById(R.id.cover_view)
        }

        override fun bind(data: Element) {
            this.data = data
            coverView.render(data.id)
        }
    }
}