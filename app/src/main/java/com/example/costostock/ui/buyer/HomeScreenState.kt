package com.example.costostock.ui.buyer

import com.example.costostock.data.model.Offer

enum class ViewMode { MAP, LIST }

data class HomeScreenUiState(
    val isLoading: Boolean = false,
    val offers: List<Offer> = emptyList(),
    val selectedViewMode: ViewMode = ViewMode.LIST,
    val searchQuery: String = ""
)