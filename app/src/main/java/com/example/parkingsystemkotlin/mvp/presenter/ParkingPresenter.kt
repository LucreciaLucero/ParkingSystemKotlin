package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.mvp.contract.ParkingContract

class ParkingPresenter(private var model: ParkingContract.ModelContract, private var view: ParkingContract.ViewContract) :
    ParkingContract.PresenterContract {

    override fun onButtonPressed() {
        view.showDialogParkingsAvailable()
    }

    override fun setParkingLots(parkingLots: Int) {
        model.setParkingAvailables(parkingLots)
        view.showMessageOfParkingLots(model.getParkingAvailables())
    }

    override fun onButtonReservationPressed() {
        view.showReservationScreen()
    }
}
