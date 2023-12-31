package uz.gita.melissastore.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.gita.melissastore.theme.TianLianSky

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditTextField(
    value:String,
    onValueChange:(String)->Unit,
    placeholder: String,
    trailingIcon:@Composable ()->Unit = {},
    visualTransformation: VisualTransformation = VisualTransformation.None,
    isError:Boolean = false
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 16.dp,
            )
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = TianLianSky,
            unfocusedBorderColor = Color.Gray
        ),
        shape = RoundedCornerShape(10.dp),
        label = {
            Text(text = placeholder)
        },
        trailingIcon = trailingIcon,
        visualTransformation = visualTransformation,
        textStyle = TextStyle(
            fontSize = 17.sp
        ),
        isError = isError,
        supportingText = {
            if (isError){
                Text(
                    text = "[3-10] belgidan iborat bo'lishi shart",
                    color = Color.Red,
                    style = TextStyle(
                        fontSize = 16.sp
                    )
                )
            }
        },
        maxLines = 1
    )
}