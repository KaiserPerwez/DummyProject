package com.kaiser.dummyproject.ui.screen1list

import android.databinding.BindingAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kaiser.dummyproject.data.model.api.UserModel

object ListUsersBindings {

    @JvmStatic
    @BindingAdapter("load_users")
    fun RecyclerView.loadUsers(users: List<UserModel>?) {
        this.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = if (users != null) UserRecyclerAdapter(users) else UserRecyclerAdapter(emptyList())
        }
    }

}