package ru.surfstudio.android.easyadapter_sample.ui.common.recycler.controller

import android.view.ViewGroup
import ru.surfstudio.android.easyadapter.controller.BindableItemController
import ru.surfstudio.android.easyadapter.holder.BindableViewHolder
import ru.surfstudio.android.easyadapter_sample.R
import ru.surfstudio.android.easyadapter_sample.ui.common.stub.Stub
import ru.surfstudio.android.easyadapter_sample.ui.common.stub.toStub


class ElementStubController : BindableItemController<Stub, ElementStubController.Holder>() {

    override fun createViewHolder(parent: ViewGroup): Holder = Holder(parent)

    override fun getItemId(stub: Stub)= stub.id.toString()

    inner class Holder(parent: ViewGroup) : BindableViewHolder<Stub>(parent, R.layout.element_item_layout) {

        init {
            itemView.toStub()
        }

        override fun bind(stub: Stub) {
            //ignore
        }
    }
}