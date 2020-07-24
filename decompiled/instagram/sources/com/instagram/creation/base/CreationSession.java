package com.instagram.creation.base;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.people.PeopleTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0QD;
import p000X.C06400Ox;
import p000X.C161106u5;
import p000X.C183027rm;
import p000X.C183867tM;

public class CreationSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(290);
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public Bitmap A03;
    public Rect A04;
    public C183027rm A05;
    public C183027rm A06;
    public MediaSession A07;
    public LocationSignalPackage A08;
    public MediaCaptureConfig A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public ArrayList A0D = new ArrayList();
    public List A0E = new ArrayList();
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public DirectThreadKey A0I;
    public ArrayList A0J = new ArrayList();
    public List A0K = new ArrayList();
    public final HashMap A0L = new HashMap();
    public final HashMap A0M = new HashMap();
    public final List A0N = new ArrayList();
    public final List A0O = new ArrayList();

    public final void A0C() {
        this.A02 = -1;
        this.A03 = null;
        this.A04 = null;
        A0D();
        this.A0D.clear();
        this.A05 = this.A06;
        this.A01 = 0;
        this.A0G = false;
        this.A0C = null;
        A0D();
        this.A0B = null;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A0F = false;
    }

    public final int describeContents() {
        return 0;
    }

    public static float A00(MediaSession mediaSession, AnonymousClass0C1 r4) {
        float f;
        int i;
        int i2;
        Integer num = mediaSession.A02;
        float f2 = 1.0f;
        if (num == Constants.ZERO) {
            PhotoSession photoSession = mediaSession.A00;
            CropInfo cropInfo = photoSession.A03;
            boolean z = false;
            if (photoSession.A01 % 180 != 0) {
                z = true;
            }
            if (z) {
                i2 = cropInfo.A00;
            } else {
                i2 = cropInfo.A01;
            }
            f2 = (float) i2;
            if (z) {
                i = cropInfo.A01;
            } else {
                i = cropInfo.A00;
            }
        } else if (num == Constants.ONE) {
            PendingMedia A042 = PendingMediaStore.A01(r4).A04(mediaSession.A01());
            f2 = (float) A042.A0G;
            i = A042.A0F;
        } else {
            f = 1.0f;
            return f2 / f;
        }
        f = (float) i;
        return f2 / f;
    }

    public final float A01() {
        float f = this.A00;
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return 1.0f;
        }
        return f;
    }

    public final float A02(AnonymousClass0C1 r4) {
        float f = 1.0f;
        for (MediaSession A002 : this.A0E) {
            f = Math.max(f, A00(A002, r4));
        }
        return Math.min(1.91f, f);
    }

    public final float A03(AnonymousClass0C1 r4) {
        float f = 1.0f;
        for (MediaSession A002 : this.A0E) {
            f = Math.min(f, A00(A002, r4));
        }
        return Math.max(0.8f, f);
    }

    public final PhotoSession A04(String str) {
        for (MediaSession mediaSession : this.A0E) {
            if (mediaSession.A02 == Constants.ZERO) {
                PhotoSession photoSession = mediaSession.A00;
                if (photoSession.A07.equals(str)) {
                    return photoSession;
                }
            }
        }
        return null;
    }

    public final IgFilterGroup A05() {
        return this.A07.A00.A04;
    }

    public final String A06() {
        MediaSession mediaSession = this.A07;
        if (mediaSession != null) {
            return mediaSession.A01();
        }
        return null;
    }

    public final String A07() {
        return this.A07.A00.A07;
    }

    public final List A08() {
        return Collections.unmodifiableList(this.A0E);
    }

    public final List A09() {
        if (!this.A0H || !C06400Ox.A01()) {
            return A08();
        }
        if (this.A0E.size() != this.A0O.size() || this.A0F) {
            this.A0O.clear();
            this.A0O.addAll(this.A0E);
            Collections.reverse(this.A0O);
        }
        return Collections.unmodifiableList(this.A0O);
    }

    public final List A0A() {
        ArrayList arrayList = new ArrayList();
        for (MediaSession mediaSession : this.A0E) {
            if (mediaSession.A02 == Constants.ZERO) {
                arrayList.add(mediaSession.A00);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List A0B() {
        ArrayList arrayList = new ArrayList();
        for (MediaSession mediaSession : this.A0E) {
            if (mediaSession.A02 == Constants.ONE) {
                arrayList.add(mediaSession.A01);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void A0D() {
        this.A0E.clear();
        this.A0O.clear();
        this.A07 = null;
        this.A0F = false;
    }

    public final void A0E(Location location) {
        MediaSession mediaSession = this.A07;
        if (mediaSession.A02 == Constants.ZERO) {
            mediaSession.A00.A02 = location;
        } else {
            mediaSession.A01.A09 = location;
        }
    }

    public final void A0F(C161106u5 r7) {
        this.A0N.clear();
        for (MediaSession mediaSession : this.A0E) {
            C183867tM r3 = new C183867tM();
            String A012 = mediaSession.A01();
            r3.A06 = A012;
            r3.A04 = mediaSession;
            Integer num = mediaSession.A02;
            if (num == Constants.ZERO) {
                IgFilterGroup igFilterGroup = mediaSession.A00.A04;
                if (igFilterGroup == null) {
                    AnonymousClass0QD.A01("MediaSessionState", "FilterGroup passed into setFilterGroup was null.");
                } else {
                    r3.A05 = igFilterGroup.A04();
                }
            } else if (num == Constants.ONE) {
                PendingMedia ARi = r7.ARi(A012);
                r3.A03 = ARi.A13.A01;
                r3.A02 = ARi.A05;
                ClipInfo clipInfo = ARi.A0l;
                r3.A01 = clipInfo.A08;
                r3.A00 = clipInfo.A06;
                r3.A07 = ARi.A33;
            }
            this.A0N.add(r3);
        }
        this.A0F = false;
    }

    public final void A0G(String str) {
        MediaSession mediaSession = this.A07;
        if (mediaSession.A02 == Constants.ZERO) {
            mediaSession.A00.A06 = str;
        } else {
            mediaSession.A01.A0A = str;
        }
    }

    public final void A0H(String str) {
        MediaSession mediaSession = this.A07;
        if (mediaSession != null) {
            this.A0E.remove(mediaSession);
            this.A07 = null;
        }
        A0J(str, false);
    }

    public final void A0I(String str) {
        MediaSession mediaSession = this.A07;
        if (mediaSession != null) {
            this.A0E.remove(mediaSession);
            this.A07 = null;
        }
        A0J(str, true);
    }

    public final void A0J(String str, boolean z) {
        MediaSession mediaSession;
        if (z) {
            VideoSession videoSession = new VideoSession();
            videoSession.A0B = str;
            mediaSession = new MediaSession(videoSession);
        } else {
            PhotoSession photoSession = new PhotoSession();
            photoSession.A07 = str;
            mediaSession = new MediaSession(photoSession);
        }
        this.A0E.add(mediaSession);
        this.A07 = mediaSession;
        if (!this.A0L.isEmpty() && !this.A0L.containsKey(str)) {
            this.A0F = true;
        }
    }

    public final boolean A0K() {
        for (MediaSession mediaSession : this.A0E) {
            if (mediaSession.A02 == Constants.ZERO) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0L() {
        for (MediaSession mediaSession : this.A0E) {
            if (mediaSession.A02 == Constants.ONE) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0M() {
        if (this.A0B != null) {
            return true;
        }
        return false;
    }

    public final boolean A0N() {
        MediaSession mediaSession = this.A07;
        if (mediaSession == null || mediaSession.A02 != Constants.ZERO) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.A0A.intValue());
        parcel.writeParcelable(this.A09, i);
        parcel.writeInt(this.A02);
        parcel.writeTypedList(this.A0D);
        C183027rm r3 = this.A05;
        C183027rm r2 = C183027rm.RECTANGULAR;
        int i3 = 1;
        int i4 = 0;
        if (r3 == r2) {
            i4 = 1;
        }
        parcel.writeByte((byte) i4);
        if (this.A06 != r2) {
            i3 = 0;
        }
        parcel.writeByte((byte) i3);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A0I, i);
        parcel.writeTypedList(this.A0J);
        parcel.writeTypedList(this.A0E);
        MediaSession mediaSession = this.A07;
        if (mediaSession != null) {
            i2 = this.A0E.indexOf(mediaSession);
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A0C);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
        parcel.writeInt(this.A0M.size());
        for (Map.Entry entry : this.A0M.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public CreationSession() {
        A0C();
        this.A06 = C183027rm.SQUARE;
    }

    public CreationSession(Parcel parcel) {
        C183027rm r0;
        C183027rm r02;
        MediaSession mediaSession;
        this.A0A = Constants.ZERO(3)[parcel.readInt()];
        this.A09 = (MediaCaptureConfig) parcel.readParcelable(MediaCaptureConfig.class.getClassLoader());
        this.A02 = parcel.readInt();
        this.A0D = parcel.createTypedArrayList(PeopleTag.CREATOR);
        boolean z = true;
        if (parcel.readByte() == 1) {
            r0 = C183027rm.RECTANGULAR;
        } else {
            r0 = C183027rm.SQUARE;
        }
        this.A05 = r0;
        if (parcel.readByte() == 1) {
            r02 = C183027rm.RECTANGULAR;
        } else {
            r02 = C183027rm.SQUARE;
        }
        this.A06 = r02;
        this.A01 = parcel.readInt();
        this.A0I = (DirectThreadKey) parcel.readParcelable(DirectThreadKey.class.getClassLoader());
        this.A0J = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.A0E = parcel.createTypedArrayList(MediaSession.CREATOR);
        int readInt = parcel.readInt();
        if (readInt != -1) {
            mediaSession = (MediaSession) this.A0E.get(readInt);
        } else {
            mediaSession = null;
        }
        this.A07 = mediaSession;
        this.A0C = parcel.readString();
        this.A0G = parcel.readByte() == 1;
        this.A0B = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A0H = parcel.readByte() != 1 ? false : z;
        int readInt2 = parcel.readInt();
        for (int i = 0; i < readInt2; i++) {
            this.A0M.put(parcel.readString(), parcel.readString());
        }
    }
}
