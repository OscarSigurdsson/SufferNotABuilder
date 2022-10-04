package datastructure.weapon

import datastructure.SpecialRule
import datastructure.weapon.WeaponType.MELEE

data class MeleeWeapon(
    override val name: String,
    override val externalId: String,
    override val strength: Int,
    override val armourPenetration: Int,
    override val specialRules: List<SpecialRule>,
    val addUserStrength: Boolean = true,
) : Weapon() {
    override val type = MELEE
}