package com.daggerdemokotlin.Ui.presenter

import com.daggerdemokotlin.Ui.View.MainMVPView
import com.daggerdemokotlin.Ui.interactor.MainMVPInteractor
import com.mindorks.framework.mvp.ui.base.presenter.BasePresenter
import javax.inject.Inject




class MainPresenter<V : MainMVPView, I : MainMVPInteractor> @Inject internal constructor(interactor: I) : BasePresenter<V, I>(interactor = interactor), MainMVPPresenter<V, I> {
    override fun onButtonClicked() {
      var flag = interactor.callserver()
        if(flag){
            getView()?.showSuccessToast()
        }else{
            getView()?.showErrorToast()
        }
    }

}
