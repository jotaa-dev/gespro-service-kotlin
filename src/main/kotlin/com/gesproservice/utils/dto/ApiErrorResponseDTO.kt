package com.gesproservice.utils.dto

import java.io.Serializable

data class ApiErrorResponseDTO(
    var codigo: Int? = null,
    var descripcion: String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }
}