package datastructure.weapon

import datastructure.SpecialRule

abstract class Weapon {
    abstract val name: String
    abstract val externalId: String
    abstract val type: WeaponType
    abstract val strength: Int
    abstract val armourPenetration: Int
    abstract val specialRules: List<SpecialRule>
}

enum class WeaponType {
    MELEE,
    PISTOL,
    GRENADE,
    ASSAULT,
    HEAVY,
    ORDINANCE,
}
