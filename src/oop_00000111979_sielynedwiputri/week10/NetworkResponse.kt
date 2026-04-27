package oop_00000111979_sielynedwiputri.week10

class NetworkResponse {
    data class ApiResponse<T>(val status: String, val data: T)
}