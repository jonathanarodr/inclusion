package br.com.inclusion.toolkit.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.inclusion.R

class MenuAdapter(
    menu: List<ItemMenu>,
) : RecyclerView.Adapter<MenuViewHolder>() {

    private val menuSorted = menu.sortedBy { it.position }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_menu, parent, false
        )
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bindView(menuSorted[position])
    }

    override fun getItemCount() = menuSorted.size
}