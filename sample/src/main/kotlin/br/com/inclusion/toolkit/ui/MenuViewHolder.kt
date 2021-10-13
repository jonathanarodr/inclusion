package br.com.inclusion.toolkit.ui

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.inclusion.databinding.ListItemMenuBinding

class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = ListItemMenuBinding.bind(itemView)

    fun bindView(itemMenu: ItemMenu) {
        binding.apply {
            titleItemMenu.text = itemMenu.title

            itemMenu.icon?.let { value ->
                iconItemMenu.setImageDrawable(value)
                iconItemMenu.isVisible = true
            }

            itemMenu.description?.let { value ->
                descriptionItemMenu.text = value
                descriptionItemMenu.isVisible = true
            }
        }

        itemView.setOnClickListener {
            itemMenu.onClickListener(binding)
        }
    }
}