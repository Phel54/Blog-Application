package com.example.blogapplication.entity

import javax.persistence.*

@Entity
class UserEntity(
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null
)