package com.example.dz_4_6_youtube.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.dz_4_6_youtube.R
import com.example.dz_4_6_youtube.base.BaseFragment
import com.example.dz_4_6_youtube.databinding.FragmentHomeBinding
import com.example.dz_4_6_youtube.ui.adapters.PopularVideoAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {

    override val binding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel: HomeViewModel by viewModels()
    private val popularVideoAdapter = PopularVideoAdapter()

    override fun initialize() {
        binding.rvVideo.adapter = popularVideoAdapter
    }

    override fun setupSubscribes() {
        subscribesToPopularVideos()
    }

    private fun subscribesToPopularVideos() {
        viewModel.fetchPopularVideos("ru", "mostPopular", "snippet").observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                popularVideoAdapter.submitData(it)
            }
        }
    }

}