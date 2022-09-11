package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listdata = arrayListOf(
            ListAlpabeth("A", "Ayam","https://www.google.com/search?q=Ayam", "Angsa","https://www.google.com/search?q=Angsa", "Anggun", "https://www.google.com/search?q=Anggun"),
            ListAlpabeth("B", "Bebek","https://www.google.com/search?q=Bebek", "Banyak","https://www.google.com/search?q=Banyak", "Anggun", "https://www.google.com/search?q=Beruang" ),
            ListAlpabeth("C", "Cicak","https://www.google.com/search?q=Cicak", "Cimol","https://www.google.com/search?q=Cimol", "Codot", "https://www.google.com/search?q=Codot" ),
            ListAlpabeth("D", "Dagu","https://www.google.com/search?q=Dagu", "Dada","https://www.google.com/search?q=Dada", "Daki", "https://www.google.com/search?q=Daki" ),
            ListAlpabeth("E", "Ear","https://www.google.com/search?q=Ear", "East","https://www.google.com/search?q=East", "Elang", "https://www.google.com/search?q=Elang" ),
            ListAlpabeth("F", "Flanel","https://www.google.com/search?q=Flanel", "Farfum","https://www.google.com/search?q=Farfum", "Fasta", "https://www.google.com/search?q=Fasta" ),
            ListAlpabeth("G", "Gagak","https://www.google.com/search?q=Gagak", "Garuda","https://www.google.com/search?q=Garuda", "Gandul", "https://www.google.com/search?q=Gandul" ),
            ListAlpabeth("H", "Harimau","https://www.google.com/search?q=Harimau", "Hantu","https://www.google.com/search?q=Hantu", "Hahaha", "https://www.google.com/search?q=Hahaha" ),
            ListAlpabeth("I", "Induk","https://www.google.com/search?q=Induk", "Istri","https://www.google.com/search?q=Istri", "Ibu", "https://www.google.com/search?q=Ibu" ),
            ListAlpabeth("J", "Jagung","https://www.google.com/search?q=Jagung", "Jatah","https://www.google.com/search?q=Jatah", "Jajan", "https://www.google.com/search?q=Jajan" ),
        )

        var adapterStudent = FragmentAdapter(listdata)
        var lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.layoutManager = lm
        recyclerview.adapter = adapterStudent

        adapterStudent.onClick = {
            var pindah = Intent(this, detail::class.java)
            pindah.putExtra("detailalhabeth", it)
            startActivity(pindah)
        }
    }
}