package uz.gita.melissastore.presentation.navigation

import cafe.adriel.voyager.navigator.Navigator
import kotlinx.coroutines.flow.Flow

typealias NavigationArgs = Navigator.()->Unit

interface NavigationHandler {
    val navBuffer:Flow<NavigationArgs>
}