package com.geektech.lesson_1_kurs_7.data.mappers

import com.geektech.lesson_1_kurs_7.data.model.NoteEntity
import com.geektech.lesson_1_kurs_7.domain.model.Note

fun Note.toEntity()=NoteEntity(id, title, desc)

fun NoteEntity.toNote()=NoteEntity(id,title,desc)