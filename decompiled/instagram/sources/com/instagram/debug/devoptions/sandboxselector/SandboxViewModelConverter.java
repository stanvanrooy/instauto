package com.instagram.debug.devoptions.sandboxselector;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass10K;
import p000X.AnonymousClass10L;
import p000X.AnonymousClass10M;
import p000X.AnonymousClass10N;
import p000X.AnonymousClass10Q;
import p000X.AnonymousClass2GT;
import p000X.AnonymousClass2NW;
import p000X.AnonymousClass4FF;
import p000X.AnonymousClass595;
import p000X.C1189358l;
import p000X.C120195Dq;
import p000X.C13150hy;
import p000X.C18720sJ;
import p000X.C191608Hd;

public final class SandboxViewModelConverter {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CorpnetStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[CorpnetStatus.CHECKING.ordinal()] = 1;
            iArr[CorpnetStatus.ON_CORPNET.ordinal()] = 2;
            iArr[CorpnetStatus.OFF_CORPNET.ordinal()] = 3;
            int[] iArr2 = new int[SandboxType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[SandboxType.PRODUCTION.ordinal()] = 1;
            iArr2[SandboxType.DEDICATED.ordinal()] = 2;
            iArr2[SandboxType.ON_DEMAND.ordinal()] = 3;
            iArr2[SandboxType.OTHER.ordinal()] = 4;
            int[] iArr3 = new int[IgServerHealth.Unhealthy.UnhealthyReason.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[IgServerHealth.Unhealthy.UnhealthyReason.BAD_GATEWAY.ordinal()] = 1;
            iArr3[IgServerHealth.Unhealthy.UnhealthyReason.TIMED_OUT.ordinal()] = 2;
            iArr3[IgServerHealth.Unhealthy.UnhealthyReason.DJANGO_UNHEALTHY.ordinal()] = 3;
            iArr3[IgServerHealth.Unhealthy.UnhealthyReason.UNKNOWN.ordinal()] = 4;
        }
    }

    private final int getErrorFromStatus(IgServerHealth.Unhealthy.UnhealthyReason unhealthyReason) {
        int i = WhenMappings.$EnumSwitchMapping$2[unhealthyReason.ordinal()];
        if (i == 1) {
            return C0003R.string.dev_options_sandbox_selector_error_dev_env_bad_state;
        }
        if (i == 2) {
            return C0003R.string.dev_options_sandbox_selector_error_dev_env_timed_out;
        }
        if (i == 3) {
            return C0003R.string.dev_options_sandbox_selector_error_dev_env_django_unhealthy;
        }
        if (i == 4) {
            return C0003R.string.dev_options_sandbox_selector_error_dev_env_general;
        }
        throw new C191608Hd();
    }

    private final AnonymousClass2NW toHeaderItem(SandboxType sandboxType) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[sandboxType.ordinal()];
        if (i2 == 1) {
            i = C0003R.string.dev_options_sandbox_selector_header_production;
        } else if (i2 == 2) {
            i = C0003R.string.dev_options_sandbox_selector_header_dedicated;
        } else if (i2 == 3) {
            i = C0003R.string.dev_options_sandbox_selector_header_ondemand;
        } else if (i2 == 4) {
            i = C0003R.string.dev_options_sandbox_selector_header_other;
        } else {
            throw new C191608Hd();
        }
        return new AnonymousClass2NW(i);
    }

    private final AnonymousClass595 toMenuItem(Sandbox sandbox, AnonymousClass2GT r5) {
        return new AnonymousClass595((CharSequence) sandbox.url, (View.OnClickListener) new SandboxViewModelConverter$toMenuItem$2(sandbox, r5));
    }

    public static /* synthetic */ AnonymousClass595 toMenuItem$default(SandboxViewModelConverter sandboxViewModelConverter, Sandbox sandbox, AnonymousClass2GT r3, int i, Object obj) {
        if ((i & 1) != 0) {
            r3 = SandboxViewModelConverter$toMenuItem$1.INSTANCE;
        }
        return sandboxViewModelConverter.toMenuItem(sandbox, r3);
    }

    private final int toStringResId(IgServerHealth igServerHealth) {
        if (igServerHealth instanceof IgServerHealth.CheckingHealth) {
            return C0003R.string.dev_options_sandbox_selector_connection_health_loading;
        }
        if (igServerHealth instanceof IgServerHealth.Healthy) {
            return C0003R.string.dev_options_sandbox_selector_connection_health_healthy;
        }
        if (igServerHealth instanceof IgServerHealth.Unhealthy) {
            return getErrorFromStatus(((IgServerHealth.Unhealthy) igServerHealth).errorStatus);
        }
        throw new C191608Hd();
    }

    public final List convert(List list, AnonymousClass2GT r8) {
        C13150hy.A02(list, "sandboxes");
        C13150hy.A02(r8, "onServerSelected");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            SandboxType sandboxType = ((Sandbox) next).type;
            Object obj = linkedHashMap.get(sandboxType);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(sandboxType, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList<Iterable> arrayList = new ArrayList<>(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List A06 = AnonymousClass10M.A06(toHeaderItem((SandboxType) entry.getKey()));
            Iterable<Sandbox> iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AnonymousClass10K.A00(iterable, 10));
            for (Sandbox menuItem : iterable) {
                arrayList2.add(toMenuItem(menuItem, r8));
            }
            arrayList.add(AnonymousClass10N.A0D(AnonymousClass10N.A0D(A06, arrayList2), AnonymousClass10M.A06(new AnonymousClass4FF())));
        }
        C13150hy.A02(arrayList, "$this$flatten");
        ArrayList arrayList3 = new ArrayList();
        for (Iterable A0H : arrayList) {
            AnonymousClass10Q.A0H(arrayList3, A0H);
        }
        return arrayList3;
    }

    public final List convertCorpnetSection(CorpnetStatus corpnetStatus) {
        int i;
        C13150hy.A02(corpnetStatus, RealtimeProtocol.USERS_ACCOUNT_STATUS);
        int i2 = WhenMappings.$EnumSwitchMapping$0[corpnetStatus.ordinal()];
        if (i2 == 1) {
            i = C0003R.string.dev_options_sandbox_corpnet_status_checking;
        } else if (i2 == 2) {
            i = C0003R.string.dev_options_sandbox_corpnet_status_on;
        } else if (i2 == 3) {
            i = C0003R.string.dev_options_sandbox_corpnet_status_off;
        } else {
            throw new C191608Hd();
        }
        return AnonymousClass10L.A03(new AnonymousClass2NW(i), new AnonymousClass4FF());
    }

    public final List convertCurrentSandboxSection(Sandbox sandbox, IgServerHealth igServerHealth, C18720sJ r7) {
        C13150hy.A02(sandbox, "currentSandbox");
        C13150hy.A02(igServerHealth, "connectionHealth");
        C13150hy.A02(r7, "onResetClicked");
        return AnonymousClass10L.A03(new AnonymousClass2NW((int) C0003R.string.dev_options_sandbox_selector_header_current), new C1189358l((CharSequence) "[" + sandbox.type + "] " + sandbox.url), new C1189358l(toStringResId(igServerHealth)), new C120195Dq(C0003R.string.dev_options_sandbox_selector_reset, new SandboxViewModelConverter$convertCurrentSandboxSection$1(r7)), new AnonymousClass4FF());
    }

    public final List convertManualEntrySection(C18720sJ r5) {
        C13150hy.A02(r5, "onManualEntryClicked");
        return AnonymousClass10L.A03(new AnonymousClass2NW((int) C0003R.string.dev_options_sandbox_selector_header_manual_entry), new C120195Dq(C0003R.string.dev_options_sandbox_selector_button_manual_entry, new SandboxViewModelConverter$convertManualEntrySection$1(r5)), new AnonymousClass4FF());
    }
}
