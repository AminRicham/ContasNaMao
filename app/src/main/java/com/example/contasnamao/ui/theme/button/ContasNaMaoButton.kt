package com.example.contasnamao.ui.theme.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ContasNaMaoButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
    onClick: () -> Unit
){
    Button(
        modifier = modifier,
        onClick = onClick
    ) {
        Row {
            iconRes?.let{Icon(painter = painterResource(id = iconRes), contentDescription = "Ícone do botão" )}
            text?.let { Text(text = text.uppercase()) }
        }
    }
}

@Preview
@Composable
fun ContasNaMaoButtonPreview(){
    ContasNaMaoButton(modifier = Modifier.fillMaxWidth(), onClick = {}, text = "Enviar dados")
}