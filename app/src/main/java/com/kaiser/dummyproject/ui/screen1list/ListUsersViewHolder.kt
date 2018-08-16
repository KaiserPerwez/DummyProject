package com.kaiser.dummyproject.ui.screen1list

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import com.kaiser.dummyproject.databinding.ItemListUsersBinding


class ListUsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding: ItemListUsersBinding? = DataBindingUtil.bind(view)

}