package com.pransol.my_room_database_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pransol.my_room_database_app.room.Employee
import com.pransol.my_room_database_app.room.SchoolDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val schoolDatabase=SchoolDatabase.DatabaseBuilder.getInstance(this)
        GlobalScope.launch {
          schoolDatabase.schoolDao().addEmployee(Employee(null,"Prabhu1","Math",37))
        }
    }

}