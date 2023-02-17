package com.geektech.domain.use_case

import com.geektech.domain.model.Characters
import com.geektech.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow



class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke(page: Int): Flow<Result<List<Characters>>> {
        return repository.getCharacters(page)
    }
}

