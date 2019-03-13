package ru.surfstudio.android.easyadapter_sample.ui.common.stub

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import ru.surfstudio.android.easyadapter_sample.R


fun View.toStub() {
    when (this) {
        is ViewGroup ->
            (0..childCount - 1)
                    .map { this.getChildAt(it) }
                    .forEach { it.toStub() }
        is TextView -> {
            this.setBackgroundColor(ContextCompat.getColor(this.context, R.color.gray_light))
            this.text = null
        }
        is ImageView -> {
            this.setImageDrawable(null)
            this.setBackgroundColor(ContextCompat.getColor(this.context, R.color.gray_light))
        }
    }
}