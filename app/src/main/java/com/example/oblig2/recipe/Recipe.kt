package com.example.oblig2.recipe

data class Recipe(
    val id: Int,
    val name: String,
    val timeToMake: Int,
    val ingredients: List<Ingredient>,
    val instructions: List<String>,
    val imageURI: String
) {
    companion object {
        fun exampleList() : List<Recipe> {
            return listOf(
                Recipe(
                    id = 1,
                    name = "Lamb with sauce",
                    timeToMake = 75,
                    ingredients = listOf(
                        Ingredient(1, "Lamb"),
                        Ingredient.carrots(5),
                        Ingredient.potatoes(5),
                        Ingredient(1, "Sauce")
                    ),
                    instructions = listOf(
                        "Heat up oven to very many degrees. Put lamb in oven.",
                        "Cut carrots and potatoes. Boil for 20 minutes.",
                        "Put some sauce on it.",
                        "Eat."
                    ),
                    imageURI = "https://images.matprat.no/al3hs78vnl-jumbotron/mobile/biff_7.jpg"
                ),
                Recipe(
                    id = 2,
                    name = "Seibiff med gulrot og løk",
                    timeToMake = 75,
                    ingredients = listOf(
                        Ingredient(1, "Lamb"),
                        Ingredient.carrots(5),
                        Ingredient.potatoes(5),
                        Ingredient(1, "Sauce")
                    ),
                    instructions = listOf(
                        "Vask potetene godt og kok dem møre, i 20-30 minutter.",
                        "Skjær løk i skiver. Varm en stekepanne med margarin og stek løk på middels varme til den blir gyllen og bløt.",
                        "Skrell gulrot, del i biter og kok dem møre i litt vann. Hell av kokevannet og bland inn smør, kapers, sitronsaft og finhakket basilikum.",
                        "Skjær ut eventuelle bein av fisken og del den i porsjonsstykker.",
                        "Bland sammen mel, salt og pepper. Vend fiskestykkene i melblandingen.",
                        "Varm en stekepanne med margarin og stek fisken på middels varme til den er gyllen på begge sider og begynner å flake seg."
                    ),
                    imageURI = "https://images.matprat.no/eze7fgf6ed-jumbotron/mobile/seibiff_med_stekt_løk_og_gulrot.jpg"
                ),
                Recipe(
                    id = 3,
                    name = "Gresskarsuppe med egg",
                    timeToMake = 75,
                    ingredients = listOf(
                        Ingredient(1, "Lamb"),
                        Ingredient.carrots(5),
                        Ingredient.potatoes(5),
                        Ingredient(1, "Sauce")
                    ),
                    instructions = listOf(
                        "Kok egg i 10 minutter. Avkjøl i kaldt vann og skrell dem.",
                        "Skrell gresskar, del i to og skrap ut frøene. Del i biter.",
                        "Hakk løk og hvitløk.",
                        "Varm olje og fres løk og hvitløk til løken er myk og blank. Tilsett gresskarbitene og la dem frese med et par minutter. Hell over buljong og kok opp. La suppen koke i 15-20 minutter, eller til gresskaret er helt mørt. Bruk stavmikser eller hurtigmikser og mos suppa til den er helt glatt. Tilsett mer vann/kraft om nødvendig.",
                        "Smak til suppa med pepper og sitronsaft.",
                        "Dekorer eggene med balsamicoeddik, for å lage spøkelsesansikter."
                    ),
                    imageURI = "https://images.matprat.no/mn55lp5vmv-jumbotron/mobile/gresskarsuppe_med_egg.jpg"
                ),
                Recipe(
                    id = 4,
                    name = "Torskeform med ost",
                    timeToMake = 75,
                    ingredients = listOf(
                        Ingredient(1, "Lamb"),
                        Ingredient.carrots(5),
                        Ingredient.potatoes(5),
                        Ingredient(1, "Sauce")
                    ),
                    instructions = listOf(
                        "Heat up oven to very many degrees. Put lamb in oven.",
                        "Cut carrots and potatoes. Boil for 20 minutes.",
                        "Put some sauce on it.",
                        "Eat."
                    ),
                    imageURI = "https://images.matprat.no/tst38n8nmd-jumbotron/mobile/torskeformmedost.jpg"
                ),
                Recipe(
                    id = 5,
                    name = "Burritos med kjøttdeig av svin",
                    timeToMake = 75,
                    ingredients = listOf(
                        Ingredient(1, "Lamb"),
                        Ingredient.carrots(5),
                        Ingredient.potatoes(5),
                        Ingredient(1, "Sauce")
                    ),
                    instructions = listOf(
                        "Heat up oven to very many degrees. Put lamb in oven.",
                        "Cut carrots and potatoes. Boil for 20 minutes.",
                        "Put some sauce on it.",
                        "Eat."
                    ),
                    imageURI = "https://images.matprat.no/5gmzvdvjne-jumbotron/mobile/taco_wrap_med_svin0904.jpg"
                ),
            )
        }
    }
}

data class Ingredient(
    val quantity: Int,
    val ingredient: String,
) {
    companion object {
        fun carrots(amount: Int) : Ingredient {
            return Ingredient(
                quantity = amount,
                ingredient = "Carrot",
            )
        }

        fun potatoes(amount: Int) : Ingredient {
            return Ingredient(
                quantity = amount,
                ingredient = "Potato",
            )
        }

        fun onions(amount: Int) : Ingredient {
            return Ingredient(
                quantity = amount,
                ingredient = "Onion",
            )
        }
    }
}
