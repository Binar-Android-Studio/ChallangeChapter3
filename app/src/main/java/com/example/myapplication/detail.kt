package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var getdatadetail = intent.getSerializableExtra("detailalhabeth") as ListAlpabeth

        val listdata = arrayListOf(
            LinkAlpabeth( getdatadetail.data1, getdatadetail.link1),
            LinkAlpabeth( getdatadetail.data2, getdatadetail.link2),
            LinkAlpabeth( getdatadetail.data3, getdatadetail.link3),
        )

        var adapterStudent = FragmentDetail(listdata)
        var lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.layoutManager = lm
        recyclerview.adapter = adapterStudent

        adapterStudent.onClick = {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse(it.link)
            startActivity(openURL)
        }
    }
}