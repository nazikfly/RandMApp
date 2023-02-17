package com.geektech.randmapp.ui.home



import com.geektech.domain.domain.model.Characters

data class HomeState(
    val characters: List<Characters> = emptyList(),
    val showPrevious: Boolean = false,
    val showNext: Boolean = false,
    val isLoading: Boolean = false
)