package com.example.myblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var blogList: List<Blog>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.blog_list_item, parent,false)
        return BlogsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactsList[position]
        holder.tvName.text = contact.name
        holder.tvSeeMore.text = contact.name
        holder.tvSummary.text = contact.date
    }

    override fun getItemCount(): Int {
        return blogList.size
    }
}

class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvSummary)
    val tvEmail = itemView.findViewById<TextView>(R.id.tvSeeMore)