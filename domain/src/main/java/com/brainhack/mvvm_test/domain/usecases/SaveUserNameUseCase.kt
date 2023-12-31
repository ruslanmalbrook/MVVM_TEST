package com.brainhack.mvvm_test.domain.usecases

import com.brainhack.mvvm_test.domain.models.SaveUserNameParam
import com.brainhack.mvvm_test.domain.repositories.UserRepository

class SaveUserNameUseCase (private val userRepository: UserRepository) {

    fun execute(saveUserNameParam: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        return if (oldUserName.firstName != saveUserNameParam.name)
            userRepository.saveName(saveUserNameParam)
        else false
    }
}