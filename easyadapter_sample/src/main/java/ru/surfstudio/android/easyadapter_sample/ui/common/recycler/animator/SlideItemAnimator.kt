package ru.surfstudio.android.easyadapter_sample.ui.common.recycler.animator

import android.view.animation.*
import androidx.recyclerview.widget.RecyclerView

class SlideItemAnimator : StandardItemAnimator() {

    override fun onRemoveStartingInternal(item: RecyclerView.ViewHolder) {
        super.onRemoveStartingInternal(item)
        val anim = TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -1f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f)
        anim.interpolator = AccelerateInterpolator()
        anim.duration = removeDuration
        item.itemView.startAnimation(anim)
    }

    override fun onAddStartingInternal(item: RecyclerView.ViewHolder) {
        super.onAddStartingInternal(item)
        val yAnim = TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 1 / 8f,
                Animation.RELATIVE_TO_SELF, 0f)
        val alphaAnim = AlphaAnimation(0f, 1f)
        val animSet = AnimationSet(false)
        animSet.interpolator = DecelerateInterpolator()
        animSet.duration = addDuration
        animSet.addAnimation(yAnim)
        animSet.addAnimation(alphaAnim)
        item.itemView.startAnimation(animSet)
    }
}
