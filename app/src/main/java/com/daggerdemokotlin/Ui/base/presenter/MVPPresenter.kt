package com.mindorks.framework.mvp.ui.base.presenter

import com.daggerdemokotlin.Ui.base.interactor.MVPInteractor
import com.mindorks.framework.mvp.ui.base.view.MVPView

/**
 * Created by jyotidubey on 04/01/18.
 */
interface MVPPresenter<V : MVPView, I : MVPInteractor> {
    fun getView(): V?
}