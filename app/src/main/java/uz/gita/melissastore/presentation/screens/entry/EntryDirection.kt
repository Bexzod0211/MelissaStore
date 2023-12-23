package uz.gita.melissastore.presentation.screens.entry

import uz.gita.melissastore.presentation.navigation.AppNavigator
import uz.gita.melissastore.presentation.screens.main.MainScreen
import javax.inject.Inject

class EntryDirection @Inject constructor(
    private val appNavigator: AppNavigator
) : EntryContract.Direction{
    override suspend fun openMainScreen() {
        appNavigator.navigateTo(MainScreen())
    }
}