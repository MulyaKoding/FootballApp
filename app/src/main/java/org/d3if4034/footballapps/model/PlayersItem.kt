package org.d3if4034.footballapps.model


import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlayersItem(
    val strCutout: String?,
    val strPlayer: String?,
    val strPosition: String?,
    val strWeight: String?,
    val strHeight: String?,
    val strDescriptionEN: String?,
    val strFanart1: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(strCutout)
        parcel.writeString(strPlayer)
        parcel.writeString(strPosition)
        parcel.writeString(strWeight)
        parcel.writeString(strHeight)
        parcel.writeString(strDescriptionEN)
        parcel.writeString(strFanart1)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlayersItem> {
        override fun createFromParcel(parcel: Parcel): PlayersItem {
            return PlayersItem(parcel)
        }

        override fun newArray(size: Int): Array<PlayersItem?> {
            return arrayOfNulls(size)
        }
    }
}
