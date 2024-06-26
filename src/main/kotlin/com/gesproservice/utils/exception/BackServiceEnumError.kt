package com.gesproservice.utils.exception

enum class BackServiceEnumError(private val code: Int, private val description: String) {
    TIPO_DOCUMENTO_INVALIDO(1100, "Tipo de Documento Invalido"),
    NUMERO_DOCUMENTO_INVALIDO(1101, "Número de Documento Invalido"),
    TIPO_DOCUMENTO_FALTANTE(1111, "El numero de doc no puede estar vacio");

    fun getCode(): Int {
        return code
    }

    fun getDescription(): String {
        return description
    }
}