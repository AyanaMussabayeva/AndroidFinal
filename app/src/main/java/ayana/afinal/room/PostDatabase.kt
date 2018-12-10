package ayana.afinal.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import ayana.afinal.model.Post


@Database(entities = arrayOf(Post::class), version = 1)
abstract class PostDatabase : RoomDatabase()  {
    abstract fun postDao():PostDAO

    companion object {
        private var INSTANCE : PostDatabase? = null

        fun getInstance(context: Context):PostDatabase? {

            if(INSTANCE == null){
                synchronized(PostDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, PostDatabase::class.java, "post.db").build()
                }
            }
            return INSTANCE
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}