package com.siwakorn.mvvmtemplate.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.siwakorn.mvvmtemplate.data.model.response.GenreItem
import com.siwakorn.mvvmtemplate.databinding.ItemGenreBinding

class GenreAdapter(private val onclick: (GenreId: Int) -> Unit) :
    RecyclerView.Adapter<GenreAdapter.GenreViewHolder>() {

    private var items: List<GenreItem> = listOf()

    class GenreViewHolder(
        private val binding: ItemGenreBinding,
        private val onclick: (GenreId: Int) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: GenreItem) {
            binding.item = item
            binding.onClick = View.OnClickListener {
                onclick.invoke(item.id)
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GenreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemGenreBinding.inflate(layoutInflater, parent, false)
        return GenreViewHolder(itemBinding, onclick)
    }

    override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

    fun setItems(listItem: List<GenreItem>) {
        this.items = listItem
        notifyDataSetChanged()
    }

}