package com.example.lesson6task6kotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson6task6kotlin.Model.User
import com.example.lesson6task6kotlin.R

class RecyclerAdpter( private var user: List<User>):RecyclerView.Adapter<RecyclerAdpter.UserViewHolder>() {

    override fun getItemCount(): Int {
        return user.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_list, parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val users = user.get(position)

        if (holder is UserViewHolder){
            holder.tv_lastName.text = users.getLastName()
        }
    }

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        var tv_lastName: TextView = view.findViewById(R.id.tv_lastName)
    }
}