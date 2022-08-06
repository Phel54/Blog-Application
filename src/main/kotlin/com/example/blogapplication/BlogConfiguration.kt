package com.example.blogapplication

import com.example.blogapplication.entity.ArticleEntity
import com.example.blogapplication.entity.UserEntity
import com.example.blogapplication.repository.ArticleRepository
import com.example.blogapplication.repository.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val phelim = userRepository.save(UserEntity("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(ArticleEntity(
            title = "Reactor Bismuth is out",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author = phelim
        ))
        articleRepository.save(ArticleEntity(
            title = "Reactor Aluminium has landed",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author = phelim
        ))
    }
}