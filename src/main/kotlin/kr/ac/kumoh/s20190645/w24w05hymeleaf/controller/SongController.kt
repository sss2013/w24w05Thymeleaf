package kr.ac.kumoh.s20190645.w24w05hymeleaf.controller

import kr.ac.kumoh.s20190645.w24w05hymeleaf.Service.songservice
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController(val service: songservice) {
    @GetMapping("/song/random")
    fun getRandomSong(model : Model): String {
        model.addAttribute("songtitle",service.getRandom().title)
        return "random"
    }
}