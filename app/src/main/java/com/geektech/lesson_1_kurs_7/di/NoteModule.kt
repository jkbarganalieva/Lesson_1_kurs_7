package com.geektech.lesson_1_kurs_7.di

import android.content.Context
import androidx.room.Room
import com.geektech.lesson_1_kurs_7.data.local.NoteDao
import com.geektech.lesson_1_kurs_7.data.local.NoteDatabase
import com.geektech.lesson_1_kurs_7.data.repositories.NoteRepositoryImpl
import com.geektech.lesson_1_kurs_7.domain.repositories.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext cotext:Context
    )= Room.databaseBuilder(
        cotext,
        NoteDatabase::class.java,
        "note_db"
    )

    @Provides
    fun  provideNoteDao(noteDatabase: NoteDatabase)=noteDatabase.noteDao()

    @Provides
    fun provideNoteRepository(noteDao: NoteDao):NoteRepository{
        return NoteRepositoryImpl(noteDao)
    }
}