package com.brainhack.mvvm_test.presentation.ui.fragments

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.brainhack.mvvm_test.data.repositories.UserRepositoryImpl
import com.brainhack.mvvm_test.data.storage.sharedprefs.SharedPrefsUserStorage
import com.brainhack.mvvm_test.domain.models.SaveUserNameParam
import com.brainhack.mvvm_test.domain.usecases.GetUserNameUseCase
import com.brainhack.mvvm_test.domain.usecases.SaveUserNameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    private val getUserDataUseCase: GetUserNameUseCase,
    private val setUserDataUseCase: SaveUserNameUseCase
    ) : ViewModel() {

    private val resultLiveMutable = MutableLiveData<String>()
    val resultLive: LiveData<String> = resultLiveMutable

    init {
        Log.e("AAA", "VM created")
    }

    override fun onCleared() {
        Log.e("AAA", "VM cleared")

        super.onCleared()
    }

    fun save(text: String) {
        val saveUserNameParam = SaveUserNameParam(text)
        resultLiveMutable.value = setUserDataUseCase.execute(saveUserNameParam = saveUserNameParam).toString()
    }

    fun load() {
        val userNameModel = getUserDataUseCase.execute()
        resultLiveMutable.value = "${userNameModel.firstName} ${userNameModel.lastName}"
    }
}