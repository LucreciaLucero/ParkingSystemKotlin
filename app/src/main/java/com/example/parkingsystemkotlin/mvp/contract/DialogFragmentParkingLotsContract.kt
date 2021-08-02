package com.example.parkingsystemkotlin.mvp.contract

import com.example.parkingsystemkotlin.listener.DialogFragmentParkingLotsListener

interface DialogFragmentParkingLotsContract {
    interface PresenterContract {
        fun onSaveButtonPressed(listenerParkingLots: DialogFragmentParkingLotsListener)
        fun onCancelButtonPressed()
    }

    interface ViewContract {
        fun getParkingsAvailable(): String
        fun dismissDialogFragmentParkingLots()
    }
}
