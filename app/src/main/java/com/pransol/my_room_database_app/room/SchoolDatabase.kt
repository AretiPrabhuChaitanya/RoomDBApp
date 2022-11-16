package com.pransol.my_room_database_app.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Student::class,Employee::class], version = 1, exportSchema = false)
abstract class SchoolDatabase:RoomDatabase() {
    //create an abstract function with Dao
    abstract fun schoolDao():SchoolDao
    object DatabaseBuilder {
        private var INSTANCE: SchoolDatabase? = null
        fun getInstance(context: Context): SchoolDatabase {
            if (INSTANCE == null) {
                synchronized(SchoolDatabase::class) {
                    INSTANCE = buildRoomDB(context)
                }
            }
            return INSTANCE!!
        }
        private fun buildRoomDB(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                SchoolDatabase::class.java,
                "school_db"
            ).build()
    }
}