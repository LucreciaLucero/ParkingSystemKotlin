package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentDateTimePickerContract
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class DialogFragmentDateTimePickerPresenterTest {
    private var view: DialogFragmentDateTimePickerContract.ViewContract = mock()
    private var presenter: DialogFragmentDateTimePickerContract.PresenterContract = DialogFragmentDateTimePickerPresenter(view)

    @Test
    fun `on cancel date time picker button pressed test`() {
        presenter.onCancelButtonPressed()

        verify(view).dismissDialogFragment()
    }
}
