package com.daveleeds.objcexport

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var nickname by remember { mutableStateOf(Nickname.Default) }
        val service = NicknameService()

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { nickname = service.generateRandomNickname() }) {
                Text("Generate username")
            }
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(nickname.toString(), fontSize = 32.sp)
            }
        }
    }
}
