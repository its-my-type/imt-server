package com.example.imt.image.domain

import com.example.imt.celebrity.domain.Celebrity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "images")
class Image(
    @Id
    @Column(name = "image_name")
    val name: String,

    @Column
    val feature: String,

    @OneToOne
    @JoinColumn(name = "celebrity_id")
    val celebrity: Celebrity
) {
    override fun toString() = "Image(name=$name, feature=$feature, celebrity=$celebrity"
}
