package com.gesproservice.api.clientes.persistence.mapper

import com.gesproservice.api.clientes.persistence.dto.ClienteDTO
import com.gesproservice.api.clientes.persistence.entity.ClienteEntity
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring")
interface ClienteMapper {

    @Mappings(
        Mapping(source = "cliDocTipo", target = "docTipo"),
        Mapping(source = "cliDocNumero", target = "docNumero"),
        Mapping(source = "cliDetalleNombre", target = "detalleNombre"),
        Mapping(source = "cliContactoTel01", target = "contactoTel01"),
        Mapping(source = "cliContactoTel02", target = "contactoTel02"),
        Mapping(source = "cliContactoEmail", target = "contactoEmail"),
        Mapping(source = "cliDirCalle", target = "dirCalle"),
        Mapping(source = "cliDirNumero", target = "dirNumero"),
        Mapping(source = "cliDirLetraNumeroDepto", target = "dirLetraNumeroDepto"),
        Mapping(source = "cliDirCodLocalidad", target = "dirCodLocalidad"),
        Mapping(source = "cliDirCodProvincia", target = "dirCodProvincia"),
        Mapping(source = "cliCodigoLista", target = "codigoLista"),
        Mapping(source = "cliCodigoVendedor", target = "codigoVendedor"),
        Mapping(source = "cliEstadoHabilitado", target = "estadoHabilitado")
    )
    fun toClienteDTO(clienteEntity: ClienteEntity): ClienteDTO

    fun toListaClienteDTO(listaClienteEntity: List<ClienteEntity>): List<ClienteDTO>

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    fun toClienteEntity(clienteDTO: ClienteDTO): ClienteEntity
}
