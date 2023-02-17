package com.geektech.data.source.remote.dto

import androidx.compose.ui.text.input.KeyboardCapitalization.Companion.Characters
import com.geektech.randmapp.domain.model.Characters


data class CharactersDto(
        val info: Info,
        val results: List<Result>
    )

    fun CharactersDto.toListCharacters(): List<Characters> {
        val resultEntries = results.mapIndexed { _, entries ->
            Characters(
                id = entries.id,
                name = entries.name,
                specie = entries.species,
                image = entries.image
            )
        }
        return resultEntries

}