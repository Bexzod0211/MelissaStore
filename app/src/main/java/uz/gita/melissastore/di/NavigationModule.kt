package uz.gita.melissastore.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.melissastore.presentation.navigation.AppNavigator
import uz.gita.melissastore.presentation.navigation.NavigationDispatcher
import uz.gita.melissastore.presentation.navigation.NavigationHandler

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    fun bindAppNavigator(impl:NavigationDispatcher):AppNavigator

    @Binds
    fun bindNavigationHandler(impl:NavigationDispatcher):NavigationHandler

}