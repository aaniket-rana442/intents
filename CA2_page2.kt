package com.example.fruithubapp.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.fruithubapp.R
import android.provider.Settings

@Composable
fun informationpage(name: String?, password: String?){
    Box(modifier=Modifier.fillMaxSize().background(brush=Brush.verticalGradient(colors = listOf(colorResource(R.color.backcolor),colorResource(R.color.white)))), contentAlignment = Alignment.Center){
        Card(modifier = Modifier.fillMaxWidth(0.9f).fillMaxHeight(0.9f), shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(containerColor = Color.White)){
            Column(modifier = Modifier.fillMaxSize().padding(20.dp)){
                Text("Actions", modifier = Modifier.fillMaxWidth(), fontSize = 25.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.SemiBold,color=Color.Black)

                Spacer(modifier = Modifier.fillMaxWidth().height(30.dp))

                Text("Transferred Data", modifier = Modifier.fillMaxWidth(),color=colorResource(R.color.textcolor), fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.fillMaxWidth().height(20.dp))
                Text("Username: ${name}", modifier = Modifier.fillMaxWidth(),color=Color.Black, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.fillMaxWidth().height(15.dp))
                Text("Password: ${password}", modifier = Modifier.fillMaxWidth(),color=Color.Black, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.fillMaxWidth().height(15.dp))
                Text("User Type: Student", modifier = Modifier.fillMaxWidth(),color=Color.Black, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)


                Spacer(modifier = Modifier.fillMaxWidth().height(50.dp))
                Spacer(modifier = Modifier.fillMaxWidth().height(1.dp).background(color = Color.Black))
                Spacer(modifier = Modifier.fillMaxWidth().height(75.dp))


                val context = LocalContext.current
                Text("Actions",color=colorResource(R.color.textcolor), fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(start=10.dp), fontSize = 20.sp)
                Spacer(modifier=Modifier.fillMaxWidth().height(10.dp))
                Button(onClick = {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://play.google.com/store/games?hl=en")
                    context.startActivity(intent)
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = Color(0xFFFF5722)))
                {
                    Text("Open Play Store", fontSize=18.sp)
                }

                Spacer(modifier=Modifier.fillMaxWidth().height(20.dp))
                Button(onClick = {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://web.whatsapp.com/")
                    context.startActivity(intent)
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = Color(0xFFFF5722)))
                {
                    Text("Open WhatsApp", fontSize=18.sp)
                }

                Spacer(modifier=Modifier.fillMaxWidth().height(20.dp))
                Button(onClick = {
                    val intent = Intent(Intent.ACTION_SENDTO)
                    intent.data = Uri.parse("mailto:rathoreaniket759@gmail.com")
                    intent.putExtra(Intent.EXTRA_SUBJECT, "My Subject")
                    intent.putExtra(Intent.EXTRA_TEXT, "Hope you must be doing great")
                    context.startActivity(intent)
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = Color(0xFFFF5722)))
                {
                    Text("Send an E-mail", fontSize=18.sp)
                }

                Spacer(modifier=Modifier.fillMaxWidth().height(20.dp))
                Button(onClick = {
                    val intent = Intent(Intent.ACTION_SENDTO)
                    intent.data = Uri.parse("smsto:7986545471")   // phone number
                    intent.putExtra("sms_body", "Hello, this is a test message")
                    context.startActivity(intent)
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = Color(0xFFFF5722)))
                {
                    Text("Send an SMS", fontSize=18.sp)
                }

                Spacer(modifier=Modifier.fillMaxWidth().height(20.dp))
                Button(onClick = {
                    val intent = Intent(Settings.ACTION_SETTINGS)
                    context.startActivity(intent)
                    },
                    modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = Color(0xFFFF5722)))
                {
                    Text("Open Device Settings", fontSize=18.sp)

                }
            }
        }
    }
}

