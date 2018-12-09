fun crash() {
    val m = DefaultingMap<Int, Long>(0)
    m[0] += 42L
}