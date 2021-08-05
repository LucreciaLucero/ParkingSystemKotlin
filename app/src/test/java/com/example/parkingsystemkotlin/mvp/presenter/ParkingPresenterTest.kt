package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.mvp.contract.ParkingContract
import com.example.parkingsystemkotlin.mvp.model.ParkingModel
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class ParkingPresenterTest {
    private val model: ParkingContract.ModelContract = ParkingModel()
    private val view: ParkingContract.ViewContract = mock()
    private val presenter: ParkingContract.PresenterContract = ParkingPresenter(model, view)

    @Test
    fun `on button pressed set parking lots test`() {
        presenter.onButtonPressed()

        verify(view).showDialogParkingsAvailable()
    }

    @Test
    fun `on set parking lots test`() {
        presenter.setParkingLots(PARKING_LOTS)

        assertEquals(PARKING_LOTS, model.getParkingAvailables())
        verify(view).showMessageOfParkingLots(model.getParkingAvailables())
    }

    @Test
    fun `on button reservation pressed test`() {
        presenter.onButtonReservationPressed()

        verify(view).showReservationScreen()
    }

    companion object {
        private const val PARKING_LOTS: Int = 10
    }
}
