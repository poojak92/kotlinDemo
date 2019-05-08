package com.daggerdemokotlin.di.module

import android.app.Application
import android.content.Context
import com.daggerdemokotlin.Ui.accessUrl.ApiHeader
import com.daggerdemokotlin.Ui.accessUrl.AppApiHelper
import com.daggerdemokotlin.Ui.accessUrl.urlHelper
import com.daggerdemokotlin.Ui.accessUser.userhelper.AppUserHelper
import com.daggerdemokotlin.Ui.accessUser.userhelper.UserHelper
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppUserHelper): UserHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application


    @Provides
    @Named
    internal fun provideServerUrl(): String = "https://www.vogella.com/"


    @Provides
    @Singleton
    internal fun provideAPIHelper(appApiHelper: AppApiHelper): urlHelper = appApiHelper

   /* @Provides
    @Named("anotherUrl")
    internal fun provideAnotherUrl(): String = "http://www.google.com"
    */


    @Provides
    @Singleton
    internal fun provideProtectedApiUrl(@Named apiKey: String)
            : ApiHeader.PublicApiHeader = ApiHeader.PublicApiHeader(serverUrl = apiKey)



}