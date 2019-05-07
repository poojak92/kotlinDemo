package com.daggerdemokotlin.util

import dagger.Provides

interface UserHelper {
    fun providesUser(): User?
}