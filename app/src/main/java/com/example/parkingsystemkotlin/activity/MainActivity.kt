package com.example.parkingsystemkotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parkingsystemkotlin.databinding.ActivityMainBinding
import com.example.parkingsystemkotlin.listener.DialogFragmentParkingLotsListener
import com.example.parkingsystemkotlin.mvp.contract.ParkingContract
import com.example.parkingsystemkotlin.mvp.model.ParkingModel
import com.example.parkingsystemkotlin.mvp.presenter.ParkingPresenter
import com.example.parkingsystemkotlin.mvp.view.ParkingView

class MainActivity : AppCompatActivity(), DialogFragmentParkingLotsListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: ParkingContract.PresenterContract

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = ParkingPresenter(ParkingModel(), ParkingView(this))
        setListeners()
    }

    private fun setListeners() {
        binding.buttonMainParkingSize.setOnClickListener { presenter.onButtonPressed() }
    }

    override fun listenerSetParkingLotsOnClick(parkingLots: Int) {
        presenter.setParkingLots(parkingLots)
    }
}
