package com.daggerdemokotlin.Ui

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import com.daggerdemokotlin.R
import android.graphics.drawable.ColorDrawable
/**
 * Created by jyotidubey on 11/01/18.
 */
object CommonUtil {

    fun showLoadingDialog(context: Context?): ProgressDialog {
        val progressDialog = ProgressDialog(context)
        progressDialog.let {
            it.show()
          //  it.window?.setBackgroundDrawableResource(Color.TRANSPARENT.toDrawable())
            it.setContentView(R.layout.progress_dialog)
            it.isIndeterminate = true
            it.setCancelable(false)
            it.setCanceledOnTouchOutside(false)
            return it
        }
    }

}