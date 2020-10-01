package com.siwakorn.mvvmtemplate.util.exception

import android.content.Context
import com.siwakorn.mvvmtemplate.R
import java.io.IOException

class NoInternetException(private val context: Context) : IOException() {
    override val message: String?
        get() = context.getString(R.string.no_internet_exception)
}
