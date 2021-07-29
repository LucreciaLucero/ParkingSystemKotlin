package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.listener.DialogFragmentParkingLotsListener
import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentParkingLotsContract

class DialogFragmentParkingLotsPresenter(private var view: DialogFragmentParkingLotsContract.ViewContract) :
    DialogFragmentParkingLotsContract.PresenterContract {
    override fun onSaveButtonPressed(listenerParkingLots: DialogFragmentParkingLotsListener) {
        val spaces: String = view.getParkingsAvailable()
        if (spaces.isNotEmpty()) {
            listenerParkingLots.listenerSetParkingLotsOnClick(spaces.toInt())
        }
        view.dismissDialogFragmentParkingLots()
    }

    override fun onCancelButtonPressed() {
        view.dismissDialogFragmentParkingLots()
    }
}
