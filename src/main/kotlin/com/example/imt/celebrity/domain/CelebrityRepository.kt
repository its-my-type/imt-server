package com.example.imt.celebrity.domain

import org.springframework.data.jpa.repository.JpaRepository

interface CelebrityRepository : JpaRepository<Celebrity, Long> {
    fun findAllByGender(gender: Gender): List<Celebrity>
}
