package br.com.inclusion.ui.menu.gesture

import android.content.res.Resources
import br.com.inclusion.R
import br.com.inclusion.navigator.GestureNavigator
import br.com.inclusion.toolkit.ui.OnItemMenuClickListener
import br.com.inclusion.ui.menu.GestureMenu

/**
 * swipe up then left
 */
class HomeScreenGesture(
    resources: Resources,
    gestureNavigator: GestureNavigator,
) : GestureMenu {

    override val position = GesturePosition.GESTURE_HOME_SCREEN.ordinal

    override var title = resources.getString(R.string.gesture_home_screen_title)

    override var onClickListener: OnItemMenuClickListener = {
        it.root.setOnClickListener {
            gestureNavigator.navigateToGesture()
        }
    }
}