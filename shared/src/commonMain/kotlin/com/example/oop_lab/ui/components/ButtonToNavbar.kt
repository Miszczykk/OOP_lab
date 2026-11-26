package com.example.oop_lab.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonToNavbar(textToButton: String, isActive: Boolean, onClick: () -> Unit) {
    Button(
        modifier = Modifier,
        shape = RoundedCornerShape(size = 8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface
        ),
        onClick = onClick,
    ) {
        Text(
            text = textToButton,
            color = if (isActive) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.primary,
            fontSize = 20.sp,
        )
    }
}