package com.example.msgapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.msgapp.repository.MessageRepository


class MessageViewModelFactory(private val repository: MessageRepository): ViewModelProvider.Factory {
    override fun <T: ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MessageViewModel::class.java)) {
            return MessageViewModel(repository) as T
        }
        throw IllegalArgumentException("Erro ao acessar o viewModel")
    }

}