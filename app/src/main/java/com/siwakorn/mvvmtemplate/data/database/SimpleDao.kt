package com.siwakorn.mvvmtemplate.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.siwakorn.mvvmtemplate.data.database.model.SimpleData

@Dao
interface SimpleDao {
    @Query("SELECT * FROM simple WHERE userId = :userId")
    fun getListNotification(userId: String): List<SimpleData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(plants: List<SimpleData>)
}