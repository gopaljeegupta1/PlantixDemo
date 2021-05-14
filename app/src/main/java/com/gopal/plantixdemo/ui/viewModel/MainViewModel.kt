package com.gopal.plantixdemo.ui.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.gopal.plantixdemo.util.DataResponse
import com.gopal.plantixdemo.util.SampleDataProvider

class MainViewModel(app: Application) : AndroidViewModel(app) {

    //Show static data
    val dataList = MutableLiveData<List<DataResponse>>()

    init {
        dataList.value = SampleDataProvider.getJsonData(app)
    }


}