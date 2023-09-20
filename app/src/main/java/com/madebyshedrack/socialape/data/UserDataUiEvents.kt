package com.madebyshedrack.socialape.data

sealed class UserDataUiEvents {
    data class UserNameEntered(val name: String) : UserDataUiEvents()
    data class GenderSelected(val genderValue: String) : UserDataUiEvents()
}
