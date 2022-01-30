package com.example.studentroomapplication

import androidx.room.Dao
import androidx.room.Insert
import com.example.studentroomapplication.model.Student

@Dao
interface StudentDao {
    @Insert
    fun insert(student: Student)
}