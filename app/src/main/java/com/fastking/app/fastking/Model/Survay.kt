package com.fastking.app.fastking.Model

/**
 * Created by mac on 2017. 12. 12..
 */

import io.realm.RealmObject

open class Survay(): RealmObject() {
    var resultCode: String = ""

    constructor(resultCode: String): this() {
        this.resultCode = resultCode
    }
}