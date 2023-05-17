package com.geektech.lesson_1_kurs_7.domain.repositories

import com.geektech.lesson_1_kurs_7.domain.model.Note
import com.geektech.lesson_1_kurs_7.domain.repositories.NoteRepository

interface NoteRepository {

    fun createNote(note: Note)

    fun getAllNotes(): List<Note>

    fun editNote(note: Note)

    fun removeNote(note: Note)
}