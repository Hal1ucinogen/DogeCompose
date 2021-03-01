package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Cat

@Composable
fun CatDetail(cat: Cat, onAdopt: (Cat) -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
    ) {
        Box {
            Image(
                painterResource(cat.picture),
                cat.name,
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Button(
                { onAdopt(cat) },
                Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Text(text = "Adopt")
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(16.dp, 8.dp)
                .fillMaxWidth()
        ) {
            ProvideTextStyle(MaterialTheme.typography.h6) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Name:")
                    Text(cat.name)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Location:")
                    Text(cat.location)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Age:")
                    Text(cat.age)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Gender:")
                    Text(cat.gender)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Size:")
                    Text(cat.size)
                }
            }
        }
    }
}

@Preview
@Composable
fun CatDetailPreview() {
    CatDetail(
        Cat("Oliver", "Beijing", "Adult", "Male", "Large", R.drawable.ragroll01)
    )
}