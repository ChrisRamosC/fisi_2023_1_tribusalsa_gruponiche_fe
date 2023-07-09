package com.gruponiche.fit_or_fat.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.gruponiche.fit_or_fat.R

class GraficasFragment : Fragment(R.layout.fragment_graficas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnProgreso = requireView().findViewById<ConstraintLayout>(R.id.btnProgresoActividad)
        val btnEstadisticas = requireView().findViewById<ConstraintLayout>(R.id.btnEstadisticas)
        val btnIndicadores = requireView().findViewById<ConstraintLayout>(R.id.btnIndicadoresSalud)

        btnProgreso.setOnClickListener(){
            goToProgreso()
        }

        btnEstadisticas.setOnClickListener(){
            goToEstadisticas()
        }

        btnIndicadores.setOnClickListener(){
            goToIndicadores()
        }
    }


    private fun goToProgreso(){
        val intent = Intent (getActivity(), VisualizarProgreso::class.java)
        getActivity()?.startActivity(intent)
    }

    private fun goToEstadisticas(){
        val intent = Intent (getActivity(), VisualizarEstadisticas::class.java)
        getActivity()?.startActivity(intent)
    }

    private fun goToIndicadores(){
        val intent = Intent (getActivity(), VisualizarIndicadoresSalud::class.java)
        getActivity()?.startActivity(intent)
    }

}