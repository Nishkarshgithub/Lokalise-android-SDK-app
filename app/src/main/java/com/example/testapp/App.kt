package com.example.testapp
import android.app.Application
import com.lokalise.sdk.Lokalise

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Lokalise.init(appContext = this, sdkToken = "0f93e0a1741eae0db2656509bfac621e6c73ca1e", projectId = "47938759623c21161351f6.23905031")
        // Lokalise.setLocale("lv", "LV")
        // Add this only if you want to use pre-release bundles
        Lokalise.isPreRelease = true // Pre-Release // = false // Production
        Lokalise.updateTranslations()
    }
}