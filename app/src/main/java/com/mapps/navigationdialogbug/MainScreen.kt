package com.mapps.navigationdialogbug

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(showDialog: () -> Unit) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = showDialog) {
                Icon(imageVector = Icons.Default.Check, contentDescription = null)
            }
        },
    ) {
    }
}