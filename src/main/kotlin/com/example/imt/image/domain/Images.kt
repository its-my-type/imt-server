package com.example.imt.image.domain

import com.example.imt.game.domain.Game

class Images(val images: List<Image>) {

    fun getShuffledSubList(): List<Image> = images.shuffled().subList(0, getToIndex(images.size))

    private fun getToIndex(size: Int): Int = if (size < Game.IMAGE_OPTION_COUNT) size else Game.IMAGE_OPTION_COUNT

    companion object {
        fun of(images: List<Image>): Images = Images(images)
    }
}
