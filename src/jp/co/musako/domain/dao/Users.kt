package jp.co.musako.domain.dao

import org.jetbrains.exposed.dao.LongIdTable

object Users : LongIdTable() {
    val mail = varchar("mail", 256).uniqueIndex()
    val gender = integer("gender")
    val password = varchar("password", 256)
    val birthdate = date("birthdate")
    val createUserId = integer("create_user_id")
    val createTimestamp = datetime("create_timestamp")
}

