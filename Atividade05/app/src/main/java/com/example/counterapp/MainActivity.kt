package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counterapp.ui.theme.CounterAppTheme

import kotlin.math.ceil
import kotlin.math.floor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color =
                MaterialTheme.colorScheme.background) {
                    CounterApp()
                }
            }
        }
    }
}
@Composable
fun CounterApp() {

    var result by remember { mutableStateOf( 0.0) }
    var input by remember { mutableStateOf( "") }

    // Estrutura em coluna para alinhar elementos verticalmente
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // Alinhamento horizontal centralizado
        modifier = Modifier
            .fillMaxSize() // Ocupa todo o espaço disponível
            .padding(16.dp), // Adiciona espaçamento nas bordas
        verticalArrangement = Arrangement.Center // Centraliza os elementos verticalmente
    ) {
        // Exibe o resultado atual
        Text(
            text = "Resultado: $result",
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center
        )
        // Campo de entrada para número, onde o usuário digita um valor
        OutlinedTextField(
            value = input,
            onValueChange = { input = it }, // Atualiza o valor de input com o valor digitado
            label = { Text("Digite um número") },
            modifier = Modifier.fillMaxWidth() // Ocupa a largura total
        )
        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre o campo de entrada e os botões
        // Linha com os botões de incremento e decremento
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp), // Espaçamento entre os botões
            modifier = Modifier.fillMaxWidth()
        ) {
            // Botão Incrementar
            Button(
                onClick = {
                    result += input.toDoubleOrNull() ?: 0.0 // Adiciona o valor digitado ao resultado
                    input = "" // Limpa o campo de entrada
                },
                modifier = Modifier.weight(1f) // O botão ocupa metade da linha
            ) {
                Text("Incrementar")
            }
            // Botão Decrementar
            Button(
                onClick = {
                    result -= input.toDoubleOrNull() ?: 0.0 // Subtrai o valor digitado do resultado
                    input = "" // Limpa o campo de entrada
                },
                modifier = Modifier.weight(1f) // O botão ocupa metade da linha
            ) {
                Text("Decrementar")
            }
        }
        // Linha com os botões de multiplicação e divisão
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp), // Espaçamento entre os botões
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp) // Espaçamento superior
        ) {
            // Botão Multiplicar
            Button(
                onClick = {
                    result *= input.toDoubleOrNull() ?: 1.0 // Multiplica o resultado pelo valor digitado
                    input = "" // Limpa o campo de entrada
                },
                modifier = Modifier.weight(1f) // O botão ocupa metade da linha
            ) {
                Text("Multiplicar")
            }
            // Botão Dividir
            Button(
                onClick = {
                    val value = input.toDoubleOrNull() ?: 1.0
                    if (value != 0.0) { // Verifica se o valor não é zero para evitar divisão por zero
                        result /= value // Divide o resultado pelo valor digitado
                    }
                    input = "" // Limpa o campo de entrada
                },
                modifier = Modifier.weight(1f) // O botão ocupa metade da linha
            ) {
                Text("Dividir")
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Button(
                onClick = {
                    result = floor(result)
                },
                modifier = Modifier.weight(1f)
            ) {
                Text("Arredondar para baixo", textAlign = TextAlign.Center)
            }

            Button(
                onClick = {
                    result = ceil(result)
                },
                modifier = Modifier.weight(1f)
            ) {
                Text("Arredondar para cima", textAlign = TextAlign.Center)
            }
        }
        Spacer(modifier = Modifier.height(16.dp)) // Espaço antes do botão Limpar
        // Botão Limpar para redefinir o resultado e o campo de entrada
        Button(
            onClick = {
                result = ceil(result) // Redefine o resultado para zero
            },
            modifier = Modifier.fillMaxWidth() // O botão ocupa a largura total
        ) {
            Text("Limpar")
        }
    }
}