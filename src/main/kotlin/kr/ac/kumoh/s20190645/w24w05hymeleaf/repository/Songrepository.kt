package kr.ac.kumoh.s20190645.w24w05hymeleaf.repository

import kr.ac.kumoh.s20190645.w24w05hymeleaf.model.Song
import org.springframework.stereotype.Repository
import kotlin.random.Random

@Repository
class Songrepository {
    val songs=listOf(
        Song(1,"Dear..", "Siam Shade"),
        Song(2,"Diver", "Nico touches the walls"),
        Song(3,"Soul love", "Glay")
    )

    fun fetchSong()=songs
    fun getSong(index:Int)=songs[index]
    val songsSize:Int
        get() = songs.size

}