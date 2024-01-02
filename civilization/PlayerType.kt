package com.unciv.logic.civilization

import com.unciv.logic.IsPartOfGameInfoSerialization

enum class PlayerType : IsPartOfGameInfoSerialization {
    Robot,
    Human;
    fun toggle() = if (this == AI) Human else AI
}
