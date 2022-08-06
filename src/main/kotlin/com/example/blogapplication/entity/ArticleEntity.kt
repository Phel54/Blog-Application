package com.example.blogapplication.entity

import com.example.blogapplication.extensions.toSlug
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data  class ArticleEntity(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne
    var author: UserEntity,
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue
    var id: Long? = null
)