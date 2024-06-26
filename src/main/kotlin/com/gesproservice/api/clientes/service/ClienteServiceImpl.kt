package com.gesproservice.api.clientes.service

import com.gesproservice.api.clientes.persistence.dto.ClienteDTO
import com.gesproservice.api.clientes.persistence.entity.ClienteEntity
import com.gesproservice.api.clientes.persistence.mapper.ClienteMapper
import com.gesproservice.api.clientes.persistence.repository.ClienteRepository
import com.gesproservice.api.clientes.validator.ClienteValidator
import com.gesproservice.configuration.common.service.CommonServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClienteServiceImpl : CommonServiceImpl<ClienteEntity, Long>(), ClienteService {

    @Autowired
    lateinit var clienteRepository: ClienteRepository

    @Autowired
    lateinit var clienteMapper : ClienteMapper

    //@Autowired
    //lateinit var clienteValidator: ClienteValidator

    @Throws(Exception::class)
    override fun getClientePorDni(docTipo: String, docNum: String): ClienteDTO {
        //clienteValidator.validarTipoDocumento(docTipo)
        //clienteValidator.validarNumeroDocumento(docNum)

        return try {
            val clienteEntity = clienteRepository.getClientePorDni(docTipo, docNum)
            if (clienteEntity != null) {
                clienteMapper.toClienteDTO(clienteEntity)
            } else {
                throw Exception("Registro no encontrado")
            }
        } catch (e: Exception) {
            throw Exception(e.message)
        }
    }

    override fun findAll(): List<ClienteEntity> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): ClienteEntity? {
        TODO("Not yet implemented")
    }

    override fun save(entity: ClienteEntity): ClienteEntity {
        TODO("Not yet implemented")
    }

    override fun update(id: Long, entity: ClienteEntity): ClienteEntity {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long): Boolean {
        TODO("Not yet implemented")
    }

}