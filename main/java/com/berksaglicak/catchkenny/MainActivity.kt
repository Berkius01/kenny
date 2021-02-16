package com.berksaglicak.catchkenny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var secim : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun start(view : View){

        if(secim == null){
            Toast.makeText(this@MainActivity,"zorluk seçiniz",Toast.LENGTH_LONG).show()
        }
        else if(secim == 2){
            val intento = Intent(applicationContext,Main2Activity::class.java)
            startActivity(intento)
        }
        else if(secim == 1){
            val kintent = Intent(applicationContext,Main4Activity::class.java)
            startActivity(kintent)
        }
        else {
            val zintent = Intent(applicationContext,Main3Activity::class.java)
            startActivity(zintent)
        }

        }

    fun kolay(view : View){
        secim=1
    }
    fun orta(view : View){
        secim=2
    }
    fun zor(view : View){
        secim=3
    }

}


