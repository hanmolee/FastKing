package com.fastking.app.fastking

import com.fastking.app.fastking.Model.Survay
import com.vicpin.krealmextensions.RealmConfigStore
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by mac on 2017. 12. 12..
 */

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val survayConfig = RealmConfiguration.Builder().name("user-db").schemaVersion(1).deleteRealmIfMigrationNeeded().build()
        // delete all data
        Realm.deleteRealm(Realm.getDefaultConfiguration())
        Realm.deleteRealm(survayConfig)

        RealmConfigStore.init(Survay::class.java, survayConfig)
    }
}