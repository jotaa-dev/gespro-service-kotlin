package com.gesproservice.configuration.common.service

import com.gesproservice.configuration.common.entity.CommonEntity
import java.io.Serializable

interface CommonService <Entity, ID : Serializable?> {
    @Throws(Exception::class)
    fun findAll(): List<Entity>

    @Throws(Exception::class)
    fun findById(id: ID): Entity?

    @Throws(Exception::class)
    fun save(entity: Entity): Entity

    @Throws(Exception::class)
    fun update(id: ID, entity: Entity): Entity

    @Throws(Exception::class)
    fun delete(id: ID): Boolean
}