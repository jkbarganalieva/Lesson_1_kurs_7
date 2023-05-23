package com.geektech.lesson_1_kurs_7.data.repositories

import com.geektech.lesson_1_kurs_7.data.local.NoteDao
import com.geektech.lesson_1_kurs_7.data.mappers.toEntity
import com.geektech.lesson_1_kurs_7.data.mappers.toNote
import com.geektech.lesson_1_kurs_7.data.model.NoteEntity
import com.geektech.lesson_1_kurs_7.domain.model.Note
import com.geektech.lesson_1_kurs_7.domain.repositories.NoteRepository
import com.geektech.lesson_1_kurs_7.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun createNote(note: Note): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = noteDao.createNote(note.toEntity())
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(
                    Resource.Error(e.localizedMessage ?: "unknown error")
                )
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getAllNotes(): Flow<Resource<List<NoteEntity>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = noteDao.getAllNotes().map { it.toNote() }
                emit(Resource.Success(data))
            } catch (e: Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)

    }

    override fun editNote(note: Note): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = noteDao.editNote(note.toEntity())
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(
                    Resource.Error(e.localizedMessage ?: "unknown error")
                )
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun removeNote(note: Note): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = noteDao.removeNote(note.toEntity())
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(
                    Resource.Error(e.localizedMessage ?: "unknown error")
                )
            }
        }.flowOn(Dispatchers.IO)
    }

}