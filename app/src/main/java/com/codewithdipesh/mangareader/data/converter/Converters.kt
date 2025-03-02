package com.codewithdipesh.mangareader.data.converter

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun fromList(list : List<String>) : String{
        return list.joinToString(",")
    }
    @TypeConverter
    fun toList(data :String): List<String> {
        return if(data.isEmpty()) emptyList() else data.split(",")
    }
}