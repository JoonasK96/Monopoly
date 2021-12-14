package com.example.projektitest

class Player(val name: String, var money: Int) {
    companion object {
        private var lastPlayerId = 0
        fun createPlayersList(numPlayers: Int): ArrayList<Player> {
            val players = ArrayList<Player>()
            for (i in 1..numPlayers) {
                players.add(Player("Player " + ++lastPlayerId, 0))
            }
            return players
        }

        fun updateMoney(players:ArrayList<Player>, playerN: Int, Money: Int): ArrayList<Player> {
            players[playerN].money = Money
            return players
        }

    }
}