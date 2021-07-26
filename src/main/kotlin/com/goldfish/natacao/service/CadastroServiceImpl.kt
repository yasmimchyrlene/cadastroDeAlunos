package com.goldfish.natacao.service

import com.goldfish.natacao.model.Cadastro
import com.goldfish.natacao.repository.CadastroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CadastroServiceImpl : CadastroService {
    @Autowired
    lateinit var cadastroRepository: CadastroRepository

    override fun create(cadastro: Cadastro) {
        cadastroRepository.save(cadastro)
    }

    override fun update(id: Long, cadastro: Cadastro) {
        cadastroRepository.save(Cadastro(id, cadastro.nome, cadastro.cpf, cadastro.telefone))
    }

    override fun getAll(): List<Cadastro> {
        return this.cadastroRepository.findAll().toList()
    }

    override fun getById(id: Long): Cadastro {
        return this.cadastroRepository.findById(id).orElse(null)
    }

    override fun delete(id: Long) {
        return this.cadastroRepository.deleteById(id)
    }


}