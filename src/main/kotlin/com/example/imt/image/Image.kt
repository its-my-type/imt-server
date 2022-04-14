package com.example.imt.image

import com.example.imt.celebrity.domain.Celebrity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Image(
    @Id
    @Column(name = "image_name")
    val name: String,

    @ManyToOne
    @JoinColumn(name = "celebrity_id")
    val celebrity: Celebrity
) {
}
