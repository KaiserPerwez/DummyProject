package com.kaiser.dummyproject.ui.screen1list

import android.databinding.ObservableField
import com.kaiser.dummyproject.data.model.api.UserModel

class ListUsersViewModel {
    var users = ObservableField<List<UserModel>>()

    fun loadData() {
        //load data after response
        //users=new set of data
        var mList = mutableListOf<UserModel>()
        for (i in 1..10)
            mList.add(UserModel(i, "First $i", "Last $i", "Avatar $i"))
        users.set(mList)


        /*userRepository.getUsers()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({
                    result -> response.setValue(Response(Status.SUCCESS, result.data, null))
                }, {
                    throwable -> response.setValue(Response(Status.ERROR, null, throwable))
                })*/
    }

}