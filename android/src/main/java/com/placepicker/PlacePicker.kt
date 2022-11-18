package com.placepicker;

import com.getcapacitor.PluginCall;
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.serialization.*
import kotlinx.serialization.json.*

const val E_FAILED_TO_SHOW_PICKER = "E_FAILED_TO_SHOW_PICKER"

class PlacePicker(actv: AppCompatActivity) {
    private val ctx: Context
    private val activity: AppCompatActivity
    init {
        ctx = actv.applicationContext
        activity = actv
    }
    fun start(c: PluginCall) {
        PlacePickerState.call = c
        try {
            val pickerIntent = Intent(ctx, PlacePickerActivity::class.java)
            activity.startActivity(pickerIntent)
        } catch (t: Throwable) {
            PlacePickerState.call?.reject(E_FAILED_TO_SHOW_PICKER, t.message)
            PlacePickerState.call = null
        }

    }
}
