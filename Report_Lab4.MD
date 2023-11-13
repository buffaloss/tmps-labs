# Topic: *Behavioral Design Patterns*
## Author: *Golban Beatricia*
### Group: *FAF-213*
------
## Objectives:
&ensp; &ensp; __1. Study and understand the Behavioral Design Patterns.__

&ensp; &ensp; __2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.__

&ensp; &ensp; __3. Create a new Project or add some additional functionalities using behavioral design patterns.__

## Some Theory:
&ensp; &ensp; Behavioral design patterns are a category of design patterns that focus on the interaction and communication between objects and classes. They provide a way to organize the behavior of objects in a way that is both flexible and reusable, while separating the responsibilities of objects from the specific implementation details. Behavioral design patterns address common problems encountered in object behavior, such as how to define interactions between objects, how to control the flow of messages between objects, or how to define algorithms and policies that can be reused across different objects and classes.

&ensp; &ensp; The design pattern implemented in this project are:

   * Observer
   * Iterator
   * Command

## Main tasks:
&ensp; &ensp; __1. Creating a new project or extending your last one project, implement at least 1 behavioral design pattern in your project:__
  * The implemented design pattern should help to perform the tasks involved in your system.
  * The behavioral DPs can be integrated into you functionalities alongside the structural ones.
  * There should only be one client for the whole system.
  
&ensp; &ensp; __2. Keep your files grouped (into packages/directories) by their responsibilities (an example project structure):__
  * client;
  * domain;
  * utilities;
  * data(if applies);
  
&ensp; &ensp; __3. Document your work in a separate markdown file according to the requirements presented below (the structure can be extended of course):__
  * Topic of the laboratory work.
  * Author.
  * Introduction/Theory/Motivation.
  * Implementation & Explanation (you can include code snippets as well):
    * Indicate the location of the code snippet.
    * Emphasize the main idea and motivate the usage of the pattern.
  * Results/Screenshots/Conclusions;

## Behavioral design patterns implementation

### &ensp; &ensp; Observer design pattern

&ensp; &ensp; The Observer pattern is used to notify waitresses (observers) when an order (subject) is ready. The Subscriber interface declares the update method, which is implemented by the Waitress class. The Cook class, which represents the subject, has an EventManager that manages a list of subscribers and notifies them when an order is ready. The Waitress class, which represents the observer, updates upon receiving a notification, indicating that an order can be picked up.

&ensp; &ensp; This code defines the Cook and EventManager classes. The Cook class prepares food and then notifies all subscribed waitresses that the food is ready. 

```
class Cook {
    val events = EventManager()

    fun prepareFood(item: String) {
        cook(item)
        events.notify(item)
    }

    private fun cook(item: String) {
        println("Cooking $item...")
        Thread.sleep(2000)
        println("The $item is ready!")
    }
}
```

&ensp; &ensp; The EventManager class manages a list of subscribers and includes methods to subscribe, unsubscribe, and notify subscribers.

```
class EventManager {
    private val listeners = mutableListOf<Subscriber>()

    fun subscribe(listener: Subscriber) {
        listeners.add(listener)
    }

    fun unsubscribe(listener: Subscriber) {
        listeners.remove(listener)
    }

    fun notify(item: String) {
        for (listener in listeners) {
            listener.update(item)
        }
    }
}
```

### &ensp; &ensp; Iterator design pattern

&ensp; &ensp; The Iterator pattern is used to provide a way to access the elements of the menu items sequentially without exposing its underlying representation. The MenuIterator interface declares the hasNext, next, and getItem methods, which are implemented by the RegularMenuIterator and SeasonalMenuIterator classes. The RegularMenu and SeasonalMenu classes, which represent the collections, use these iterators to traverse their items. The Waitress class uses the iterators to print all items in both menus.

```
interface MenuIterator<T> {
    fun hasNext(): Boolean
    fun next(): T
    fun getItem(pos: Int): T
}
```
&ensp; &ensp; This code defines the MenuIterator interface and the RegularMenuIterator class. The RegularMenuIterator class implements the MenuIterator interface and provides methods to traverse the items of a RegularMenu.


```
class RegularMenuIterator(
    private val menuItems: List<Dish>
): MenuIterator<Dish> {
    private var position: Int = 0

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
```
&ensp; &ensp; The Waitress class uses the iterators to print all items in both menus. The printMenu method calls the hasNext and next methods on the iterators to traverse the items.

```
class Waitress (
    val name: String,
    regularMenu: RegularMenu? = null,
    seasonalMenu: SeasonalMenu? = null
) : Subscriber {
    private val it1 = regularMenu?.createIterator()
    private val it2 = seasonalMenu?.createIterator()

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
```

### &ensp; &ensp; Command design pattern

&ensp; &ensp; In this project, the Command pattern is used to encapsulate orders as objects, allowing them to be treated uniformly and managed easily. The Command interface declares the execute and undo methods, which are implemented by the Order class. The Order class encapsulates a request, which is to prepare a specific food item. The Cook class, which represents the receiver, has the prepareFood method that the Order command calls. The Waitress class, which represents the invoker, takes and posts orders, and can also undo the last order.

&ensp; &ensp; The Command interface contains the methods execute() and undo(). The Order class implements the Command interface and encapsulates a request to prepare a specific food item. The execute method calls the prepareFood method on the Cook, and the undo method simulates cancelling the order. The Cook class represents the receiver. 

```
class Order(
    private val cook: Cook,
    private val item: String
) : Command {
    override fun execute() {
        chef.prepareFood(item)
    }

    override fun undo() {
        println("Cancelling the $item...")
    }
}
```

&ensp; &ensp; The code below showcases the Waitress class, which represents the invoker. The takeOrder method takes an Order, the orderUp method posts an Order (which executes it and adds it to the command history), and the undoOrder method undoes the last order.

```
class Waitress (
    ...
) : Subscriber {
    ...
    fun takeOrder(order: Command) {
        println("Waitress $name has taken an order")
        slot = order
    }

    fun orderUp() {
        println("Waitress $name has posted the order...")
        slot?.execute()
        commandHistory.push(slot!!)
    }

    fun undoOrder() {
        val lastOrder = commandHistory.pop()
        lastOrder?.undo()
    }
}
```

## Conclusions
&ensp; &ensp; In conclusion, the implementation of the Observer, Iterator, and Command behavioral design patterns in this cafe system has been a success. The Observer pattern facilitated effective communication between the Cook (Subject) and Waitresses (Observers), ensuring that all waitresses are notified when an order is ready. The Iterator pattern was used to provide a consistent way to traverse through different types of menus (Regular and Seasonal), enhancing the system's flexibility. The Command pattern was instrumental in managing orders, allowing them to be treated as objects and enabling operations such as 'undo'. 

&ensp; &ensp; These design patterns have not only organized the behavior of objects in the system but also made the code more flexible and reusable. The implementation of these patterns has deepened my understanding of their practical applications and their role in creating efficient software systems. The learning experience from this project will be valuable in designing and developing more complex software systems in the future.