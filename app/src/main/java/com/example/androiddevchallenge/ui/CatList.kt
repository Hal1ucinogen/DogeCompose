/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Cat
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun CatList(cats: List<Cat>, onClick: (Cat) -> Unit) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.background(MaterialTheme.colors.secondary)
    ) {
        items(cats) { cat ->
            CatItem(
                cat,
                Modifier
                    .clickable { onClick(cat) }
                    .fillMaxWidth()
            )
        }
    }
}


@Composable
fun CatItem(cat: Cat, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row {
            Image(
                painter = painterResource(cat.picture),
                contentDescription = cat.name,
                Modifier
                    .size(100.dp)
                    .clip(CutCornerShape(8.dp)),
                contentScale = ContentScale.Crop,
            )
            Column(Modifier.padding(8.dp)) {
                Text(cat.name, style = MaterialTheme.typography.h6)
                val content = "${cat.age} - ${cat.gender} - ${cat.location}"
                Text(content, style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun CatPreview() {
    MyTheme {
        CatItem(
            Cat("Oliver", "Beijing", "Adult", "Male", "Large", R.drawable.ragroll01)
        )
    }
}

