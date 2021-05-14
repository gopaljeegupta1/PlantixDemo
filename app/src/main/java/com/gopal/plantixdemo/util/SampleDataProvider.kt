package com.gopal.plantixdemo.util

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class SampleDataProvider {

    companion object {

        fun getJsonData(context: Context): List<DataResponse> {
            val jsonFileString = getJsonDataFromAssets(context, "response.json")
            if (jsonFileString != null) {
                Log.i("data", jsonFileString)
            }

            val gson = Gson()
            val listPersonType = object : TypeToken<List<DataResponse>>() {}.type

            return gson.fromJson(jsonFileString, listPersonType)
        }

        private fun getJsonDataFromAssets(context: Context, fileName: String): String? {
            val jsonString: String
            try {
                jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
            } catch (ioException: IOException) {
                ioException.printStackTrace()
                return null
            }
            return jsonString
        }

    }


}