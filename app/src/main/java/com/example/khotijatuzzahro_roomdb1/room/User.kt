package com.example.khotijatuzzahro_roomdb1.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User (
    @PrimaryKey val uid: Int,
    @ColumnInfo (name ="first_name" )val firstName: String?,
    @ColumnInfo (name ="last_name" ) val lastName: String?
)
