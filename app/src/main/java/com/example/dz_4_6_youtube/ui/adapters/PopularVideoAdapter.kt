package com.example.dz_4_6_youtube.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.dz_4_6_youtube.data.models.PopularVideo
import com.example.dz_4_6_youtube.databinding.ItemVideoBinding


class PopularVideoAdapter :
    PagingDataAdapter<PopularVideo, PopularVideoAdapter.PopularVideoViewHolder>(diffUtil) {

    inner class PopularVideoViewHolder(private val binding: ItemVideoBinding) :
        ViewHolder(binding.root) {

        fun onBind(item: PopularVideo) {
            Glide.with(binding.ivVideo.context)
                .load(item.snippet.thumbnails.standard.url)
                .into(binding.ivVideo)

            Glide.with(binding.ivAvatar.context)
                .load(item.snippet.thumbnails.standard.url)
                .into(binding.ivAvatar)

            binding.tvTitle.text = item.snippet.channelTitle
            binding.tvViewing.text = item.snippet.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularVideoViewHolder {
        return PopularVideoViewHolder(
            ItemVideoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PopularVideoViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<PopularVideo>() {
            override fun areItemsTheSame(oldItem: PopularVideo, newItem: PopularVideo): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: PopularVideo, newItem: PopularVideo): Boolean {
                return oldItem == newItem
            }
        }
    }
}