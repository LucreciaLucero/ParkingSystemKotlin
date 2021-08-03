package com.example.parkingsystemkotlin.mvp.contract

interface DialogFragmentDateTimePickerContract {
    interface PresenterContract {
        fun onCancelButtonPressed()
    }

    interface ViewContract {
        fun dismissDialogFragment()
    }
}
