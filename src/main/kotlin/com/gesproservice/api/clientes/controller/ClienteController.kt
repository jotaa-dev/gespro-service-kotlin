package com.gesproservice.api.clientes.controller

import com.gesproservice.api.clientes.service.ClienteService
import com.gesproservice.utils.dto.ApiErrorResponseDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/clientes")
class ClienteController() {
    //class ClienteController(private val clienteService: ClienteService) {

    @Autowired
    lateinit var clienteService: ClienteService


    @GetMapping("/obtenerCliente/{docTipo}/{docNum}")
    fun obtenerClientePorDni(@PathVariable docTipo: String, @PathVariable docNum: String): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.getClientePorDni(docTipo, docNum))
        } catch (e: IllegalArgumentException) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ApiErrorResponseDTO(HttpStatus.BAD_REQUEST.value(), e.message))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ApiErrorResponseDTO(HttpStatus.NOT_FOUND.value(), e.message))
        }
    }


}