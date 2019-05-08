package com.mindorks.framework.mvp.ui.base.interactor

import com.daggerdemokotlin.Ui.accessUrl.urlHelper
import com.daggerdemokotlin.Ui.base.interactor.MVPInteractor
import com.daggerdemokotlin.Ui.accessUser.userhelper.UserHelper


/**
 * Created by jyotidubey on 04/01/18.
 */
open class BaseInteractor() : MVPInteractor {
    override fun isCheck(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected lateinit var userHelper: UserHelper

    protected lateinit var urlHelper: urlHelper

    constructor(userHelper: UserHelper , urlHelper: urlHelper) : this() {
        this.userHelper = userHelper
        this.urlHelper = urlHelper
    }



}