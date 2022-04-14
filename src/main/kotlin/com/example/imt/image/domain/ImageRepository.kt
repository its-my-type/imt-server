package com.example.imt.image.domain

import com.example.imt.celebrity.domain.Celebrity
import org.springframework.data.jpa.repository.JpaRepository

interface ImageRepository : JpaRepository<Image, String> {
    fun findAllByCelebrityIn(celebrities: List<Celebrity>): List<Image>
}
