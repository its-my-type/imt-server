package com.example.imt.game.application

import com.example.imt.celebrity.application.CelebrityService
import com.example.imt.celebrity.domain.Gender
import com.example.imt.game.application.dto.StartResultResponse
import com.example.imt.game.domain.Game.Companion.IMAGE_OPTION_COUNT
import com.example.imt.image.application.ImageService
import com.example.imt.image.domain.Image
import org.springframework.stereotype.Service

@Service
class GameService(
    private val celebrityService: CelebrityService,
    private val imageService: ImageService,
) {
    fun getStartResult(gender: Gender): List<StartResultResponse> =
        celebrityService.getRandomCelebritiesOf(gender, IMAGE_OPTION_COUNT)
            .let(imageService::getRandomImagesOf)
            .map(StartResultResponse::toDto)
}
