package com.marciotrindade.initcompose.recipe

import androidx.annotation.DrawableRes

data class Recipe(
     @DrawableRes
     val imageResources:Int,
     val title:String,
     val ingredients:List<String>
 )