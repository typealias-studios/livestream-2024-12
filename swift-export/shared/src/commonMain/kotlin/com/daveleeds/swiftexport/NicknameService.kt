package com.daveleeds.swiftexport

import kotlinx.coroutines.delay

class NicknameService {
    fun generateRandomNickname(): Nickname {
        return Nickname(adjectives.random(), nouns.random())
    }

    suspend fun generateRandomNickname(delay: Long): Nickname {
        delay(delay)
        return generateRandomNickname()
    }

    private val adjectives = listOf(
        "Amusing", "Whimsical", "Discombobulated", "Articulate",
        "Voluble", "Impertinent", "Loquacious", "Phlegmatic",
        "Overwrought", "Parsimonious", "Spontaneous"
    )

    private val nouns = listOf(
        "Sloth", "Gecko", "Jackrabbit", "Puffin",
        "Lemur", "Wombat", "Squirrel", "Llama",
        "Basilisk", "Dinosaur", "Critter",
    )
}
