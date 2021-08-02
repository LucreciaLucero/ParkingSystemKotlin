package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.listener.DialogFragmentParkingLotsListener
import com.example.parkingsystemkotlin.mvp.contract.DialogFragmentParkingLotsContract
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.verifyNoMoreInteractions
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Test

class DialogFragmentParkingLotsPresenterTest {
    private val view: DialogFragmentParkingLotsContract.ViewContract = mock()
    private val presenter: DialogFragmentParkingLotsContract.PresenterContract = DialogFragmentParkingLotsPresenter(view)
    private val listener: DialogFragmentParkingLotsListener = mock()

    @Test
    fun `on save button pressed test`() {
        whenever(view.getParkingsAvailable()).thenReturn(PARKING_LOT_STRING)

        presenter.onSaveButtonPressed(listener)

        verify(view).dismissDialogFragmentParkingLots()
        verify(listener).listenerSetParkingLotsOnClick(PARKING_LOT_INT)
    }

    @Test
    fun `on save button pressed empty string test`() {
        whenever(view.getParkingsAvailable()).thenReturn(PARKING_LOT_EMPTY_STRING)

        presenter.onSaveButtonPressed(listener)

        verify(view).dismissDialogFragmentParkingLots()
        verifyNoMoreInteractions(listener)
    }

    @Test
    fun `on cancel button pressed`() {
        presenter.onCancelButtonPressed()

        verify(view).dismissDialogFragmentParkingLots()
    }

    companion object {
        private const val PARKING_LOT_STRING: String = "10"
        private const val PARKING_LOT_INT: Int = 10
        private const val PARKING_LOT_EMPTY_STRING: String = ""
    }
}
