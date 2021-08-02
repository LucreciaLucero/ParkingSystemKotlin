package com.example.parkingsystemkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.parkingsystemkotlin.databinding.DialogFragmentParkingLotsBinding
import com.example.parkingsystemkotlin.listener.DialogFragmentParkingLotsListener
import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentParkingLotsContract
import com.example.parkingsystemkotlin.mvp.presenter.DialogFragmentParkingLotsPresenter
import com.example.parkingsystemkotlin.mvp.view.DialogFragmentParkingLotsView

class DialogFragmentParkingLots : DialogFragment() {
    private lateinit var binding: DialogFragmentParkingLotsBinding
    private lateinit var presenter: DialogFragmentParkingLotsContract.PresenterContract
    private lateinit var listenerDialogFragment: DialogFragmentParkingLotsListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DialogFragmentParkingLotsBinding.inflate(layoutInflater)
        listenerDialogFragment = activity as DialogFragmentParkingLotsListener
        setListeners()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = DialogFragmentParkingLotsPresenter(DialogFragmentParkingLotsView(binding, this))
    }

    private fun setListeners() {
        binding.buttonSaveDialogFragmentParkingSize.setOnClickListener { presenter.onSaveButtonPressed(listenerDialogFragment) }
        binding.buttonCancelDialogFragmentParkingSize.setOnClickListener { presenter.onCancelButtonPressed() }
    }
}
