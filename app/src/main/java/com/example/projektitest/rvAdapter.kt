package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projektitest.Player
import com.example.projektitest.R
import com.example.projektitest.ScoreViewModel

class rvAdapter(private val mPlayers : List<Player>) : RecyclerView.Adapter<rvAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.image_view)
        val pnametv: TextView = itemView.findViewById(R.id.pNameTV)
        val moneytv: TextView = itemView.findViewById(R.id.moneyTV)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val rvItemView = inflater.inflate(R.layout.rv_item, parent, false)
        return ViewHolder(rvItemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val player = mPlayers.get(position)
        val playertv = holder.pnametv
        playertv.setText(player.name)
    }

    override fun getItemCount(): Int {
        return mPlayers.size
    }




}
