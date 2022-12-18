package com.example.openapigeneratorsample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.api.DefaultApi
import com.example.model.Ping200Response
import com.example.openapigeneratorsample.ui.theme.OpenApiGeneratorSampleTheme
import kotlinx.coroutines.launch
import org.openapitools.client.infrastructure.ApiClient
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    lifecycleScope.launch {
      ApiClient().createService(DefaultApi::class.java)
        .ping().enqueue(object: Callback<Ping200Response> {
          override fun onResponse(
            call: retrofit2.Call<Ping200Response>,
            response: Response<Ping200Response>
          ) {
            Log.d("Bonny", "${response.body().toString()}")
          }

          override fun onFailure(call: retrofit2.Call<Ping200Response>, t: Throwable) {
            Log.d("Bonny", "fail ${t.message}")
          }
        })
    }

    setContent {
      OpenApiGeneratorSampleTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          Greeting("Android")
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  OpenApiGeneratorSampleTheme {
    Greeting("Android")
  }
}