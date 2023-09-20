package com.madebyshedrack.socialape.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.madebyshedrack.socialape.data.UserDataUiEvents
import com.madebyshedrack.socialape.data.UserInputScreenState

class UserInputViewModel : ViewModel() {
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvents(event: UserDataUiEvents){
        when(event){
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }
            is UserDataUiEvents.GenderSelected -> {
                uiState.value = uiState.value.copy(
                    genderSelected = event.genderValue
                )
            }
        }
    }

    fun isValidState() : Boolean {
        if (!uiState.value.nameEntered.isNullOrEmpty() && !uiState.value.genderSelected.isNullOrEmpty()){
            return true
        } else {
            return false
        }
    }
}
