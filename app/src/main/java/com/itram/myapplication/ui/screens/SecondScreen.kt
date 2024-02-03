package com.itram.myapplication.ui.screens


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController, text: String? = null) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Second Screen") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        modifier = Modifier.clickable { navController.popBackStack() }
                    )
                }
            )
        }
    ) { innedPadding ->
        SecondBodyContent(navController, innedPadding, text)
    }
}

@Composable
fun SecondBodyContent(navController: NavController, innedPadding: PaddingValues, text: String?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innedPadding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "I Navigate")
        text?.let {
            Text(text = it)
        }
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Back")
        }
    }
}