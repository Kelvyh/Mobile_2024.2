package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        title = "Workshop de Design UX/UI",
        description = "Aprenda as melhores práticas em UX/UI.",
        date = "2024-12-20",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id = 3,
        title = "Hackathon Internacional",
        description = "Colabore e resolva desafios tecnológicos.",
        date = "2024-12-25",
        location = "Escola de Engenharia",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 4,
        title = "Seminário de IA e Machine Learning",
        description = "Novas fronteiras da Inteligência Artificial.",
        date = "2024-12-30",
        location = "Instituto de Tecnologia",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    Event(
        id = 5,
        title = "Feira de Startups",
        description = "Encontre investidores e parceiros.",
        date = "2025-01-05",
        location = "Espaço Empreendedor",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    Event(
        id = 6,
        title = "Palestra sobre Cibersegurança",
        description = "Proteja seus dados no mundo digital.",
        date = "2025-01-10",
        location = "Auditório Principal",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    Event(
        id = 7,
        title = "Congresso de Realidade Aumentada",
        description = "Explorando o futuro da AR.",
        date = "2025-01-15",
        location = "Arena Digital",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    Event(
        id = 8,
        title = "Oficina de Programação Mobile",
        description = "Crie apps com Android e iOS.",
        date = "2025-01-20",
        location = "Laboratório de Computação",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 9,
        title = "Encontro de Desenvolvedores Web",
        description = "Novidades em frameworks e ferramentas.",
        date = "2025-01-25",
        location = "Hub Criativo",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    Event(
        id = 10,
        title = "Conferência de Robótica",
        description = "Soluções inovadoras em automação.",
        date = "2025-01-30",
        location = "Centro de Robótica",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img10
    )
)