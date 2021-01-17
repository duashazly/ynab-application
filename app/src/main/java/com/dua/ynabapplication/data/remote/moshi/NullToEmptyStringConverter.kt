package com.dua.ynabapplication.data.remote.moshi

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonReader

object NullToEmptyStringConverter {
    @FromJson
    fun fromJson(reader: JsonReader): String {
        if (reader.peek() != JsonReader.Token.NULL) {
            return reader.nextString()
        }
        reader.nextNull<Unit>()
        return ""
    }
}
