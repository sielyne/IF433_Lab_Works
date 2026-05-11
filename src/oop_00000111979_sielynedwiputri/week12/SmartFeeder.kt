package oop_00000111979_sielynedwiputri.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    return availableGram - requestedGram
}