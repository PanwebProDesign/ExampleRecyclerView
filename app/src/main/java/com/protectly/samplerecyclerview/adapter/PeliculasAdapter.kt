package com.protectly.samplerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.protectly.samplerecyclerview.R

class PeliculasAdapter(private val listaPeliculas: Array<String>) : RecyclerView.Adapter<PeliculasAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tituloPelicula: TextView
        val subtituloPelicula: TextView

        init {
            // se enlazan los ids con las vistas
            tituloPelicula = view.findViewById(R.id.titulo_pelicula)
            subtituloPelicula = view.findViewById(R.id.subtitulo_pelicula)
        }
    }

    //enlaza el archivo xml con la clase ViewHolser que generamos arriba
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //crea una nueva vista, que define la celda que vamos a pintar la informacion
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fila, parent, false)

        return ViewHolder(view)
    }

    //esta funcion tiene que devolver la cantidad de items que va a mostrar el recycler
    override fun getItemCount(): Int {
        return listaPeliculas.size
    }

    //aca vamos a configurar la info en cada celda que vamos a mostrar en la lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // obtiene el elemento desde la lista con su posicion y pinta esta info
        // en los diferentes views  que tenga la vista
        //Aca estamos mostrando el titulo de la pelicula
        holder.tituloPelicula.text = listaPeliculas [position]
        //vamos a agregar un texto en el subtitulo
        holder.subtituloPelicula.text = "Estoy en la posicion $position"
    }


}