package com.gopal.plantixdemo.ui

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.gopal.plantixdemo.R
import com.gopal.plantixdemo.adapter.NotesListAdapter
import com.gopal.plantixdemo.databinding.MainFragmentBinding
import com.gopal.plantixdemo.ui.viewModel.MainViewModel
import com.gopal.plantixdemo.util.TAG

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding
    private lateinit var adapter: NotesListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*for toolbar*/
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //setHasOptionsMenu(true)
        requireActivity().title = getString(R.string.app_name)

        /*initialize*/
        binding = MainFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /*bind recycleview*/
        with(binding.recycleView) {
            setHasFixedSize(true)
            val divider = DividerItemDecoration(context, LinearLayoutManager(context).orientation)
            addItemDecoration(divider)
        }

        viewModel.dataList.observe(viewLifecycleOwner, Observer {
            Log.i(TAG, it.toString())
            adapter = NotesListAdapter(it)
            binding.recycleView.adapter = adapter
            binding.recycleView.layoutManager = LinearLayoutManager(activity)

        })


        return binding.root
    }

}