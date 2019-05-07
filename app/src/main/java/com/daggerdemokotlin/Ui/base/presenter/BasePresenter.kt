package com.mindorks.framework.mvp.ui.base.presenter

import com.daggerdemokotlin.Ui.base.interactor.MVPInteractor
import com.mindorks.framework.mvp.ui.base.view.MVPView


/**
 * Created by jyotidubey on 04/01/18.
 */
abstract class BasePresenter<V : MVPView, I : MVPInteractor> internal constructor(protected var interactor: I) : MVPPresenter<V, I> {
    private var view: V? = null


    override fun getView(): V? = view



}