package com.siwakorn.mvvmtemplate.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.siwakorn.mvvmtemplate.data.database.SimpleDao
import com.siwakorn.mvvmtemplate.data.database.model.SimpleData

@Database(
    entities = [SimpleData::class],
    version = 1,
    exportSchema = false
)
abstract class SimpleDatabase : RoomDatabase() {
    abstract val simpleDao: SimpleDao
}