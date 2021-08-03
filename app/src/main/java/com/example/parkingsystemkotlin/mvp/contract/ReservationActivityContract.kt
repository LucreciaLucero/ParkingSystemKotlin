package com.example.parkingsystemkotlin.mvp.contract

interface ReservationActivityContract {
    interface PresenterContract {
        fun dateTimePickerButtonStartPressed()
        fun dateTimePickerButtonEndPressed()
        fun buttonCancelReservation()
    }

    interface ViewContract {
        fun showDateTimeInfo()
        fun dismissActivity()
    }
}
