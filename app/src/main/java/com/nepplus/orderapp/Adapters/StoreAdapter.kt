package com.nepplus.orderapp.Adapters

import android.content.Context
import android.widget.ArrayAdapter
import androidx.fragment.app.FragmentManager
import com.nepplus.orderapp.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext,resId,mList) {
}