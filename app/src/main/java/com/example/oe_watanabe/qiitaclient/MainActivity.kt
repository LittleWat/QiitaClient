package com.example.oe_watanabe.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.oe_watanabe.qiitaclient.model.Article
import com.example.oe_watanabe.qiitaclient.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val articleView = ArticleView(applicationContext)

        articleView.setArticle(Article(id = "123",
                title = "Kotlin入門",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "kohei", profileImageUrl = "")))

        setContentView(articleView)
    }
}
