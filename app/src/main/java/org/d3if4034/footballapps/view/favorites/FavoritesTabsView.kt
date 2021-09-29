package org.d3if4034.footballapps.view.favorites

import com.omrobbie.footballapps.model.EventsItem
import com.omrobbie.footballapps.model.TeamsItem
import org.d3if4034.footballapps.model.EventsItem
import org.d3if4034.footballapps.model.TeamsItem

interface FavoritesTabsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
    fun showTeamList(data: MutableList<TeamsItem>)
}
