package com.geektech.lesson_1_kurs_7.data.repositories

import com.geektech.lesson_1_kurs_7.data.local.NoteDao
import com.geektech.lesson_1_kurs_7.domain.model.Note
import com.geektech.lesson_1_kurs_7.domain.repositories.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun createNote(note: Note) {
        noteDao.createNote(note)

    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes()

    }

    override fun editNote(note: Note) {

    }

    override fun removeNote(note: Note) {

    }
}