package com.azuka.mainactivity.repository

import androidx.lifecycle.LiveData
import com.azuka.mainactivity.data.User
import com.azuka.mainactivity.data.UserDAO

class UserRepository(private val userDao: UserDAO) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

}