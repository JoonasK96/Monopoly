package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projektitest.R

abstract class rvAdapter : RecyclerView.Adapter<rvAdapter.ViewHolder>() {

    private val player = arrayOf("Player 1",
        "Player 2", "Player 3", "Player 4")

    private val Money = arrayOf(1000,2000,3000,4000)


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var player: TextView
        var money: TextView

        init {
            player = itemView.findViewById(R.id.pNameTV)
            money = itemView.findViewById(R.id.moneyTV)

        }
    }
}
