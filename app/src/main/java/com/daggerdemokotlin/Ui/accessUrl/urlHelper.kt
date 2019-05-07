package com.daggerdemokotlin.Ui.accessUrl

import com.daggerdemokotlin.Ui.accessUser.userhelper.User

interface urlHelper {
    fun callServer(user: User?): Boolean
}