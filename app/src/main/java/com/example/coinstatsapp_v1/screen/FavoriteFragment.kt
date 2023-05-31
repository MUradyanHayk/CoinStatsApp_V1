package com.example.coinstatsapp_v1.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.coinstatsapp_v1.R
import com.example.coinstatsapp_v1.databinding.FragmentFavoriteBinding
import com.example.coinstatsapp_v1.viewModel.CoinViewModel
import dagger.hilt.android.AndroidEntryPoint

private const val TAG = "FavoriteFragment"

@AndroidEntryPoint
class FavoriteFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteBinding
    private val viewModel: CoinViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }
}