package com.example.movieapp.views.nowplaying

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapp.BuildConfig
//import com.example.movieapp.data.NowPlayingLocal
import com.example.movieapp.databinding.LayoutRecyclerViewBinding
import com.example.movieapp.models.movies.MovieUpcoming

class NowPlayingAdapter : ListAdapter<MovieUpcoming, NowPlayingAdapter.NowPlayingViewHolder>(NowPlayingComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowPlayingViewHolder {
        val binding = LayoutRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NowPlayingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NowPlayingViewHolder, position: Int) {

        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }
    }

    class NowPlayingViewHolder(private val binding: LayoutRecyclerViewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: MovieUpcoming) {
            binding.apply {
                Glide.with(itemView)
                    .load(BuildConfig.TMDB_PHOTO_BASE_URL + movie.posterPath)
                    .into(imageView)
                titleTextView.text = movie.title.toString()
                overviewTextView.text = movie.overview
                releaseDateTextView.text = movie.releaseDate
            }
        }

    }

    class NowPlayingComparator : DiffUtil.ItemCallback<MovieUpcoming>() {
        override fun areItemsTheSame(oldItem: MovieUpcoming, newItem: MovieUpcoming): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MovieUpcoming, newItem: MovieUpcoming): Boolean {
            return oldItem == newItem
        }
    }

}