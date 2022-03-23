package br.com.inclusion.ui.menu.gesture

import android.content.res.Resources
import br.com.inclusion.R
import br.com.inclusion.navigator.GestureNavigator
import br.com.inclusion.toolkit.ui.OnItemMenuClickListener
import br.com.inclusion.ui.menu.GestureMenu

/**
 * swipe down then up
 */
class NextReadControlGesture(
    resources: Resources,
    gestureNavigator: GestureNavigator,
) : GestureMenu {

    override val position = GesturePosition.GESTURE_NEXT_READ_CONTROL.ordinal

    override var title = resources.getString(R.string.gesture_next_read_control_title)

    override var onClickListener: OnItemMenuClickListener = {
        it.root.setOnClickListener {
            gestureNavigator.navigateToGesture()
        }
    }
}