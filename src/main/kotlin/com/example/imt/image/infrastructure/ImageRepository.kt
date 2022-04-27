package com.example.imt.image.infrastructure

import com.example.imt.celebrity.domain.Celebrity
import com.example.imt.image.domain.Image
import org.springframework.data.jpa.repository.JpaRepository

interface ImageRepository : JpaRepository<Image, String>, ImageRepositoryCustom {
    fun findAllByCelebrityIn(celebrities: List<Celebrity>): List<Image>
}
