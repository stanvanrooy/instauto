package p000X;

import android.os.Handler;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1ye  reason: invalid class name and case insensitive filesystem */
public final class C45831ye implements C45781yU {
    public final CopyOnWriteArraySet A00;
    public final Handler A01;

    public final void Ayv(List list) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YN(this, list), -1156068850);
    }

    public final void AzH(String str, boolean z, long j) {
        AnonymousClass0ZA.A0E(this.A01, new C50322Fv(this, str, z, j), -1709334768);
    }

    public final void AzI(int i, int i2, int i3, int i4) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YQ(this, i, i2, i3, i4), -1308063211);
    }

    public final void B0v(ParcelableFormat parcelableFormat, long j, String str, List list) {
        AnonymousClass0ZA.A0E(this.A01, new C50332Fx(this, parcelableFormat, j, str, list), -78459585);
    }

    public final void B1b() {
        AnonymousClass0ZA.A0E(this.A01, new C50352Fz(this), -818097379);
    }

    public final void BCp(byte[] bArr, long j) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YM(this, bArr, j), -805984539);
    }

    public final void BEU(String str, String str2, C29634D2r d2r, C42071rS r21, long j, int i, int i2, long j2, int i3, int i4, boolean z) {
        C42071rS r7 = r21;
        C29634D2r d2r2 = d2r;
        String str3 = str;
        long j3 = j2;
        String str4 = str2;
        int i5 = i2;
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YS(this, str3, str4, d2r2, r7, j, i, i5, j3, i3, i4, z), -1023264722);
    }

    public final void BFH(long j, String str) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2G0(this, j, str), -671781238);
    }

    public final void BFL() {
        AnonymousClass0ZA.A0E(this.A01, new C46001yy(this), 741597236);
    }

    public final void BLq(long j) {
        AnonymousClass0ZA.A0E(this.A01, new C54232Wk(this, j), 851831369);
    }

    public final void BOA(int i) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YO(this, i), -501715181);
    }

    public final void BOS(ServicePlayerState servicePlayerState, LiveState liveState, boolean z, boolean z2) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass27Q(this, servicePlayerState, liveState, z, z2), 1858839977);
    }

    public final void BP8(long j, boolean z, boolean z2) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2G2(this, j, z, z2), 602420057);
    }

    public final void BRd(List list) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YR(this, list), -459464561);
    }

    public final void BUk(long j, String str) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2Xe(this, j, str), 1883009430);
    }

    public final void BUn(long j, long j2, int i, int i2, long j3, Integer num, boolean z, int i3, int i4) {
        int i5 = i2;
        int i6 = i;
        long j4 = j2;
        long j5 = j;
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2YK(this, j5, j4, i6, i5, j3, num, z, i3, i4), 1785418110);
    }

    public final void BV1(long j, long j2, int i, int i2, long j3, Integer num, long j4, String str, int i3, int i4) {
        int i5 = i2;
        int i6 = i;
        long j5 = j4;
        long j6 = j2;
        long j7 = j;
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2J4(this, j7, j6, i6, i5, j3, num, j5, str, i3, i4), -609155316);
    }

    public final void BVK(String str) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2G1(this, str), -581938006);
    }

    public final void BVN() {
        AnonymousClass0ZA.A0E(this.A01, new C473023b(this), 24888238);
    }

    public final void BVO(int i, int i2) {
        AnonymousClass0ZA.A0E(this.A01, new C50342Fy(this, i, i2), 1009308083);
    }

    public final void BVW(ServicePlayerState servicePlayerState, LiveState liveState, boolean z, boolean z2, String str, String str2) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2G4(this, servicePlayerState, liveState, z, z2, str, str2), -139184053);
    }

    public final void BW9(boolean z, boolean z2) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass2G3(this, z, z2), 89950152);
    }

    public final void BuA(String str, String str2) {
        AnonymousClass0ZA.A0E(this.A01, new AnonymousClass8YP(this, str, str2), 1041334551);
    }

    public C45831ye(Handler handler, C45781yU r3) {
        this.A01 = handler;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A00 = copyOnWriteArraySet;
        if (r3 != null) {
            copyOnWriteArraySet.add(r3);
        }
    }
}
