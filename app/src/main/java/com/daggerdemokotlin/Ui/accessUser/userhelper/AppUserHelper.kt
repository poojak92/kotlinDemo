package com.daggerdemokotlin.Ui.accessUser.userhelper

import android.content.Context
import javax.inject.Inject

/*@Module
class AppUserHelper {

 *//*   @Provides
    @Singleton
    internal fun providesUser(): User {
        return User("Lars", "Vogel")
    }*//*




}*/
class AppUserHelper @Inject constructor(context: Context) : UserHelper {
   /* override fun providesUser(): User {
        return User("Lars", "Vogel")
    }*/

    override fun providesUser(): User? {
        return User("Lars", "Vogel")
    }

}