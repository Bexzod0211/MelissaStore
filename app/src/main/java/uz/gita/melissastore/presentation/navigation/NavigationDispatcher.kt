package uz.gita.melissastore.presentation.navigation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationDispatcher @Inject constructor(

) :AppNavigator,NavigationHandler{
    override val navBuffer = MutableSharedFlow<NavigationArgs>()

    private suspend fun navigate(args:NavigationArgs){
        navBuffer.emit(args)
    }

    override suspend fun back() {
        navigate {
            pop()
        }
    }

    override suspend fun navigateTo(screen: AppScreen) {
        navigate {
            push(screen)
        }
    }

    override suspend fun replace(screen: AppScreen) {
        navigate {
            replace(screen)
        }
    }


}