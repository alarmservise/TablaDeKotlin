package com.alarmservise.tabladekotlin.dialoghelper

import android.app.AlertDialog
import com.alarmservise.tabladekotlin.MainActivity
import com.alarmservise.tabladekotlin.databinding.SignDialogBinding

class DialogHelper(private val act: MainActivity) {
    fun createSignDialog(){
        val builder = AlertDialog.Builder(act)
        val rootDialogElement = SignDialogBinding.inflate(act.layoutInflater)
        val view = rootDialogElement.root
        builder.setView(view)
        builder.show()
    }
}