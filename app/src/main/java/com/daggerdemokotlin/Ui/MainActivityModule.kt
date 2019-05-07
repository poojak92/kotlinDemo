package com.daggerdemokotlin.Ui

import com.daggerdemokotlin.Ui.View.MainMVPView
import com.daggerdemokotlin.Ui.interactor.MainInteractor
import com.daggerdemokotlin.Ui.interactor.MainMVPInteractor
import com.daggerdemokotlin.Ui.presenter.MainMVPPresenter
import com.daggerdemokotlin.Ui.presenter.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by jyotidubey on 06/01/18.
 */
@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(presenter: MainPresenter<MainMVPView, MainMVPInteractor>)
            : MainMVPPresenter<MainMVPView, MainMVPInteractor> = presenter

}