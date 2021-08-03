package com.example.parkingsystemkotlin.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parkingsystemkotlin.databinding.ActivityReservationBinding
import com.example.parkingsystemkotlin.mvp.contract.ReservationActivityContract
import com.example.parkingsystemkotlin.mvp.presenter.ReservationPresenter
import com.example.parkingsystemkotlin.mvp.view.ReservationView

class ReservationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReservationBinding
    private lateinit var presenter: ReservationActivityContract.PresenterContract

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReservationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = ReservationPresenter(ReservationView(this))
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            buttonInitialDateTimePickerActivityReservation.setOnClickListener { presenter.dateTimePickerButtonStartPressed() }
            buttonEndDateTimePickerActivityReservation.setOnClickListener { presenter.dateTimePickerButtonEndPressed() }
            buttonCancelActivityReservation.setOnClickListener { presenter.buttonCancelReservation() }
        }
    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, ReservationActivity::class.java)
        }
    }
}
