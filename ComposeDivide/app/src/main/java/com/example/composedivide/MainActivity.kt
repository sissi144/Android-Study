package com.example.composedivide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedivide.ui.theme.ComposeDivideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDivideTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(
        Modifier.fillMaxHeight()
    ){
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Column(modifier = Modifier.weight(1f).background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text (
                    text = "Text composable",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text (
                    text = "Displays text and follows Material Design guidelines.",
                    textAlign = TextAlign.Justify,
                )
            }
            Column(modifier = Modifier.weight(1f).background(Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text (text = "Image composable")
                Text (text = "Creates a composable that lays out and draws a given Painter class object.")
            }
        }
        Column( Modifier.weight(1f)) {
            Column(modifier = Modifier.weight(1f).background(Color.Blue),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text (text = "Row composable")
                Text (text = "A layout composable that places its children in a horizontal sequence.")
            }
            Column(modifier = Modifier.weight(1f).background(Color.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text (text = "Column composable")
                Text (text = "A layout composable that places its children in a vertical sequence.")
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDivideTheme {
        Greeting("Android")
    }
}