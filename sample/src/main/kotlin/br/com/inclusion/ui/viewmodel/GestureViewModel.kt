package br.com.inclusion.ui.viewmodel

import androidx.lifecycle.ViewModel
import br.com.inclusion.ui.menu.GestureMenu

class GestureViewModel(
    private val gestureMenu: List<GestureMenu>,
) : ViewModel() {

    fun getGestureMenu(): List<GestureMenu> {
        return gestureMenu.sortedBy { it.position }
    }
}