package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Cat

class HomeViewModel : ViewModel() {
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