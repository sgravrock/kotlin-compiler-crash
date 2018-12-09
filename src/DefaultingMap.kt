class DefaultingMap<K> {
    operator fun get(key: K) = 0L

    operator fun set(key: K, value: Long) {
    }
}

fun crash() {
    val m = DefaultingMap<Int>()
    m[0] += 42L
}