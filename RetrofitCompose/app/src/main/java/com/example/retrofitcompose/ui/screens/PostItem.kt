package com.example.retrofitcompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.retrofitcompose.data.models.Post
import com.example.retrofitcompose.ui.theme.greyishBlack
import com.example.retrofitcompose.ui.theme.lightRed
import com.example.retrofitcompose.ui.theme.orangeWarning

@Composable
fun PostItem(post: Post, onDelete: (Int) -> Unit, onEdit: (Post) -> Unit) {
    var showDialog by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = lightRed
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = post.title, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(4.dp))

            Text(text = post.content, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = { showDialog = true },
                    colors = ButtonDefaults.buttonColors(
                            containerColor = orangeWarning,
                            contentColor = Color.Black
                    )
                ) {
                    Text(text = "Deletar")
                }

                Button(
                    onClick = {onEdit(post)},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = greyishBlack,
                        contentColor = Color.White
                    ),
                ) {
                    Text(text = "Editar")
                }
            }
        }
    }

    if(showDialog){
        AlertDialog(
            onDismissRequest = {showDialog = false},
            title = {Text(text = "Confirmar Exclusão")},
            text = { Text(text = "Tem certeza que deseja deletar este post ?")},
            confirmButton = {
                TextButton(
                    onClick = {onDelete(post.id)
                        showDialog = false })
                {
                    Text(text = "Sim")
                }
            },
            dismissButton = {
                TextButton(onClick ={ showDialog = false}) {
                    Text(text = "Cancelar")
                }
            }
        )
    }

}