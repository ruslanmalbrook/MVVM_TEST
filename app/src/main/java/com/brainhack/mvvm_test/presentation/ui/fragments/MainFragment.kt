package com.brainhack.mvvm_test.presentation.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.brainhack.mvvm_test.app.App
import com.brainhack.mvvm_test.databinding.FragmentMainBinding
import javax.inject.Inject

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var viewModelFactory: MainFragmentViewModelFactory
    private lateinit var viewModel: MainFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity().applicationContext as App).appComponent.inject(this)

        Log.e("AAA", "Fragment created")

        viewModel = ViewModelProvider(
            this, viewModelFactory
        )[MainFragmentViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.resultLive.observe(viewLifecycleOwner, Observer { text ->
            binding.getDataText.text = text
        })

        binding.getDataBtn.setOnClickListener {
            viewModel.load()
        }

        binding.saveDataBtn.setOnClickListener {
            viewModel.save(binding.saveDataText.text.toString())
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}