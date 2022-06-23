package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener {
            Toast.makeText(this,"Aceptar",Toast.LENGTH_SHORT).show()



        }

        binding.btnCancel.setOnClickListener {//accion click del boton
            Toast.makeText(this,"Adios",Toast.LENGTH_SHORT).show()//mensaje
            System.exit(0) //cerrar aplicacion


        }




    }
}