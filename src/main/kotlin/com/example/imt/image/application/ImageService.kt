package com.example.imt.image.application

import com.example.imt.celebrity.domain.Celebrity
import com.example.imt.celebrity.domain.Gender
import com.example.imt.image.domain.Image
import com.example.imt.image.domain.Images
import com.example.imt.image.infrastructure.ImageRepository
import org.springframework.stereotype.Service

@Service
class ImageService(
    private val imageRepository: ImageRepository,
) {
    @Deprecated(message = "연예인 : 이미지 = 1 : N 맵핑 시 사용")
    fun getRandomImagesOf(celebrities: List<Celebrity>): List<Image> =
        imageRepository.findAllByCelebrityIn(celebrities)
            .shuffled()
            .distinctBy { it.celebrity }

    fun getImagesByGender(gender: Gender): Images = Images.of(imageRepository.findAllByCelebrityGender(gender))

    fun getImagesByNames(names: List<String>): Images = Images.of(imageRepository.findAllByNameIn(names))
}
