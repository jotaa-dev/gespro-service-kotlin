package com.gesproservice.api.clientes.persistence.entity

import com.gesproservice.configuration.common.entity.CommonEntity
import jakarta.persistence.*


@Entity(name = "clientes")
data class ClienteEntity (
    @Column(name = "cli_doc_tipo")
    val cliDocTipo: String,
    @Column(name = "cli_doc_numero")
    val cliDocNumero: String,
    @Column(name = "cli_detalle_nombre")
    val cliDetalleNombre: String,
    @Column(name = "cli_contacto_tel_01")
    val cliContactoTel01: String,
    @Column(name = "cli_contacto_tel_02")
    val cliContactoTel02: String,
    @Column(name = "cli_contacto_email")
    val cliContactoEmail: String,
    @Column(name = "cli_dir_calle")
    val cliDirCalle: String,
    @Column(name = "cli_dir_numero")
    val cliDirNumero: String,
    @Column(name = "cli_dir_letra_numero_depto")
    val cliDirLetraNumeroDepto: String,
    @Column(name = "cli_dir_cod_localidad")
    val cliDirCodLocalidad: Short,
    @Column(name = "cli_dir_cod_provincia")
    val cliDirCodProvincia: Byte,
    @Column(name = "cli_codigo_lista")
    val cliCodigoLista: Byte,
    @Column(name = "cli_codigo_vendedor")
    val cliCodigoVendedor: Byte,
    @Column(name = "cli_estado_habilitado")
    val cliEstadoHabilitado: Boolean
) : CommonEntity() {
}