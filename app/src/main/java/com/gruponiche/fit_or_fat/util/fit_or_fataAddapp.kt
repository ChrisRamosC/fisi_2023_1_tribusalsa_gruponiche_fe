package com.gruponiche.fit_or_fat.util

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.paypal.checkout.PayPalCheckout
import com.paypal.checkout.config.CheckoutConfig
import com.paypal.checkout.config.Environment
import com.paypal.checkout.config.SettingsConfig
import com.paypal.checkout.createorder.CurrencyCode
import com.paypal.checkout.createorder.UserAction

class fit_or_fataAddapp:Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
        val config = CheckoutConfig(
            application = this,
            clientId = "ASO58eu4v8cw81BWw3RW_G9t0BIBNU1mUL_3YMpu9kyVHzZKhivpiQM7etULzoByrt7kc4QhzA5m_olp",
            environment = Environment.SANDBOX,
            currencyCode = CurrencyCode.USD,
            userAction = UserAction.PAY_NOW,
            settingsConfig = SettingsConfig(
                loggingEnabled = true
            )
        )
        PayPalCheckout.setConfig(config)
    }
}