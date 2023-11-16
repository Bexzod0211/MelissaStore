package uz.gita.melissastore.presentation.screens.entry01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.androidx.AndroidScreen
import uz.gita.melissastore.presentation.components.EditTextField
import uz.gita.melissastore.theme.KarimunBlue
import uz.gita.melissastore.theme.TianLianSky
import uz.gita.melissastore.theme.Typography

class EntryScreen1 : AndroidScreen() {
    @Composable
    override fun Content() {

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ScreenContent(){
    var login by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Melissa-store",
            style = Typography.displayLarge,
            modifier = Modifier
                .padding(
                    top = 16.dp,
                    start = 16.dp
                )
        )

        Spacer(
            modifier = Modifier
                .weight(1f)
        )


        Text(
            text =  "Tizimga kirish",
            style = Typography
                .displayMedium,
            modifier = Modifier
                .padding(start = 16.dp)
        )


        Text(
            text = "Lorem ipsum dolor sit amet, consectetur",
            style = Typography
                .displaySmall,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 8.dp
                )
        )

        Text(
            text = "Log in",
            style = Typography
                .headlineLarge,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    start = 16.dp
                )
        )

        EditTextField(
            value = login,
            onValueChange = {
                            login = it
            },
            placeholder = "Loginingizni kiriting"
        )

        Text(
            text = "Parol",
            style = Typography
                .headlineLarge,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    start = 16.dp
                )
        )

        EditTextField(
            value = password,
            onValueChange = {
                password= it
            },
            placeholder = "Parolingizni kiriting",
        )


        Box(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 48.dp
                )
                .fillMaxWidth()
                .height(60.dp)
                .background(
                    color = KarimunBlue,
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Kirish",
                style = Typography
                    .headlineMedium,
                color = Color.White
            )
        }

        Spacer(
            modifier = Modifier
                .weight(2f)
        )

    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenPreview() {
    ScreenContent()
}