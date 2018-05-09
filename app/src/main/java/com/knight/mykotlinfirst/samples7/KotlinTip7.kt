package com.knight.mykotlinfirst.samples7

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 17:36
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 17:36
 * version: v 1.0
 */

class User(val id: Int, val name: String, val address: String, val email: String)

/**
 * save user
 */
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalAccessException("Can't save user ${user.id}: empty Name")
    }
    if (user.address.isEmpty()) {
        throw  IllegalAccessException("Can't save user ${user.address}:empty adderss")
    }
    if (user.email.isEmpty()) {
        throw IllegalAccessException("Can't save user ${user.email}:empty email")
    }
    //save to db
}

/**
 * 利用局部涵数抽取相同的逻辑，去除重复代码
 */
fun saveUser2(user: User) {
    fun validate(value: String, fildName: String) {
        if (value.isEmpty()) {
            throw  IllegalAccessException("Can't save user ${user.id} : empty $fildName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    validate(user.email, "Email")
    //save to db
}

fun User.validateAll() {
    fun validate(value: String, fildNmae: String) {
        if (value.isEmpty()) {
            throw IllegalAccessException("Can't save user $id: empty $fildNmae")
        }
    }
    validate(name, "Name")
    validate(address, "address")
    validate(email, "Email")

}

fun saveUser3(user: User) {
    user.validateAll()
    //save to db
}