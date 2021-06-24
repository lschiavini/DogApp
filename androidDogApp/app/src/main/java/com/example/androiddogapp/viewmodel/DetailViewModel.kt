package com.example.androiddogapp.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.androiddogapp.model.DogBreed
import com.example.androiddogapp.model.DogDatabase
import kotlinx.coroutines.launch

class DetailViewModel(application: Application) : BaseViewModel(application) {
    val dogLiveData = MutableLiveData<DogBreed>()
    var dogsLoaded = listOf<DogBreed>()

    fun fetch(uuid: Int) {
        launch {
            val dog = DogDatabase(getApplication()).dogDao().getDog(uuid)
            dogLiveData.value = dog
        }
    }

}