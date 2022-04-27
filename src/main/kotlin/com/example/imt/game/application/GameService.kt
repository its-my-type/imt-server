package com.example.imt.game.application

import com.example.imt.celebrity.domain.Gender
import com.example.imt.game.application.dto.StartResultResponse
import com.example.imt.game.domain.Game.Companion.IMAGE_OPTION_COUNT
import com.example.imt.image.application.ImageService
import org.springframework.stereotype.Service

@Service
class GameService(
    private val imageService: ImageService,
) {
    fun getStartResult(gender: Gender): List<StartResultResponse> =
        imageService.getImagesByGender(gender)
            .let {
                val toIndex = if (it.size < IMAGE_OPTION_COUNT) it.size else IMAGE_OPTION_COUNT
                it.shuffled().subList(0, toIndex)
            }.map(StartResultResponse::toDto)
}
