package com.hiltexample.hilt_example_constructor_injection

class ApplicationService(val netWorkService: NetWorkService) {
    fun startService() :String{
        return "We are Starting the Server and ${netWorkService.fetchingData()}"
    }
}