package com.example.jetpackcompose.built.`in`.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.built.`in`.layouts.ui.theme.JetpackComposeTheme

class BuiltInLayouts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 400)
@Composable
fun LayoutPreview() {

    Row {
        Image(painter = painterResource(id = R.drawable.profile), contentDescription = "profile",Modifier.size(50.dp))
        Column(
        ) {
            Text(
                text = "Viraj Gupta",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Fresher",
                fontWeight = FontWeight.Normal
            )
        }
    }
//    Box(
//        contentAlignment = Alignment.Center
//    ){
//        Image(
//            painter = painterResource(id = R.drawable.dummy),
//            contentDescription = "",
//
//        )
//        Image(
//            painter = painterResource(id = R.drawable.download),
//            contentDescription = "")
//    }


//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    ){
//        Text(text = "A", fontSize = 34.sp)
//        Text(text = "B", fontSize = 34.sp)
//    }

//    Column(
//        verticalArrangement = Arrangement.SpaceBetween,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "A", fontSize = 34.sp)
//        Text(text = "B", fontSize = 34.sp)
//    }

}
