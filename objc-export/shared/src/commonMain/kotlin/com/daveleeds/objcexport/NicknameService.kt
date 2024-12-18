package com.daveleeds.objcexport

class NicknameService {
    fun generateRandomNickname(): Nickname {
        return Nickname(adjectives.random(), nouns.random())
    }

    val adjectives = listOf(
        "Amusing", "Whimsical", "Discombobulated", "Articulate",
        "Voluble", "Impertinent", "Loquacious", "Phlegmatic",
        "Overwrought", "Parsimonious", "Spontaneous"
    )

    val nouns = listOf(
        "Sloth", "Gecko", "Jackrabbit", "Puffin",
        "Lemur", "Wombat", "Squirrel", "Llama",
        "Basilisk", "Dinosaur", "Critter",
    )
}
