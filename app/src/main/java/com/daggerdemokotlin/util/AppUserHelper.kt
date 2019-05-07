package com.daggerdemokotlin.util

import android.content.Context
import com.daggerdemokotlin.util.User
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

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