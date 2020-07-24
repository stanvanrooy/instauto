package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.0Cd  reason: invalid class name and case insensitive filesystem */
public final class C04050Cd extends AnonymousClass2MK {
    public Drawable A00;
    public final Context A01;
    public final AnonymousClass41F A02;
    public final AnonymousClass3OI A03;
    public final C74513Oe A04;

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass9GP(layoutInflater.inflate(C0003R.layout.thread_message_typing_indicator, viewGroup, false));
    }

    public final Class A02() {
        return AnonymousClass3KK.class;
    }

    public final /* bridge */ /* synthetic */ void A03(AnonymousClass1ZK r3) {
        AnonymousClass9GP r32 = (AnonymousClass9GP) r3;
        super.A03(r32);
        r32.A03.setOnClickListener((View.OnClickListener) null);
        r32.A00.cancel();
        r32.A02.stop();
    }

    public final /* bridge */ /* synthetic */ void A04(C40371oY r11, AnonymousClass1ZK r12) {
        int i;
        int i2;
        Integer num;
        AnonymousClass3KK r112 = (AnonymousClass3KK) r11;
        AnonymousClass9GP r122 = (AnonymousClass9GP) r12;
        ImageView imageView = r122.A01;
        Context context = this.A01;
        C74513Oe r1 = this.A04;
        boolean z = r112.A04;
        Drawable drawable = this.A00;
        boolean booleanValue = ((Boolean) this.A03.A07.get()).booleanValue();
        AnonymousClass3OY r5 = r1.A05.A00;
        boolean A022 = C06400Ox.A02(context);
        if (A022) {
            i = r5.A02;
        } else {
            i = r5.A01;
        }
        float f = (float) i;
        if (A022) {
            i2 = r5.A01;
        } else {
            i2 = r5.A02;
        }
        float f2 = (float) i2;
        AnonymousClass3Nv A002 = C74423Nu.A00(drawable);
        if (A002 != null) {
            if (booleanValue) {
                A002.A00(r5.A05);
            } else {
                A002.A01(r5.A05, (float) r5.A00);
            }
            Shape shape = A002.A04;
            if (shape instanceof C74363No) {
                C74363No r13 = (C74363No) shape;
                if (z) {
                    num = Constants.ONE;
                } else {
                    num = Constants.ZERO;
                }
                AnonymousClass3OY.A02(r5, r13, num, f, f2);
            }
        }
        imageView.setBackground(drawable);
        AnonymousClass41B r2 = new AnonymousClass41B(this, r112);
        r122.A00.start();
        r122.A02.start();
        ImageUrl imageUrl = r112.A01;
        if (imageUrl != null) {
            r122.A03.setUrl(imageUrl);
        } else {
            r122.A03.A04();
        }
        r122.A03.setOnClickListener(r2);
    }

    public C04050Cd(Context context, C74513Oe r3, AnonymousClass3OI r4, AnonymousClass41F r5) {
        this.A01 = context;
        this.A03 = r4;
        this.A04 = r3;
        this.A02 = r5;
        if (((Boolean) r4.A0A.get()).booleanValue()) {
            this.A00 = C74423Nu.A01(new C74353Nn()).A03;
        }
    }
}
