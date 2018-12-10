package ayana.afinal.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import ayana.afinal.model.Post

@Dao
interface PostDAO {
    @Query("SELECT * FROM post")
    fun getAll(): List<Post>

    @Query("SELECT * FROM post WHERE id = :id")
    fun getById(id: Int): List<Post>

    @Insert
    fun insert(letter: Post)

}