package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 300)
@Composable
//cannot scroll with the normal column
// columns renders all the data that we don't want i.e. here in compose lazyColumns are there to implement this 
fun PreviewItem(){
    LazyColumn(content = {
        items(getCategories()){category->
            BlogCategory(img = category.image, title = category.title , subtitle = category.subTitle )
        }
    })
}

@Composable
fun BlogCategory(img : Int, title : String, subtitle : String) {
    Card(
        modifier = Modifier
            .padding(8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                modifier = Modifier
                    .size(50.dp)
                    .padding(8.dp)
                    .weight(.2f),
                contentDescription = "",
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Thin
        )
    }
}


data class Category(
    val image : Int,
    val title : String,
    val subTitle : String
)

fun getCategories(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.a, "Programming", "Learn New Language"))
    list.add(Category(R.drawable.b, "Full Stack", "From backend to frontend"))
    list.add(Category(R.drawable.c, "DevOps", "Deployment , CI , CD"))
    list.add(Category(R.drawable.d, "AI & ML", "Basics AI"))
    list.add(Category(R.drawable.e, "Technology", "News about new tech"))
    list.add(Category(R.drawable.a, "Programming", "Learn New Language"))
    list.add(Category(R.drawable.b, "Full Stack", "From backend to frontend"))
    list.add(Category(R.drawable.c, "DevOps", "Deployment , CI , CD"))
    list.add(Category(R.drawable.d, "AI & ML", "Basics AI"))
    list.add(Category(R.drawable.e, "Technology", "News about new tech"))
    list.add(Category(R.drawable.a, "Programming", "Learn New Language"))
    list.add(Category(R.drawable.b, "Full Stack", "From backend to frontend"))
    list.add(Category(R.drawable.c, "DevOps", "Deployment , CI , CD"))
    list.add(Category(R.drawable.d, "AI & ML", "Basics AI"))
    list.add(Category(R.drawable.e, "Technology", "News about new tech"))
    list.add(Category(R.drawable.a, "Programming", "Learn New Language"))
    list.add(Category(R.drawable.b, "Full Stack", "From backend to frontend"))
    list.add(Category(R.drawable.c, "DevOps", "Deployment , CI , CD"))
    list.add(Category(R.drawable.d, "AI & ML", "Basics AI"))
    list.add(Category(R.drawable.e, "Technology", "News about new tech"))

    return list
}