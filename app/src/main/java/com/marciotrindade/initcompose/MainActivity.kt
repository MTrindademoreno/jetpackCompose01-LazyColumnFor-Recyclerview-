package com.marciotrindade.initcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import com.marciotrindade.initcompose.recipe.defaultRecipes
import com.marciotrindade.initcompose.ui.RecipeList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier.fillMaxSize()) {
                // 2
                TopAppBar(title = {
                    Text("ComposableCookBook")
                })
                // 3
                RecipeList(defaultRecipes)
            }


        }
    }
}
//@Preview
//@Composable
//fun Greeting(){
//    Column() {
//        Text("Olá Luigi, esse app está sendo desenvolvido pelo seu pai!",style = TextStyle(color = Color.Blue))
//        Text("esse é o segundo texto",style = TextStyle(color =Color.Green) )
//        Text("o terceiro texto fica aqui", style = TextStyle(color = Color.Magenta))
//    }

//}

