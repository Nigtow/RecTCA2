package com.example.androidjogo.services

import com.example.androidjogo.MainActivity

interface PerguntaListener {
    fun getPerguntaActivity():MainActivity
    fun getEmail():String
    fun getSenha():String
    fun sair()
}