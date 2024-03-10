package com.example.childcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.childcare.ui.theme.ChildCareTheme
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.FilledTonalButton
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip

class RegistrationForm : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChildCareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RegistrationForm("Android")
                }
            }
        }
    }
}

@Composable
fun RegistrationForm(name: String, modifier: Modifier = Modifier) {

    Column  (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .border(width = 4.dp,
                Color.Black)
            .clip(RoundedCornerShape(8.dp))
    ){
        Image(painter = painterResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .wrapContentHeight()
                .height(80.dp)
        )

        Text(
            text="Sign Up",
            Modifier.padding(20.dp)
        )

        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            label = { Text("Firstname") },
            placeholder = { Text("John") },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 15.dp)
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            label = { Text("Lastname") },
            placeholder = { Text("Doe") },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 15.dp)
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            label = { Text("Phone") },
            placeholder = { Text("+1406453444") },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 15.dp)
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            label = { Text("Email") },
            prefix = { Text("www.") },
            suffix = { Text(".com") },
            placeholder = { Text("google") },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 15.dp)
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            label = { Text("Password") },
            prefix = { Text("www.") },
            suffix = { Text(".com") },
            placeholder = { Text("google") },
        )

        RegistrationButton {

        }

    }
}

@Composable
fun RegistrationButton(onClick: () -> Unit) {
    Column (
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.padding(top = 16.dp)
    ) {
    }
    FilledTonalButton(onClick = { onClick() }) {
        Text("Sign Up")
    }
}

@Preview(showBackground = true)
@Composable
fun RegistrationPreview() {
    ChildCareTheme {
        RegistrationForm("Android")
    }
}
