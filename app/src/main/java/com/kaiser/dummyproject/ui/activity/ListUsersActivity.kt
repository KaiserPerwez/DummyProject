package com.kaiser.dummyproject.ui.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kaiser.dummyproject.R
import com.kaiser.dummyproject.viewmodel.ListUsersViewModel
import com.kaiser.dummyproject.databinding.ActivityListUsersBinding

class ListUsersActivity : AppCompatActivity() {
lateinit var binding:ActivityListUsersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_list_users)
        binding.vmodel= ListUsersViewModel()
        binding.vmodel?.loadData()
    }
}
