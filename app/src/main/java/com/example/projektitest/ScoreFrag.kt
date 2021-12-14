package com.example.projektitest

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.rvAdapter

class ScoreFrag : Fragment() {

    lateinit var players: ArrayList<Player>
    private lateinit var viewModel: ScoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.score_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        players = Player.createPlayersList(4);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var rv = requireView().findViewById<View>(R.id.recyclerView) as RecyclerView
        val adapter = rvAdapter(players)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(activity)

        viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
    }


}