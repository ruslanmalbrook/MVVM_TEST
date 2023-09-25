package com.brainhack.mvvm_test.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brainhack.mvvm_test.domain.usecases.GetUserNameUseCase
import com.brainhack.mvvm_test.domain.usecases.SaveUserNameUseCase
import javax.inject.Inject

class MainFragmentViewModelFactory @Inject constructor(
    val getUserNameUseCase: GetUserNameUseCase,
    val saveUserNameUseCase: SaveUserNameUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return MainFragmentViewModel(
            getUserDataUseCase = getUserNameUseCase,
            setUserDataUseCase = saveUserNameUseCase
        ) as T
    }
}