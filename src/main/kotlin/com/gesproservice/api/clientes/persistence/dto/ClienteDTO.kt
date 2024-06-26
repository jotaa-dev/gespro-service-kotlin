package com.gesproservice.api.clientes.persistence.dto

data class ClienteDTO (

    // DATOS-DE-IDENTIDAD
    var docTipo: String? = null,
    var docNumero: String? = null,

    // DATOS-DE-CONTACTO
    var detalleNombre: String? = null,
    var contactoTel01: String? = null,
    var contactoTel02: String? = null,
    var contactoEmail: String? = null,

    // DATOS-DE-DIRECCION
    var dirCalle: String? = null,
    var dirNumero: String? = null,
    var dirLetraNumeroDepto: String? = null,
    var dirCodLocalidad: Byte? = null,
    var dirCodProvincia: Byte? = null,

    // OTROS-DATOS
    var codigoLista: Byte? = null,
    var codigoVendedor: Byte? = null,
    var estadoHabilitado: Boolean? = null

)
