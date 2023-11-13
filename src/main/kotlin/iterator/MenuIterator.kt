package iterator

interface MenuIterator<T> {
    fun hasNext(): Boolean
    fun next(): T
    fun getItem(pos: Int): T
}