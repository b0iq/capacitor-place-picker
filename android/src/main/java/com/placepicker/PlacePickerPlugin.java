package com.placepicker;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PlacePicker")
public class PlacePickerPlugin extends Plugin {

    private PlacePicker implementation = null;

    @PluginMethod
    public void pickPlace(PluginCall call) {
        if (implementation == null) {
            implementation = new PlacePicker(this.getActivity());
        }

        implementation.start(call);
    }
}
