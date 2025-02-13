package com.example.contasnamao.ui.theme.searchBar

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    value: String,
    labelText: String? = null
    ){
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = {labelText?.let {Text(it) }},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = modifier
    )
}

@Preview
@Composable
private fun SearchBarPreview(){
    SearchBar(labelText = "Label",onValueChange = {}, value = "0")
}