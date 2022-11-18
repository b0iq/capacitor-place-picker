package com.placepicker
import kotlinx.serialization.*
const val PICK_OPTIONS = "com.placepicker.PICKER_OPTIONS"

@Serializable
enum class PlacePickerPresentation(val type: String) {
  modal("modal"),
  fullscreen("fullscreen")
}

@Serializable
data class PlacePickerCoordinate (
  var latitude: Double = 25.2048,
  var longitude: Double = 55.2708
)
@Serializable
data class PlacePickerAddress(
  var name: String? = null,
  var streetName: String? = null,
  var city: String? = null,
  var state: String? = null,
  var zipCode: String? = null,
  var country: String? = null,
)
@Serializable
data class PlacePickerOptions(
  val presentationStyle: PlacePickerPresentation? = PlacePickerPresentation.modal,
  val title: String = "Choose Place",
  val searchPlaceholder: String = "Search...",
  val color: String = "#FF0000",
  val contrastColor: String = "#FFFFFF",
  val locale: String = "en-US",
  val initialCoordinates: PlacePickerCoordinate = PlacePickerCoordinate(),
  val enableGeocoding: Boolean = true,
  val enableSearch: Boolean = true,
  val enableUserLocation: Boolean = true,
  val enableLargeTitle: Boolean = true,
  val rejectOnCancel: Boolean = true
)

@Serializable
data class PlacePickerResult (
  var coordinate: PlacePickerCoordinate? = null,
  var address: PlacePickerAddress? = null,
  var didCancel: Boolean = false,
)
