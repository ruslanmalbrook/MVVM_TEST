package com.brainhack.mvvm_test.domain.usecases

import com.brainhack.mvvm_test.domain.models.UserNameModel
import com.brainhack.mvvm_test.domain.repositories.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {
    fun execute(): UserNameModel {
        return userRepository.getName()
    }
}