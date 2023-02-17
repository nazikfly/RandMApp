package com.geektech.randmapp.ui

import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController


fun RickAndMortyA() {

    RickAndMortyTheme {
        val navController = rememberNavController()
        val navigationActions = remember(navController) {
            RickAndMortyActions(navController)
        }

        RickAndMortyNavGraph(
            navController = navController,
            navigateToHome = navigationActions.navigateToHome,
            navigateToDetail = navigationActions.navigateToDetail
        )
    }
}