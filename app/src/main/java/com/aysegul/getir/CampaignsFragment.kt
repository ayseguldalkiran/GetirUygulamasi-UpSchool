package com.aysegul.getir

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aysegul.getir.databinding.FragmentCampaignsBinding
import com.aysegul.getir.databinding.FragmentHomeBinding

class CampaignsFragment : Fragment() {
    private lateinit var design : FragmentCampaignsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_campaigns, container, false)

        return design.root
    }

}