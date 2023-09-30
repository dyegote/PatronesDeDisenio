package com.example.patronesdisenio.patronescomportamiento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.patronesdisenio.R



class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var texto: TextView
    private lateinit var boton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        texto = view.findViewById(R.id.toques)
        boton = view.findViewById(R.id.button)
        boton.setOnClickListener {
            viewModel.onButtonClick()
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.numeroDeToques.observe(viewLifecycleOwner, Observer { toques ->
            texto.text = toques.toString()
        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}