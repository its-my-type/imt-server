package com.example.imt.image.application

import com.example.imt.celebrity.domain.Celebrity
import com.example.imt.image.domain.Image
import com.example.imt.image.domain.ImageRepository
import org.springframework.stereotype.Service

@Service
class ImageService(
    private val imageRepository: ImageRepository,
) {
    fun getRandomImagesOf(celebrities: List<Celebrity>): List<Image> =
        imageRepository.findAllByCelebrityIn(celebrities)
            .shuffled()
            .distinctBy { it.celebrity }
}
