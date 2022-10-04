package datastructure.weapon

data class RangedWeapon(
    val weapon: Weapon,
    val range: Int,
    val shots: Shots,
)

data class Shots(val amount: Int, val die: Boolean)



