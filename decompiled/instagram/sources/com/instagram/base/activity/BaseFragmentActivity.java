package com.instagram.base.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.C0003R;
import com.instagram.p009ui.pixelguide.PixelGuideView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p000X.Constants;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19r;
import p000X.AnonymousClass1D8;
import p000X.AnonymousClass1D9;
import p000X.AnonymousClass1DA;
import p000X.AnonymousClass1DB;
import p000X.AnonymousClass1DC;
import p000X.AnonymousClass1DD;
import p000X.AnonymousClass1DE;
import p000X.AnonymousClass1DF;
import p000X.AnonymousClass1DG;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1EZ;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2L0;
import p000X.AnonymousClass7KE;
import p000X.C019000b;
import p000X.C05640Lj;
import p000X.C05770Lw;
import p000X.C06220Of;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C11850fm;
import p000X.C11860fn;
import p000X.C11870fo;
import p000X.C11880fp;
import p000X.C15330mi;
import p000X.C176567gQ;
import p000X.C27301Hh;
import p000X.C27651Ir;
import p000X.C30531DeF;
import p000X.C30532DeG;
import p000X.C30533DeH;
import p000X.C31201Wx;
import p000X.C33431cu;
import p000X.C33441cv;
import p000X.C33451cw;
import p000X.C33461cx;
import p000X.C33471cy;
import p000X.C33481cz;
import p000X.C33491d0;
import p000X.C33501d1;
import p000X.C33841da;
import p000X.C54062Vp;

public abstract class BaseFragmentActivity extends IgFragmentActivity implements C11850fm, C11860fn, C11870fo, C11880fp {
    public static boolean A0I;
    public int A00;
    public TextView A01;
    public AnonymousClass7KE A02;
    public AnonymousClass1EZ A03;
    public ViewGroup A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass1EW A07;
    public AnonymousClass2L0 A08;
    public final View.OnClickListener A09 = new AnonymousClass1DG(this);
    public final Set A0A = new CopyOnWriteArraySet();
    public final C11200ea A0B = new AnonymousClass1DE(this);
    public final C11200ea A0C = new AnonymousClass1DC(this);
    public final C11200ea A0D = new AnonymousClass1DF(this);
    public final C11200ea A0E = new AnonymousClass1DD(this);
    public final C11200ea A0F = new AnonymousClass1DA(this);
    public final C11200ea A0G = new AnonymousClass1DB(this);
    public final AnonymousClass1D9 A0H = new AnonymousClass1D8(this);

    public C33501d1 A0P() {
        return null;
    }

    public abstract void A0V(Bundle bundle);

    public boolean A0Y() {
        return true;
    }

    public static final void A00(AnonymousClass1EX r1) {
        if (!A0I) {
            ((AnonymousClass1EW) r1).A0E();
        }
    }

    public int A0O() {
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.COORDINATORLAYOUT_ROOT_LAYOUT, "is_enabled", false)).booleanValue()) {
            return C0003R.layout.activity_fragment_host_coordinator_layout;
        }
        return C0003R.layout.activity_fragment_host;
    }

    public final AnonymousClass2L0 A0Q() {
        if (this.A08 == null) {
            this.A08 = new AnonymousClass2L0((ViewStub) findViewById(C0003R.C0005id.snack_bar_stub));
        }
        return this.A08;
    }

    public final void A0W(AnonymousClass19r r3) {
        synchronized (this.A0A) {
            this.A0A.add(r3);
        }
    }

    public final void A0X(AnonymousClass19r r3) {
        synchronized (this.A0A) {
            this.A0A.remove(r3);
        }
    }

    public final AnonymousClass1EW AFO() {
        return this.A07;
    }

    public final ViewGroup AVK() {
        if (this.A04 == null) {
            this.A04 = (ViewGroup) ((ViewStub) findViewById(C0003R.C0005id.search_container_stub)).inflate();
        }
        return this.A04;
    }

    public final void Azn(C05770Lw r3) {
        if (this.A05 == null) {
            this.A05 = (TextView) ((ViewStub) findViewById(C0003R.C0005id.devserver_indicator_stub)).inflate();
        }
        if (r3.A0K()) {
            this.A05.setText(C05770Lw.A00().A04());
            this.A05.setVisibility(0);
        } else {
            this.A05.setVisibility(8);
        }
        this.A05.setTranslationY((float) this.A00);
    }

    public final void BWM(C05770Lw r3) {
        if (this.A06 == null) {
            this.A06 = (TextView) ((ViewStub) findViewById(C0003R.C0005id.whitehat_indicator_stub)).inflate();
        }
        if (r3.A0D()) {
            this.A06.setText(C0003R.string.whitehat_settings_certs_overlay);
            this.A06.setVisibility(0);
            return;
        }
        this.A06.setVisibility(8);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.A02 != null) {
            Toolbar toolbar = (Toolbar) findViewById(C0003R.C0005id.tool_bar);
            C54062Vp A0D2 = A0K().A0D();
            A0D2.A0G(this.A02.A03);
            A0D2.A0H(this.A02.A03);
            if (this.A02.A03) {
                toolbar.setNavigationIcon((int) C0003R.C0004drawable.instagram_arrow_back_24);
            }
            View.OnClickListener onClickListener = this.A02.A00;
            if (onClickListener != null) {
                toolbar.setNavigationOnClickListener(onClickListener);
            } else {
                toolbar.setNavigationOnClickListener(this.A09);
            }
            menu.clear();
            Iterator it = this.A02.A02.iterator();
            while (it.hasNext()) {
                C33841da r2 = (C33841da) it.next();
                MenuItem showAsActionFlags = menu.add(r2.A01).setShowAsActionFlags(2);
                Drawable drawable = r2.A04;
                if (drawable != null) {
                    showAsActionFlags.setIcon(drawable);
                } else {
                    showAsActionFlags.setIcon(r2.A02);
                }
                showAsActionFlags.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener) null);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A0R() {
        AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L instanceof AnonymousClass1HM) {
            if (!C31201Wx.A01(this).A0Q()) {
                this.A07.A0F((AnonymousClass1HM) A0L);
            }
        } else if (A0L instanceof C11850fm) {
            this.A07.A07.setVisibility(8);
        } else {
            this.A07.A0F((AnonymousClass1HM) null);
        }
    }

    public void A0S() {
        int i;
        AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L != null && A0L.mView != null) {
            AnonymousClass1EW r2 = this.A07;
            boolean z = false;
            if ((!(A0L instanceof C33431cu) || !((C33431cu) A0L).Ae1()) && ((r2 == null || r2.A02) && (A0L instanceof AnonymousClass1HM) && !C27301Hh.A03(A0L))) {
                z = true;
            }
            if (z) {
                i = C27651Ir.A00(this);
            } else {
                i = 0;
            }
            findViewById(C0003R.C0005id.layout_container_main).setPadding(0, i, 0, 0);
        }
    }

    public void A0T() {
        if (A0Y()) {
            C15330mi.A01(this);
        }
    }

    public final void A0U() {
        A0R();
        A0S();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.A0A) {
            for (AnonymousClass19r r0 : this.A0A) {
                if (r0 != null) {
                    r0.Ar3(i, i2, intent);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(955057209);
        A0T();
        setContentView(A0O());
        this.A07 = new AnonymousClass1EW((ViewGroup) findViewById(C0003R.C0005id.action_bar_container), this.A09);
        super.onCreate(bundle);
        A05().A0r(this.A0H);
        A0V(bundle);
        this.A03 = new AnonymousClass1EZ((ViewStub) findViewById(C0003R.C0005id.pixel_guide_stub), C05770Lw.A00());
        ViewStub viewStub = (ViewStub) findViewById(C0003R.C0005id.tool_bar_stub);
        if (A0I && viewStub != null) {
            viewStub.inflate();
            this.A02 = new AnonymousClass7KE((ViewGroup) findViewById(C0003R.C0005id.tool_bar_container), this.A09);
            A0K().A0U((Toolbar) findViewById(C0003R.C0005id.tool_bar_container).findViewById(C0003R.C0005id.tool_bar));
            this.A02.Bnz(false);
        }
        AnonymousClass0Z0.A07(-927139192, A002);
    }

    public void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-1127661587);
        super.onDestroy();
        this.A0A.clear();
        AnonymousClass0Z0.A07(708735910, A002);
    }

    public void onPause() {
        int A002 = AnonymousClass0Z0.A00(99066112);
        super.onPause();
        C11130eT r3 = C11130eT.A01;
        r3.A03(C33441cv.class, this.A0F);
        r3.A03(C33451cw.class, this.A0B);
        r3.A03(C33461cx.class, this.A0G);
        r3.A03(C33471cy.class, this.A0C);
        r3.A03(C33481cz.class, this.A0E);
        r3.A03(C33491d0.class, this.A0D);
        C33501d1 A0P = A0P();
        if (A0P != null) {
            A0P.A06(Constants.ONE);
        }
        AnonymousClass0Z0.A07(-1442534514, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009a, code lost:
        if (r7.equals("Horizontal Stripes") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0176, code lost:
        if (r7.equals("Vertical And Horizontal Stripes") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0181, code lost:
        if (r7.equals("Vertical Stripes") == false) goto L_0x009c;
     */
    public void onResume() {
        char c;
        int A002 = AnonymousClass0Z0.A00(-278735019);
        super.onResume();
        A0U();
        C11130eT r3 = C11130eT.A01;
        r3.A02(C33441cv.class, this.A0F);
        r3.A02(C33451cw.class, this.A0B);
        r3.A02(C33461cx.class, this.A0G);
        r3.A02(C33471cy.class, this.A0C);
        r3.A02(C33481cz.class, this.A0E);
        r3.A02(C33491d0.class, this.A0D);
        AnonymousClass1EZ r5 = this.A03;
        if (r5.A01.A00.getBoolean("pixel_grid", false)) {
            r5.A00.A02(0);
            PixelGuideView pixelGuideView = (PixelGuideView) r5.A00.A01();
            String string = r5.A01.A00.getString("pixel_guide_style", (String) null);
            if (TextUtils.isEmpty(string)) {
                string = "Pixel Grid";
            }
            int A032 = (int) C06220Of.A03(pixelGuideView.getContext(), r5.A01.A00.getInt("pixel_guide_size", 8));
            int hashCode = string.hashCode();
            if (hashCode == -1427524836) {
                c = 1;
            } else if (hashCode == -398112099) {
                c = 2;
            } else if (hashCode == 1895940554) {
                c = 0;
            }
            c = 65535;
            if (c == 0) {
                pixelGuideView.A06 = new C30533DeH(pixelGuideView.A04, A032);
            } else if (c == 1) {
                pixelGuideView.A06 = new C30531DeF(pixelGuideView.A04, A032);
            } else if (c != 2) {
                pixelGuideView.A06 = new C176567gQ(A032);
            } else {
                pixelGuideView.A06 = new C30532DeG(pixelGuideView.A04, A032);
            }
            pixelGuideView.invalidate();
        } else {
            r5.A00.A02(8);
        }
        C05770Lw A003 = C05770Lw.A00();
        if (A003.A0K()) {
            Azn(A003);
        }
        if (A003.A0D()) {
            BWM(A003);
        }
        if (!C05770Lw.A00().A0E() && !C05770Lw.A00().A0F()) {
            boolean A0G2 = C05770Lw.A00().A0G();
        }
        if (C05770Lw.A00().A0J()) {
            if (this.A01 == null) {
                this.A01 = (TextView) ((ViewStub) findViewById(C0003R.C0005id.injected_stories_tool_overlay_stub)).inflate();
            }
            if (C05770Lw.A00().A0J()) {
                this.A01.setText("Stories Injection Enabled");
                this.A01.setBackgroundColor(C019000b.A00(getBaseContext(), C0003R.color.green_5));
                this.A01.setVisibility(0);
            } else {
                this.A01.setVisibility(8);
            }
        }
        AnonymousClass0QD.A00().BcK(getClass().getName());
        C33501d1 A0P = A0P();
        if (A0P != null) {
            A0P.A06(Constants.ZERO);
        }
        AnonymousClass0Z0.A07(1301562503, A002);
    }

    public void onStop() {
        int A002 = AnonymousClass0Z0.A00(-1611647604);
        super.onStop();
        C33501d1 A0P = A0P();
        if (A0P != null) {
            A0P.A06(Constants.A0C);
        }
        AnonymousClass0Z0.A07(1164961606, A002);
    }

    public void A0J(AnonymousClass1HD r1) {
        A0S();
    }
}
