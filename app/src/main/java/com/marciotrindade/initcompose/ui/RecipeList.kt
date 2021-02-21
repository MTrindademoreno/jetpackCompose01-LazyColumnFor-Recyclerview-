package com.marciotrindade.initcompose.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.marciotrindade.initcompose.recipe.Recipe
import com.marciotrindade.initcompose.recipe.RecipeCard

@Composable
fun RecipeList(receitas:List<Recipe>){
    LazyColumnFor(receitas) { item->
       RecipeCard(item,modifier = Modifier.padding(16.dp))

    }
}