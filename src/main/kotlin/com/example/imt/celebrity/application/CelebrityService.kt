package com.example.imt.celebrity.application

import com.example.imt.celebrity.domain.Celebrity
import com.example.imt.celebrity.domain.CelebrityRepository
import com.example.imt.celebrity.domain.Gender
import org.springframework.stereotype.Service

@Service
class CelebrityService(
    private val celebrityRepository: CelebrityRepository,
) {
    @Deprecated(message = "연예인 : 이미지 = 1 : N 맵핑 시 사용")
    fun getRandomCelebritiesOf(gender: Gender, imageCount: Int): List<Celebrity> =
        celebrityRepository.findAllByGender(gender)
            .let {
                val toIndex = if (it.size < imageCount) it.size else imageCount
                it.shuffled().subList(0, toIndex)
            }
}
