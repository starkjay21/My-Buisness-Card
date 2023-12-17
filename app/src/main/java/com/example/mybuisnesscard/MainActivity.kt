package com.example.mybuisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybuisnesscard.ui.theme.MyBuisnessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBuisnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Jayesh", "I am an Android Developer", "Meet Jayesh, a passionate individual with a zest for life and a heart that beats for Manchester United and football. Hailing from the vibrant world of android development, Jayesh is not just a coding wizard but a fervent supporter of the Red Devils. When he's not busy crafting innovative mobile applications, you'll find him immersed in the thrilling world of football, cheering on his favorite team with unwavering enthusiasm.")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, desc: String, about: String, modifier: Modifier = Modifier) {

    Column(modifier = Modifier.padding(
        top = 40.dp,
        start = 8.dp,
        end = 8.dp
    )) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = name,
                modifier =
                Modifier
                    .size(150.dp)
                    .align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {

                Text(
                    text = name,
                    fontSize = 32.sp,
                    color = Color.Blue,
                    modifier =
                    modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                )
                Text(
                    text = desc,
                    fontSize = 28.sp,
                    modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = about,
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyBuisnessCardTheme {
        Greeting("Jayesh Nayak", "I am an Android Developer", "Meet Jayesh, a passionate individual with a zest for life and a heart that beats for Manchester United and football. Hailing from the vibrant world of android development, Jayesh is not just a coding wizard but a fervent supporter of the Red Devils. When he's not busy crafting innovative mobile applications, you'll find him immersed in the thrilling world of football, cheering on his favorite team with unwavering enthusiasm.")
    }
}