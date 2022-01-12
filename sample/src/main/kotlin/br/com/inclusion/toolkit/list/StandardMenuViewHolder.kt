package br.com.inclusion.toolkit.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.inclusion.R
import br.com.inclusion.databinding.ListStandardItemMenuBinding

class StandardMenuViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = ListStandardItemMenuBinding.bind(itemView)

    companion object {
        operator fun invoke(parent: ViewGroup): StandardMenuViewHolder {
            return LayoutInflater.from(parent.context).inflate(
                R.layout.list_standard_item_menu, parent, false
            ).run {
                StandardMenuViewHolder(this)
            }
        }
    }

    fun bindView(itemMenu: StandardItemMenu) {
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