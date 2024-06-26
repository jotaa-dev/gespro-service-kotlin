package com.gesproservice.api.clientes.persistence.repository

import com.gesproservice.api.clientes.persistence.entity.ClienteEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : JpaRepository<ClienteEntity, Long> {

    @Query(
        value = "SELECT * FROM clientes WHERE clientes.cli_doc_tipo = :docTipo AND clientes.cli_doc_numero = :docNum",
        nativeQuery = true
    )
    fun getClientePorDni(@Param("docTipo") docTipo: String, @Param("docNum") docNum: String): ClienteEntity


}