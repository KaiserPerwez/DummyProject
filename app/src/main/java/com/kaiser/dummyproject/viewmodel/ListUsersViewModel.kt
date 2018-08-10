package com.kaiser.dummyproject.viewmodel

import android.databinding.ObservableField
import com.kaiser.dummyproject.data.model.api.UserModel

/**
 * @author Wellington Costa on 31/12/2017.
 */
class ListUsersViewModel {
    var users = ObservableField<List<UserModel>>()

    fun loadData() {
        //load data after response
        //users=new set of data
        var mList = mutableListOf<UserModel>()
        for (i in 1..10)
            mList.add(UserModel(i, "First $i", "Last $i", "Avatar $i"))
        users.set(mList)
    }

}