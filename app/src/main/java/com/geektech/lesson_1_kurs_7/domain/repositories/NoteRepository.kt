package com.geektech.lesson_1_kurs_7.domain.repositories

import com.geektech.lesson_1_kurs_7.data.model.NoteEntity
import com.geektech.lesson_1_kurs_7.domain.model.Note
import com.geektech.lesson_1_kurs_7.domain.utils.Resource
import kotlinx.coroutines.flow.Flow


interface NoteRepository {

    fun createNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<NoteEntity>>>

    fun editNote(note: Note):Flow<Resource<Unit>>

    fun removeNote(note: Note):Flow<Resource<Unit>>
}