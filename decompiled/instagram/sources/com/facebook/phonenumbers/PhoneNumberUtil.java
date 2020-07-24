package com.facebook.phonenumbers;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass3J0;
import p000X.AnonymousClass3J1;
import p000X.AnonymousClass3J2;
import p000X.AnonymousClass3J3;
import p000X.AnonymousClass3M3;
import p000X.AnonymousClass3M4;
import p000X.AnonymousClass3M5;
import p000X.AnonymousClass3M6;
import p000X.AnonymousClass3M7;
import p000X.AnonymousClass3M8;
import p000X.AnonymousClass3M9;
import p000X.AnonymousClass3MA;
import p000X.AnonymousClass3MB;
import p000X.AnonymousClass3MD;
import p000X.AnonymousClass3NG;
import p000X.C45471xw;
import p000X.C73223Iz;

public final class PhoneNumberUtil {
    public static PhoneNumberUtil A07;
    public static Pattern A08;
    public static Pattern A09;
    public static Pattern A0A;
    public static Pattern A0B;
    public static Pattern A0C;
    public static Pattern A0D;
    public static Pattern A0E;
    public static Pattern A0F;
    public static Pattern A0G;
    public static Pattern A0H;
    public static Pattern A0I;
    public static final AnonymousClass3NG A0J = new AnonymousClass3M3();
    public static final AnonymousClass3M5 A0K = new AnonymousClass3M6();
    public static final AnonymousClass3M5 A0L = new AnonymousClass3M7();
    public static final AnonymousClass3M5 A0M = new AnonymousClass3M4();
    public static final Logger A0N = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final AnonymousClass3M5 A0O = new AnonymousClass3M9();
    public static final AnonymousClass3M5 A0P = new AnonymousClass3M8();
    public final AnonymousClass3NG A00;
    public final AnonymousClass3MA A01;
    public final AnonymousClass3MD A02 = new AnonymousClass3MD();
    public final String A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Context A05;
    public final Map A06 = Collections.synchronizedMap(new HashMap());

    public PhoneNumberUtil(AnonymousClass3NG r3, AnonymousClass3MA r4, Context context) {
        this.A05 = context;
        this.A03 = "PhoneNumberMetadataProto";
        this.A00 = r3;
        this.A01 = r4;
    }

    private int A00(String str) {
        int A002 = this.A01.A00(str);
        if (A002 != -1) {
            return A002;
        }
        AnonymousClass3J1 A0E2 = A0E(str);
        if (A0E2 != null) {
            AnonymousClass3MA r3 = this.A01;
            int i = A0E2.A00;
            if (str == null || str.length() == 0 || i < 0 || i > 32767) {
                throw new IllegalArgumentException();
            }
            boolean z = false;
            if (r3.A00(str) != -1) {
                z = true;
            }
            if (!z) {
                synchronized (r3) {
                    if (r3.A00 == null) {
                        r3.A00 = new HashMap();
                    }
                    if (!r3.A00.containsKey(str)) {
                        r3.A00.put(str, Integer.valueOf(i));
                    }
                }
            }
            return A0E2.A00;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid region code: ", str));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized com.facebook.phonenumbers.PhoneNumberUtil A01(android.content.Context r5) {
        /*
            java.lang.Class<com.facebook.phonenumbers.PhoneNumberUtil> r4 = com.facebook.phonenumbers.PhoneNumberUtil.class
            monitor-enter(r4)
            com.facebook.phonenumbers.PhoneNumberUtil r0 = A07     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0022
            android.content.Context r3 = r5.getApplicationContext()     // Catch:{ all -> 0x0026 }
            X.3NH r2 = new X.3NH     // Catch:{ all -> 0x0026 }
            r2.<init>(r3)     // Catch:{ all -> 0x0026 }
            com.facebook.phonenumbers.PhoneNumberUtil r1 = new com.facebook.phonenumbers.PhoneNumberUtil     // Catch:{ all -> 0x0026 }
            X.3MA r0 = new X.3MA     // Catch:{ all -> 0x0026 }
            r0.<init>()     // Catch:{ all -> 0x0026 }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0026 }
            monitor-enter(r4)     // Catch:{ all -> 0x0026 }
            A07 = r1     // Catch:{ all -> 0x001e }
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0021:
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
        L_0x0022:
            com.facebook.phonenumbers.PhoneNumberUtil r0 = A07     // Catch:{ all -> 0x0026 }
            monitor-exit(r4)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A01(android.content.Context):com.facebook.phonenumbers.PhoneNumberUtil");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return (p000X.AnonymousClass3J1) r5.A04.get(r2);
     */
    public static AnonymousClass3J1 A02(PhoneNumberUtil phoneNumberUtil, int i, String str) {
        if (!"001".equals(str)) {
            return phoneNumberUtil.A0E(str);
        }
        synchronized (phoneNumberUtil.A04) {
            boolean z = false;
            if (Arrays.binarySearch(AnonymousClass3MB.A01, (short) i) >= 0) {
                z = true;
            }
            if (!z) {
                return null;
            }
            Map map = phoneNumberUtil.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                phoneNumberUtil.A0K(phoneNumberUtil.A03, "001", i, phoneNumberUtil.A00);
            }
        }
    }

    private Integer A03(String str, AnonymousClass3J1 r3) {
        if (A0M(str, r3.A04)) {
            if (A0M(str, r3.A09)) {
                return Constants.A0Y;
            }
            if (A0M(str, r3.A0D)) {
                return Constants.A0N;
            }
            if (A0M(str, r3.A0A)) {
                return Constants.A0j;
            }
            if (A0M(str, r3.A0G)) {
                return Constants.A0u;
            }
            if (A0M(str, r3.A08)) {
                return Constants.A12;
            }
            if (A0M(str, r3.A07)) {
                return Constants.A14;
            }
            if (A0M(str, r3.A0E)) {
                return Constants.A15;
            }
            if (A0M(str, r3.A0F)) {
                return Constants.A02;
            }
            if (A0M(str, r3.A03)) {
                if (r3.A0q || A0M(str, r3.A05)) {
                    return Constants.A0C;
                }
                return Constants.ZERO;
            } else if (!r3.A0q && A0M(str, r3.A05)) {
                return Constants.ONE;
            }
        }
        return Constants.A03;
    }

    public static final String A05(C73223Iz r3) {
        StringBuilder sb = new StringBuilder();
        if (r3.A0F) {
            char[] cArr = new char[r3.A01];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(r3.A02);
        return sb.toString();
    }

    public static String A06(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                sb.append(digit2);
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r2.matcher(r4).lookingAt() == false) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c0  */
    public static void A08(PhoneNumberUtil phoneNumberUtil, String str, String str2, boolean z, boolean z2, C73223Iz r17) {
        String str3;
        String str4;
        AnonymousClass3J1 A0E2;
        StringBuilder sb;
        int i;
        boolean z3;
        String substring;
        if (str == null) {
            throw new C45471xw(Constants.ONE, "The phone number supplied was null.");
        } else if (str.length() <= 250) {
            StringBuilder sb2 = new StringBuilder();
            int indexOf = str.indexOf(";phone-context=");
            if (indexOf > 0) {
                int i2 = indexOf + 15;
                if (str.charAt(i2) == '+') {
                    int indexOf2 = str.indexOf(59, i2);
                    if (indexOf2 > 0) {
                        substring = str.substring(i2, indexOf2);
                    } else {
                        substring = str.substring(i2);
                    }
                    sb2.append(substring);
                }
                int indexOf3 = str.indexOf("tel:");
                int i3 = indexOf3 + 4;
                if (indexOf3 < 0) {
                    i3 = 0;
                }
                sb2.append(str.substring(i3, indexOf));
            } else {
                Pattern pattern = A0I;
                if (pattern == null) {
                    pattern = Pattern.compile("[+＋\\p{Nd}]", 0);
                }
                A0I = pattern;
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    str3 = str.substring(matcher.start());
                    Pattern pattern2 = A0F;
                    if (pattern2 == null) {
                        pattern2 = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$", 0);
                    }
                    A0F = pattern2;
                    Matcher matcher2 = pattern2.matcher(str3);
                    if (matcher2.find()) {
                        str3 = str3.substring(0, matcher2.start());
                        A0N.log(Level.FINER, AnonymousClass000.A0E("Stripped trailing characters: ", str3));
                    }
                    Pattern pattern3 = A0D;
                    if (pattern3 == null) {
                        pattern3 = Pattern.compile("[\\\\/] *x", 0);
                    }
                    A0D = pattern3;
                    Matcher matcher3 = pattern3.matcher(str3);
                    if (matcher3.find()) {
                        str3 = str3.substring(0, matcher3.start());
                    }
                } else {
                    str3 = "";
                }
                sb2.append(str3);
            }
            int indexOf4 = sb2.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb2.delete(indexOf4, sb2.length());
            }
            if (A0A(sb2.toString())) {
                PhoneNumberUtil phoneNumberUtil2 = phoneNumberUtil;
                if (z2) {
                    String sb3 = sb2.toString();
                    if (!phoneNumberUtil.A01.A02(str2)) {
                        if (!(sb3 == null || sb3.length() == 0)) {
                            Pattern pattern4 = A0C;
                            if (pattern4 == null) {
                                pattern4 = Pattern.compile("[+＋]+", 0);
                            }
                            A0C = pattern4;
                        }
                        z3 = false;
                        if (!z3) {
                            throw new C45471xw(Constants.ZERO, "Missing or invalid default region.");
                        }
                    }
                    z3 = true;
                    if (!z3) {
                    }
                }
                boolean z4 = z;
                C73223Iz r12 = r17;
                if (z) {
                    if (str != null) {
                        r12.A0E = true;
                        r12.A06 = str;
                    }
                    throw null;
                }
                Pattern pattern5 = A09;
                if (pattern5 == null) {
                    pattern5 = Pattern.compile("(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$", 66);
                }
                A09 = pattern5;
                Matcher matcher4 = pattern5.matcher(sb2);
                if (matcher4.find() && A0A(sb2.substring(0, matcher4.start()))) {
                    int groupCount = matcher4.groupCount();
                    int i4 = 1;
                    while (true) {
                        if (i4 > groupCount) {
                            break;
                        } else if (matcher4.group(i4) != null) {
                            str4 = matcher4.group(i4);
                            sb2.delete(matcher4.start(), sb2.length());
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (str4.length() > 0) {
                        if (str4 != null) {
                            r12.A09 = true;
                            r12.A04 = str4;
                        }
                        throw null;
                    }
                    A0E2 = phoneNumberUtil2.A0E(str2);
                    sb = new StringBuilder();
                    i = phoneNumberUtil2.A0C(sb2.toString(), A0E2, sb, z4, r12);
                    if (i == 0) {
                        String A0H2 = phoneNumberUtil2.A0H(i);
                        if (!A0H2.equals(str2)) {
                            A0E2 = A02(phoneNumberUtil2, i, A0H2);
                        }
                    } else {
                        A09(sb2);
                        sb.append(sb2);
                        if (str2 != null) {
                            int i5 = A0E2.A00;
                            r12.A07 = true;
                            r12.A00 = i5;
                        } else if (z) {
                            r12.A08 = false;
                            r12.A03 = Constants.ZERO;
                        }
                    }
                    if (sb.length() >= 2) {
                        if (A0E2 != null) {
                            StringBuilder sb4 = new StringBuilder();
                            StringBuilder sb5 = new StringBuilder(sb);
                            phoneNumberUtil2.A0N(sb5, A0E2, sb4);
                            boolean z5 = false;
                            if (A04(phoneNumberUtil2.A02.A00(A0E2.A04.A02), sb5.toString()) == Constants.A0C) {
                                z5 = true;
                            }
                            if (!z5) {
                                if (z) {
                                    String sb6 = sb4.toString();
                                    if (sb6 != null) {
                                        r12.A0D = true;
                                        r12.A05 = sb6;
                                    }
                                    throw null;
                                }
                                sb = sb5;
                            }
                        }
                        int length = sb.length();
                        if (length >= 2) {
                            if (length <= 17) {
                                String sb7 = sb.toString();
                                int length2 = sb7.length();
                                if (length2 > 1 && sb7.charAt(0) == '0') {
                                    int i6 = 1;
                                    r12.A0A = true;
                                    r12.A0F = true;
                                    while (i6 < length2 - 1 && sb7.charAt(i6) == '0') {
                                        i6++;
                                    }
                                    if (i6 != 1) {
                                        r12.A0C = true;
                                        r12.A01 = i6;
                                    }
                                }
                                long parseLong = Long.parseLong(sb.toString());
                                r12.A0B = true;
                                r12.A02 = parseLong;
                                return;
                            }
                            throw new C45471xw(Constants.A0Y, "The string supplied is too long to be a phone number.");
                        }
                    }
                    throw new C45471xw(Constants.A0N, "The string supplied is too short to be a phone number.");
                }
                str4 = "";
                if (str4.length() > 0) {
                }
                A0E2 = phoneNumberUtil2.A0E(str2);
                sb = new StringBuilder();
                try {
                    i = phoneNumberUtil2.A0C(sb2.toString(), A0E2, sb, z4, r12);
                } catch (C45471xw e) {
                    Pattern pattern6 = A0C;
                    if (pattern6 == null) {
                        pattern6 = Pattern.compile("[+＋]+", 0);
                    }
                    A0C = pattern6;
                    Matcher matcher5 = pattern6.matcher(sb2.toString());
                    if (e.A00 != Constants.ZERO || !matcher5.lookingAt()) {
                        throw new C45471xw(e.A00, e.getMessage());
                    }
                    i = phoneNumberUtil2.A0C(sb2.substring(matcher5.end()), A0E2, sb, z4, r12);
                    if (i == 0) {
                        throw new C45471xw(Constants.ZERO, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i == 0) {
                }
                if (sb.length() >= 2) {
                }
                throw new C45471xw(Constants.A0N, "The string supplied is too short to be a phone number.");
            }
            throw new C45471xw(Constants.ONE, "The string supplied did not seem to be a phone number.");
        } else {
            throw new C45471xw(Constants.A0Y, "The string supplied was too long to parse.");
        }
    }

    public final int A0B(String str) {
        if (this.A01.A02(str)) {
            return A00(str);
        }
        Logger logger = A0N;
        Level level = Level.WARNING;
        if (str == null) {
            str = "null";
        }
        logger.log(level, AnonymousClass000.A0J("Invalid or missing region code (", str, ") provided."));
        return 0;
    }

    public final AnonymousClass3J1 A0E(String str) {
        if (!this.A01.A02(str)) {
            return null;
        }
        synchronized (this.A06) {
            if (!this.A06.containsKey(str)) {
                A0K(this.A03, str, 0, this.A00);
            }
        }
        return (AnonymousClass3J1) this.A06.get(str);
    }

    public final C73223Iz A0F(String str, String str2) {
        C73223Iz r5 = new C73223Iz();
        A08(this, str, str2, false, true, r5);
        return r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r2 == r1) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r1.endsWith(r2) != false) goto L_0x009e;
     */
    public final Integer A0G(C73223Iz r6, C73223Iz r7) {
        boolean z;
        C73223Iz r4 = new C73223Iz();
        r4.A00(r6);
        C73223Iz r3 = new C73223Iz();
        r3.A00(r7);
        r4.A0E = false;
        r4.A06 = "";
        r4.A08 = false;
        Integer num = Constants.ZERO;
        r4.A03 = num;
        r4.A0D = false;
        r4.A05 = "";
        r3.A0E = false;
        r3.A06 = "";
        r3.A08 = false;
        r3.A03 = num;
        r3.A0D = false;
        r3.A05 = "";
        if (r4.A09 && r4.A04.length() == 0) {
            r4.A09 = false;
            r4.A04 = "";
        }
        if (r3.A09 && r3.A04.length() == 0) {
            r3.A09 = false;
            r3.A04 = "";
        }
        if (!r4.A09 || !r3.A09 || r4.A04.equals(r3.A04)) {
            int i = r4.A00;
            int i2 = r3.A00;
            if (i == 0 || i2 == 0) {
                r4.A07 = true;
                r4.A00 = i2;
                if (r4.A01(r3)) {
                    return Constants.A0N;
                }
            } else if (r4.A01(r3)) {
                return Constants.A0Y;
            }
            String valueOf = String.valueOf(r4.A02);
            String valueOf2 = String.valueOf(r3.A02);
            if (!valueOf.endsWith(valueOf2)) {
                z = false;
            }
            z = true;
            if (z) {
                return Constants.A0C;
            }
        }
        return Constants.ONE;
    }

    public final String A0H(int i) {
        int i2;
        int binarySearch = Arrays.binarySearch(AnonymousClass3MB.A01, (short) i);
        if (binarySearch < 0) {
            i2 = -1;
        } else {
            while (binarySearch >= 0 && AnonymousClass3MB.A01[binarySearch] == i) {
                binarySearch--;
            }
            i2 = binarySearch + 1;
        }
        if (i2 >= 0) {
            return AnonymousClass3MB.A00[i2];
        }
        return "ZZ";
    }

    public final String A0I(C73223Iz r7) {
        int i = r7.A00;
        List<String> A012 = this.A01.A01(i);
        if (A012 == null) {
            A0N.log(Level.WARNING, AnonymousClass000.A0A("Missing/invalid country_code (", i, ") for number ", A05(r7)));
            return null;
        } else if (A012.size() == 1) {
            return (String) A012.get(0);
        } else {
            String A052 = A05(r7);
            for (String str : A012) {
                AnonymousClass3J1 A0E2 = A0E(str);
                if (A0E2.A0V) {
                    if (this.A02.A00(A0E2.A0J).matcher(A052).lookingAt()) {
                        return str;
                    }
                } else if (A03(A052, A0E2) != Constants.A03) {
                    return str;
                }
            }
            return null;
        }
    }

    public final String A0J(C73223Iz r10, Integer num) {
        List list;
        String str;
        if (r10.A02 == 0 && r10.A0E) {
            String str2 = r10.A06;
            if (str2.length() > 0) {
                return str2;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i = r10.A00;
        String A052 = A05(r10);
        Integer num2 = Constants.ZERO;
        if (num == num2) {
            sb.append(A052);
            A07(i, num2, sb);
        } else {
            boolean z = false;
            if (Arrays.binarySearch(AnonymousClass3MB.A01, (short) i) >= 0) {
                z = true;
            }
            if (!z) {
                sb.append(A052);
            } else {
                AnonymousClass3J1 A022 = A02(this, i, A0H(i));
                if (A022.A0P.size() == 0 || num == Constants.A0C) {
                    list = A022.A0Q;
                } else {
                    list = A022.A0P;
                }
                AnonymousClass3J3 A0D2 = A0D(list, A052);
                if (A0D2 != null) {
                    String str3 = A0D2.A01;
                    Matcher matcher = this.A02.A00(A0D2.A03).matcher(A052);
                    Integer num3 = Constants.A0C;
                    String str4 = A0D2.A02;
                    if (num != num3 || str4 == null || str4.length() <= 0) {
                        A052 = matcher.replaceAll(str3);
                    } else {
                        Pattern pattern = A0B;
                        if (pattern == null) {
                            pattern = Pattern.compile("(\\$\\d)", 0);
                        }
                        A0B = pattern;
                        A052 = matcher.replaceAll(pattern.matcher(str3).replaceFirst(str4));
                    }
                    if (num == Constants.A0N) {
                        Pattern pattern2 = A0E;
                        if (pattern2 == null) {
                            pattern2 = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+", 0);
                        }
                        A0E = pattern2;
                        Matcher matcher2 = pattern2.matcher(A052);
                        if (matcher2.lookingAt()) {
                            A052 = matcher2.replaceFirst("");
                        }
                        A052 = matcher2.reset(A052).replaceAll("-");
                    }
                }
                sb.append(A052);
                if (r10.A09) {
                    String str5 = r10.A04;
                    if (str5.length() > 0) {
                        if (num == Constants.A0N) {
                            str = ";ext=";
                        } else if (A022.A0d) {
                            str = A022.A0N;
                        } else {
                            str = " ext. ";
                        }
                        sb.append(str);
                        sb.append(str5);
                    }
                }
                A07(i, num, sb);
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005e */
    public final void A0K(String str, String str2, int i, AnonymousClass3NG r14) {
        String str3;
        ObjectInputStream objectInputStream;
        boolean equals = "001".equals(str2);
        if (equals) {
            str3 = String.valueOf(i);
        } else {
            str3 = str2;
        }
        String A0N2 = AnonymousClass000.A0N("libphone_data/", str, "_", str3);
        InputStream Aiv = r14.Aiv(A0N2);
        if (Aiv != null) {
            try {
                objectInputStream = new ObjectInputStream(Aiv);
                AnonymousClass3J0 r6 = new AnonymousClass3J0();
                try {
                    r6.readExternal(objectInputStream);
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                        A0N.log(Level.WARNING, "error closing input stream (ignored)", e);
                    } catch (Throwable ) {
                    }
                } catch (IOException e2) {
                    A0N.log(Level.WARNING, "error reading input (ignored)", e2);
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                        A0N.log(Level.WARNING, "error closing input stream (ignored)", e3);
                    }
                } catch (Throwable ) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e4) {
                        A0N.log(Level.WARNING, "error closing input stream (ignored)", e4);
                    }
                }
                List list = r6.A00;
                if (!list.isEmpty()) {
                    if (list.size() > 1) {
                        A0N.log(Level.WARNING, AnonymousClass000.A0E("invalid metadata (too many entries): ", A0N2));
                    }
                    AnonymousClass3J1 r2 = (AnonymousClass3J1) list.get(0);
                    if (equals) {
                        this.A04.put(Integer.valueOf(i), r2);
                    } else {
                        this.A06.put(str2, r2);
                    }
                } else {
                    A0N.log(Level.SEVERE, AnonymousClass000.A0E("empty metadata: ", A0N2));
                    throw new IllegalStateException(AnonymousClass000.A0E("empty metadata: ", A0N2));
                }
            } catch (IOException e5) {
                A0N.log(Level.SEVERE, AnonymousClass000.A0E("cannot load/parse metadata: ", A0N2), e5);
                throw new RuntimeException(AnonymousClass000.A0E("cannot load/parse metadata: ", A0N2), e5);
            }
        } else {
            A0N.log(Level.SEVERE, AnonymousClass000.A0E("missing metadata: ", A0N2));
            throw new IllegalStateException(AnonymousClass000.A0E("missing metadata: ", A0N2));
        }
    }

    public final boolean A0M(String str, AnonymousClass3J2 r5) {
        Matcher matcher = this.A02.A00(r5.A01).matcher(str);
        if (!this.A02.A00(r5.A02).matcher(str).matches() || !matcher.matches()) {
            return false;
        }
        return true;
    }

    public static Integer A04(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return Constants.ZERO;
        }
        if (matcher.lookingAt()) {
            return Constants.A0N;
        }
        return Constants.A0C;
    }

    public static void A07(int i, Integer num, StringBuilder sb) {
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
                sb.insert(0, " ");
                break;
            case 3:
                sb.insert(0, "-");
                sb.insert(0, i);
                sb.insert(0, '+');
                sb.insert(0, "tel:");
                return;
            default:
                return;
        }
        sb.insert(0, i);
        sb.insert(0, '+');
    }

    public static void A09(StringBuilder sb) {
        String str;
        String sb2 = sb.toString();
        Pattern pattern = A0G;
        if (pattern == null) {
            pattern = Pattern.compile("(?:.*?[A-Za-z]){3}.*", 0);
        }
        A0G = pattern;
        if (pattern.matcher(sb2).matches()) {
            AnonymousClass3M5 r5 = A0L;
            int length = sb2.length();
            StringBuilder sb3 = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char AEw = r5.AEw(Character.toUpperCase(sb2.charAt(i)), 55296);
                if (AEw != 55296) {
                    sb3.append(AEw);
                }
            }
            str = sb3.toString();
        } else {
            str = A06(sb2);
        }
        sb.replace(0, sb.length(), str);
    }

    public static boolean A0A(String str) {
        if (str.length() < 2) {
            return false;
        }
        Pattern pattern = A0H;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\\p{Nd}]*(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        }
        A0H = pattern;
        return pattern.matcher(str).matches();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3  */
    public final int A0C(String str, AnonymousClass3J1 r11, StringBuilder sb, boolean z, C73223Iz r14) {
        String str2;
        Integer num;
        int i;
        boolean z2;
        if (str.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (r11 != null) {
            str2 = r11.A0I;
        } else {
            str2 = "NonMatch";
        }
        if (sb2.length() != 0) {
            Pattern pattern = A0C;
            if (pattern == null) {
                pattern = Pattern.compile("[+＋]+", 0);
            }
            A0C = pattern;
            Matcher matcher = pattern.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                A09(sb2);
                num = Constants.ZERO;
            } else {
                Pattern A002 = this.A02.A00(str2);
                A09(sb2);
                Matcher matcher2 = A002.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Pattern pattern2 = A08;
                    if (pattern2 == null) {
                        pattern2 = Pattern.compile("(\\p{Nd})", 0);
                    }
                    A08 = pattern2;
                    Matcher matcher3 = pattern2.matcher(sb2.substring(end));
                    if (!matcher3.find() || !A06(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                        z2 = true;
                        if (z2) {
                            num = Constants.ONE;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            if (z) {
                if (num != null) {
                    r14.A08 = true;
                    r14.A03 = num;
                } else {
                    throw null;
                }
            }
            if (num != Constants.A0N) {
                if (r11 != null) {
                    i = r11.A00;
                    String valueOf = String.valueOf(i);
                    String sb3 = sb2.toString();
                    if (sb3.startsWith(valueOf)) {
                        StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                        AnonymousClass3J2 r8 = r11.A04;
                        Pattern A003 = this.A02.A00(r8.A01);
                        A0N(sb4, r11, (StringBuilder) null);
                        Pattern A004 = this.A02.A00(r8.A02);
                        if ((!A003.matcher(sb2).matches() && A003.matcher(sb4).matches()) || A04(A004, sb2.toString()) == Constants.A0N) {
                            sb.append(sb4);
                            if (z) {
                                Integer num2 = Constants.A0C;
                                if (num2 != null) {
                                    r14.A08 = true;
                                    r14.A03 = num2;
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                }
                r14.A07 = true;
                r14.A00 = 0;
                return 0;
            } else if (sb2.length() > 2) {
                if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                    int length = sb2.length();
                    int i2 = 1;
                    while (true) {
                        if (i2 > 3 || i2 > length) {
                            break;
                        }
                        i = Integer.parseInt(sb2.substring(0, i2));
                        boolean z3 = false;
                        if (Arrays.binarySearch(AnonymousClass3MB.A01, (short) i) >= 0) {
                            z3 = true;
                        }
                        if (z3) {
                            sb.append(sb2.substring(i2));
                            break;
                        }
                        i2++;
                    }
                    if (i == 0) {
                        throw new C45471xw(Constants.ZERO, "Country calling code supplied was not recognised.");
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else {
                throw new C45471xw(Constants.A0C, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            r14.A07 = true;
            r14.A00 = i;
            return i;
        }
        num = Constants.A0N;
        if (z) {
        }
        if (num != Constants.A0N) {
        }
        r14.A07 = true;
        r14.A00 = i;
        return i;
    }

    public final AnonymousClass3J3 A0D(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3J3 r3 = (AnonymousClass3J3) it.next();
            int size = r3.A04.size();
            if (size != 0) {
                if (!this.A02.A00((String) r3.A04.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.A02.A00(r3.A03).matcher(str).matches()) {
                return r3;
            }
        }
        return null;
    }

    public final boolean A0L(C73223Iz r6) {
        String A0I2 = A0I(r6);
        int i = r6.A00;
        AnonymousClass3J1 A022 = A02(this, i, A0I2);
        if (A022 == null || ((!"001".equals(A0I2) && i != A00(A0I2)) || A03(A05(r6), A022) == Constants.A03)) {
            return false;
        }
        return true;
    }

    public final boolean A0N(StringBuilder sb, AnonymousClass3J1 r12, StringBuilder sb2) {
        int length = sb.length();
        String str = r12.A0K;
        if (!(length == 0 || str.length() == 0)) {
            Matcher matcher = this.A02.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A002 = this.A02.A00(r12.A04.A01);
                boolean matches = A002.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String str2 = r12.A0L;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!matches || A002.matcher(sb3.toString()).matches()) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else if (matches && !A002.matcher(sb.substring(matcher.end())).matches()) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }
}
