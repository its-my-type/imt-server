package com.example.imt.game.application

import com.example.imt.celebrity.domain.Gender
import com.example.imt.game.application.dto.StageRequest
import com.example.imt.game.application.dto.StartResponse
import com.example.imt.image.application.ImageService
import org.springframework.stereotype.Service

@Service
class GameService(
    private val imageService: ImageService,
) {
    fun getStartResult(gender: Gender): List<StartResponse> =
        imageService.getImagesByGender(gender)
            .getShuffledSubList()
            .map(StartResponse::toDto)

    fun getStageResult(gender: Gender, stageRequest: StageRequest) {
        val images = imageService.getImagesByNames(stageRequest.names)
        // TODO() - 위 예시와 같이 요청받은 id에 대한 images 불러올 수 있음.
    }
}
