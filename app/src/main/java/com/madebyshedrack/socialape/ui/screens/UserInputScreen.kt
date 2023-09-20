package com.madebyshedrack.socialape.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.madebyshedrack.socialape.R
import com.madebyshedrack.socialape.data.UserDataUiEvents
import com.madebyshedrack.socialape.ui.ButtonComponent
import com.madebyshedrack.socialape.ui.GenderCard
import com.madebyshedrack.socialape.ui.TextComponent
import com.madebyshedrack.socialape.ui.TextFieldComponent
import com.madebyshedrack.socialape.ui.TopBar
import com.madebyshedrack.socialape.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi there \uD83D\uDE0A")
            TextComponent(
                textValue = "Explore SocialApe App!",
                textSize = 22.sp,
            )
            Spacer(modifier = Modifier.size(20.dp))
            TextComponent(
                textValue = "Please input your details, in other to proceed",
                textSize = 18.sp,
            )
            Spacer(modifier = Modifier.size(60.dp))
            TextComponent(textValue = "Name", textSize = 18.sp)
            Spacer(modifier = Modifier.size(10.dp))
            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvents(
                    UserDataUiEvents.UserNameEntered(it)
                )
            })
            Spacer(modifier = Modifier.size(20.dp))
            TextComponent(textValue = "Select your gender", textSize = 18.sp)
            Row(modifier = Modifier.fillMaxWidth()) {
                GenderCard(image = R.drawable.girl, selectGender = {
                    userInputViewModel.onEvents(
                        UserDataUiEvents.GenderSelected(it)
                    )
                }, selected = userInputViewModel.uiState.value.genderSelected == "Female")
                GenderCard(image = R.drawable.boy, selectGender = {
                    userInputViewModel.onEvents(
                        UserDataUiEvents.GenderSelected(it)
                    )
                }, selected = userInputViewModel.uiState.value.genderSelected == "Male")
            }
            Spacer(modifier = Modifier.weight(1f))
            if (userInputViewModel.isValidState()) {
                ButtonComponent(
                    goToProfileScreen = {

                    }
                )
            }

        }
    }
}

