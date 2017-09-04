package com.codex.android.frasesdokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    private val phrases = arrayOf("Se benze, porque a sua felicidade vai ofender muita gente",
            "O que é teu, chega com o tempo. E o que não é se vai com ele.",
            "Eu te abraçaria , mesmo eu sendo um cacto e você um balão",
            "te perdoar não quer dizer que eu vá voltar",
            "Feliz ou não, a lei da vida sempre é seguir em frente com a cabeça erguida.",
            "Deixe ir. É melhor uns meses de coração partido do que uma vida inteira de decepções diárias.",
            "Que toda mal vire amor , que toda dor vire flor",
            "Que toda mal vire amor , que toda dor vire flor",
            "Que seja bem, que me traga paz",
            "A cada sorriso seu, eu sinto como se fosse meu")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun newPhrase(view: View) {
        textView.text = phrases[Random().nextInt(phrases.size)]
    }
}
