package com.instagram.realtimeclient;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

public final class SkywalkerCommand__JsonHelper {
    public static boolean processSingleField(SkywalkerCommand skywalkerCommand, String str, C13080hr r8) {
        HashMap hashMap;
        String A0t;
        ArrayList arrayList;
        String A0t2;
        ArrayList arrayList2;
        String A0t3;
        if ("sub".equals(str)) {
            if (r8.A0g() == C13120hv.START_ARRAY) {
                arrayList2 = new ArrayList();
                while (r8.A0p() != C13120hv.END_ARRAY) {
                    if (r8.A0g() == C13120hv.VALUE_NULL) {
                        A0t3 = null;
                    } else {
                        A0t3 = r8.A0t();
                    }
                    if (A0t3 != null) {
                        arrayList2.add(A0t3);
                    }
                }
            } else {
                arrayList2 = null;
            }
            skywalkerCommand.mSubscribeTopics = arrayList2;
            return true;
        } else if ("unsub".equals(str)) {
            if (r8.A0g() == C13120hv.START_ARRAY) {
                arrayList = new ArrayList();
                while (r8.A0p() != C13120hv.END_ARRAY) {
                    if (r8.A0g() == C13120hv.VALUE_NULL) {
                        A0t2 = null;
                    } else {
                        A0t2 = r8.A0t();
                    }
                    if (A0t2 != null) {
                        arrayList.add(A0t2);
                    }
                }
            } else {
                arrayList = null;
            }
            skywalkerCommand.mUnsubscribeTopics = arrayList;
            return true;
        } else if (!"pub".equals(str)) {
            return false;
        } else {
            if (r8.A0g() == C13120hv.START_OBJECT) {
                hashMap = new HashMap();
                while (r8.A0p() != C13120hv.END_OBJECT) {
                    String A0t4 = r8.A0t();
                    r8.A0p();
                    C13120hv A0g = r8.A0g();
                    C13120hv r0 = C13120hv.VALUE_NULL;
                    if (A0g == r0) {
                        hashMap.put(A0t4, (Object) null);
                    } else {
                        if (A0g == r0) {
                            A0t = null;
                        } else {
                            A0t = r8.A0t();
                        }
                        if (A0t != null) {
                            hashMap.put(A0t4, A0t);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            skywalkerCommand.mPublishTopicToPayload = hashMap;
            return true;
        }
    }

    public static SkywalkerCommand parseFromJson(C13080hr r3) {
        SkywalkerCommand skywalkerCommand = new SkywalkerCommand();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(skywalkerCommand, A0i, r3);
            r3.A0f();
        }
        return skywalkerCommand;
    }

    public static SkywalkerCommand parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(SkywalkerCommand skywalkerCommand) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, skywalkerCommand, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r3, SkywalkerCommand skywalkerCommand, boolean z) {
        if (z) {
            r3.A0T();
        }
        if (skywalkerCommand.mSubscribeTopics != null) {
            r3.A0d("sub");
            r3.A0S();
            for (String str : skywalkerCommand.mSubscribeTopics) {
                if (str != null) {
                    r3.A0g(str);
                }
            }
            r3.A0P();
        }
        if (skywalkerCommand.mUnsubscribeTopics != null) {
            r3.A0d("unsub");
            r3.A0S();
            for (String str2 : skywalkerCommand.mUnsubscribeTopics) {
                if (str2 != null) {
                    r3.A0g(str2);
                }
            }
            r3.A0P();
        }
        if (skywalkerCommand.mPublishTopicToPayload != null) {
            r3.A0d("pub");
            r3.A0T();
            for (Map.Entry entry : skywalkerCommand.mPublishTopicToPayload.entrySet()) {
                r3.A0d((String) entry.getKey());
                if (entry.getValue() == null) {
                    r3.A0R();
                } else {
                    r3.A0g((String) entry.getValue());
                }
            }
            r3.A0Q();
        }
        if (z) {
            r3.A0Q();
        }
    }
}
