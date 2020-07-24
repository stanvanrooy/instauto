package p000X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.photo.crop.AvatarCropActivity;
import com.instagram.fileregistry.OwnerHelper;

/* renamed from: X.0oP  reason: invalid class name and case insensitive filesystem */
public final class C16320oP extends C16330oQ {
    public AnonymousClass867 A00;
    public C162186w3 A01;

    public final Intent A00(Context context) {
        return new Intent(context, MediaCaptureActivity.class);
    }

    public final Intent A01(Context context, Uri uri, AnonymousClass0C1 r7) {
        C185867wo r3 = new C185867wo(context);
        r3.A00.putParcelable("CropFragment.imageUri", uri);
        r3.A00.putBoolean("CropFragment.isAvatar", true);
        r3.A00.putInt("CropFragment.largestDimension", 1080);
        Intent intent = new Intent(context, AvatarCropActivity.class);
        intent.putExtras(r3.A00);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
        return intent;
    }

    public final AnonymousClass867 A02() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass867();
        }
        return this.A00;
    }

    public final C162186w3 A03() {
        if (this.A01 == null) {
            this.A01 = new C162186w3();
        }
        return this.A01;
    }

    public final C31151Wq A04(Context context, C31131Wo r3, AnonymousClass0C1 r4) {
        return new C31141Wp(context, r3, r4);
    }

    public final void A05() {
        OwnerHelper.A00.A03("CapturedMediaFileOwner", C23060zT.A01);
    }

    public final boolean A06(Context context, Intent intent) {
        Intent A002 = A00(context);
        if (A002.getComponent() != null) {
            return A002.getComponent().equals(intent.getComponent());
        }
        return false;
    }
}
