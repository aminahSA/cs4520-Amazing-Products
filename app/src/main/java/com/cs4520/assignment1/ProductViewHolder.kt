package com.cs4520.assignment1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val productTextView: TextView = itemView.findViewById(R.id.productTextView)

    fun bind(product: String) {
        // Bind data to views
        productTextView.text = product
    }
}

