package com.daggerdemokotlin.Ui.accessUser.presenter

import com.daggerdemokotlin.Ui.accessUser.View.MainMVPView
import com.daggerdemokotlin.Ui.accessUser.interactor.MainMVPInteractor
import com.mindorks.framework.mvp.ui.base.presenter.BasePresenter
import javax.inject.Inject




class MainPresenter<V : MainMVPView, I : MainMVPInteractor> @Inject internal constructor(interactor: I) :
    BasePresenter<V, I>(interactor = interactor), MainMVPPresenter<V, I> {
    override fun onButtonClicked(){
        var flag = iscalled()
        if(flag){
            getView()?.let {
                it.hideProgress()
                it.showSuccessToast()
            }
        }else{
            getView()?.showErrorToast()
        }
    }

    private fun iscalled(): Boolean {
        interactor?.let { return it.callserver() }
        return false
    }

}