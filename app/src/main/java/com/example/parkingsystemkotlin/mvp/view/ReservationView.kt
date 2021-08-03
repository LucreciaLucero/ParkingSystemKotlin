package com.example.parkingsystemkotlin.mvp.view

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import com.example.parkingsystemkotlin.fragment.DialogFragmentDateTimePicker
import com.example.parkingsystemkotlin.mvp.contract.ReservationActivityContract
import com.example.parkingsystemkotlin.mvp.view.base.ActivityView
import com.example.parkingsystemkotlin.utils.ConstantUtils

class ReservationView(activity: Activity) : ActivityView(activity),
    ReservationActivityContract.ViewContract {

    override fun showDateTimeInfo() {
        fragmentManager?.let {
            DialogFragmentDateTimePicker().show(it, ConstantUtils.DIALOG_FRAGMENT_RESERVATION_TAG)
        }
    }

    override fun dismissActivity() {
        (activity as AppCompatActivity).finish()
    }
}
