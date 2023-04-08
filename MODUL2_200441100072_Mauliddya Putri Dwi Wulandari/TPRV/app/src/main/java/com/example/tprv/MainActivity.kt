package com.example.tprv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<tprv>()
        data.add(tprv(R.drawable.ini, "Asmaul", "haloo"))
        data.add(tprv(R.drawable.ini, "Qusna", "apa kabar"))
        data.add(tprv(R.drawable.ini, "Anggi", "posisi"))
        data.add(tprv(R.drawable.ini, "Nia", "sido a"))
        data.add(tprv(R.drawable.ini, "Septi", "sholat"))
        data.add(tprv(R.drawable.ini, "Eka", "wes iso a"))
        data.add(tprv(R.drawable.ini, "Niken", "nandi"))
        data.add(tprv(R.drawable.ini, "Eva", "hihi"))
        data.add(tprv(R.drawable.ini, "Asmaul", "haloo"))
        data.add(tprv(R.drawable.ini, "Qusna", "apa kabar"))
        data.add(tprv(R.drawable.ini, "Anggi", "posisi"))
        data.add(tprv(R.drawable.ini, "Nia", "sido a"))
        data.add(tprv(R.drawable.ini, "Septi", "sholat"))
        data.add(tprv(R.drawable.ini, "Eka", "wes iso a"))
        data.add(tprv(R.drawable.ini, "Niken", "nandi"))
        data.add(tprv(R.drawable.ini, "Eva", "hihi"))

        adapter=MyAdapter(data)
    }
}