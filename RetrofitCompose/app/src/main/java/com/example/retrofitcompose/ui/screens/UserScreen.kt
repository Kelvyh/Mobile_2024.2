package com.example.retrofitcompose.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Color
import com.example.retrofitcompose.ui.theme.greyishBlack
import com.example.retrofitcompose.ui.theme.lightRed
import com.example.retrofitcompose.viewmodel.PostViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserScreen(viewModel: PostViewModel = viewModel()) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        isLoading = true
        viewModel.fetchUsers()
        isLoading = false
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 128.dp)
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Nome") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = lightRed
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "E-mail") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = lightRed
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                isLoading = true
                viewModel.createUser(name, email,
                    onSuccess = {
                        Toast.makeText(context, "Usuário criado com sucesso", Toast.LENGTH_SHORT).show()
                        isLoading = false
                    },
                    onError = {
                        Toast.makeText(context, "Erro ao criar usuário", Toast.LENGTH_SHORT).show()
                        isLoading = false
                    }
                )
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = greyishBlack,
                contentColor = Color.White
            )
        ) {
            Text(text = "Criar Usuário")
        }
        Spacer(modifier = Modifier.height(16.dp))

        if (isLoading) {
            CircularProgressIndicator()
        }

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(viewModel.users) { users ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = lightRed
                    )
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "Nome: ${users.name}")
                        Text(
                            text = "Email: ${users.email}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}