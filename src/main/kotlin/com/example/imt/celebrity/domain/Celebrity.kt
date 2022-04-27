package com.example.imt.celebrity.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "celebrities")
class Celebrity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "celebrity_id")
    private val id: Long,

    @Column
    private val name: String,

    @Enumerated(value = EnumType.STRING)
    @Column
    private val gender: Gender,

    @Column
    private val birth: Int,
) {
    override fun toString() = "Celebrity(id=$id, name=$name, gender=$gender, birth=$birth"
}
