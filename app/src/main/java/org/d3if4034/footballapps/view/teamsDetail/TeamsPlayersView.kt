package org.d3if4034.footballapps.view.teamsDetail

import com.omrobbie.footballapps.model.PlayersItem

interface TeamsPlayersView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showPlayerList(data: MutableList<PlayersItem>)
}
