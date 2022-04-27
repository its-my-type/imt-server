package com.example.imt.image.infrastructure

import com.example.imt.celebrity.domain.Gender
import com.example.imt.celebrity.domain.QCelebrity.celebrity
import com.example.imt.image.domain.Image
import com.example.imt.image.domain.QImage.image
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
class ImageRepositoryCustomImpl(
    private val jpaQueryFactory: JPAQueryFactory,
): ImageRepositoryCustom {

    override fun findAllByCelebrityGender(gender: Gender): List<Image> =
        jpaQueryFactory
            .selectFrom(image)
            .join(celebrity).on(celebrity.eq(image.celebrity))
            .where(celebrity.gender.eq(gender))
            .fetch()
}
