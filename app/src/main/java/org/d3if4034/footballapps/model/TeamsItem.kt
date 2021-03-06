package org.d3if4034.footballapps.model


import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TeamsItem(
    val id: Long?,
    val idTeam: String?,
    val strTeamBadge: String?,
    val strTeam: String?,
    val intFormedYear: String?,
    val strStadium: String?,
    val strDescriptionEN: String?) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readValue(Long::class.java.classLoader) as? Long,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    companion object {
        const val TABLE_TEAMS = "TABLE_TEAMS"
        const val ID = "ID"
        const val ID_TEAM = "ID_TEAM"
        const val TEAM_BADGE = "TEAM_BADGE"
        const val TEAM = "TEAM"
        const val FORMED_YEAR = "FORMED_YEAR"
        const val STADIUM = "STADIUM"
        const val DESCRIPTION = "DESCRIPTION"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(idTeam)
        parcel.writeString(strTeamBadge)
        parcel.writeString(strTeam)
        parcel.writeString(intFormedYear)
        parcel.writeString(strStadium)
        parcel.writeString(strDescriptionEN)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TeamsItem> {
        override fun createFromParcel(parcel: Parcel): TeamsItem {
            return TeamsItem(parcel)
        }

        override fun newArray(size: Int): Array<TeamsItem?> {
            return arrayOfNulls(size)
        }
    }
}
