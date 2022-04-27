package com.example.imt.game.application.dto

import com.example.imt.image.domain.Image

data class StartResponse (
    val name: String
) {
    companion object {
        fun toDto(image: Image): StartResponse = StartResponse(image.name)
    }
}
