package com.protectly.samplerecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.protectly.samplerecyclerview.adapter.PeliculasAdapter
import com.protectly.samplerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Vamos a crear la lista de peliculas
        val peliculas = arrayOf(
            "Ghost",
            "El silencio de los inocentes",
            "La edad de oro",
            "los paracaidistas del submarino rojo",
            "los muertos luchan por vivir",
            "el discreto encanto de la burguesía",
            "stalker",
            "el séptimo sello",
            "El Padrino",
            "Día de los Santos Inocentes",
            "Top Gun",
            "niño en pijama de rayas",
            "el mundo de wain",
            "en busca de la felicidad",
            "naranja mecanica",
            "El perfecto asesino",
            "Mision Imposible",
            "solaris",
            "el resplandor",
            "Negocio redondo",
            "el guardaespaldas",
            "incendio bajo el mar",
            "la esquina de la casa redonda",
            "agachate que vienen los indios"
        )

        val adaptadorPeliculas = PeliculasAdapter(peliculas.sortedArrayDescending())
        binding.recyclerExample.adapter = adaptadorPeliculas


    }
}