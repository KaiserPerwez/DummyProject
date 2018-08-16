package com.kaiser.dummyproject.ui.screen2fb


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kaiser.dummyproject.R
import com.kaiser.dummyproject.databinding.FragmentLoginFbBinding

class LoginFbFragment : Fragment() {
    lateinit var binding: FragmentLoginFbBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login_fb, container, false)
        binding.vm = LoginFbViewModel()
        return binding.root
    }
}
