package com.example.oe_watanabe.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.oe_watanabe.qiitaclient.model.Article
import com.example.oe_watanabe.qiitaclient.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(
                dummyArticle("kotlin", "Mr.kot"),
                dummyArticle("swift", "Miss.swi")
        )

        val listView: ListView = findViewById<ListView>(R.id.list_view)
        listView.adapter = listAdapter
        listView.setOnItemClickListener{articleView, view, position, id ->
            val article = listAdapter.articles[position]
            ArticleActivity.intent(this, article).let {
                startActivity(it)
            }
        }

    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "https://qiita.com/Dreamwalker/items/3a086e168e5dc801f0cd",
                    user = User(id = "", name = userName, profileImageUrl = ""))
}
