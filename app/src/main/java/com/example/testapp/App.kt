package com.example.testapp
import android.app.Application
import com.lokalise.sdk.Lokalise

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Lokalise.init(appContext = this, sdkToken = "YOUR SDK TOKEN", projectId = "YOUR PROJECT ID")
        // Lokalise.setLocale("lv", "LV")
        // Add this only if you want to use pre-release bundles
        Lokalise.isPreRelease = true // Pre-Release // = false // Production
        Lokalise.updateTranslations()
    }
}
