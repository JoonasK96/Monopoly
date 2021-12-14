package com.example.projektitest

import java.util.ArrayList


class Player(val name: String, var money: Int) {
    companion object {
        private var lastPlayerId = 0
        private val players = ArrayList<Player>()
        fun createPlayersList(numPlayers: Int): ArrayList<Player> {
            for (i in 1..numPlayers) {
                players.add(Player("Player " + ++lastPlayerId, 0))
            }
            return players
        }

        fun updateMoney(playerN: Int, Money: Int): ArrayList<Player> {
            players[playerN].money = Money
            return players
        }

    }
}