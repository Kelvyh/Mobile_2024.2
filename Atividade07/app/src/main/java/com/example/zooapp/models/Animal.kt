package com.example.zooapp.models

import com.example.zooapp.R


data class Animal (
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Bulbasaur",
        species = "Seed Pokémon",
        imageRes = R.drawable.pokemon_1_shiny,
        description = "Bulbasaur is a dual-type Grass/Poison Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16, which evolves into Venusaur starting at level 32.",
        curiosities = "Bulbasaur uses the nutrients from its bulb to grow."
    ),
    Animal(
        id = 2,
        name = "Ivysaur",
        species = "Seed Pokémon",
        imageRes = R.drawable.pokemon_2_shiny,
        description = "Ivysaur is the evolved form of Bulbasaur. It evolves into Venusaur starting at level 32.",
        curiosities = "The flower on its back grows as it absorbs sunlight."
    ),
    Animal(
        id = 3,
        name = "Venusaur",
        species = "Seed Pokémon",
        imageRes = R.drawable.pokemon_3_shiny,
        description = "Venusaur is the final evolution of Bulbasaur. It can Mega Evolve into Mega Venusaur.",
        curiosities = "Its flower's aroma soothes and calms people."
    ),
    Animal(
        id = 4,
        name = "Charmander",
        species = "Lizard Pokémon",
        imageRes = R.drawable.pokemon_4_shiny,
        description = "Charmander is a Fire-type Pokémon introduced in Generation I. It evolves into Charmeleon starting at level 16.",
        curiosities = "The flame on its tail indicates its life force."
    ),
    Animal(
        id = 5,
        name = "Charmeleon",
        species = "Flame Pokémon",
        imageRes = R.drawable.pokemon_5_shiny,
        description = "Charmeleon is the evolved form of Charmander. It evolves into Charizard starting at level 36.",
        curiosities = "It swings its tail to attack opponents with flames."
    ),
    Animal(
        id = 6,
        name = "Charizard",
        species = "Flame Pokémon",
        imageRes = R.drawable.pokemon_6_shiny,
        description = "Charizard is the final evolution of Charmander. It is a dual-type Fire/Flying Pokémon.",
        curiosities = "Charizard breathes intense flames that can melt anything."
    ),
    Animal(
        id = 7,
        name = "Squirtle",
        species = "Tiny Turtle Pokémon",
        imageRes = R.drawable.pokemon_7_shiny,
        description = "Squirtle is a Water-type Pokémon introduced in Generation I. It evolves into Wartortle starting at level 16.",
        curiosities = "Its shell is used for both protection and swimming."
    ),
    Animal(
        id = 8,
        name = "Wartortle",
        species = "Turtle Pokémon",
        imageRes = R.drawable.pokemon_8_shiny,
        description = "Wartortle is the evolved form of Squirtle. It evolves into Blastoise starting at level 36.",
        curiosities = "The fluffy tail helps it maintain balance."
    ),
    Animal(
        id = 9,
        name = "Blastoise",
        species = "Shellfish Pokémon",
        imageRes = R.drawable.pokemon_9_shiny,
        description = "Blastoise is the final evolution of Squirtle. It can Mega Evolve into Mega Blastoise.",
        curiosities = "Its water cannons can shoot water with tremendous force."
    ),
    Animal(
        id = 10,
        name = "Caterpie",
        species = "Worm Pokémon",
        imageRes = R.drawable.pokemon_10_shiny,
        description = "Caterpie is a Bug-type Pokémon introduced in Generation I. It evolves into Metapod starting at level 7.",
        curiosities = "Its antenna releases a stench to repel predators."
    ),
    Animal(
        id = 11,
        name = "Metapod",
        species = "Cocoon Pokémon",
        imageRes = R.drawable.pokemon_11_shiny,
        description = "Metapod is the evolved form of Caterpie. It evolves into Butterfree starting at level 10.",
        curiosities = "Its shell is as hard as steel, but it moves very little."
    ),
    Animal(
        id = 12,
        name = "Butterfree",
        species = "Butterfly Pokémon",
        imageRes = R.drawable.pokemon_12_shiny,
        description = "Butterfree is the final evolution of Caterpie. It is a Bug/Flying-type Pokémon.",
        curiosities = "Its wings are covered with poisonous scales."
    ),
    Animal(
        id = 13,
        name = "Weedle",
        species = "Hairy Bug Pokémon",
        imageRes = R.drawable.pokemon_13_shiny,
        description = "Weedle is a Bug/Poison-type Pokémon introduced in Generation I. It evolves into Kakuna starting at level 7.",
        curiosities = "Its poison stinger is used to fend off enemies."
    ),
    Animal(
        id = 14,
        name = "Kakuna",
        species = "Cocoon Pokémon",
        imageRes = R.drawable.pokemon_14_shiny,
        description = "Kakuna is the evolved form of Weedle. It evolves into Beedrill starting at level 10.",
        curiosities = "Although it appears motionless, Kakuna is preparing to evolve."
    ),
    Animal(
        id = 15,
        name = "Beedrill",
        species = "Poison Bee Pokémon",
        imageRes = R.drawable.pokemon_15_shiny,
        description = "Beedrill is the final evolution of Weedle. It is a Bug/Poison-type Pokémon.",
        curiosities = "Beedrill can fly at high speed and attack with its stingers."
    ),
    Animal(
        id = 16,
        name = "Pidgey",
        species = "Tiny Bird Pokémon",
        imageRes = R.drawable.pokemon_16_shiny,
        description = "Pidgey is a Normal/Flying-type Pokémon introduced in Generation I. It evolves into Pidgeotto starting at level 18.",
        curiosities = "Pidgey is very docile and avoids conflict."
    ),
    Animal(
        id = 17,
        name = "Pidgeotto",
        species = "Bird Pokémon",
        imageRes = R.drawable.pokemon_17_shiny,
        description = "Pidgeotto is the evolved form of Pidgey. It evolves into Pidgeot starting at level 36.",
        curiosities = "It protects its territory fiercely from intruders."
    ),
    Animal(
        id = 18,
        name = "Pidgeot",
        species = "Bird Pokémon",
        imageRes = R.drawable.pokemon_18_shiny,
        description = "Pidgeot is the final evolution of Pidgey. It can Mega Evolve into Mega Pidgeot.",
        curiosities = "Its glossy plumage is highly sought after by collectors."
    ),
    Animal(
        id = 19,
        name = "Rattata",
        species = "Mouse Pokémon",
        imageRes = R.drawable.pokemon_19_shiny,
        description = "Rattata is a Normal-type Pokémon introduced in Generation I. It evolves into Raticate starting at level 20.",
        curiosities = "It has sharp fangs that grow continuously."
    ),
    Animal(
        id = 20,
        name = "Raticate",
        species = "Mouse Pokémon",
        imageRes = R.drawable.pokemon_20_shiny,
        description = "Raticate is the evolved form of Rattata. It is a Normal-type Pokémon.",
        curiosities = "Its sturdy whiskers help it maintain balance."
    ),
    Animal(
        id = 21,
        name = "Spearow",
        species = "Tiny Bird Pokémon",
        imageRes = R.drawable.pokemon_21_shiny,
        description = "Spearow is a Normal/Flying-type Pokémon introduced in Generation I. It evolves into Fearow starting at level 20.",
        curiosities = "It has a loud cry that can be heard over long distances."
    ),
    Animal(
        id = 22,
        name = "Fearow",
        species = "Beak Pokémon",
        imageRes = R.drawable.pokemon_22_shiny,
        description = "Fearow is the evolved form of Spearow. It is a Normal/Flying-type Pokémon.",
        curiosities = "Fearow can fly for an entire day without resting."
    ),
    Animal(
        id = 23,
        name = "Ekans",
        species = "Snake Pokémon",
        imageRes = R.drawable.pokemon_23_shiny,
        description = "Ekans is a Poison-type Pokémon introduced in Generation I. It evolves into Arbok starting at level 22.",
        curiosities = "It wraps itself around its prey to weaken it."
    ),
    Animal(
        id = 24,
        name = "Arbok",
        species = "Cobra Pokémon",
        imageRes = R.drawable.pokemon_24_shiny,
        description = "Arbok is the evolved form of Ekans. It is a Poison-type Pokémon.",
        curiosities = "The pattern on its belly can intimidate foes."
    ),
    Animal(
        id = 25,
        name = "Pikachu",
        species = "Mouse Pokémon",
        imageRes = R.drawable.pokemon_25_shiny,
        description = "Pikachu is an Electric-type Pokémon introduced in Generation I. It evolves from Pichu when leveled up with high friendship and evolves into Raichu when exposed to a Thunder Stone.",
        curiosities = "It stores electricity in its cheeks and releases it during battle."
    ),
    Animal(
        id = 26,
        name = "Raichu",
        species = "Mouse Pokémon",
        imageRes = R.drawable.pokemon_26_shiny,
        description = "Raichu is the evolved form of Pikachu. It is an Electric-type Pokémon.",
        curiosities = "Its tail acts as a ground to protect itself from its own electricity."
    ),
    Animal(
        id = 27,
        name = "Sandshrew",
        species = "Mouse Pokémon",
        imageRes = R.drawable.pokemon_27_shiny,
        description = "Sandshrew is a Ground-type Pokémon introduced in Generation I. It evolves into Sandslash starting at level 22.",
        curiosities = "Its tough hide protects it from predators."
    ),
    Animal(
        id = 28,
        name = "Sandslash",
        species = "Mouse Pokémon",
        imageRes = R.drawable.pokemon_28_shiny,
        description = "Sandslash is the evolved form of Sandshrew. It is a Ground-type Pokémon.",
        curiosities = "It uses its sharp claws to dig and defend itself."
    ),
    Animal(
        id = 29,
        name = "Nidoran♀",
        species = "Poison Pin Pokémon",
        imageRes = R.drawable.pokemon_29_shiny,
        description = "Nidoran♀ is a Poison-type Pokémon introduced in Generation I. It evolves into Nidorina starting at level 16.",
        curiosities = "Its ears are sensitive to even the slightest sound."
    ),
    Animal(
        id = 30,
        name = "Nidorina",
        species = "Poison Pin Pokémon",
        imageRes = R.drawable.pokemon_30_shiny,
        description = "Nidorina is the evolved form of Nidoran♀. It evolves into Nidoqueen when exposed to a Moon Stone.",
        curiosities = "It prefers not to fight while caring for its young."
    ),
    Animal(
        id = 31,
        name = "Nidoqueen",
        species = "Drill Pokémon",
        imageRes = R.drawable.pokemon_31_shiny,
        description = "Nidoqueen is the final evolution of Nidoran♀. It is a Poison/Ground-type Pokémon.",
        curiosities = "Its body is encased in extremely hard scales."
    ),
    Animal(
        id = 32,
        name = "Nidoran♂",
        species = "Poison Pin Pokémon",
        imageRes = R.drawable.pokemon_32_shiny,
        description = "Nidoran♂ is a Poison-type Pokémon introduced in Generation I. It evolves into Nidorino starting at level 16.",
        curiosities = "It has barbs that secrete a powerful poison."
    ),
    Animal(
        id = 33,
        name = "Nidorino",
        species = "Poison Pin Pokémon",
        imageRes = R.drawable.pokemon_33_shiny,
        description = "Nidorino is the evolved form of Nidoran♂. It evolves into Nidoking when exposed to a Moon Stone.",
        curiosities = "Its horn is harder than diamond and can pierce anything."
    ),
    Animal(
        id = 34,
        name = "Nidoking",
        species = "Drill Pokémon",
        imageRes = R.drawable.pokemon_34_shiny,
        description = "Nidoking is the final evolution of Nidoran♂. It is a Poison/Ground-type Pokémon.",
        curiosities = "Its tail is powerful enough to topple a building."
    ),
    Animal(
        id = 35,
        name = "Clefairy",
        species = "Fairy Pokémon",
        imageRes = R.drawable.pokemon_35_shiny,
        description = "Clefairy is a Fairy-type Pokémon introduced in Generation I. It evolves into Clefable when exposed to a Moon Stone.",
        curiosities = "It is said to dance on moonlit nights."
    ),
    Animal(
        id = 36,
        name = "Clefable",
        species = "Fairy Pokémon",
        imageRes = R.drawable.pokemon_36_shiny,
        description = "Clefable is the evolved form of Clefairy. It is a Fairy-type Pokémon.",
        curiosities = "It has an acute sense of hearing and dislikes loud noises."
    ),
    Animal(
        id = 37,
        name = "Vulpix",
        species = "Fox Pokémon",
        imageRes = R.drawable.pokemon_37_shiny,
        description = "Vulpix is a Fire-type Pokémon introduced in Generation I. It evolves into Ninetales when exposed to a Fire Stone.",
        curiosities = "Its tails grow hotter as it matures."
    ),
    Animal(
        id = 38,
        name = "Ninetales",
        species = "Fox Pokémon",
        imageRes = R.drawable.pokemon_38_shiny,
        description = "Ninetales is the evolved form of Vulpix. It is a Fire-type Pokémon.",
        curiosities = "Each of its tails is said to hold a mystical power."
    ),
    Animal(
        id = 39,
        name = "Jigglypuff",
        species = "Balloon Pokémon",
        imageRes = R.drawable.pokemon_39_shiny,
        description = "Jigglypuff is a Normal/Fairy-type Pokémon introduced in Generation I. It evolves into Wigglytuff when exposed to a Moon Stone.",
        curiosities = "It can sing a lullaby that puts its foes to sleep."
    ),
    Animal(
        id = 40,
        name = "Wigglytuff",
        species = "Balloon Pokémon",
        imageRes = R.drawable.pokemon_40_shiny,
        description = "Wigglytuff is the evolved form of Jigglypuff. It is a Normal/Fairy-type Pokémon.",
        curiosities = "It can expand its body by inhaling air, allowing it to float."
    ),
    Animal(
        id = 41,
        name = "Zubat",
        species = "Bat Pokémon",
        imageRes = R.drawable.pokemon_41_shiny,
        description = "Zubat is a Poison/Flying-type Pokémon introduced in Generation I. It evolves into Golbat starting at level 22.",
        curiosities = "Zubat is completely blind, but it uses echolocation to navigate."
    ),
    Animal(
        id = 42,
        name = "Golbat",
        species = "Bat Pokémon",
        imageRes = R.drawable.pokemon_42_shiny,
        description = "Golbat is the evolved form of Zubat. It is a Poison/Flying-type Pokémon.",
        curiosities = "It is known for its large mouth, which it uses to suck the blood of its prey."
    ),
    Animal(
        id = 43,
        name = "Oddish",
        species = "Weed Pokémon",
        imageRes = R.drawable.pokemon_43_shiny,
        description = "Oddish is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Gloom starting at level 21.",
        curiosities = "It releases a sweet fragrance that can put others to sleep."
    ),
    Animal(
        id = 44,
        name = "Gloom",
        species = "Weed Pokémon",
        imageRes = R.drawable.pokemon_44_shiny,
        description = "Gloom is the evolved form of Oddish. It can evolve into Vileplume when exposed to a Sun Stone or into Bellossom via a special method in later generations.",
        curiosities = "Its stench is enough to make anyone faint."
    ),
    Animal(
        id = 45,
        name = "Vileplume",
        species = "Flower Pokémon",
        imageRes = R.drawable.pokemon_45_shiny,
        description = "Vileplume is the final evolution of Oddish. It is a Grass/Poison-type Pokémon.",
        curiosities = "Its giant flower releases toxic spores that can incapacitate foes."
    ),
    Animal(
        id = 46,
        name = "Paras",
        species = "Mushroom Pokémon",
        imageRes = R.drawable.pokemon_46_shiny,
        description = "Paras is a Bug/Grass-type Pokémon introduced in Generation I. It evolves into Parasect starting at level 24.",
        curiosities = "Its mushrooms, known as Parasites, release spores to control its behavior."
    ),
    Animal(
        id = 47,
        name = "Parasect",
        species = "Mushroom Pokémon",
        imageRes = R.drawable.pokemon_47_shiny,
        description = "Parasect is the evolved form of Paras. It is a Bug/Grass-type Pokémon.",
        curiosities = "The mushrooms on its back have taken over its body, controlling its actions."
    ),
    Animal(
        id = 48,
        name = "Venonat",
        species = "Insect Pokémon",
        imageRes = R.drawable.pokemon_48_shiny,
        description = "Venonat is a Bug/Poison-type Pokémon introduced in Generation I. It evolves into Venomoth starting at level 31.",
        curiosities = "Its large eyes allow it to see in the dark."
    ),
    Animal(
        id = 49,
        name = "Venomoth",
        species = "Poison Moth Pokémon",
        imageRes = R.drawable.pokemon_49_shiny,
        description = "Venomoth is the evolved form of Venonat. It is a Bug/Poison-type Pokémon.",
        curiosities = "Its wings release toxic dust that it uses to defend itself."
    ),
    Animal(
        id = 50,
        name = "Diglett",
        species = "Mole Pokémon",
        imageRes = R.drawable.pokemon_50_shiny,
        description = "Diglett is a Ground-type Pokémon introduced in Generation I. It evolves into Dugtrio starting at level 26.",
        curiosities = "It burrows underground and can emerge unexpectedly to surprise its foes."
    )


)