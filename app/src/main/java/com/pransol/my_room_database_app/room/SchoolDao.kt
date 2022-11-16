package com.pransol.my_room_database_app.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SchoolDao {

    //Student

    @Insert
    suspend fun addStudent(newStudent:Student)
    @Update
    suspend fun updateStudent(updatedStudent:Student)
    @Delete
    suspend fun deleteStudent(student:Student):Int
    @Query("delete from student_table")
    suspend fun deleteAllStudents():Int
    @Query("select * from student_table")
    suspend fun getAllStudents(): List<Student>

    //Employee

    @Insert
    suspend fun addEmployee(newEmployee:Employee)
    @Update
    suspend fun updateEmployee(updatedEmployee:Employee)
    @Delete
    suspend fun deleteEmployee(employee:Employee):Int
    @Query("delete from employee_table")
    suspend fun deleteAllEmployees():Int
    @Query("select * from employee_table")
    suspend fun getAllEmployees(): List<Employee>
}