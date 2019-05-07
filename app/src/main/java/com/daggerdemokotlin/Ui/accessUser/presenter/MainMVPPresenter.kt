package com.daggerdemokotlin.Ui.accessUser.presenter

import com.daggerdemokotlin.Ui.accessUser.View.MainMVPView
import com.daggerdemokotlin.Ui.accessUser.interactor.MainMVPInteractor
import com.mindorks.framework.mvp.ui.base.presenter.MVPPresenter

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I>{
    fun onButtonClicked()
}