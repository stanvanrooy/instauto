package p000X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1cc  reason: invalid class name and case insensitive filesystem */
public final class C33251cc implements AnonymousClass0QB {
    public static C33251cc A08;
    public FrameLayout A00;
    public FrameLayout A01;
    public boolean A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A04 = new C33261cd(this);
    public final List A05 = new ArrayList();
    public final Context A06;
    public final WindowManager A07;

    public static synchronized C119625Bh A00(C33251cc r4) {
        synchronized (r4) {
            Activity activity = (Activity) r4.A05.get(0);
            IBinder windowToken = activity.findViewById(16908290).getWindowToken();
            if (windowToken == null) {
                return null;
            }
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            C119625Bh r0 = new C119625Bh(r4, windowToken, rect);
            return r0;
        }
    }

    public static void A03(C33251cc r3, View view, IBinder iBinder, int i) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.token = iBinder;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        layoutParams.flags |= 8;
        layoutParams.type = 1002;
        layoutParams.softInputMode = 1;
        layoutParams.setTitle(AnonymousClass000.A0E("InAppNotificationWindow:", Integer.toHexString(r3.hashCode())));
        layoutParams.x = 0;
        layoutParams.y = i;
        r3.A07.addView(view, layoutParams);
    }

    public static synchronized void A04(C33251cc r9, C61442lo r10, Context context) {
        boolean z;
        View view;
        synchronized (r9) {
            if (!r9.A05.isEmpty()) {
                AnonymousClass0ZA.A08(r9.A03, r9.A04);
                FrameLayout frameLayout = r9.A00;
                boolean z2 = true;
                if (frameLayout != null) {
                    view = frameLayout.getChildAt(0);
                    Animation animation = view.getAnimation();
                    if (animation != null) {
                        animation.setAnimationListener((Animation.AnimationListener) null);
                        view.clearAnimation();
                    }
                    z = false;
                } else {
                    view = LayoutInflater.from(context).inflate(C0003R.layout.in_app_notification_layout, (ViewGroup) null);
                    C91133x3 r1 = new C91133x3();
                    r1.A06 = (IgImageView) view.findViewById(C0003R.C0005id.notification_icon);
                    r1.A05 = (TextView) view.findViewById(C0003R.C0005id.notification_title);
                    r1.A04 = (TextView) view.findViewById(C0003R.C0005id.notification_message);
                    r1.A00 = view;
                    r1.A01 = (ViewStub) view.findViewById(C0003R.C0005id.circular_image_stub);
                    r1.A02 = (ViewStub) view.findViewById(C0003R.C0005id.rounded_corner_image_stub);
                    r1.A03 = (ViewStub) view.findViewById(C0003R.C0005id.thumbnail_image_stub);
                    view.setTag(r1);
                    FrameLayout frameLayout2 = new FrameLayout(r9.A06);
                    r9.A00 = frameLayout2;
                    r9.A01 = null;
                    frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -2));
                    C119625Bh A002 = A00(r9);
                    if (A002 != null) {
                        A03(r9, r9.A00, A002.A01, A002.A00.top);
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                }
                if (z2) {
                    C91133x3 r2 = (C91133x3) view.getTag();
                    if (!(r10.A01 == null && r10.A00 == null)) {
                        if (r10.A04 == Constants.ZERO) {
                            if (r2.A06 == null) {
                                r2.A01.inflate();
                                r2.A06 = (IgImageView) view.findViewById(r2.A01.getInflatedId());
                            }
                            Drawable drawable = r10.A00;
                            if (drawable != null) {
                                r2.A06.setImageDrawable(drawable);
                            } else {
                                r2.A06.setUrl(r10.A01);
                            }
                        } else {
                            if (r2.A07 == null) {
                                r2.A02.inflate();
                                r2.A07 = (IgImageView) view.findViewById(C0003R.C0005id.rounded_corner_image);
                            }
                            Drawable drawable2 = r10.A00;
                            if (drawable2 != null) {
                                r2.A07.setImageDrawable(drawable2);
                            } else {
                                r2.A07.setUrl(r10.A01);
                            }
                        }
                    }
                    if (r10.A02 != null) {
                        if (r2.A08 == null) {
                            r2.A03.inflate();
                            r2.A08 = (IgImageView) view.findViewById(r2.A03.getInflatedId());
                        }
                        r2.A08.setUrl(r10.A02);
                    }
                    int i = 8;
                    if (TextUtils.isEmpty(r10.A06)) {
                        r2.A05.setText("");
                        r2.A05.setVisibility(8);
                    } else {
                        r2.A05.setText(r10.A06);
                        r2.A05.setVisibility(0);
                    }
                    r2.A05.setSingleLine(r10.A07);
                    r2.A04.setText(r10.A05);
                    TextView textView = r2.A04;
                    if (!TextUtils.isEmpty(r10.A05)) {
                        i = 0;
                    }
                    textView.setVisibility(i);
                    Context context2 = view.getContext();
                    r2.A00.setOnTouchListener(new AnonymousClass4J1(new GestureDetector(context2, new AnonymousClass5BX(context2, r9, r10))));
                    if (z) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(C06220Of.A09(r9.A06), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
                        TranslateAnimation translateAnimation = new TranslateAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (-view.getMeasuredHeight()), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        translateAnimation.setDuration(300);
                        translateAnimation.setFillAfter(false);
                        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                        view.startAnimation(translateAnimation);
                    }
                    AnonymousClass0ZA.A09(r9.A03, r9.A04, 4000, 2057103616);
                } else {
                    r9.A00 = null;
                }
            }
        }
    }

    public final synchronized FragmentActivity A06() {
        return (FragmentActivity) ((Activity) this.A05.get(0));
    }

    public final synchronized void A08() {
        AnonymousClass0ZA.A0E(this.A03, new C33651dG(this), -472383365);
    }

    public final synchronized boolean A0B() {
        return !this.A05.isEmpty();
    }

    public final void Aqy(Activity activity) {
    }

    public final void Aqz(Activity activity) {
    }

    public final void Ar1(Activity activity) {
    }

    public final synchronized void Ar2(Activity activity) {
        if (this.A05.size() == 1) {
            A05(this, false);
            this.A01 = null;
        }
        this.A05.remove(activity);
    }

    public final synchronized void Ar6(Activity activity) {
        this.A05.add(activity);
    }

    public static synchronized C33251cc A01() {
        C33251cc r0;
        synchronized (C33251cc.class) {
            if (A08 == null) {
                A08 = new C33251cc(StoredPreferences.A00);
            }
            r0 = A08;
        }
        return r0;
    }

    public static void A02(C33251cc r2) {
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            r2.A07.removeViewImmediate(frameLayout);
            r2.A00 = null;
        }
    }

    public static void A05(C33251cc r5, boolean z) {
        if (!r5.A05.isEmpty()) {
            AnonymousClass0ZA.A08(r5.A03, r5.A04);
            if (z) {
                View childAt = r5.A00.getChildAt(0);
                TranslateAnimation translateAnimation = new TranslateAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (-childAt.getMeasuredHeight()));
                translateAnimation.setDuration(300);
                translateAnimation.setFillAfter(false);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setAnimationListener(new C136095rQ(r5));
                childAt.startAnimation(translateAnimation);
                return;
            }
            A02(r5);
        }
    }

    public final void A07() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            this.A01 = frameLayout;
            AnonymousClass0ZA.A08(this.A03, this.A04);
            A02(this);
        }
    }

    public final void A09(C61442lo r2) {
        A0A(r2, this.A06);
    }

    public final void A0A(C61442lo r4, Context context) {
        if (this.A02) {
            return;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            AnonymousClass0ZA.A0E(this.A03, new C119615Bg(this, r4, context), -1182899152);
        } else {
            A04(this, r4, context);
        }
    }

    public C33251cc(Context context) {
        this.A06 = context;
        this.A07 = (WindowManager) context.getSystemService("window");
    }
}
