package com.geektech.domain.repositories

import com.geektech.domain.model.Characters
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

        fun getCharacters(page: Int): Flow<Result<List<Characters>>>

        suspend fun getCharacter(id: Int): Result<Character>

}