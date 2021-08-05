package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.mvp.contract.ReservationActivityContract

class ReservationPresenter(private var view: ReservationActivityContract.ViewContract) : ReservationActivityContract.PresenterContract {
    override fun dateTimePickerButtonStartPressed() {
        view.showDateTimeInfo()
    }

    override fun dateTimePickerButtonEndPressed() {
        view.showDateTimeInfo()
    }

    override fun buttonCancelReservation() {
        view.dismissActivity()
    }
}
