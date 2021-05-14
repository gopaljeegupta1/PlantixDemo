package com.gopal.plantixdemo

import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gopal.plantixdemo.db.AppDatabase
import com.gopal.plantixdemo.db.NoteDao
import com.gopal.plantixdemo.db.NoteEntity
import com.gopal.plantixdemo.util.SampleDataProvider

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 */
@RunWith(AndroidJUnit4::class)
class DatabaseTest {

    private lateinit var dao: NoteDao
    private lateinit var database: AppDatabase


    @Before
    fun createDb() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        database = Room.inMemoryDatabaseBuilder(appContext, AppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        dao = database.noteDao()!!
    }

    @Test
    fun createNotes() {
        dao.insertAll(SampleDataProvider.getNotes())
        val count = dao.getCount()
        assertEquals(count, SampleDataProvider.getNotes().size)

    }

    @Test
    fun insertNote() {
        val note = NoteEntity()
        note.text = "some text"
        dao.insertNote(note)
        val saveNote = dao.getNoteById(1)
        assertEquals(saveNote?.id ?: 0, 1)
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.gopal.jetpackdemo", appContext.packageName)
    }
}