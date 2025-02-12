package com.example.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth.data.AuthRepository
import com.example.auth.ui.view.LoginScreen
import com.example.auth.ui.theme.AuthTheme
import com.example.auth.ui.view.ResetPasswordScreen
import com.example.auth.ui.view.HomeScreen
import com.example.auth.ui.view.RegisterScreen
import com.example.auth.viewmodel.AuthViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AuthTheme {
                val navController = rememberNavController()
                val authViewModel = AuthViewModel(AuthRepository())

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController = navController,
                        startDestination = "login",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("login") {
                            LoginScreen(navController, authViewModel, this@MainActivity)
                        }
                        composable("home") {
                            HomeScreen(navController, authViewModel, this@MainActivity)
                        }
                        composable("register") {
                            RegisterScreen(navController, authViewModel, this@MainActivity)
                        }
                        composable("resetPassword") {
                            ResetPasswordScreen(navController, authViewModel, this@MainActivity)
                        }
                    }
                }
            }
        }
    }
}