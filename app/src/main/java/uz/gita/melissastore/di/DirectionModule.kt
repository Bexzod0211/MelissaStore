package uz.gita.melissastore.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.melissastore.presentation.screens.entry.EntryContract
import uz.gita.melissastore.presentation.screens.entry.EntryDirection

@Module
@InstallIn(ViewModelComponent::class)
interface DirectionModule {

    @Binds
    fun bindEntryDirection(impl:EntryDirection):EntryContract.Direction
}