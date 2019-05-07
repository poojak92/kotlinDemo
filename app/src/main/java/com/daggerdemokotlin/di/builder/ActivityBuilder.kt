package com.mindorks.framework.mvp.di.builder


import com.daggerdemokotlin.Ui.MainActivityModule
import com.daggerdemokotlin.Ui.View.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jyotidubey on 05/01/18.
 */
@Module
abstract class ActivityBuilder {

   @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity



}