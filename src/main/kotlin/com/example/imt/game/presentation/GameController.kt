package com.example.imt.game.presentation

import com.example.imt.celebrity.domain.Gender
import com.example.imt.common.API_URI
import com.example.imt.game.application.GameService
import com.example.imt.game.presentation.GameController.Companion.GAME_URI
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(GAME_URI)
class GameController(
    private val gameService: GameService,
) {

    @GetMapping(value = ["/initial-images"], params = ["gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun start(@RequestParam gender: Gender) = gameService.getStartResult(gender)

    @GetMapping(params = ["stage", "gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun getStageResult(
        @RequestParam stage: Long,
        @RequestParam gender: Gender,
    ) {
        TODO()
    }

    @GetMapping(value = ["/results"], params = ["gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun getGameResult(
        @RequestParam gender: Gender,
    ) {
        TODO()
    }

    companion object {
        const val GAME_URI: String = "$API_URI/games"
    }
}
