package br.com.inclusion.toolkit.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.inclusion.R

class MenuWidgetAdapter(
    menu: List<ItemMenuWidget>,
) : RecyclerView.Adapter<MenuWidgetViewHolder>() {

    private val menuSorted = menu.sortedBy { it.position }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuWidgetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_menu_widget, parent, false
        )
        return MenuWidgetViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuWidgetViewHolder, position: Int) {
        holder.bindView(menuSorted[position])
    }

    override fun getItemCount() = menuSorted.size
}