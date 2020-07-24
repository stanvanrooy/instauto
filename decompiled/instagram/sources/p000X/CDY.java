package p000X;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.LatLng;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.maps.p053ui.IgStaticMapView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.CDY */
public final class CDY extends C27341Hl implements C27516CGg {
    public View A00;
    public TextView A01;
    public TextView A02;
    public CD3 A03;
    public CDA A04;
    public IgSwitch A05;
    public IgStaticMapView A06;
    public AnonymousClass0C1 A07;
    public final View.OnClickListener A08 = new CEH(this);
    public final C27510CGa A09 = new C27510CGa(this);
    public final C79583dh A0A = new CEO(this);

    public static void A02(CDY cdy) {
        LatLng latLng;
        CFS cfs = cdy.A03.A07;
        if (cfs.A00()) {
            Location lastLocation = C16230oG.A00.getLastLocation(cdy.A07);
            if (lastLocation == null) {
                latLng = new LatLng(0.0d, 0.0d);
            } else {
                latLng = new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude());
            }
            String string = cdy.getString(C0003R.string.promote_create_audience_location_local_current_location_name, Double.valueOf(latLng.A00), Double.valueOf(latLng.A01));
            double d = latLng.A00;
            double d2 = latLng.A01;
            CFS cfs2 = cdy.A03.A07;
            int i = cfs2.A00;
            C27473CEp cEp = new C27473CEp();
            cEp.A06 = null;
            cEp.A05 = string;
            cEp.A03 = null;
            cEp.A00 = d;
            cEp.A01 = d2;
            cEp.A02 = i;
            cEp.A04 = null;
            cEp.A08 = null;
            cEp.A07 = null;
            cfs2.A01 = cEp;
        } else {
            C27473CEp cEp2 = cfs.A02;
            if (cEp2 != null) {
                String str = cEp2.A06;
                String str2 = cEp2.A05;
                CFL cfl = cEp2.A03;
                double d3 = cEp2.A00;
                double d4 = cEp2.A01;
                String str3 = cEp2.A04;
                String str4 = cEp2.A08;
                String str5 = cEp2.A07;
                int i2 = cfs.A00;
                C27473CEp cEp3 = new C27473CEp();
                cEp3.A06 = str;
                cEp3.A05 = str2;
                cEp3.A03 = cfl;
                cEp3.A00 = d3;
                cEp3.A01 = d4;
                cEp3.A02 = i2;
                cEp3.A04 = str3;
                cEp3.A08 = str4;
                cEp3.A07 = str5;
                cfs.A02 = cEp3;
            }
        }
        CDA.A00(cdy.A04, Constants.A15);
    }

    public final String getModuleName() {
        return "promote_create_audience_locations_local";
    }

    public static LatLng A00(CDY cdy) {
        CFS cfs = cdy.A03.A07;
        if (cfs.A00()) {
            Location lastLocation = C16230oG.A00.getLastLocation(cdy.A07);
            if (lastLocation != null) {
                return new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude());
            }
        } else {
            C27473CEp cEp = cfs.A02;
            if (cEp != null) {
                return new LatLng(cEp.A00, cEp.A01);
            }
        }
        return new LatLng(0.0d, 0.0d);
    }

    public static void A01(CDY cdy) {
        TextView textView;
        Context context;
        int i;
        if (cdy.A03.A07.A00()) {
            cdy.A00.setVisibility(8);
            return;
        }
        cdy.A00.setVisibility(0);
        if (cdy.A03.A07.A02 == null) {
            cdy.A02.setVisibility(8);
            cdy.A01.setText(C0003R.string.promote_create_audience_location_custom_address_label);
            textView = cdy.A01;
            context = cdy.getContext();
            i = C0003R.color.igds_primary_text;
        } else {
            cdy.A02.setVisibility(0);
            cdy.A01.setText(cdy.A03.A07.A02.A05);
            textView = cdy.A01;
            context = cdy.getContext();
            i = C0003R.color.igds_secondary_text;
        }
        textView.setTextColor(C019000b.A00(context, i));
    }

    public static void A03(CDY cdy, LatLng latLng) {
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("promote_audience_creation_map");
        staticMapView$StaticMapOptions.A02(latLng.A00, latLng.A01);
        int A002 = C019000b.A00(cdy.getContext(), C0003R.color.map_circle_color);
        Context context = cdy.getContext();
        int i = cdy.A03.A07.A00;
        int i2 = i * 1000;
        if (CDX.A00(context) == Constants.ZERO) {
            i2 = Math.round(((float) i) * 1609.34f);
        }
        staticMapView$StaticMapOptions.A03(A002, latLng, i2);
        cdy.A06.setMapOptions(staticMapView$StaticMapOptions);
    }

    public final void BGX(CDA cda, Integer num) {
        if (num == Constants.A0j) {
            A02(this);
            A03(this, A00(this));
        }
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-530303958);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_create_audience_locations_local_view, viewGroup, false);
        AnonymousClass0Z0.A09(1332412964, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1002817415);
        this.A04.A0D(this);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1631690410, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (this.A03 != null && this.A04 != null && z) {
            A02(this);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        this.A03 = ((C945346y) activity).AT6();
        CDA AT7 = ((CC9) activity).AT7();
        this.A04 = AT7;
        AT7.A0C(this);
        this.A07 = this.A03.A0Q;
        this.A06 = (IgStaticMapView) view.findViewById(C0003R.C0005id.map_view);
        this.A05 = (IgSwitch) view.findViewById(C0003R.C0005id.switch_button);
        CFS cfs = this.A03.A07;
        boolean z = false;
        if (cfs.A03 != null) {
            z = true;
        }
        if (!z) {
            cfs.A03 = Boolean.valueOf(C16230oG.isLocationPermitted(getContext()));
        }
        this.A05.setChecked(this.A03.A07.A00());
        this.A05.setToggleListener(this.A0A);
        View findViewById = view.findViewById(C0003R.C0005id.custom_address_entry);
        this.A00 = findViewById;
        findViewById.setOnClickListener(this.A08);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.custom_address_title);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.custom_address);
        A01(this);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        int A072 = C06220Of.A07(context);
        this.A06.setLayoutParams(new LinearLayout.LayoutParams(A072, Math.round(((float) A072) / 1.5f)));
        A03(this, A00(this));
        Context context2 = view.getContext();
        C27497CFn cFn = new C27497CFn(view, "radius_slider");
        Context context3 = getContext();
        ArrayList arrayList = new ArrayList(CCH.A02.size());
        for (Integer intValue : CCH.A02) {
            int intValue2 = intValue.intValue();
            if (1 - CDX.A00(context3).intValue() != 0) {
                i = C0003R.string.promote_create_audience_location_radius_in_miles;
            } else {
                i = C0003R.string.promote_create_audience_location_radius_in_kilometers;
            }
            arrayList.add(context3.getString(i, new Object[]{Integer.valueOf(intValue2)}));
        }
        C27453CDv.A00(context2, cFn, Collections.unmodifiableList(arrayList), this.A03, this.A04);
        if (this.mUserVisibleHint) {
            A02(this);
        }
    }
}
