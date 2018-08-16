package com.kaiser.dummyproject.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kaiser.dummyproject.R
import com.kaiser.dummyproject.databinding.ActivityMainBinding
import com.kaiser.dummyproject.ui.common.ViewPagerAdapter
import com.kaiser.dummyproject.ui.screen1list.ListUsersFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupToolbar()
        setupTabs()
    }

    private fun setupToolbar() {
       // setSupportActionBar(binding.includeToolbar?.toolbar)
      //  supportActionBar?.title = getString(R.string.app_name)
    }

    private fun setupTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(ListUsersFragment(), getString(R.string.users))

        binding.viewPager.adapter = adapter
       // binding.includeToolbar?.tabs?.setupWithViewPager(binding.viewPager)
    }

}