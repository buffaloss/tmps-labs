package menu

import iterator.MenuIterator
import iterator.RegularMenuIterator

class RegularMenu: Menu {
    private val menuItems = mutableListOf<Dish>()

    init {
        menuItems.addAll(listOf(
            Dish("Chicken Sandwich", false),
            Dish("Veggie Burger", true),
            Dish("Pasta", false),
            Dish("Coffee", true)
        ))
    }

    override fun createIterator(): MenuIterator<Dish> {
        return RegularMenuIterator(menuItems)
    }
}