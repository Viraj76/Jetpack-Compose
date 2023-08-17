package com.example.jetpackcompose.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.modifiers.ui.theme.JetpackComposeTheme

// sequence matters in modifiers
// chaining possible , if there is any requirement to change the properties of compose i.e. we ill
// pass the modifier as a parameter
class ModifiersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

//@Preview(showBackground = true, widthDp = 200, heightDp = 300)
@Composable
fun PracticeModifiers() {
    Text(
        text = "Hey",
        color = Color.White,
        modifier = Modifier
            .background(Color.Cyan)
            .padding(23.dp)
            .clickable { }
    )
}
@Preview(showSystemUi = true, widthDp = 200, heightDp = 300)
@Composable
fun RoundImage() {
    Image(
        painter = painterResource(id = R.drawable.dummy),
        contentScale = ContentScale.Crop,
        modifier =  Modifier.size(8.dp)
            .clip(CircleShape)
            .border(4.dp, Color.Gray,CircleShape)
        ,contentDescription = ""
    )
}
