package com.example.androiddogapp.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.androiddogapp.model.DogBreed
import com.example.androiddogapp.model.DogDatabase
import kotlinx.coroutines.launch

class DetailViewModel(application: Application) : BaseViewModel(application) {
    val dogLiveData = MutableLiveData<DogBreed>()
    var dogsLoaded = listOf<DogBreed>()

    fun fetchFromDatabaseAndSet(uuid: Int) {
        launch {
            val dogs = DogDatabase(getApplication()).dogDao().getAllDogs()
            setDogSelected(dogs, uuid)
        }
    }


    private fun setDogSelected(dogsList: List<DogBreed>, uuid: Int ) {
        val dogsListFiltered = dogsList.filter { dog -> dog.uuid == uuid }
        val defaultDog =
            DogBreed(
                "1",
                "Corgi",
                "15 years",
                "breedgroup",
                "bredFor",
                "temperament",
                ""
            )
        val dog = dogsListFiltered.elementAtOrElse(
            0 ){ defaultDog }

        dogLiveData.value = dog
    }

}