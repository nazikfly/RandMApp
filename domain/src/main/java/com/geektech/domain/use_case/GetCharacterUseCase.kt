package com.geektech.domain.use_case

import com.geektech.domain.repositories.CharacterRepository



class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Result<Character> {
        return repository.getCharacter(id)
    }
}