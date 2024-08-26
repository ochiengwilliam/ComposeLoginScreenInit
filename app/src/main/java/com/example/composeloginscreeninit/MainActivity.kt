package com.example.composeloginscreeninit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                 Login()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(){

    var rememberMeChecked by remember { mutableStateOf(false) }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Login", fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 48.dp, top = 48.dp)

        )

        OutlinedTextField(value = "" ,
            onValueChange = {},
            label ={Text(text = "Username")},

            leadingIcon = {
               Icon(painter = painterResource(id = R.drawable.person),

                   contentDescription = null)
            },

            modifier = Modifier

                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(CircleShape)
                .background(Color(0xFFF2F2F2)),

            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )

        OutlinedTextField(value = "" ,
            onValueChange = {},
            label ={Text(text = "Password")},
            
            leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.lock),
                        contentDescription = null
                    )

            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(CircleShape)
                .background(Color(0xFFF2F2F2)),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )


        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){

           Checkbox(checked = rememberMeChecked,

               onCheckedChange ={rememberMeChecked = it },

               colors = CheckboxDefaults.colors(checkedColor =Color(0xFFFFC107)


               ))


            Text(text = "Remember me",
                color = Color.Gray,
                modifier = Modifier.padding(start = 8.dp))
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(CircleShape)
            .background(
                brush = Brush.horizontalGradient
                    (
                    listOf(
                        Color(0xFFFFC107),
                        Color(0xFFF44336)

                    )
                )
            )


        ){
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = PaddingValues()
                ) {
                
                Text(text = "Login",
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )

            }


        }}}






