package com.daggerdemokotlin.Ui.interactor

import com.daggerdemokotlin.util.UserHelper
import com.mindorks.framework.mvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class MainInteractor @Inject internal constructor(userHelper: UserHelper) : BaseInteractor(userHelper), MainMVPInteractor {
    override fun callserver(): Boolean {
        var user = userHelper.providesUser()
        System.out.println("user: "+user);
        if(user !=null) {
            return true
        }
        else {
            return false
        }
    }

   /* override fun doGoogleLoginApiCall() = apiHelper.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))

    override fun doFBLoginApiCall() = apiHelper.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))


    override fun doServerLoginApiCall(email: String, password: String) =
        apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))


    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
        preferenceHelper.let {
            it.setCurrentUserId(loginResponse.userId)
            it.setAccessToken(loginResponse.accessToken)
            it.setCurrentUserLoggedInMode(loggedInMode)
        }*/
}


/*class MainInteractor @Inject internal constructor(userHelper: UserHelper) : BaseInteractor(userHelper), MainMVPInteractor {
    override fun isCheck(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun callserver(): Boolean {
       var user = userHelper.providesUser()
        System.out.println("user: "+user);
        if(user !=null)
            return true
        else
            return false
    }

}*/


