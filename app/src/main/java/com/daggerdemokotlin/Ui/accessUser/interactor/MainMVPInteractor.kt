package com.daggerdemokotlin.Ui.accessUser.interactor

import com.daggerdemokotlin.Ui.base.interactor.MVPInteractor

interface MainMVPInteractor : MVPInteractor {
    fun callserver(): Boolean
}