package com.placepicker

import com.getcapacitor.PluginCall

class PlacePickerState {
  companion object {
    var options: PlacePickerOptions? = PlacePickerOptions()
    var result = PlacePickerResult()
    var call: PluginCall? = null
  }
}
