package com.daggerdemokotlin.Ui.interactor

import com.daggerdemokotlin.Ui.base.interactor.MVPInteractor

interface MainMVPInteractor : MVPInteractor {
    fun callserver(): Boolean
}