package com.example.oop_lab.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oop_lab.data.AppTab

@Composable
fun Navbar(
    selectedTab: AppTab,
    onTabSelected: (AppTab) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(all = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "System Dydaktyczny KPI",
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
        )

        Row(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.surface)
        ) {
            AppTab.entries.forEach { tab ->
                val isSelected = tab == selectedTab
                ButtonToNavbar(textToButton = tab.title, isActive = isSelected, onClick = { onTabSelected(tab) })
            }
        }
    }
}