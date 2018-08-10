package com.kaiser.dummyproject.ui.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kaiser.dummyproject.data.model.api.UserModel
import com.kaiser.dummyproject.ui.recycler.adapter.UserRecyclerAdapter

/**
 * @author Wellington Costa on 31/12/2017.
 */
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