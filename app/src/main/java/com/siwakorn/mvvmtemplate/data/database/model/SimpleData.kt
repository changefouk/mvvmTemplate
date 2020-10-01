package com.siwakorn.mvvmtemplate.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "simple")
data class SimpleData(
    val userId: String,
    val text: String
) {
    @PrimaryKey(autoGenerate = true)
    var simpleId: Int = 0
}