package ru.bdim.kotlinlessons.view

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import ru.bdim.kotlinlessons.R
import ru.bdim.kotlinlessons.view_model.DateViewModal

class DateActivity : AppCompatActivity() {

    private lateinit var viewModel : DateViewModal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(DateViewModal::class.java)
        viewModel.showDate().observe(this, Observer {
            tvw_date.text = it
        })
        btn_date.setOnClickListener {
            viewModel.nextDate()
        }
    }
}