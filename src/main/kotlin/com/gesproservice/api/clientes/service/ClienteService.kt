package com.gesproservice.api.clientes.service

import com.gesproservice.api.clientes.persistence.entity.ClienteEntity
import com.gesproservice.configuration.common.service.CommonService

interface ClienteService : CommonService<ClienteEntity, Long> {
    abstract fun getClientePorDni(docTipo: String, docNum: String): Any
}