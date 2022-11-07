package com.example.lunchtray.data

import com.example.lunchtray.constants.ItemType
import com.example.lunchtray.model.MenuItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {
    val menuItems = mapOf(
        "khesed" to
        MenuItem(
            name = "חֵסֵד",
            description = "Khesed; Steadfast Love",
            num = 1.0,
            type = ItemType.HEBREW
        ),
        "elohim" to
        MenuItem(
            name = "אֱלהִים",
            description = "Elohim; God",
            num = 1.0,
            type = ItemType.HEBREW
        ),
        "tsedeq" to
        MenuItem(
            name = "צֶדֶק",
            description = "Tsedeq; Righteousness",
            num = 1.0,
            type = ItemType.HEBREW
        ),
        "kabad" to
        MenuItem(
            name = "כָּבַד",
            description = "Kabad; Weighty, Heavy, Glory",
            num = 1.0,
            type = ItemType.HEBREW
        ),
        "kurios" to
        MenuItem(
            name = "κύριος",
            description = "Kurios; Lord, Master",
            num = 1.0,
            type = ItemType.GREEK
        ),
        "theopneustos" to
        MenuItem(
            name = "θεόπνευστος",
            description = "Theopneustos; God-Breathed",
            num = 1.0,
            type = ItemType.GREEK
        ),
        "dikaioo" to
        MenuItem(
            name = "δικαιόω",
            description = "Dikaioo; Justify, Declare Rightous",
            num = 1.0,
            type = ItemType.GREEK
        ),
        "hamartia" to
        MenuItem(
            name = "ἁμαρτία",
            description = "Hamartia; Sin, Failure",
            num = 1.0,
            type = ItemType.GREEK
        ),
        "fide" to
        MenuItem(
            name = "Fide",
            description = "Faith",
            num = 1.0,
            type = ItemType.LATIN
        ),
        "gratia" to
        MenuItem(
            name = "Gratia",
            description = "Grace",
            num = 1.0,
            type = ItemType.LATIN
        ),
        "deus" to
        MenuItem(
            name = "Deus",
            description = "God",
            num = 1.0,
            type = ItemType.LATIN
        )
    )
}
