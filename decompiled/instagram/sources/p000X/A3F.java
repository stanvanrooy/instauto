package p000X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: X.A3F */
public final class A3F extends C23081A5s implements A6D {
    public int A00;
    public int A01;
    public C230379zz A02;
    public boolean A03 = false;
    public final C228009rX A04 = new C228009rX(this);

    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void A08(C230379zz r5, int i, int i2) {
        this.A02 = r5;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", (double) (((float) i) / AnonymousClass951.A01.density));
        writableNativeMap.putDouble("screenHeight", (double) (((float) i2) / AnonymousClass951.A01.density));
    }

    public final void AvQ(MotionEvent motionEvent) {
        C228009rX r2 = this.A04;
        A9C a9c = ((UIManagerModule) ((A3N) getContext()).A02(UIManagerModule.class)).mEventDispatcher;
        if (!r2.A01) {
            C228009rX.A00(r2, motionEvent, a9c);
            r2.A01 = true;
            r2.A00 = -1;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A04.A01(motionEvent, ((UIManagerModule) ((A3N) getContext()).A02(UIManagerModule.class)).mEventDispatcher);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public A3F(Context context) {
        super(context);
    }

    private void A00() {
        if (getChildCount() > 0) {
            this.A03 = false;
            int id = getChildAt(0).getId();
            C230379zz r2 = this.A02;
            if (r2 != null) {
                A08(r2, this.A01, this.A00);
                return;
            }
            A3N a3n = (A3N) getContext();
            A3G a3g = new A3G(this, a3n, id);
            MessageQueueThread messageQueueThread = a3n.A04;
            AnonymousClass0FY.A00(messageQueueThread);
            messageQueueThread.runOnQueue(a3g);
            return;
        }
        this.A03 = true;
    }

    public final void AbJ(Throwable th) {
        ((A3N) getContext()).A08(new RuntimeException(th));
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (this.A03) {
            A00();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(-584971480);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01 = i;
        this.A00 = i2;
        A00();
        AnonymousClass0Z0.A0D(1009071715, A06);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0Z0.A05(1526727920);
        this.A04.A01(motionEvent, ((UIManagerModule) ((A3N) getContext()).A02(UIManagerModule.class)).mEventDispatcher);
        super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(1427069623, A05);
        return true;
    }
}
