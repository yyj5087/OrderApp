package com.nepplus.orderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.nepplus.orderapp.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setupValues()
    }
    fun setupEvents(){

    }
    fun setupValues(){
        Glide.with(this).load(mStoreData.logoImageURL).into(imgLogo)

        txtStore.text = mStoreData.name
        txtphone.text = mStoreData.phone
        ratingBar.rating = mStoreData.rating.toFloat()
        txtRating.text = "${mStoreData.rating}"
    }
}