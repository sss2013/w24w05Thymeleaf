package kr.ac.kumoh.s20190645.w24w05hymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/song/random")
    fun getRandomSong(): String {
        return "random"
    }
}