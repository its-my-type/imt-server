package com.example.imt.game.application.dto

import com.example.imt.image.domain.Image
import com.fasterxml.jackson.annotation.JsonProperty

data class StartResultResponse (
    @JsonProperty("image_name")
    val name: String
) {
    companion object {
        fun toDto(image: Image): StartResultResponse = StartResultResponse(image.name)
    }
}
