package com.example.coinstatsapp_v1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coinstatsapp_v1.R
import com.example.coinstatsapp_v1.data.model.CoinModel
import com.example.coinstatsapp_v1.databinding.CoinItemBinding

class CoinsAdapter : ListAdapter<CoinModel, CoinsAdapter.CoinsAdapterViewHolder>(CoinDiffUtilsCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinsAdapterViewHolder {
        val binding = CoinItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoinsAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoinsAdapterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class CoinsAdapterViewHolder(val binding: CoinItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(coinModel: CoinModel) {
            Glide.with(binding.root.context).load(coinModel.icon)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.avatar)
            binding.name.text = coinModel.name

        }
    }

    class CoinDiffUtilsCallBack : DiffUtil.ItemCallback<CoinModel>() {
        override fun areItemsTheSame(oldItem: CoinModel, newItem: CoinModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CoinModel, newItem: CoinModel): Boolean {
            return oldItem == newItem
        }

    }
}