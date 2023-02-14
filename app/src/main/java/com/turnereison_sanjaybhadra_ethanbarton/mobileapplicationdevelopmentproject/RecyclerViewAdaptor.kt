package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdaptor(
    private val context: Context,
    private val dataset: List<Listable>
): RecyclerView.Adapter<RecyclerViewAdaptor.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val primaryTextview = view.findViewById<TextView>(R.id.primary_textview)
        val secondaryTextview = view.findViewById<TextView>(R.id.secondary_textview)
    }

    // sets up the recycler view cell type as `item_cell`
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cell, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // tells the recycler view how many cells we will have
    override fun getItemCount(): Int = dataset.size

    // configures the cell for the item in index `position`
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.primaryTextview.text = item.getPrimaryText()
        holder.secondaryTextview.text = item.getSecondaryText()
    }
}