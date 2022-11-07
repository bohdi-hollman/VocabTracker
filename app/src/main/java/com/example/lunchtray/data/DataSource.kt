package com.example.lunchtray.data

import com.example.lunchtray.constants.ItemType
import com.example.lunchtray.model.MenuItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {
    val menuItems = mapOf(
        "cauliflower" to
        MenuItem(
            name = "חֵסֵד",
            description = "Khesed; Steadfast Love",
            num = 1.0,
            type = ItemType.ENTREE
        ),
        "chili" to
        MenuItem(
            name = "אֱלהִים",
            description = "Elohim; God",
            num = 1.0,
            type = ItemType.ENTREE
        ),
        "pasta" to
        MenuItem(
            name = "צֶדֶק",
            description = "Tsedeq; Righteousness",
            num = 1.0,
            type = ItemType.ENTREE
        ),
        "skillet" to
        MenuItem(
            name = "כָּבַד",
            description = "Kabad; Weighty, Heavy, Glory",
            num = 1.0,
            type = ItemType.ENTREE
        ),
        "salad" to
        MenuItem(
            name = "κύριος",
            description = "Kurios; Lord, Master",
            num = 1.0,
            type = ItemType.SIDE_DISH
        ),
        "soup" to
        MenuItem(
            name = "Butternut Squash Soup",
            description = "Roasted butternut squash, roasted peppers, chili oil",
            num = 1.0,
            type = ItemType.SIDE_DISH
        ),
        "potatoes" to
        MenuItem(
            name = "δικαιόω",
            description = "Dikaioo; Justify, Declare Rightous",
            num = 1.0,
            type = ItemType.SIDE_DISH
        ),
        "rice" to
        MenuItem(
            name = "ἁμαρτία",
            description = "Hamartia; Sin, Failure",
            num = 1.0,
            type = ItemType.SIDE_DISH
        ),
        "bread" to
        MenuItem(
            name = "Fide",
            description = "Faith",
            num = 1.0,
            type = ItemType.ACCOMPANIMENT
        ),
        "berries" to
        MenuItem(
            name = "Gratia",
            description = "Grace",
            num = 1.0,
            type = ItemType.ACCOMPANIMENT
        ),
        "pickles" to
        MenuItem(
            name = "Deus",
            description = "God",
            num = 1.0,
            type = ItemType.ACCOMPANIMENT
        )
    )
}
