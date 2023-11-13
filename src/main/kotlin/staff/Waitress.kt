package staff

import iterator.MenuIterator
import menu.Dish
import menu.RegularMenu
import menu.SeasonalMenu

class Waitress (
    val name: String,
    regularMenu: RegularMenu? = null,
    seasonalMenu: SeasonalMenu? = null
) : Subscriber {
    private val it1 = regularMenu?.createIterator()
    private val it2 = seasonalMenu?.createIterator()

    override fun update(item: String) {
        println("Waitress $name: Order $item ready - can be picked up...")
    }

    fun printMenu() {
        println("----- MENU -----")
        it1?.let { printMenu(it) }
        it2?.let { printMenu(it) }
        println("----- END MENU -----")
    }

    private fun printMenu(it: MenuIterator<Dish>) {
        while (it.hasNext()) {
            println(it.next())
        }
    }
}
