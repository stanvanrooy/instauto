package p000X;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1bW  reason: invalid class name and case insensitive filesystem */
public final class C32591bW extends DataSetObserver {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public View A01;
    public int[] A02;
    public final Handler A03;
    public final SparseArray A04;
    public final ViewGroup A05;
    public final ListAdapter A06;
    public final C255119b A07;
    public final C32601bX A08 = new C32601bX(this);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = (int[]) r0.A03.A07.get(r1);
     */
    public final void onChanged() {
        int[] iArr;
        AnonymousClass1PE r0 = (AnonymousClass1PE) this.A06;
        C474423y r1 = r0.A02;
        int[] iArr2 = (r1 == null || iArr == null) ? new int[0] : new int[]{iArr[0]};
        this.A02 = iArr2;
    }

    public C32591bW(Context context, ListAdapter listAdapter, C255119b r5, float f) {
        this.A03 = new Handler(context.getMainLooper());
        this.A06 = listAdapter;
        listAdapter.registerDataSetObserver(this);
        this.A07 = r5;
        this.A05 = (ViewGroup) r5.getParent();
        this.A04 = new SparseArray();
        this.A00 = f;
    }
}
