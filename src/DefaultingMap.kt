class DefaultingMap<K, V> {
    private val storage = mutableMapOf<K, V>()
    private val defaultValue: V

    constructor(defaultValue: V) {
        this.defaultValue = defaultValue
    }

    operator fun get(key: K) = storage[key] ?: defaultValue

    operator fun set(key: K, value: V) {
        storage[key] = value
    }
}

fun crash() {
    val m = DefaultingMap<Int, Long>(0)
    m[0] += 42L
}