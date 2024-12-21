package com.example.a_start.ui.topics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun LoginScreen( modifier: Modifier = Modifier) {

    var textFieldState by remember { mutableStateOf("") }
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold (
        modifier = modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) } // Use snackBarHost here

    ){  padding ->

    Column (
       modifier = modifier
           .fillMaxWidth()
           .padding(horizontal = 30.dp,),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center
   ){
       TextField(
           value = textFieldState,
           onValueChange = {textFieldState = it},
           label = { //hint of what is displayed in the Text field
               Text( text = "Login")
           },
           singleLine = true,
           modifier = Modifier
               .fillMaxWidth()
               .padding(top = 300.dp),
       )

       Spacer(modifier = Modifier.height(16.dp))
       Button(onClick = {
           scope.launch {
               snackbarHostState.showSnackbar("Hello $textFieldState")
           }
       }) {
           Text("Please great me")
       }

    }

}
}