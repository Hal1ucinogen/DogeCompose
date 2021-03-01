package com.example.androiddevchallenge.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.HomeViewModel
import kotlinx.coroutines.launch


@Composable
fun Home() {
    val snackBarHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Ragroll Adoption")
                }
            )
        },
        snackbarHost = {
            SnackbarHost(snackBarHostState)
        }
    ) {
        val viewModel: HomeViewModel = viewModel()
        val current = viewModel.currentCat
        CatList(viewModel.cats) {
            if (current == null) {
                viewModel.showCat(it)
            }
        }
        current?.run {
            CatDetail(current) {
                coroutineScope.launch {
                    snackBarHostState.showSnackbar("Adoption for ${it.name} has been submitted")
                }
            }
        }
    }
}