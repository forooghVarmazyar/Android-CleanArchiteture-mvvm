package com.example.android_sample.core.platform

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_sample.core.exception.Failure

abstract class BaseViewModel :ViewModel(){
    var failure: MutableLiveData<Failure> = MutableLiveData()

    protected fun handleFailure(failure: Failure){
        this.failure.postValue(failure)
    }
}