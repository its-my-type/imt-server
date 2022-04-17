package com.example.imt.celebrity.application

import com.example.imt.celebrity.domain.Celebrity
import com.example.imt.celebrity.domain.CelebrityRepository
import com.example.imt.celebrity.domain.Gender
import org.springframework.stereotype.Service

@Service
class CelebrityService(
    private val celebrityRepository: CelebrityRepository,
) {
    fun getRandomCelebritiesOf(gender: Gender, imageCount: Int): List<Celebrity> =
        celebrityRepository.findAllByGender(gender)
            .let {
                if (it.size < imageCount) return emptyList()
                else it.shuffled().subList(0, imageCount)
            }
}
