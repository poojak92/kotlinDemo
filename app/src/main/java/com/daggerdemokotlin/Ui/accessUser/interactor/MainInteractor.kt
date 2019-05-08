package com.daggerdemokotlin.Ui.accessUser.interactor

import com.daggerdemokotlin.Ui.accessUrl.urlHelper
import com.daggerdemokotlin.Ui.accessUser.userhelper.UserHelper
import com.mindorks.framework.mvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class MainInteractor @Inject internal constructor(userHelper: UserHelper,urlhelper: urlHelper) : BaseInteractor(userHelper,urlhelper), MainMVPInteractor {

    override fun doServerLoginApiCall():String{
        val url =urlHelper.performServerLogin()
        System.out.println("url: "+url)
        return url.toString()
   }


    override fun calluser(): Boolean {
        var user = userHelper.providesUser()
        System.out.println("user: "+user)
        return user !=null
    }

}



