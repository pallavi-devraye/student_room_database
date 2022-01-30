package com.example.studentroomapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(var name: String, var studentClass: String,
                   @PrimaryKey(autoGenerate = true)var id: Int? = null)
