package com.example.jetpackcompose.built_in_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField


import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview


class BuiltInCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // to run add the compose here
        }
    }
}

//@Preview(showSystemUi = true)


//Text Input , we can only type if we write in this way i.e. the state change

//@Composable
//fun TestButton(){
//    val state = remember{mutableStateOf("")}
//    TextField(
//        value = state.value,
//        onValueChange = {
//            state.value = it
//        },
//        label = { Text(text = "Enter Message")}
//    )
//}




//Image compose

//@Composable
//fun TestImage(){
//    Image(
//        painter = painterResource(id = R.drawable.dummy),
//        contentDescription = "Dummy Image",
//        alignment = Alignment.Center,
//        colorFilter = ColorFilter.tint(Color.Blue),
//        contentScale = ContentScale.FillHeight
//    )
//
//}


// TEXT COMPOSE

//@Composable
//fun Greeting() {
//    Text(
//        text = "Hello Viraj",
//    )
//}

