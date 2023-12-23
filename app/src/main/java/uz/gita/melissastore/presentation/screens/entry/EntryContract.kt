package uz.gita.melissastore.presentation.screens.entry

interface EntryContract {

    interface Direction {
        suspend fun openMainScreen()
    }

    interface ViewModel{
        fun onEventDispatcher(intent: Intent)
    }

    sealed interface Intent {
        object EnterButtonClicked:Intent
    }


}