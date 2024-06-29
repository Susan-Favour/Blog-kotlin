package com.example.myblog

import android.view.ViewGroup
import android.view.View
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class MyBlogsAdapter(var bloggerList: List<Blog>):
        RecyclerView.Adapter<BlogsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_item, parent, false)
        return BlogsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val blogger = bloggerList[position]
        holder.tvAuthor.text = blogger.author
        holder.tvTitle.text = blogger.title
        holder.tvDate.text = blogger.date
        holder.tvSummary.text = blogger.summary

    }

    override fun getItemCount(): Int {
      return bloggerList.size
    }
}


class BlogsViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvSummary = itemView.findViewById<TextView>(R.id.tvSummary)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}