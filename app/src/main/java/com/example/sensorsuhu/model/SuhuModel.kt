package com.example.sensorsuhu.model

import com.google.gson.annotations.SerializedName

data class SuhuModel(
    @SerializedName("field1")
    var field_1 : String?,
    @SerializedName("created_at")
    var date_time : String?
)