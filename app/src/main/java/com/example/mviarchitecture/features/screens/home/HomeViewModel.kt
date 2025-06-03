package com.example.mviarchitecture.features.screens.home

import androidx.lifecycle.ViewModel
import com.example.mviarchitecture.model.TodoItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    // Example business logic or UI state
    val title = "Home"
    private var nextId = 0

}