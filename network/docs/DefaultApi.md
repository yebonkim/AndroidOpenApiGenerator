# DefaultApi

All URIs are relative to *https://simple-todo.simple-todo.workers.dev/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ping**](DefaultApi.md#ping) | **GET** ping | 





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import com.example.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DefaultApi::class.java)

val result : Ping200Response = webService.ping()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Ping200Response**](Ping200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

