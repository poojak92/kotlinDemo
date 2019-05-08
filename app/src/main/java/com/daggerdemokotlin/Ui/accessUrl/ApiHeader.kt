package com.daggerdemokotlin.Ui.accessUrl

import android.content.Context
import javax.inject.Inject
import javax.inject.Named






class ApiHeader @Inject constructor(internal val publicApiHeader: PublicApiHeader) {

    class PublicApiHeader @Inject constructor(@Named("serverUrl") val serverUrl: String)

}