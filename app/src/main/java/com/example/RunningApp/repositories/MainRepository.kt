package com.example.RunningApp.repositories

import com.example.RunningApp.DB.Run
import com.example.RunningApp.DB.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val rundao : RunDAO
) {
    suspend fun insertRun(run: Run) = rundao.insertRun(run)

    suspend fun deleteRun(run: Run) = rundao.deleteRun(run)

    fun getAllRunsSortedByDate() = rundao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = rundao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = rundao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = rundao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = rundao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = rundao.getTotalAvgSpeed()

    fun getTotalDistance() = rundao.getTotalDistance()

    fun getTotalCaloriesBurned() = rundao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = rundao.getTotalTimeInMillis()


}