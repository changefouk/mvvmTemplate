package com.siwakorn.mvvmtemplate.ui.main

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.siwakorn.mvvmtemplate.R
import com.siwakorn.mvvmtemplate.databinding.MainFragmentBinding
import com.siwakorn.mvvmtemplate.ui.base.BaseFragment
import com.siwakorn.mvvmtemplate.ui.main.adapter.GenreAdapter
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModel()

    override fun getLayout(): Int = R.layout.main_fragment

    override fun onViewModelBinding() {
        binding.vm = this.viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchData()
        val adapter = GenreAdapter {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.discoverGenre(it)?.let { data ->

                    //

                }
            }
        }
        binding.adapter = adapter

        viewModel.listGenre.observe(viewLifecycleOwner, {
            adapter.setItems(it)
        })

    }


}