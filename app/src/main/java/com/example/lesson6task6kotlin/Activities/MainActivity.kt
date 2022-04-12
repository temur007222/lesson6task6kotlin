package com.example.lesson6task6kotlin.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6task6kotlin.Adapter.RecyclerAdpter
import com.example.lesson6task6kotlin.Model.User
import com.example.lesson6task6kotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val users = prepareUserList()
        refreshAdapter(users as ArrayList<User>)
    }
    private fun initView(){
        findViewById<RecyclerView>(R.id.rv).layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
    private fun refreshAdapter(user: ArrayList<User>){
        val adapter = RecyclerAdpter(user)
        findViewById<RecyclerView>(R.id.rv).adapter = adapter
    }

    private fun prepareUserList(): List<User>{
        val users: MutableList<User> = ArrayList()
        for (i in 1..10) {
                users.add(User("Nick$i"))
        }
        return users
    }
}