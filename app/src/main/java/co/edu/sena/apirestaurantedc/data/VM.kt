package co.edu.sena.apirestaurantedc.data

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VM :ViewModel(){
    val _status = MutableLiveData<String>()
    val status:LiveData<String> = _status

    init {
        getLogo()
    }

    private fun getLogo(){
        /////////////////////////
        viewModelScope.launch {
            //val listaR = APIService.service.getLogo()
            _status.value = "OK"
        }
        /////////////////////////
    }

}