package org.d3if4034.footballapps.model


import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EventsItem(
    val id: Long?,
    val idEvent: String?,
    val dateEvent: String?,
    val strTime: String?,

    // home team
    val idHomeTeam: String?,
    val strHomeTeam: String?,
    val intHomeScore: String?,
    val strHomeFormation: String?,
    val strHomeGoalDetails: String?,
    val intHomeShots: String?,
    val strHomeLineupGoalkeeper: String?,
    val strHomeLineupDefense: String?,
    val strHomeLineupMidfield: String?,
    val strHomeLineupForward: String?,
    val strHomeLineupSubstitutes: String?,

    // away team
    val idAwayTeam: String?,
    val strAwayTeam: String?,
    val intAwayScore: String?,
    val strAwayFormation: String?,
    val strAwayGoalDetails: String?,
    val intAwayShots: String?,
    val strAwayLineupGoalkeeper: String?,
    val strAwayLineupDefense: String?,
    val strAwayLineupMidfield: String?,
    val strAwayLineupForward: String?,
    val strAwayLineupSubstitutes: String?) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readValue(Long::class.java.classLoader) as? Long,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    companion object {
        const val TABLE_EVENTS = "TABLE_EVENTS"
        const val ID = "ID"
        const val ID_EVENT = "ID_EVENT"
        const val DATE = "DATE"
        const val TIME = "TIME"

        // home team
        const val HOME_ID = "HOME_ID"
        const val HOME_TEAM = "HOME_TEAM"
        const val HOME_SCORE = "HOME_SCORE"
        const val HOME_FORMATION = "HOME_FORMATION"
        const val HOME_GOAL_DETAILS = "HOME_GOAL_DETAILS"
        const val HOME_SHOTS = "HOME_SHOTS"
        const val HOME_LINEUP_GOALKEEPER = "HOME_LINEUP_GOALKEEPER"
        const val HOME_LINEUP_DEFENSE = "HOME_LINEUP_DEFENSE"
        const val HOME_LINEUP_MIDFIELD = "HOME_LINEUP_MIDFIELD"
        const val HOME_LINEUP_FORWARD = "HOME_LINEUP_FORWARD"
        const val HOME_LINEUP_SUBSTITUTES = "HOME_LINEUP_SUBSTITUTES"

        // away team
        const val AWAY_ID = "AWAY_ID"
        const val AWAY_TEAM = "AWAY_TEAM"
        const val AWAY_SCORE = "AWAY_SCORE"
        const val AWAY_FORMATION = "AWAY_FORMATION"
        const val AWAY_GOAL_DETAILS = "AWAY_GOAL_DETAILS"
        const val AWAY_SHOTS = "AWAY_SHOTS"
        const val AWAY_LINEUP_GOALKEEPER = "AWAY_LINEUP_GOALKEEPER"
        const val AWAY_LINEUP_DEFENSE = "AWAY_LINEUP_DEFENSE"
        const val AWAY_LINEUP_MIDFIELD = "AWAY_LINEUP_MIDFIELD"
        const val AWAY_LINEUP_FORWARD = "AWAY_LINEUP_FORWARD"
        const val AWAY_LINEUP_SUBSTITUTES = "AWAY_LINEUP_SUBSTITUTES"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(idEvent)
        parcel.writeString(dateEvent)
        parcel.writeString(strTime)
        parcel.writeString(idHomeTeam)
        parcel.writeString(strHomeTeam)
        parcel.writeString(intHomeScore)
        parcel.writeString(strHomeFormation)
        parcel.writeString(strHomeGoalDetails)
        parcel.writeString(intHomeShots)
        parcel.writeString(strHomeLineupGoalkeeper)
        parcel.writeString(strHomeLineupDefense)
        parcel.writeString(strHomeLineupMidfield)
        parcel.writeString(strHomeLineupForward)
        parcel.writeString(strHomeLineupSubstitutes)
        parcel.writeString(idAwayTeam)
        parcel.writeString(strAwayTeam)
        parcel.writeString(intAwayScore)
        parcel.writeString(strAwayFormation)
        parcel.writeString(strAwayGoalDetails)
        parcel.writeString(intAwayShots)
        parcel.writeString(strAwayLineupGoalkeeper)
        parcel.writeString(strAwayLineupDefense)
        parcel.writeString(strAwayLineupMidfield)
        parcel.writeString(strAwayLineupForward)
        parcel.writeString(strAwayLineupSubstitutes)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EventsItem> {
        override fun createFromParcel(parcel: Parcel): EventsItem {
            return EventsItem(parcel)
        }

        override fun newArray(size: Int): Array<EventsItem?> {
            return arrayOfNulls(size)
        }
    }
}
