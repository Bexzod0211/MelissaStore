package uz.gita.melissastore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.melissastore.presentation.navigation.NavigationHandler
import uz.gita.melissastore.presentation.screens.entry.EntryScreen1
import uz.gita.melissastore.theme.MelissaStoreTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationHandler:NavigationHandler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MelissaStoreTheme {
                Navigator(screen = EntryScreen1()){navigator ->
                    LaunchedEffect(key1 = navigator){
                        navigationHandler.navBuffer
                            .onEach {navArgs->
                                navArgs.invoke(navigator)
                            }
                            .launchIn(lifecycleScope)
                    }
                    CurrentScreen()
                }
            }
        }
    }
}