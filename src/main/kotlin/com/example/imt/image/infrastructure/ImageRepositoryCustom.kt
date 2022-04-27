package com.example.imt.image.infrastructure

import com.example.imt.celebrity.domain.Gender
import com.example.imt.image.domain.Image

interface ImageRepositoryCustom {
    fun findAllByCelebrityGender(gender: Gender): List<Image>
}
