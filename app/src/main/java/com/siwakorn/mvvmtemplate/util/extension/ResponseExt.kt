package com.siwakorn.mvvmtemplate.util.extension

fun Int.isSuccess(): Boolean {
    return this == 200
}