package com.mindorks.framework.mvp.ui.base.interactor

import com.daggerdemokotlin.Ui.base.interactor.MVPInteractor
import com.daggerdemokotlin.util.UserHelper


/**
 * Created by jyotidubey on 04/01/18.
 */
open class BaseInteractor() : MVPInteractor {
    override fun isCheck(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected lateinit var userHelper: UserHelper

    constructor(userHelper: UserHelper) : this() {
        this.userHelper = userHelper
    }



}