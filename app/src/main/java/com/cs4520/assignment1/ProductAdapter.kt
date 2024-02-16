package com.cs4520.assignment1

import Product
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    private val products: List<Product>)
    : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {


        class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.product, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
    }

    override fun getItemCount(): Int {
        return products.size
    }
}
