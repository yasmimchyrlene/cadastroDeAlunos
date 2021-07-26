package com.goldfish.natacao.repository

import com.goldfish.natacao.model.Cadastro
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CadastroRepository: CrudRepository<Cadastro, Long> {
}