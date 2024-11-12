package com.example.appclimaparcial.repositorio
import com.example.appclimaparcial.repositorio.modelos.Ciudad
import com.example.appclimaparcial.repositorio.modelos.Clima
import com.example.appclimaparcial.repositorio.modelos.ListForecast
import io.ktor.client.HttpClient

class ApiRepositorio : Repositorio{

    private val apiKey = "625f54f0ba19b17169903c58a48378f0"


    override suspend fun CiudadBuscada(ciudad: String): List<Ciudad> {
        TODO("Not yet implemented")
    }

    override suspend fun mostrarClima(lat: Float, lon: Float): Clima {
        TODO("Not yet implemented")
    }

    override suspend fun mostrarPronostico(nombre: String): List<ListForecast> {
        TODO("Not yet implemented")
    }

}