package com.aysegul.getir

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.size
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.aysegul.getir.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var design : FragmentHomeBinding
    private lateinit var categoryList : ArrayList<Products>
    private lateinit var adapter : ProductsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        design.rvCategory.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val category1 = Products(1, "Yeni Ürünler", "new_products")
        val category2 = Products(2, "İndirimler", "special_offers")
        val category3 = Products(3, "Meyve", "fruit")
        val category4 = Products(12, "İçecek", "beverage")
        val category5 = Products(4, "Su", "water")
        val category6 = Products(5, "Atıştırmalık", "snacks")
        val category7 = Products(6, "Dondurma", "icecream")
        val category8 = Products(7, "Petshop", "petshop")
        val category9 = Products(8, "Temizlik", "hygiene")
        val category10 = Products(9, "Kozmetik", "toothpaste")
        val category11 = Products(10, "Bebek", "baby")
        val category12 = Products(11, "Süt Ürünleri", "milk")

        categoryList = ArrayList()

        categoryList.add(category1)
        categoryList.add(category2)
        categoryList.add(category3)
        categoryList.add(category4)
        categoryList.add(category5)
        categoryList.add(category6)
        categoryList.add(category7)
        categoryList.add(category8)
        categoryList.add(category9)
        categoryList.add(category10)
        categoryList.add(category11)
        categoryList.add(category12)

        adapter = ProductsAdapter(requireContext(), categoryList)
        design.productsAdapter = adapter

        return design.root
    }

}