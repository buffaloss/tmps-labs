package menu

import iterator.MenuIterator

interface Menu {
    fun createIterator(): MenuIterator<Dish>
}