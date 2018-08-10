package com.kaiser.dummyproject.data.remote.retrofit

import com.kaiser.dummyproject.data.remote.retrofit.response.ApiListResponse
import com.kaiser.dummyproject.data.model.api.UserModel
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * @author Wellington Costa on 30/12/2017.
 */
interface Api {

    @GET("users")
    fun fetchUsers(): Observable<ApiListResponse<UserModel>>
}