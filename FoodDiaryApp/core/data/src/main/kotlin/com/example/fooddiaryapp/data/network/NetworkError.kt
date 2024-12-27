package com.example.fooddiaryapp.data.network

sealed class NetworkError : Exception() {
    data class Server(override val message: String) : NetworkError()
    data class Unknown(override val message: String) : NetworkError()
    data object Network : NetworkError() {
        private fun readResolve(): Any = Network
    }

    data object Unauthorized : NetworkError() {
        private fun readResolve(): Any = Unauthorized
    }
}