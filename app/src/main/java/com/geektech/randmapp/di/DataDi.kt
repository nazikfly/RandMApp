package com.geektech.randmapp.di

import com.geektech.data.data.repositories.CharacterRepositoryImpl
import com.geektech.rickandmortyapp.api.BaseRepository
import org.koin.dsl.module

val dataModule = module {

    single <BaseRepository>{
        CharacterRepositoryImpl(api = get())
    }
}