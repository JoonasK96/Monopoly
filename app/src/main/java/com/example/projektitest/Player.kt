package com.example.projektitest

class Player(val name: String, val isOnline: Boolean){
    companion object {
        private var lastPlayerId = 0
        fun createPlayersList(numPlayers: Int) : ArrayList<Player> {
            val players = ArrayList<Player>()
            for (i in 1..numPlayers) {
                players.add(Player("Person " + ++lastPlayerId, i <= numPlayers/ 2))
            }
            return players
        }

}
}