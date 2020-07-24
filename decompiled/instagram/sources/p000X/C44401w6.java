package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0003R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.maps.p053ui.IgStaticMapView;
import com.instagram.model.mediatype.MediaType;
import java.util.ArrayList;

/* renamed from: X.1w6  reason: invalid class name and case insensitive filesystem */
public final class C44401w6 extends BaseAdapter {
    public int A00;
    public Context A01;
    public AnonymousClass1LO A02;
    public C44411w7 A03;
    public C44431w9 A04;
    public C44421w8 A05;
    public AnonymousClass1NJ A06;
    public C32221an A07;
    public C36841ih A08;
    public AnonymousClass1RJ A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass1U5 A0D;
    public final C27371Ho A0E;

    public final int getViewTypeCount() {
        return 3;
    }

    public final void A00(C36841ih r13, int i, AnonymousClass1RJ r15, C32221an r16, AnonymousClass1U5 r17, AnonymousClass0C1 r18) {
        this.A08 = r13;
        this.A00 = i;
        Context context = this.A01;
        boolean z = this.A0C;
        AnonymousClass1U5 r3 = r17;
        AnonymousClass0C1 r2 = r18;
        this.A03 = new C44411w7(context, r2, r3, (C162096vs) null, z);
        this.A05 = new C44421w8(context, r3, (C162096vs) null, r2, z);
        this.A04 = new C44431w9(context, r3);
        this.A09 = r15;
        this.A07 = r16;
    }

    public final int getCount() {
        return this.A06.A07();
    }

    public final Object getItem(int i) {
        return this.A06.A0P(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = i;
        View view2 = view;
        if (view == null) {
            int itemViewType = getItemViewType(i2);
            ViewGroup viewGroup2 = viewGroup;
            if (itemViewType == 1) {
                view2 = this.A03.A01(this.A01, viewGroup2);
            } else if (itemViewType != 2) {
                if (itemViewType == 3) {
                    view2 = LayoutInflater.from(this.A01).inflate(C0003R.layout.row_feed_carousel_map, viewGroup2, false);
                    view2.setTag(new AnonymousClass2Z9((MediaFrameLayout) view2.findViewById(C0003R.C0005id.carousel_map_media_group), (IgStaticMapView) view2.findViewById(C0003R.C0005id.carousel_map_view), new C32261ar((ViewGroup) view2)));
                }
                throw new UnsupportedOperationException("Unhandled carousel view type");
            } else {
                view2 = this.A05.A01(this.A01, viewGroup2);
            }
        }
        int itemViewType2 = getItemViewType(i2);
        if (itemViewType2 == 1) {
            C44411w7 r8 = this.A03;
            AnonymousClass1NJ r7 = this.A06;
            r8.A02(view2, r7, this.A08, this.A00, i2, false, r7.A12(), this.A06.A13(), this.A0E, this.A02);
        } else if (itemViewType2 != 2) {
            if (itemViewType2 == 3) {
                C44431w9 r14 = this.A04;
                AnonymousClass1NJ r11 = this.A06;
                C36841ih r13 = this.A08;
                int i3 = this.A00;
                AnonymousClass2Z9 r10 = (AnonymousClass2Z9) view2.getTag();
                AnonymousClass1NJ A0P = r11.A0P(i2);
                r10.A00.setEnabled(true);
                AnonymousClass40Q r3 = A0P.A0H;
                ArrayList arrayList = new ArrayList();
                StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = C44431w9.A02;
                staticMapView$StaticMapOptions.A00();
                staticMapView$StaticMapOptions.A01(r3.A00, r3.A01);
                for (AnonymousClass40Q r32 : A0P.A2N) {
                    arrayList.add(new LatLng(r32.A00, r32.A01));
                }
                staticMapView$StaticMapOptions.A04(arrayList);
                staticMapView$StaticMapOptions.A09 = String.valueOf(A0P.A03);
                r10.A00.setMapOptions(staticMapView$StaticMapOptions);
                r10.A00.setOnTouchListener(new DTB(r14, r10, i3, r11, r13));
            }
            throw new UnsupportedOperationException("Unhandled carousel view type");
        } else {
            int i4 = this.A08.A01;
            AnonymousClass1NJ A0P2 = this.A06.A0P(i4);
            C44421w8 r9 = this.A05;
            AnonymousClass1NJ r112 = this.A06;
            C36841ih r12 = this.A08;
            int i5 = this.A00;
            C32141af Aa7 = this.A09.Aa7(i2, A0P2);
            C32221an r72 = this.A07;
            C32221an r16 = r72;
            int i6 = i2;
            r9.A02(view2, r112, r12, i5, i6, Aa7, r16, this.A0E, this.A09.AaD(A0P2), C36451i4.A09(A0P2, this.A0A, this.A0B), false, this.A06.A12(), this.A06.A13());
            if (i2 == i4) {
                this.A09.A0E((C32161ah) view2.getTag(), A0P2);
            }
        }
        this.A0D.Ba8(view2, this.A06, this.A08, i2);
        return view2;
    }

    public C44401w6(Context context, AnonymousClass1NJ r9, C36841ih r10, int i, AnonymousClass1RJ r12, C32221an r13, AnonymousClass1U5 r14, AnonymousClass0C1 r15, boolean z, C27371Ho r17, AnonymousClass1LO r18) {
        this.A01 = context;
        this.A06 = r9;
        this.A0D = r14;
        this.A0C = z;
        this.A0E = r17;
        C36841ih r1 = r10;
        int i2 = i;
        AnonymousClass1RJ r3 = r12;
        A00(r1, i2, r3, r13, r14, r15);
        this.A02 = r18;
        AnonymousClass0L7 r2 = AnonymousClass0L7.VIDEO_SCRUBBER;
        this.A0B = ((Boolean) AnonymousClass0L6.A02(r15, r2, "is_sponsored_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0A = ((Boolean) AnonymousClass0L6.A02(r15, r2, "is_organic_enabled", false, (AnonymousClass04H) null)).booleanValue();
    }

    public final long getItemId(int i) {
        return (long) ((AnonymousClass1NJ) getItem(i)).APo().hashCode();
    }

    public final int getItemViewType(int i) {
        MediaType APx = ((AnonymousClass1NJ) getItem(i)).APx();
        if (APx == MediaType.VIDEO) {
            return 2;
        }
        if (APx == MediaType.AD_MAP) {
            return 3;
        }
        return 1;
    }
}
