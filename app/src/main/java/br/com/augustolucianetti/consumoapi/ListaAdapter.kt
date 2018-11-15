package br.com.augustolucianetti.consumoapi

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import br.com.augustolucianetti.consumoapi.model.Pokemon

class ListaAdapter(
        val pokemons: List<Pokemon>,
        val contect : Context,
        val listener: (Pokemon) -> Unit) {

    class ViewHoldr (itemView: View) :RecyclerView.ViewHolder(itemView) {
        
    }
}
