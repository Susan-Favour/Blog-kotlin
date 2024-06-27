package com.example.myblog

import android.os.Bundle
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
        binding.rvBlog.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }

    fun displayBlogs(){
        val blog1 = Blog("Anna", "070001029203", "annie@gmail.com", "")
        val blog2 = Blog("Barry", "070001029203", "barry@gmail.com", "")
        val blog3 = Blog("Candy", "070001029203", "candy@gmail.com", "")
        val blog4 = Blog("Didier", "070001029203", "didier@gmail.com", "")
        val blog5 = Blog("Euphy", "070001029203", "euphy@gmail.com", "")
        val blog6 = Blog("Fave", "070001029203", "fave@gmail.com", "")

        val contactList = listOf(blog1, blog2, blog3, blog4, blog5, blog6)
        val contactsAdapter = BlogAdapter(contactList)
        binding.rvBlog.adapter = blogAdapter

    }


    }

}