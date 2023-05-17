package com.geektech.lesson_1_kurs_7.data.local

import androidx.room.*
import com.geektech.lesson_1_kurs_7.data.model.NoteEntity

@Dao
interface NoteDao {
    // CRUD->create,

    @Insert
    suspend fun createNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes(): List<NoteEntity>

   @Update
   suspend fun editNote(noteEntity: NoteEntity)

    @Delete
    suspend fun removeNote(noteEntity: NoteEntity)

}