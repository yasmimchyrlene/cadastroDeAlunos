package com.goldfish.natacao.service

import com.goldfish.natacao.model.Cadastro

interface CadastroService {

    fun create(cadastro: Cadastro)
    fun update(id: Long, cadastro: Cadastro)
    fun getAll(): List<Cadastro>
    fun getById(id: Long): Cadastro
    fun delete(id: Long)
}