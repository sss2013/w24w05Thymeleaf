package kr.ac.kumoh.s20190645.w24w05hymeleaf.Service

import kr.ac.kumoh.s20190645.w24w05hymeleaf.model.Song
import kr.ac.kumoh.s20190645.w24w05hymeleaf.repository.Songrepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class songservice(val repository:Songrepository) {
    fun getRandom() = repository.getSong(Random.nextInt(repository.songsSize))
}