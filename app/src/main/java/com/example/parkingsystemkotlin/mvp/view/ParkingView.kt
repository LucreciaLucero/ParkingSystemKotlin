package com.example.parkingsystemkotlin.mvp.view

import android.app.Activity
import com.example.parkingsystemkotlin.R
import com.example.parkingsystemkotlin.fragment.DialogFragmentParkingLots
import com.example.parkingsystemkotlin.mvp.contract.ParkingContract
import com.example.parkingsystemkotlin.mvp.view.base.ActivityView
import com.example.parkingsystemkotlin.utils.ConstantUtils
import com.example.parkingsystemkotlin.utils.toast

class ParkingView(activity: Activity) : ActivityView(activity), ParkingContract.ViewContract {
    override fun showDialogParkingsAvailable() {
        fragmentManager?.let {
            DialogFragmentParkingLots().show(it, ConstantUtils.DIALOG_FRAGMENT_TAG)
        }
    }

    override fun showMessageOfParkingLots(parkingsAvailable: Int) {
        context?.let {
            it.toast(it.getString(R.string.toast_main_parking_size, parkingsAvailable))
        }
    }
}
