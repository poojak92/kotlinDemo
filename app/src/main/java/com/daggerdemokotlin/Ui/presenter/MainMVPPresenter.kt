package com.daggerdemokotlin.Ui.presenter

import com.daggerdemokotlin.Ui.View.MainMVPView
import com.daggerdemokotlin.Ui.interactor.MainMVPInteractor
import com.mindorks.framework.mvp.ui.base.presenter.MVPPresenter

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I>{
    fun onButtonClicked()
}