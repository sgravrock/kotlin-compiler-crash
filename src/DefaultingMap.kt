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

    operator fun iterator() = storage.iterator()

    val values: Collection<V>
        get() = storage.values
}