package com.example.kmpreactnative

import com.example.kmpreactnative.utils.CFlow
import com.example.kmpreactnative.utils.wrap
import kotlinx.coroutines.flow.flowOf

class Greeting {
    fun greeting(): CFlow<String> = flowOf("Hello, ${Platform().platform}!").wrap()
}
