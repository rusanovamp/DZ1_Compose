package com.example.dz_1_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dz_1_compose.ui.theme.DZ_1_COMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DZ_1_COMPOSETheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name:String, modifier: Modifier = Modifier) {
    val numbers = listOf(
        12, 24, 30,
        16, 9, 1,
        45, 18, 5
    )
    Column {
        Text(
            text = "Числа",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = modifier
        ) {
            items(numbers) { number ->
                Box(
                    modifier = modifier
                        .padding(4.dp)
                        //.size(100.dp)
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = number.toString())
                }
            }
        }
    }
}
/*fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(12.dp)
    ) {
        Text(
            text = "Числа",
            fontSize = 24.sp
        )
        Row {
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "12")
            }
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "2")
            }
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "36")
            }
        }
        Row {
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "3")
            }
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "18")
            }
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "5")
            }
        }
        Row {
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "9")
            }
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "25")
            }
            Box(
                modifier = modifier
                    .size(100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "6")
            }
        }
    }
}

 */



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DZ_1_COMPOSETheme {
        Greeting("Android")
    }
}