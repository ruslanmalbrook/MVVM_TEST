package com.brainhack.mvvm_test.data.storage

import com.brainhack.mvvm_test.data.storage.models.User

interface UserStorage {
    fun save(user: User): Boolean

    fun get(): User
}