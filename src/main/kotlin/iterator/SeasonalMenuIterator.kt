package iterator

import menu.Dish

class SeasonalMenuIterator(
    private val menuItems: List<Dish>
): MenuIterator<Dish> {
    private var position: Int = 0
        set(value) {
            field = if (value >= 0) value else 0
        }

    override fun hasNext(): Boolean {
        return position < menuItems.size
    }

    override fun next(): Dish {
        val item = menuItems[position]
        position += 1
        return item
    }

    override fun getItem(pos: Int): Dish {
        return if (pos < menuItems.size) menuItems[pos] else menuItems[0]
    }
}
