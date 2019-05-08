package com.daggerdemokotlin.Ui.accessUser.View

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import com.daggerdemokotlin.R
import com.daggerdemokotlin.TestActivity
import com.daggerdemokotlin.Ui.CommonUtil
import com.daggerdemokotlin.Ui.base.view.BaseActivity
import com.daggerdemokotlin.Ui.accessUser.interactor.MainMVPInteractor
import com.daggerdemokotlin.Ui.accessUser.presenter.MainMVPPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() ,MainMVPView{
    @Inject
    internal lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>

    private var progressDialog: ProgressDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
        btnclick.setOnClickListener { presenter.onButtonClicked() }
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()

    }

    override fun showSuccessToast(tempurl :String) {
        System.out.println("P----implemented: ---"+tempurl) ;//To change body of created functions use File | Settings | File Templates.

        val intent = Intent(this, TestActivity::class.java)
        startActivity(intent)
        finish()
        System.out.println("P----implemented") ;//To change body of created functions use File | Settings | File Templates.
    }

    override fun showErrorToast() {
        System.out.println("P--not--implemented") ;//To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgress() {
        hideProgress()
        progressDialog = CommonUtil.showLoadingDialog(this)
    }

    override fun hideProgress() {
        if (progressDialog != null && progressDialog?.isShowing!!) {
            progressDialog?.cancel()
        }
    }


}
