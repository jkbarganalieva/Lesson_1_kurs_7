package com.geektech.lesson_1_kurs_7.domain.usecase

import com.geektech.lesson_1_kurs_7.domain.model.Note
import com.geektech.lesson_1_kurs_7.domain.repositories.NoteRepository

class CreateNoteUseCase (private val noteRepository: NoteRepository
){
    fun createNote(note: Note)=noteRepository.createNote(note)
}