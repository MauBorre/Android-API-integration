package com.example.marsphotos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.marsphotos.ui.MarsPhotosApp
import com.example.marsphotos.ui.screens.MarsViewModel
import com.example.marsphotos.ui.theme.MarsPhotosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarsPhotosTheme {
                val viewModel: MarsViewModel =
                    viewModel(factory = MarsViewModel.Factory)
                MarsPhotosApp()
            }
        }
    }


}
