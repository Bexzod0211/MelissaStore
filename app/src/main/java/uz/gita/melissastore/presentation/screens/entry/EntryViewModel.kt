package uz.gita.melissastore.presentation.screens.entry

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EntryViewModel @Inject constructor(
    private val direction: EntryContract.Direction
) :EntryContract.ViewModel,ViewModel(){
    override fun onEventDispatcher(intent: EntryContract.Intent) {
        when(intent){
            EntryContract.Intent.EnterButtonClicked->{
                viewModelScope.launch {
                    direction.openMainScreen()
                }
            }
        }
    }

}