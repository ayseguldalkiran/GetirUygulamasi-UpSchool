package com.aysegul.getir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.aysegul.getir.databinding.FragmentProductDetailBinding

class ProductDetailFragment : Fragment() {

    private lateinit var design : FragmentProductDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_product_detail, container, false)
        val bundle : ProductDetailFragmentArgs by navArgs()
        val incomingCategory = bundle.productObject
        design.productObject = incomingCategory

        design.imageViewCategoryImage.setImageResource(resources.getIdentifier(incomingCategory.image_name, "drawable", requireContext().packageName))

        return design.root
    }

}