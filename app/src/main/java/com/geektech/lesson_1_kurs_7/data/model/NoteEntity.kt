package com.geektech.lesson_1_kurs_7.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val title: String,
    val desc: String
)

//NoteDto