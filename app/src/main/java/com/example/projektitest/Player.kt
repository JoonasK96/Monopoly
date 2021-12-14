package com.example.projektitest

class Player(val name: String, val money: Int){
    companion object {
        private var lastPlayerId = 0
        fun createPlayersList(numPlayers: Int) : ArrayList<Player> {
            val players = ArrayList<Player>()
            for (i in 1..numPlayers) {
                players.add(Player("Player " + ++lastPlayerId, 1000))
            }
            return players
        }
        fun updateMoney(numPlayers: Int) : ArrayList<Player>{
            val players = ArrayList<Player>()
            for (i in 1..numPlayers) {
                players.add(Player("Player" + ++lastPlayerId, 1000))
            }
            return players
        }

}
}