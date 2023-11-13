package menu

import iterator.MenuIterator
import iterator.SeasonalMenuIterator


class SeasonalMenu: Menu {
    private val menuItems = mutableListOf<Dish>()

    init {
        menuItems.addAll(listOf(
            Dish("Pumpkin Spice Latte", true),
            Dish("Roasted Turkey Sandwich", false),
            Dish("Cranberry Muffin", true),
            Dish("Peppermint Hot Chocolate", true)
        ))
    }

    override fun createIterator(): MenuIterator<Dish> {
        return SeasonalMenuIterator(menuItems)
    }

}