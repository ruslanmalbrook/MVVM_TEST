package com.brainhack.mvvm_test.domain.repositories

import com.brainhack.mvvm_test.domain.models.SaveUserNameParam
import com.brainhack.mvvm_test.domain.models.UserNameModel

interface UserRepository {
    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserNameModel
}