package com.hiltexample.hilt_example_constructor_injection

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class NetWorkViewModel @Inject constructor(val netWorkService: NetWorkService,val applicationService: ApplicationService): ViewModel() {

    fun getNetworkServiceData(): String {
        return netWorkService.fetchingData()
    }

    fun getApplicationService(): String {
        return applicationService.startService()
    }
}