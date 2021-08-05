package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentDateTimePickerContract

class DialogFragmentDateTimePickerPresenter(private var view: DialogFragmentDateTimePickerContract.ViewContract) :
    DialogFragmentDateTimePickerContract.PresenterContract {

    override fun onCancelButtonPressed() {
        view.dismissDialogFragment()
    }
}
