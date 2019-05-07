package com.daggerdemokotlin.Ui.accessUser.View

import com.mindorks.framework.mvp.ui.base.view.MVPView


/**
 * Created by jyotidubey on 04/01/18.
 */
interface MainMVPView : MVPView {

    fun showSuccessToast()
    fun showErrorToast()

}