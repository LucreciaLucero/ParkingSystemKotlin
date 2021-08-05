package com.example.parkingsystemkotlin.mvp.presenter

import com.example.parkingsystemkotlin.mvp.contract.ReservationActivityContract
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class ReservationPresenterTest {
    private var view: ReservationActivityContract.ViewContract = mock()
    private var presenter: ReservationActivityContract.PresenterContract = ReservationPresenter(view)

    @Test
    fun `date time picker button start pressed test`() {
        presenter.dateTimePickerButtonStartPressed()

        verify(view).showDateTimeInfo()
    }

    @Test
    fun `date time picker button end pressed test`() {
        presenter.dateTimePickerButtonEndPressed()

        verify(view).showDateTimeInfo()
    }

    @Test
    fun `button cancel reservation test`() {
        presenter.buttonCancelReservation()

        verify(view).dismissActivity()
    }
}
