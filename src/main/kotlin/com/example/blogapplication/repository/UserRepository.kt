package com.example.blogapplication.repository

import com.example.blogapplication.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserEntity, Long> {
    fun findByLogin(login: String): UserEntity?
}