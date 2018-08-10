package com.kaiser.dummyproject.ui.recycler.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.kaiser.dummyproject.R
import com.kaiser.dummyproject.ui.base.BaseRecyclerAdapter
import com.kaiser.dummyproject.data.model.api.UserModel
import com.kaiser.dummyproject.ui.recycler.viewholder.ListUsersViewHolder

/**
 * @author KaiserPerwez on 09/08/2018.
 */
class UserRecyclerAdapter(list: List<UserModel>) : BaseRecyclerAdapter<UserModel>(list) {

    override fun onCreateViewHolderBase(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_list_users, parent, false)
        return ListUsersViewHolder(view)
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as ListUsersViewHolder).binding
        binding?.user = list[position]//user item from constructor param
    }

}