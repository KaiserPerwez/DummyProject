package com.kaiser.dummyproject.data.model.api

import com.google.gson.annotations.SerializedName

/**
 * @author Wellington Costa on 30/12/2017.
 */
data class UserModel (
        @SerializedName("id") val id: Int,
        @SerializedName("first_name") val firstName: String,
        @SerializedName("last_name") val lastName: String,
        @SerializedName("avatar") val avatar: String?
)