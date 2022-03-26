package com.example.aop_act2_chapter4

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.aop_act2_chapter4.dao.HistoryDao
import com.example.aop_act2_chapter4.model.History

@Database(entities = [History::class],version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}