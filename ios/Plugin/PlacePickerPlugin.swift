import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(PlacePickerPlugin)
public class PlacePickerPlugin: CAPPlugin {
    private let implementation = PlacePicker()

    @objc func pickPlace(_ call: CAPPluginCall) {
        implementation.start(call: call)
    }
}
