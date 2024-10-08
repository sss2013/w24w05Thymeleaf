package kr.ac.kumoh.s20190645.w24w05hymeleaf.model

import org.springframework.beans.factory.annotation.Autowired

data class Song(
    val id: Int,
    val title: String,
    val singer: String
)