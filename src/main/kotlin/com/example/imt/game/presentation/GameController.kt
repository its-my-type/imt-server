package com.example.imt.game.presentation

import com.example.imt.celebrity.domain.Gender
import com.example.imt.common.API_URI
import com.example.imt.game.application.GameService
import com.example.imt.game.application.dto.StageRequest
import com.example.imt.game.presentation.GameController.Companion.GAME_URI
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.annotations.ApiIgnore

@RestController
@RequestMapping(GAME_URI)
class GameController(
    private val gameService: GameService,
) {
    @Operation(summary = "테스트 시작 API", description = "성별에 따른 랜덤 이미지 파일명 6개 반환")
    @ApiResponses(
        ApiResponse(responseCode = "200", description = "OK"),
        ApiResponse(responseCode = "400", description = "Bad Request"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    )
    @GetMapping(value = ["/initial-images"], params = ["gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun start(@RequestParam(required = true) gender: Gender) = gameService.getStartResult(gender)

    @Operation(summary = "스테이지 API", description = "선택 이미지의 feature 적용한 응답 이미지 6개 반환")
    @ApiResponses(
        ApiResponse(responseCode = "200", description = "OK"),
        ApiResponse(responseCode = "400", description = "Bad Request"),
        ApiResponse(responseCode = "500", description = "Internal Server Error")
    )
    @PostMapping(params = ["gender"])
    @ResponseStatus(value = HttpStatus.OK)
    fun stage(
        @RequestParam(required = true) gender: Gender,
        @RequestBody request: StageRequest,
    ) = gameService.getStageResult(gender, request)

    @ApiIgnore
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
