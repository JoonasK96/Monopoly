package com.example.myapplication

import android.app.usage.UsageEvents
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projektitest.R

abstract class rvAdapter : RecyclerView.Adapter<rvAdapter.ViewHolder>() {

    private val players = arrayOf("Player 1",
        "Player 2", "Player 3", "Player 4")

    private val Money = arrayOf(1000,2000,3000,4000)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(itemLayout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return players.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val player = players.get(position)
        holder.updateEvent(rvAdapter)
    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var imageView : ImageView = itemView.findViewById(R.id.image_view)
        private var pname: TextView = itemView.findViewById(R.id.pNameTV)
        private var money: TextView = itemView.findViewById(R.id.moneyTV)

        fun updateEvent (event: rvAdapter) {
            pname.text = "testPname"
            money.text = "testMoney"

        }
    }
}
