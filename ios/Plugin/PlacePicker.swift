import Foundation
import Capacitor

@objc public class PlacePicker: NSObject {
    func start(call: CAPPluginCall) {
        DispatchQueue.main.async {
            do {
                let opts: PlacePickerOptions = try call.dictionaryRepresentation.asClass()
                let keyWindow = UIApplication.shared.windows.filter {$0.isKeyWindow}.first
                if var topController = keyWindow?.rootViewController {
                    while let presentedViewController = topController.presentedViewController {
                        topController = presentedViewController
                    }
                    let placePickerViewController = UINavigationController(rootViewController: PlacePickerViewController(call, opts))
                    if opts.presentationStyle == .fullscreen {
                        placePickerViewController.modalPresentationStyle = .fullScreen
                    }
                    topController.present(placePickerViewController, animated: true)
                }
            } catch {
                call.reject("parsing", "Cannot parse options", NSError(domain: "pickPlaceWithOptions", code: 10))
                return
            }
        }
    }
}
