package com.example.fruithubapp.screens

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fruithubapp.HomeActivity

@Composable
fun loginform(){
    
    var name by remember{ mutableStateOf("") }
    var password by remember{mutableStateOf("")}

    Box(Modifier.fillMaxSize().background(brush = Brush.verticalGradient(colors = listOf(Color(0xFFFFE0CC),Color.White))),contentAlignment = Alignment.Center){
        Card(modifier= Modifier.fillMaxWidth(0.9f).wrapContentHeight(),elevation = CardDefaults.cardElevation(8.dp),colors = CardDefaults.cardColors(containerColor = Color.White),shape= RoundedCornerShape(16.dp)){
            Column(modifier = Modifier.padding(20.dp)){
                Text("Username",modifier=Modifier.fillMaxWidth().padding(start = 5.dp), color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                OutlinedTextField(value = name,
                    onValueChange = {name=it},
                    label={Text("username")},
                    placeholder = {Text("eg: aaniket_rana")},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = Color.Black
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Black,
                        unfocusedBorderColor = Color.LightGray
                    )
                )

                Spacer(modifier=Modifier.fillMaxWidth().height(20.dp))

                Text("Password",modifier=Modifier.fillMaxWidth().padding(start = 5.dp), color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                OutlinedTextField(value = password,
                    onValueChange = {password=it},
                    visualTransformation = androidx.compose.ui.text.input.PasswordVisualTransformation(),
                    label={Text("password")},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = Color.Black
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Black,
                        unfocusedBorderColor = Color.LightGray
                    )
                )

                Spacer(modifier=Modifier.fillMaxWidth().height(30.dp))

                val context = androidx.compose.ui.platform.LocalContext.current
                Button(onClick = {
                        val intent = Intent(context, HomeActivity::class.java)
                        intent.putExtra("username",name)
                        intent.putExtra("password",password)
                        context.startActivity(intent)
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = Color(0xFFFF5722))) {
                    Text("Go to Next Screen", fontSize=18.sp)
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun preview(){
    loginform()
}