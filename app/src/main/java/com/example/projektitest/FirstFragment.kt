package com.example.projektitest

import android.app.usage.UsageEvents
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.myapplication.rvAdapter
import com.example.projektitest.databinding.ActivityMainBinding
import org.intellij.lang.annotations.Language


private val ViewBinding?.recyclerView: Any
    get() {return Any()}

class FirstFragment: Fragment() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding

    private lateinit var rvAdapter: rvAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)

        recyclerView.hasFixedSize()
        recyclerView.layoutManager=
    }



}
