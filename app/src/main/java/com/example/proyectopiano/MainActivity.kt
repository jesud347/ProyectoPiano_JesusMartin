package com.example.proyectopiano

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.media.MediaPlayer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectopiano.ui.theme.ProyectoPianoTheme
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoPianoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
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
fun MiPiano(){
    val context = LocalContext.current

    Column (modifier = Modifier.fillMaxWidth()
    ){

            Image(

                painter = painterResource(id = R.drawable.cabecero), // Reemplaza con el nombre de tu imagen
                contentDescription = "Piano Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

        Row (
            Modifier.fillMaxSize()
                .fillMaxWidth()
                .weight(1f)
        ){
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.Black)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.doo)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("DO") }
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.DarkGray)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.re)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("RE") }
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.Black)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.mi)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("MI") }
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.DarkGray)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.fa)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("FA") }
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.Black)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.sol)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("SOL") }
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.DarkGray)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.la)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("LA") }
            Row(
                modifier = Modifier
                    .height(400.dp)
                    .weight(1f)
                    .background(color = Color.Black)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.si)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    }
            ) { Text("SI") }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    MiPiano()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoPianoTheme {
        Greeting("Android")
    }
}