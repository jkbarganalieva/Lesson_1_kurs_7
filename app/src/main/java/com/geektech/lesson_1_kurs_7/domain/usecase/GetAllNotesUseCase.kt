package com.geektech.lesson_1_kurs_7.domain.usecase

import com.geektech.lesson_1_kurs_7.domain.repositories.NoteRepository

class GetAllNotesUseCase(
    private val noteRepository: NoteRepository
) {

    fun  getAllNotes()=noteRepository.getAllNotes()
}