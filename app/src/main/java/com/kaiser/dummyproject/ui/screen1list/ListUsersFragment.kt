package com.kaiser.dummyproject.ui.screen1list

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kaiser.dummyproject.R
import com.kaiser.dummyproject.databinding.FragmentListUsersBinding

class ListUsersFragment : Fragment() {
    lateinit var binding: FragmentListUsersBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_users, container, false)
        binding.vmodel = ListUsersViewModel()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vmodel?.loadData()
    }
}
