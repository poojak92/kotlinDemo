package com.daggerdemokotlin.Ui.accessUser

import com.daggerdemokotlin.Ui.accessUser.View.MainMVPView
import com.daggerdemokotlin.Ui.accessUser.interactor.MainInteractor
import com.daggerdemokotlin.Ui.accessUser.interactor.MainMVPInteractor
import com.daggerdemokotlin.Ui.accessUser.presenter.MainMVPPresenter
import com.daggerdemokotlin.Ui.accessUser.presenter.MainPresenter
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