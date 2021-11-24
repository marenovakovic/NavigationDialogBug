package com.mapps.navigationdialogbug

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun Dialog(dismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = {},
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = dismiss) {
                Text(text = "Dismiss")
            }
        },
    )
}