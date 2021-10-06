package br.com.inclusion.toolkit.ui

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.inclusion.databinding.ListItemMenuWidgetBinding

class MenuWidgetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = ListItemMenuWidgetBinding.bind(itemView)

    fun bindView(itemMenuWidget: ItemMenuWidget) {
        binding.apply {
            titleItemMenu.text = itemMenuWidget.title

            itemMenuWidget.icon?.let { value ->
                iconItemMenu.setImageDrawable(value)
                iconItemMenu.isVisible = true
            }

            itemMenuWidget.description?.let { value ->
                descriptionItemMenu.text = value
                descriptionItemMenu.isVisible = true
            }
        }

        itemView.setOnClickListener {
            itemMenuWidget.onClickListener(binding)
        }
    }
}