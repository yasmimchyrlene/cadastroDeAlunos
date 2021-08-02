package com.goldfish.natacao.controller

import com.goldfish.natacao.model.Cadastro
import com.goldfish.natacao.service.CadastroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/cadastro"])
class CadastroContoller {

    @Autowired
    lateinit var cadastroService: CadastroService

    @PostMapping
    fun create(@RequestBody cadastro: Cadastro): ResponseEntity<Any> {
        this.cadastroService.create(cadastro)
        return ResponseEntity(cadastro, HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody cadastro: Cadastro): ResponseEntity<Any> =
        ResponseEntity(this.cadastroService.update(id, cadastro), HttpStatus.OK)


    @GetMapping
    fun getAll(): ResponseEntity<Any> {
        var cadastro = this.cadastroService.getAll()
        return ResponseEntity(cadastro, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Any> {
        var cadastro = this.cadastroService.getById(id)
        return ResponseEntity(cadastro, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        cadastroService.delete(id)
        return ResponseEntity(Unit, HttpStatus.NO_CONTENT)
    }

}