package com.example.subiyantoroapp

import android.app.Activity
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHeroAdapter(private val heroList: ArrayList<Hero>): RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_hero, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = heroList[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.tvImage)

        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail
        holder.cardHero.setOnClickListener {
            val activity = holder.itemView.context as Activity
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_IMAGE, hero.photo)
            intent.putExtra(DetailActivity.EXTRA_TITLE, hero.name)
            intent.putExtra(DetailActivity.EXTRA_DETAIL, hero.detail)
            activity.startActivity(intent)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvImage: ImageView = itemView.findViewById(R.id.img_item_photo)
        var cardHero: RelativeLayout = itemView.findViewById(R.id.hero_item)
    }
}