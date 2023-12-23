package uz.gita.melissastore.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerDefaults
import androidx.compose.material3.DrawerDefaults.scrimColor
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.androidx.AndroidScreen
import kotlinx.coroutines.launch
import uz.gita.melissastore.R
import uz.gita.melissastore.data.models.MenuItem
import uz.gita.melissastore.theme.DrWhite

class MainScreen : AndroidScreen() {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        var scope = rememberCoroutineScope()
        var drawerState= rememberDrawerState(initialValue = DrawerValue.Closed)

        ModalNavigationDrawer(
            modifier = Modifier
                .background(
                    color = DrWhite
                )
                .fillMaxSize(),
            drawerState = drawerState,
            drawerContent = {

            },
        content = {
            Scaffold(
                topBar = {
                         AppBar {
                             scope.launch {
                                 drawerState.open()
                             }
                         }
                },
                content = {

                    it
                },

            )
        },
        )
    }

}

/*private val menuItems = listOf(
    MenuItem(1, R.drawable.ic_statistic,"Statistika"),
    MenuItem(2,R.drawable.ic_xisobot,"Hisobotlar"),
    MenuItem(3,R.drawable.ic_mahsulotlar,"Mahsulotlar"),
    MenuItem(4,R.drawable.ic_kategoriyalar,"Kategoriyalar"),
    MenuItem(5,R.drawable),
    MenuItem(),
    MenuItem(),
    MenuItem(),
    MenuItem(),
    MenuItem(),
    MenuItem(),
)*/

@Composable
private fun ScreenContent(){

}

@Preview
@Composable
private fun ScreenPreview() {
    ScreenContent()
}