package com.gruponiche.fit_or_fat.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gruponiche.fit_or_fat.databinding.ItemRutinaBinding
import com.gruponiche.fit_or_fat.io.response.RutinaResponse
import java.util.*

class RutinaViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemRutinaBinding.bind(view)

    fun render(rutinaModel: RutinaResponse, onClickListener: (RutinaResponse) -> Unit) {
        binding.tvRutinaNombre.text = rutinaModel.nombreRutina.capitalize(Locale.ROOT)
        binding.tvRutinaInfo.text = "| " + rutinaModel.nivelRutina.capitalize(Locale.ROOT) + " | " + rutinaModel.tipoRutina.capitalize(Locale.ROOT)
        Glide.with(binding.ivRutina.context).load(rutinaModel.linkImagen).into(binding.ivRutina)
        itemView.setOnClickListener {
            onClickListener(rutinaModel)
        }
    }



}