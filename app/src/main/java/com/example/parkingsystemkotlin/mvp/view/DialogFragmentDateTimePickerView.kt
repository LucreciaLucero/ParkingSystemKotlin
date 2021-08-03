package com.example.parkingsystemkotlin.mvp.view

import androidx.fragment.app.DialogFragment
import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentDateTimePickerContract
import com.example.parkingsystemkotlin.mvp.view.base.FragmentView

class DialogFragmentDateTimePickerView(dialogFragment: DialogFragment) : FragmentView(dialogFragment),
    DialogFragmentDateTimePickerContract.ViewContract {

    override fun dismissDialogFragment() {
        (fragment as DialogFragment).dismiss()
    }
}
