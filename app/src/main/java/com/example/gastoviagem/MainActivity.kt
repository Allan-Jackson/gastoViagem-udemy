package com.example.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import android.widget.Button
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val botaoCalcular: Button = findViewById(R.id.buttonCalculate) modo "antigo" - não recomendado - de fazer

        //executando evento do botão
        buttonCalculate.setOnClickListener { //isto é o uso do "synthetic", onde os elementos que contém um id no XML viram um atributo em uma classe com o nome do recurso de layout, o android studio já faz um import estático desses atributos, assim podemos chamá-los como se fossem atributos da classe mesmo
            //TODO: código que o botão vai executar
        }
        buttonCalculate.setOnClickListener(this) //2º maneira de executar o evento do botão, fazendo a Activity implementar a interface View.OnClickListener
        textViewRS.setOnClickListener(this)
    }

    //3º maneira de executar evento do botão
    fun teste(v: View) { //método que vai ser chamado no XML na propriedade "android:onClick='teste'", é necessário que ele receba este View no parâmetro
        //TODO: código que o botão vai executar
    }

    override fun onClick(view: View) { //sobreescrevendo o método onClick da interface View.OnClickListener - interface aninhada -
        /*TESTAR SE ISSO FUNCIONA
        when(view){
            buttonCalculate -> calculate()
            textViewRS -> calculate()
        }*/
        if(R.id.buttonCalculate == view.id)
            calculate()
    }
    private fun calculate(){

    }


}