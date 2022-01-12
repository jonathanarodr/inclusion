package br.com.inclusion.toolkit.list

import android.graphics.drawable.Drawable
import br.com.inclusion.databinding.ListCardItemMenuBinding
import br.com.inclusion.databinding.ListStandardItemMenuBinding

typealias OnItemMenuClickListener = (itemView: ListStandardItemMenuBinding) -> Unit
typealias OnCardItemMenuClickListener = (itemView: ListCardItemMenuBinding) -> Unit

interface ItemMenu {
    val position: Int
    val icon: Drawable? get() = null
    var title: String
    val description: String? get() = null
}

interface StandardItemMenu : ItemMenu {
    var onClickListener: OnItemMenuClickListener
}

interface CardItemMenu : ItemMenu {
    var onClickListener: OnCardItemMenuClickListener
}