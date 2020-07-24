package com.instagram.react.views.maps;

import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.LatLng;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.maps.p053ui.IgStaticMapView;
import p000X.C23043A0y;
import p000X.C23053A3d;

public class IgStaticMapViewManager extends SimpleViewManager {
    public static final String LATITUDE_KEY = "latitude";
    public static final String LONGITUDE_KEY = "longitude";
    public static final String RADIUS_IN_METERS_KEY = "radiusInMeters";
    public static final String REACT_CLASS = "IgStaticMap";

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "region")
    public void setRegion(IgStaticMapView igStaticMapView, C23043A0y a0y) {
        double d = a0y.getDouble(LATITUDE_KEY);
        double d2 = a0y.getDouble(LONGITUDE_KEY);
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("react_native_map");
        if (a0y.hasKey(RADIUS_IN_METERS_KEY)) {
            staticMapView$StaticMapOptions.A03(1, new LatLng(d, d2), a0y.getInt(RADIUS_IN_METERS_KEY));
        } else {
            staticMapView$StaticMapOptions.A02(d, d2);
        }
        igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
    }

    public IgStaticMapView createViewInstance(C23053A3d a3d) {
        return new IgStaticMapView(a3d);
    }
}
