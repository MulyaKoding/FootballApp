package org.d3if4034.footballapps.model

import com.google.gson.annotations.SerializedName

data class EventSearchResponse(

    @field:SerializedName("event")
    val events: MutableList<EventsItem>
)
