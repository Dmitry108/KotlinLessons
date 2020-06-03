package ru.bdim.kotlinlessons.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.bdim.kotlinlessons.model.DateToday

class DateViewModal : ViewModel() {
    private val model = DateToday()
    private val liveData : MutableLiveData<String> = MutableLiveData()
    init {
        model.date().observeForever{
            liveData.value = it.toString()
        }
    }
    fun showDate() : LiveData<String> = liveData
    fun nextDate() {
        model.nextDate()
    }
}
