package com.example.myplaylist

import android.content.Context
import android.view.LayoutInflater
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myplaylist.adapter.MainAdapter
import com.example.myplaylist.databinding.FragmentPage1Binding
import com.example.myplaylist.viewmodel.MainViewModel

class FragmentPage1 : Fragment() {

    private lateinit var mainActivity: MainActivity
    private lateinit var binding: FragmentPage1Binding
    private val mainViewModel by viewModels<MainViewModel>()
    private val mainAdapter = MainAdapter()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.setContentView(mainActivity, R.layout.fragment_page_1)

        binding.apply {
            lifecycleOwner = this@FragmentPage1
            activity = this@FragmentPage1
            vm = mainViewModel
            recyclerView.adapter = mainAdapter
        }

        mainViewModel.getAlbum("Remapping The Human Soul")

        initObserver()

        return inflater.inflate(R.layout.fragment_page_1, container, false)





    }

    fun getSong(){
        mainViewModel.getSong(binding.editKeyword.text.toString())
    }

    private fun initObserver(){
        mainViewModel.mySong.observe(viewLifecycleOwner){
            mainAdapter.submitList(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}