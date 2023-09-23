package com.brainhack.mvvm_test.data.storage.sharedprefs

import android.content.Context
import com.brainhack.mvvm_test.data.storage.UserStorage
import com.brainhack.mvvm_test.data.storage.models.User

private const val SHARED_PREFERENCES = "shared_preferences"
private const val KEY_FIRSTNAME = "firstName"
private const val KEY_LASTNAME = "lastName"

class SharedPrefsUserStorage(context: Context) : UserStorage {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE)

    override fun save(user: User): Boolean {
        sharedPreferences.edit().putString(KEY_FIRSTNAME, user.firstName).apply()
        sharedPreferences.edit().putString(KEY_LASTNAME, user.lastName).apply()

        return !user.firstName.isEmpty()
    }

    override fun get(): User {
        val firstName = sharedPreferences.getString(KEY_FIRSTNAME, "firstName") ?: "firstName"
        val lastName = sharedPreferences.getString(KEY_LASTNAME, "lastName") ?: "lastName"

        return User(firstName = firstName, lastName = lastName)
    }
}