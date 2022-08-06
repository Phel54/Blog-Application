package com.example.blogapplication.repository

import com.example.blogapplication.entity.ArticleEntity
import org.springframework.data.repository.CrudRepository


interface ArticleRepository : CrudRepository<ArticleEntity,Long>{
    fun findBySlug(slug: String): ArticleEntity?
    fun findAllByOrderByAddedAtDesc(): Iterable<ArticleEntity>
}