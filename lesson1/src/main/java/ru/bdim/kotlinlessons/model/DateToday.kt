package ru.bdim.kotlinlessons.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

class DateToday {
    private val day = 24*60*60*1000
    private val liveData : MutableLiveData<Date> = MutableLiveData()

    init {
        liveData.value = Date()
    }

    fun date() : LiveData<Date> = liveData
    fun nextDate() : LiveData<Date> {
        var n : Date? = liveData.value

        n = Date(n!!.time + day)
        liveData.value = n
        return liveData
    }
}