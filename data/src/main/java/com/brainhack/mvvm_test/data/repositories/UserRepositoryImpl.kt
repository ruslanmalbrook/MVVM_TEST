package com.brainhack.mvvm_test.data.repositories

import com.brainhack.mvvm_test.data.storage.models.User
import com.brainhack.mvvm_test.data.storage.UserStorage
import com.brainhack.mvvm_test.domain.models.SaveUserNameParam
import com.brainhack.mvvm_test.domain.models.UserNameModel
import com.brainhack.mvvm_test.domain.repositories.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveUserNameParam: SaveUserNameParam): Boolean {

        val user = mapToStorage(saveUserNameParam)

        return userStorage.save(user)
    }

    override fun getName(): UserNameModel {

        val user = userStorage.get()

        return mapToDomain(user)
    }

    private fun mapToDomain(user: User): UserNameModel  {
        return UserNameModel(firstName = user.firstName, lastName = user.lastName)
    }

    private fun mapToStorage(saveUserNameParam: SaveUserNameParam): User {
        return User(firstName = saveUserNameParam.name, lastName = "")
    }
}