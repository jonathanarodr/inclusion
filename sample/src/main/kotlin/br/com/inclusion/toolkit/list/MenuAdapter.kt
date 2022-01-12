package br.com.inclusion.toolkit.list

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    menu: List<ItemMenu>,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val menuSorted = menu.sortedBy { it.position }

    companion object {
        private const val STANDARD_VIEW_TYPE = 1
        private const val CARD_VIEW_TYPE = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            STANDARD_VIEW_TYPE -> StandardMenuViewHolder(parent)
            CARD_VIEW_TYPE -> CardMenuViewHolder(parent)
            else -> error("View holder not mapped for the view type $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val transaction = menuSorted[position]

        when (holder) {
            is StandardMenuViewHolder -> holder.bindView(transaction as StandardItemMenu)
            is CardMenuViewHolder -> holder.bindView(transaction as CardItemMenu)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (menuSorted[position]) {
            is StandardItemMenu -> STANDARD_VIEW_TYPE
            is CardItemMenu -> CARD_VIEW_TYPE
            else -> Log.e(javaClass.simpleName, "Item type not mapped")
        }
    }

    override fun getItemCount() = menuSorted.size
}