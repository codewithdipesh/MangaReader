package com.codewithdipesh.mangareader.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.codewithdipesh.mangareader.domain.model.Rating
import com.codewithdipesh.mangareader.domain.model.Status

@Entity(tableName = "genre")
data class GenreEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val mangaId:String,
    val name :String
)
