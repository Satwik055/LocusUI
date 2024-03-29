package com.satwik.locusui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.satwik.locusui.theme.Grey
import com.satwik.locusui.theme.LightGrey
import com.satwik.locusui.theme.Purple
import com.satwik.locusui.theme.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpacesTextField(
    modifier: Modifier = Modifier,
    text:String,
    fontFamily: FontFamily = poppins,
    onValueChange: (String) -> Unit,
    placeholder:String,
    errorText: String = "",
    enabled:Boolean = true,
    isError:Boolean = false
){
    OutlinedTextField(
        modifier = modifier,
        value = text,
        enabled = enabled,
        onValueChange = onValueChange,
        isError = isError,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            cursorColor = Purple,
            focusedBorderColor = Purple,
            unfocusedBorderColor = Grey,
            errorBorderColor = Color.Red,
        ),
        singleLine = true,
        supportingText = { Text(text = errorText, color = Color.Red, fontSize = 13.sp)},
        textStyle = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp, color = Color.White),
        placeholder = {
            Text(
                text = placeholder,
                color = LightGrey,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal
            )
        }
    )

}

@Preview
@Composable
fun PreviewOutlinedTextField(){

}