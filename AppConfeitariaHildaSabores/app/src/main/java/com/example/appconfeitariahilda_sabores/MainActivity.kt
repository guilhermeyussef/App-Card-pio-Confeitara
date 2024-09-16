package com.example.appconfeitariahilda_sabores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.appconfeitariahilda_sabores.list_item.FoodItem
import com.example.appconfeitariahilda_sabores.model.Food

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodList()

        }
    }
}

@Composable
private fun FoodList(){

    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Bolo de Brigadeiro",
            foodDescription = "Bolo irresistível com recheio cremoso de brigadeiro, perfeito para os amantes de chocolate!",
            price = "R$ 60,00 Kg"
        ),
        Food(
            imgFood = R.drawable.food2,
            foodName = "Bolo Trufado",
            foodDescription = "Delicioso bolo com recheio trufado de chocolate, uma experiência rica e      sofisticada para o seu paladar.",
            price = "R$ 65,00 kg"
        ),
        Food(
            imgFood = R.drawable.food3,
            foodName = "Bolo Rede Velvet",
            foodDescription = "Clássico bolo Red Velvet com recheio de cream cheese, macio e elegante com um toque de chocolate.",
            price = "R$ 75,00 kg"
        ),
        Food(
            imgFood = R.drawable.food4,
            foodName = "Torta de Limão",
            foodDescription = "Torta refrescante com base crocante e recheio cremoso de limão, perfeita para os amantes de sabores cítricos.",
            price = "R$ 28,00 kg"
        ),
        Food(
            imgFood = R.drawable.food5,
            foodName = "Docinhos",
            foodDescription = "Seleção de docinhos clássicos: brigadeiro, beijinho, leite ninho e bicho de pé, ideais     para adoçar qualquer ocasião.",
            price = "R$ 150,00 cento"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn {
            itemsIndexed(foodList){position,food ->
                FoodItem(food)
            }
        }
    }
}
