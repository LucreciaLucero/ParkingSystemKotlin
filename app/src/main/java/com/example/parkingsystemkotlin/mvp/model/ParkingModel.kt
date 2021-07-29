package com.example.parkingsystemkotlin.mvp.model

import com.example.parkingsystemkotlin.mvp.contract.ParkingContract
import com.example.parkingsystemkotlin.utils.ConstantUtils

class ParkingModel : ParkingContract.ModelContract {
    private var parkingAvailables: Int = ConstantUtils.ZERO

    override fun setParkingAvailables(parkingLots: Int) {
        this.parkingAvailables = parkingLots
    }

    override fun getParkingAvailables(): Int {
        return parkingAvailables
    }
}
