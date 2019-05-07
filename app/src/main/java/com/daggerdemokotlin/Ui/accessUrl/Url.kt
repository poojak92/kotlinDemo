package com.daggerdemokotlin.Ui.accessUrl

import com.daggerdemokotlin.Ui.accessUser.userhelper.User
import javax.inject.Inject
import javax.inject.Named

class Url @Inject
constructor(@param:Named("serverUrl") var serverUrl: String?) : urlHelper {
    override fun callServer(user: User?): Boolean {
        println("P111serverUrl: $serverUrl")

        if (user != null && serverUrl != null && serverUrl!!.length > 0) {
            println("P111User: $user ServerUrl: $serverUrl")
            return true
        }
        return false
    }
    /* fun callServer(user: User?): Boolean {
         // System.out.println("P111"+"User: " + user.toString() );

     }*/
}