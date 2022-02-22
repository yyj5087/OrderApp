package com.nepplus.orderapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.nepplus.orderapp.R
import com.nepplus.orderapp.datas.StoreData
import java.util.zip.Inflater

class StoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView // 머가 들어있냐요?
        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item,null)
        }
        val row = tempRow!!
        val data = mList[position]
        val imgLogo = row.findViewById<ImageView>(R.id.image)
        val txtView = row.findViewById<TextView>(R.id.txtView)
        val ratingBar = row.findViewById<TextView>(R.id.ratingBar)
        txtView.text = data.name
        return row

    }
}