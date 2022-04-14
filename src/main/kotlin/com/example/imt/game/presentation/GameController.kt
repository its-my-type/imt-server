package com.example.imt.game.presentation

import com.example.imt.common.API_URI
import com.example.imt.game.presentation.GameController.Companion.GAME_URI
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(GAME_URI)
class GameController {

    @GetMapping(value = ["/initial-images"], params = ["gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun startGame(
        @RequestParam gender: String,
    ) {
        println(gender)
    }

    @GetMapping(params = ["stage", "gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun progressStage(
        @RequestParam stage: Long,
        @RequestParam gender: String,
    ) {
        println(stage)
        println(gender)
    }

    @GetMapping(value = ["/results"], params = ["gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun getResult(
        @RequestParam gender: String,
    ) {
        println(gender)
    }

    companion object {
        const val GAME_URI: String = "$API_URI/games"
    }
}
