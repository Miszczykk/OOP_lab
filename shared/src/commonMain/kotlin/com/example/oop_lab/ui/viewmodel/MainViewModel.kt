package com.example.oop_lab.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.oop_lab.data.AppTab
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
    private val _selectedTab = MutableStateFlow(value = AppTab.EMPLOYEES)
    val selectedTab: StateFlow<AppTab> = _selectedTab

    fun onTabSelected(tab: AppTab) {
        _selectedTab.update { tab }
    }
}