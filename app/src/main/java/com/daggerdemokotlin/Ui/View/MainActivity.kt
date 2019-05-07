package com.daggerdemokotlin.Ui.View

import android.os.Bundle
import com.daggerdemokotlin.R
import com.daggerdemokotlin.Ui.base.view.BaseActivity
import com.daggerdemokotlin.Ui.interactor.MainMVPInteractor
import com.daggerdemokotlin.Ui.presenter.MainMVPPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() ,MainMVPView{
    override fun showSuccessToast() {
       System.out.println("P----implemented") ;//To change body of created functions use File | Settings | File Templates.
    }

    override fun showErrorToast() {
        System.out.println("P--not--implemented") ;//To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    internal lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnclick.setOnClickListener { presenter.onButtonClicked() }
    }


}
