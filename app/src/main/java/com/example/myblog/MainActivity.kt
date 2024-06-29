package com.example.myblog

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogger.layoutManager= LinearLayoutManager(this)

        showBlogs()
    }

    fun showBlogs(){
        val blog1 = Blog("Susan Favour", "27th March 2024", "My life in Crime", "If you compare ChatGPT and Google Bard, one of the advantages Google’s Bard has had until now is that it answers you using current search data, while ChatGPT has been stuck working off data it was trained on from 2021.")
        val blog2 = Blog("Maureen Njeri", "27th March 2024", "My life in Crime", "If you compare ChatGPT and Google Bard, one of the advantages Google’s Bard has had until now is that it answers you using current search data, while ChatGPT has been stuck working off data it was trained on from 2021...")
        val blog3 = Blog("Michael B.Jordan", "27th March 2024", "My life in Crime", "If you compare ChatGPT and Google Bard, one of the advantages Google’s Bard has had until now is that it answers you using current search data, while ChatGPT has been stuck working off data it was trained on from 2021...")
        val blog4 = Blog("Rege Jean Page", "27th March 2024", "My life in Crime", "If you compare ChatGPT and Google Bard, one of the advantages Google’s Bard has had until now is that it answers you using current search data, while ChatGPT has been stuck working off data it was trained on from 2021...")
        val blog5 = Blog("Uche Montana", "27th March 2024", "My life in Crime", "If you compare ChatGPT and Google Bard, one of the advantages Google’s Bard has had until now is that it answers you using current search data, while ChatGPT has been stuck working off data it was trained on from 2021...")
        val blog6 = Blog("Emmah Kanyi", "27th March 2024", "My life in Crime", "If you compare ChatGPT and Google Bard, one of the advantages Google’s Bard has had until now is that it answers you using current search data, while ChatGPT has been stuck working off data it was trained on from 2021...")

        val blogList = listOf(blog1,blog2,blog3,blog4,blog5, blog6,)
        val blogsAdapter = MyBlogsAdapter(blogList)
        binding.rvBlogger.adapter = blogsAdapter
    }
}