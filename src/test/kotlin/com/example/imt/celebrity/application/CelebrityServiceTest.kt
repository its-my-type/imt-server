package com.example.imt.celebrity.application

import com.example.imt.celebrity.domain.Celebrity
import com.example.imt.celebrity.domain.CelebrityRepository
import com.example.imt.celebrity.domain.Gender
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class CelebrityServiceTest {
    @Mock
    private lateinit var celebrityRepository: CelebrityRepository

    private lateinit var celebrityService: CelebrityService

    @BeforeEach
    fun setUp() {
        celebrityService = CelebrityService(celebrityRepository)
    }

//    @Test
//    internal fun `getRandomCelebritiesOf`() {
//        // given
//        val gender = Gender.MALE
//        val imageCount = 6
//        val celebrities = listOf(
//            Celebrity(1, "홍길동", Gender.MALE),
//            Celebrity(2, "김철수", Gender.MALE),
//            Celebrity(3, "강동원", Gender.MALE),
//            Celebrity(4, "이정재", Gender.MALE),
//            Celebrity(5, "김범수", Gender.MALE),
//            Celebrity(6, "손흥민", Gender.MALE),
//        )
//        `when`(celebrityRepository.findAllByGender(gender)).thenReturn(celebrities)
//
//        // when
//        val result = celebrityService.getRandomCelebritiesOf(gender, imageCount)
//
//        assertThat(result).isEqualTo(celebrities)
//    }
}
