package p000X;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.BMC */
public final class BMC implements C25501BNl {
    public final Map A00;

    public final boolean AfK(Object obj) {
        BMC bmc = (BMC) obj;
        Map map = this.A00;
        if (map != null && bmc.A00 != null) {
            if (map.size() == bmc.A00.size()) {
                Iterator it = bmc.A00.entrySet().iterator();
                for (Map.Entry entry : this.A00.entrySet()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    if (entry == null || entry2 == null) {
                        if (entry == null && entry2 == null) {
                            return true;
                        }
                        return false;
                    } else if (entry.getKey() == null || ((String) entry.getKey()).equals(entry2.getKey())) {
                        if (entry.getValue() != null && !((String) entry.getValue()).equals(entry2.getValue())) {
                            return false;
                        }
                    }
                }
            }
            return false;
        } else if (!(map == null && bmc.A00 == null)) {
            return false;
        }
        return true;
    }

    public final int Boo() {
        int i = 0;
        for (Map.Entry entry : this.A00.entrySet()) {
            i += ((String) entry.getKey()).length() + ((String) entry.getValue()).length();
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ JSONObject BrS(Object obj, JSONObject jSONObject) {
        String str = (String) obj;
        JSONObject jSONObject2 = new JSONObject();
        boolean z = false;
        for (Map.Entry entry : this.A00.entrySet()) {
            if (entry.getKey() != null && !((String) entry.getKey()).isEmpty() && entry.getValue() != null && !((String) entry.getValue()).isEmpty()) {
                z = true;
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (z) {
            return jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }

    public BMC(Enumeration enumeration) {
        String str;
        HashMap hashMap = new HashMap();
        while (enumeration.hasMoreElements()) {
            InetAddress inetAddress = (InetAddress) enumeration.nextElement();
            boolean z = inetAddress instanceof Inet4Address;
            if (z || (inetAddress instanceof Inet6Address)) {
                String hostAddress = inetAddress.getHostAddress();
                if (z) {
                    str = "v4";
                } else {
                    str = "v6";
                }
                hashMap.put(str, hostAddress.contains("%") ? hostAddress.substring(0, hostAddress.indexOf(37)) : hostAddress);
            }
        }
        this.A00 = hashMap;
    }
}
