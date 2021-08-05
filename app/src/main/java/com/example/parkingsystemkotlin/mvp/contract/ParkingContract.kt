package com.example.parkingsystemkotlin.mvp.contract

interface ParkingContract {
    interface PresenterContract {
        fun onButtonPressed()
        fun setParkingLots(parkingLots: Int)
        fun onButtonReservationPressed()
    }

    interface ModelContract {
        fun setParkingAvailables(parkingLots: Int)
        fun getParkingAvailables(): Int
    }

    interface ViewContract {
        fun showDialogParkingsAvailable()
        fun showMessageOfParkingLots(parkingsAvailable: Int)
        fun showReservationScreen()
    }
}
