package com.example.coinstatsapp_v1.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.coinstatsapp_v1.R
import com.example.coinstatsapp_v1.adapter.CoinsAdapter
import com.example.coinstatsapp_v1.databinding.FragmentAllCoinBinding
import com.example.coinstatsapp_v1.viewModel.CoinViewModel
import dagger.hilt.android.AndroidEntryPoint

private const val TAG = "AllCoinFragment"

@AndroidEntryPoint
class AllCoinFragment : Fragment() {
    private lateinit var binding: FragmentAllCoinBinding
    private val viewModel: CoinViewModel by viewModels()
    private var adapter: CoinsAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAllCoinBinding.inflate(inflater, container, false)
        adapter = CoinsAdapter()
        binding.recyclerView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.coins.observe(viewLifecycleOwner) { coins ->
            adapter?.submitList(coins)
        }

        viewModel.installAllCoins()
    }
}