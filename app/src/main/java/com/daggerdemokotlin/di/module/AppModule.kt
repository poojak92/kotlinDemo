package com.daggerdemokotlin.di.module

import android.app.Application
import android.content.Context
import com.daggerdemokotlin.Ui.accessUser.userhelper.AppUserHelper
import com.daggerdemokotlin.Ui.accessUser.userhelper.UserHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppUserHelper): UserHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application
}