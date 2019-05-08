package com.daggerdemokotlin.Ui.accessUrl

import android.content.Context
import javax.inject.Inject


class AppApiHelper @Inject constructor(private val apiHeader: ApiHeader)  : urlHelper {
    override fun performServerLogin(): String ?{
        return apiHeader.publicApiHeader.serverUrl
    }
}