package com.siwakorn.mvvmtemplate.ui.main

import com.siwakorn.mvvmtemplate.R
import com.siwakorn.mvvmtemplate.databinding.MainFragmentBinding
import com.siwakorn.mvvmtemplate.ui.base.BaseFragment
import org.koin.android.ext.android.inject

class MainFragment : BaseFragment<MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by inject()

    override fun getLayout(): Int = R.layout.main_fragment

    override fun onViewModelBinding() {
        binding.vm = this.viewModel
    }

}