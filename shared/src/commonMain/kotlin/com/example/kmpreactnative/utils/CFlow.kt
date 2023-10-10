package com.example.kmpreactnative.utils

import kotlinx.coroutines.flow.Flow

expect class CFlow<T : Any> : Flow<T>

expect fun <T : Any> Flow<T>.wrap(): CFlow<T>
