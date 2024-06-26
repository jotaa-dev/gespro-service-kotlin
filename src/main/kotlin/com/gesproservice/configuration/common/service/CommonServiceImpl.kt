package com.gesproservice.configuration.common.service

import com.gesproservice.configuration.common.entity.CommonEntity
import org.springframework.stereotype.Service
import java.io.Serializable

@Service
abstract class CommonServiceImpl<Entity, ID : Serializable?> : CommonService<Entity, ID> {
}