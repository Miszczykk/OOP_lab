package com.example.oop_lab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.oop_lab.ui.components.Navbar
import com.example.oop_lab.ui.theme.OOPTheme
import com.example.oop_lab.ui.viewmodel.MainViewModel

@Composable
fun App() {
    val viewModel = remember { MainViewModel() }
    val selectedTab by viewModel.selectedTab.collectAsState()

    OOPTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
        ) {
            Navbar(
                selectedTab = selectedTab,
                onTabSelected = { newTab -> viewModel.onTabSelected(newTab) },
            )
        }
    }
}