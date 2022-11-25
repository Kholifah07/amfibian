/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.amphibians.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.amphibians.databinding.FragmentAmphibianDetailBinding

/**
 * Fragmen  menunjukkan informasi  tentang Amfibi
 */
class AmphibianDetailFragment : Fragment() {

    private val viewModel: AmphibianViewModel by activityViewModels()
    // Mengembang tata letak dengan Data Binding,
    // menyetel livecyler ke  OverviewFragment
    //  mengaktifkan Data Binding untuk mengamati LiveData, dan menyiapkan RecyclerView dengan adaptor.
    //
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    // view
    ): View {

        val binding = FragmentAmphibianDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // Inflate layout dengan  fragment
        return binding.root
    }
}
