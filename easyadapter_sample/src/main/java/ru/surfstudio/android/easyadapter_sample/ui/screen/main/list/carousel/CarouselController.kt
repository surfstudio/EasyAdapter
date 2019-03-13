package ru.surfstudio.android.easyadapter_sample.ui.screen.main.list.carousel

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.surfstudio.android.easyadapter.EasyAdapter
import ru.surfstudio.android.easyadapter.controller.BindableItemController
import ru.surfstudio.android.easyadapter.holder.BindableViewHolder
import ru.surfstudio.android.easyadapter_sample.R
import ru.surfstudio.android.easyadapter_sample.domain.Carousel
import ru.surfstudio.android.easyadapter_sample.domain.Element
import ru.surfstudio.android.easyadapter_sample.ui.common.recycler.animator.StandardItemAnimator


class CarouselController(
    val onElementClickListener: (element: Element) -> Unit,
    val onShowAllClickListener: (carousel: Carousel) -> Unit
) : BindableItemController<Carousel, CarouselController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    override fun getItemId(data: Carousel) = data.id

    inner class Holder(parent: ViewGroup) : BindableViewHolder<Carousel>(parent, R.layout.carousel_item_layout) {
        private lateinit var data: Carousel
        private val titleTv: TextView
        private val adapter: EasyAdapter = EasyAdapter()
        private val carouselElementController = CarouselElementController(onElementClickListener)

        init {
            val allBtn = itemView.findViewById<View>(R.id.carousel_all_btn)
            allBtn.setOnClickListener { onShowAllClickListener.invoke(data) }
            titleTv = itemView.findViewById<TextView>(R.id.carousel_title_tv)

            val recyclerView = itemView.findViewById<RecyclerView>(R.id.carousel_recycler)
            val linearLayoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            val itemAnimator = StandardItemAnimator()
            GravitySnapHelper(Gravity.START).attachToRecyclerView(recyclerView)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = linearLayoutManager
            recyclerView.itemAnimator = itemAnimator
        }

        override fun bind(data: Carousel) {
            this.data = data
            titleTv.text = data.name
            adapter.setData(data.elements, carouselElementController)
        }
    }
}