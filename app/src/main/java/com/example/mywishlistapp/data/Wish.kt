package com.example.mywishlistapp.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id :Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title:String ="",
    @ColumnInfo(name = "wish-desc")
    val description:String =""
)


object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Pixel", description = "Google Pixel 8 Pro (Obsidian, 128 Gb, 5050 Mah)"),
        Wish(title = "Google Watch 2", description = "Android Watch"),
        Wish(title = "A Sci-fi,Book", description = "A Science Fiction book from best seller"),
        Wish(title = "Google Pixel", description = "Google Pixel 8 Pro (Obsidian, 128 Gb, 5050 Mah)")

    )
}
