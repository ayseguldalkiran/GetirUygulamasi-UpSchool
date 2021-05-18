package com.aysegul.getir

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import com.aysegul.getir.databinding.CardBinding

class ProductsAdapter (var mContext: Context, var categories: List<Products>) : RecyclerView.Adapter<ProductsAdapter.CardHolder>(){

    inner class CardHolder(cardBinding: CardBinding) : RecyclerView.ViewHolder(cardBinding.root){
        var design: CardBinding

        init {
            this.design = cardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = CardBinding.inflate(layoutInflater, parent, false)
        return CardHolder(design)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        val category = categories.get(position)
        holder.design.productObject = category

        holder.design.imageViewCategory.setImageResource(
            mContext.resources.getIdentifier(category.image_name, "drawable", mContext.packageName)
        )

        holder.design.categoryCardView.setOnClickListener{
            val transition = HomeFragmentDirections.productDetailTransition(category)
            Navigation.findNavController(it).navigate(transition)
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}