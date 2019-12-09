package jp.co.musako.domain.entity

import jp.co.musako.domain.dao.Users
import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass

class UsersEntity(id: EntityID<Long>) : LongEntity(id) {

    companion object : LongEntityClass<UsersEntity>(Users)

    val mail by Users.mail
    val gender by Users.gender
    val password by Users.password
    val birthdate by Users.birthdate
    val createUserId by Users.createUserId
    val createTimestamp by Users.createTimestamp
}