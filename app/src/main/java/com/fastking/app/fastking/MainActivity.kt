package com.fastking.app.fastking

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import java.io.IOException
import com.apollographql.apollo.ApolloClient



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var user_id : String = input_id.text.toString()
        var user_password : String = input_pwd.text.toString()

        btn_login.setOnClickListener { login(user_id, user_password) }


    }

    /*private fun userLoginRequest() {

        var Url : String = ""

        val okHttpClient : OkHttpClient = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()


        val apolloClient : ApolloClient = ApolloClient.builder()
                .serverUrl(Url)
                .okHttpClient(okHttpClient)
                .normalizedCache(normalizedCacheFactory, cacheKeyResolver)
                .build()

    }*/


    private fun login(user_id: String, user_password: String) {

        try {
            //userLoginRequest()
        }
        catch (e : IOException){

        }

        when(user_id){


        }
    }
}
