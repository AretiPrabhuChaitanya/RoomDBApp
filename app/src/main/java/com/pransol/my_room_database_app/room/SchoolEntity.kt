package com.pransol.my_room_database_app.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(@PrimaryKey(autoGenerate = true)val student_id:Int?, val name:String?, val std:String?, val age:Int?)
@Entity(tableName = "employee_table")
data class Employee(@PrimaryKey(autoGenerate = true)val employee_id:Int?, val name:String?, val subject:String?, val age:Int?)