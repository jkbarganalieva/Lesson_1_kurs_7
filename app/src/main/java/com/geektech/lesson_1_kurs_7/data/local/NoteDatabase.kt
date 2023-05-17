package com.geektech.lesson_1_kurs_7.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geektech.lesson_1_kurs_7.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao():NoteDao

}