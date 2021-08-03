package com.example.parkingsystemkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.parkingsystemkotlin.databinding.DialogFragmentDateTimePickerBinding
import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentDateTimePickerContract
import com.example.parkingsystemkotlin.mvp.presenter.DialogFragmentDateTimePickerPresenter
import com.example.parkingsystemkotlin.mvp.view.DialogFragmentDateTimePickerView

class DialogFragmentDateTimePicker : DialogFragment() {
    private lateinit var binding: DialogFragmentDateTimePickerBinding
    private lateinit var presenter: DialogFragmentDateTimePickerContract.PresenterContract

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DialogFragmentDateTimePickerBinding.inflate(layoutInflater)
        presenter = DialogFragmentDateTimePickerPresenter(DialogFragmentDateTimePickerView(this))

        setListeners()
        return binding.root
    }

    private fun setListeners() {
        binding.buttonCancelDialogFragmentParkingSize.setOnClickListener { presenter.onCancelButtonPressed() }
    }
}
