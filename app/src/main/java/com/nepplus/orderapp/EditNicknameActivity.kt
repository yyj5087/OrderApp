package com.nepplus.orderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setupValues()
    }

    fun setupEvents(){

        btnSave.setOnClickListener {
            val inputNickname = edtName.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick",inputNickname)
            setResult(RESULT_OK,resultIntent)
            finish()
        }
    }
    fun setupValues(){

    }
}