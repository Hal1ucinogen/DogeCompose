/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Cat

class MainViewModel : ViewModel() {
    val cats by mutableStateOf(
        listOf(
            Cat("Oliver", "Beijing", "Adult", "Male", "Large", R.drawable.ragroll01),
            Cat("Milo", "Shanghai", "Young", "Female", "Medium", R.drawable.ragroll02),
            Cat("Charlie", "HongKong", "Puppy", "Male", "Small", R.drawable.ragroll03),
            Cat("Max", "Taipei", "Adult", "Female", "Large", R.drawable.ragroll04),
            Cat("Loki", "Chengdu", "Young", "Male", "Medium", R.drawable.ragroll05),
            Cat("Oscar", "Guangzhou", "Puppy", "Female", "Small", R.drawable.ragroll06),
            Cat("Simon", "Shenzhen", "Adult", "Male", "Large", R.drawable.ragroll07),
            Cat("Louie", "Chongqing", "Young", "Female", "Medium", R.drawable.ragroll08)
        )
    )

    var currentCat: Cat? by mutableStateOf(null)

    fun showCat(cat: Cat) {
        currentCat = cat
    }

    fun dismissCat() {
        currentCat = null
    }
}