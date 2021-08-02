package com.example.parkingsystemkotlin.mvp.view

import com.example.parkingsystemkotlin.databinding.DialogFragmentParkingLotsBinding
import com.example.parkingsystemkotlin.fragment.DialogFragmentParkingLots
import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentParkingLotsContract
import com.example.parkingsystemkotlin.mvp.view.base.FragmentView

class DialogFragmentParkingLotsView(
    private var binding: DialogFragmentParkingLotsBinding,
    dialogFragmentParkingLots: DialogFragmentParkingLots
) : FragmentView(dialogFragmentParkingLots), DialogFragmentParkingLotsContract.ViewContract {
    override fun getParkingsAvailable(): String = binding.inputTextDialogFragmentParkingLots.text.toString()

    override fun dismissDialogFragmentParkingLots() {
        fragment?.let {
            (it as DialogFragmentParkingLots).dismiss()
        }
    }
}
