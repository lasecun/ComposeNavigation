package com.itram.myapplication.ui.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.itram.myapplication.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController) {
    Scaffold { innedPadding ->
        BodyContent(navController, innedPadding)
    }
}

@Composable
fun BodyContent(navController: NavController, innedPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innedPadding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello Navigation!")
        Button(onClick = {
            navController.navigate(
                AppScreens.SecondScreen.route +
                        "/This is a parameter"
            )
        }) {
            Text(text = "Navigate")
        }
    }
}