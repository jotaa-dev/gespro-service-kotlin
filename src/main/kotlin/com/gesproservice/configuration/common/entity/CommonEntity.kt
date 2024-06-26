package com.gesproservice.configuration.common.entity

import jakarta.persistence.*
import java.io.Serializable

@MappedSuperclass
open class CommonEntity : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint")
    var id: Long? = null

    companion object {
        private const val serialVersionUID: Long = 1377845301858639262L
    }

}