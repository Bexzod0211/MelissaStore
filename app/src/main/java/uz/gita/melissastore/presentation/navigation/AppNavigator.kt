package uz.gita.melissastore.presentation.navigation

import cafe.adriel.voyager.androidx.AndroidScreen

typealias AppScreen = AndroidScreen

interface AppNavigator {

    suspend fun back()
    suspend fun navigateTo(screen: AppScreen)
    suspend fun replace(screen:AppScreen)


}