package br.com.inclusion.toolkit.ui

import android.graphics.drawable.Drawable
import br.com.inclusion.databinding.ListItemMenuWidgetBinding

typealias OnItemMenuClickListener = (itemView: ListItemMenuWidgetBinding) -> Unit

interface ItemMenuWidget {
    val position: Int
    val icon: Drawable? get() = null
    var title: String
    val description: String? get() = null
    var onClickListener: OnItemMenuClickListener
}