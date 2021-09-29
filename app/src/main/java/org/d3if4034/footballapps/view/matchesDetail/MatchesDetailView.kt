package org.d3if4034.footballapps.view.matchesDetail

import com.omrobbie.footballapps.model.TeamsItem

interface MatchesDetailView {

    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(dataHomeTeam: MutableList<TeamsItem>, dataAwayTeam: MutableList<TeamsItem>)
}
