package com.example.projektitest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    private val players: MutableLiveData<List<Player>> by lazy {
        MutableLiveData<List<Player>>().also {
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<Player>> {
        return players
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}