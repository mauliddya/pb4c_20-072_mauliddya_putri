package com.example.bismillah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var bolaAdapter : BolaAdapter? = null
    private var bolaList = mutableListOf<Bola>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bolaList = ArrayList()

        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        bolaAdapter = BolaAdapter(this@MainActivity, bolaList)
        val layoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = bolaAdapter


        siapkanData()


    }

    private fun siapkanData() {

        bolaList.addAll(
            listOf(
                Bola("Bali United", R.drawable.bali),
                Bola("Perib Bandung", R.drawable.bandung),
                Bola("Persebaya Surabaya", R.drawable.surabaya),
                Bola("Persija Jakarta", R.drawable.jakarta),
                Bola("PSM Makasar", R.drawable.makasar),
                Bola("Arema", R.drawable.malang),
                Bola("Persita", R.drawable.persita),
                Bola("Rans Nusantara", R.drawable.rans),
                Bola("PSS Sleman", R.drawable.sleman),
                Bola("PSIS Semarang", R.drawable.semarang),
                Bola("Persis Solo", R.drawable.solo),
            )
        )


        bolaAdapter!!.notifyDataSetChanged()
    }
}