package com.daggerdemokotlin.Ui.accessUser.userhelper

import android.content.Context
import javax.inject.Inject


class AppUserHelper @Inject constructor(context: Context) : UserHelper {
     override fun providesUser(): User? {
        return User("Lars", "Vogel")
    }

}