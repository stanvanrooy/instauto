package com.facebook.react.bridge;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.systrace.SystraceMessage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p000X.A3L;
import p000X.A4D;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0ZJ;
import p000X.C08750Yk;
import p000X.C23041A0r;
import p000X.C23072A4q;

public class JavaModuleWrapper {
    public final ArrayList mDescs = new ArrayList();
    public final C23072A4q mJSInstance;
    public final ArrayList mMethods = new ArrayList();
    public final ModuleHolder mModuleHolder;

    public class MethodDescriptor {
        public Method method;
        public String name;
        public String signature;
        public String type;

        public MethodDescriptor() {
        }
    }

    private void findMethods() {
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "findMethods", -165039546);
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    A4D a4d = new A4D(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    String str = a4d.A02;
                    methodDescriptor.type = str;
                    if (str == BaseJavaModule.METHOD_TYPE_SYNC) {
                        if (!a4d.A03) {
                            A4D.A01(a4d);
                        }
                        String str2 = a4d.A01;
                        AnonymousClass0FY.A00(str2);
                        methodDescriptor.signature = str2;
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(a4d);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException(AnonymousClass000.A0N("Java Module ", this.mModuleHolder.mName, " method name already registered: ", name));
                }
            }
        }
        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 960541033);
    }

    public NativeMap getConstants() {
        ModuleHolder moduleHolder = this.mModuleHolder;
        if (!moduleHolder.mReactModuleInfo.A03) {
            return null;
        }
        String str = moduleHolder.mName;
        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "JavaModuleWrapper.getConstants");
        A02.A01("moduleName", str);
        A02.A02();
        ReactMarker.logMarker(A3L.GET_CONSTANTS_START, str, 0);
        BaseJavaModule module = getModule();
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "module.getConstants", -359872348);
        Map constants = module.getConstants();
        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1074781008);
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "create WritableNativeMap", -2004406670);
        ReactMarker.logMarker(A3L.CONVERT_CONSTANTS_START, str, 0);
        try {
            return C23041A0r.A07(constants);
        } finally {
            ReactMarker.logMarker(A3L.CONVERT_CONSTANTS_END, str, 0);
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -600930734);
            ReactMarker.logMarker(A3L.GET_CONSTANTS_END, str, 0);
            SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
        }
    }

    public List getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    public String getName() {
        return this.mModuleHolder.mName;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r1v0 int) = (r16v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public void invoke(int r16, com.facebook.react.bridge.ReadableNativeArray r17) {
        /*
            r15 = this;
            java.util.ArrayList r0 = r15.mMethods
            if (r0 == 0) goto L_0x0109
            int r0 = r0.size()
            r1 = r16
            if (r1 >= r0) goto L_0x0109
            java.util.ArrayList r0 = r15.mMethods
            java.lang.Object r2 = r0.get(r1)
            X.A4D r2 = (p000X.A4D) r2
            X.A4q r9 = r15.mJSInstance
            java.lang.String r4 = "Could not invoke "
            com.facebook.react.bridge.JavaModuleWrapper r0 = r2.A06
            com.facebook.react.bridge.ModuleHolder r0 = r0.mModuleHolder
            java.lang.String r3 = r0.mName
            java.lang.String r1 = "."
            java.lang.reflect.Method r0 = r2.A07
            java.lang.String r0 = r0.getName()
            java.lang.String r11 = p000X.AnonymousClass000.A0J(r3, r1, r0)
            r0 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r3 = "callJavaModuleMethod"
            X.0Yk r5 = com.facebook.systrace.SystraceMessage.A02(r0, r3)
            java.lang.String r3 = "method"
            r5.A01(r3, r11)
            r5.A02()
            r6 = 0
            boolean r3 = r2.A03     // Catch:{ all -> 0x0100 }
            if (r3 != 0) goto L_0x0042
            p000X.A4D.A01(r2)     // Catch:{ all -> 0x0100 }
        L_0x0042:
            java.lang.Object[] r3 = r2.A05     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x00f8
            X.A4i[] r3 = r2.A04     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x00f8
            int r5 = r2.A00     // Catch:{ all -> 0x0100 }
            r7 = r17
            int r3 = r7.size()     // Catch:{ all -> 0x0100 }
            if (r5 != r3) goto L_0x00e4
            r8 = 0
        L_0x0055:
            X.A4i[] r10 = r2.A04     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            int r3 = r10.length     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            if (r6 >= r3) goto L_0x0070
            java.lang.Object[] r5 = r2.A05     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            r3 = r10[r6]     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            java.lang.Object r3 = r3.A01(r9, r7, r8)     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            r5[r6] = r3     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            X.A4i[] r3 = r2.A04     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            r3 = r3[r6]     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            int r3 = r3.A00()     // Catch:{ UnexpectedNativeTypeException -> 0x00ab }
            int r8 = r8 + r3
            int r6 = r6 + 1
            goto L_0x0055
        L_0x0070:
            java.lang.reflect.Method r5 = r2.A07     // Catch:{ IllegalArgumentException -> 0x00a0, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x0085 }
            com.facebook.react.bridge.JavaModuleWrapper r3 = r2.A06     // Catch:{ IllegalArgumentException -> 0x00a0, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x0085 }
            com.facebook.react.bridge.BaseJavaModule r3 = r3.getModule()     // Catch:{ IllegalArgumentException -> 0x00a0, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x0085 }
            java.lang.Object[] r2 = r2.A05     // Catch:{ IllegalArgumentException -> 0x00a0, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x0085 }
            r5.invoke(r3, r2)     // Catch:{ IllegalArgumentException -> 0x00a0, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x0085 }
            X.0Yk r0 = com.facebook.systrace.SystraceMessage.A00(r0)
            r0.A02()
            return
        L_0x0085:
            r3 = move-exception
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x0100 }
            boolean r2 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00da
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x0100 }
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2     // Catch:{ all -> 0x0100 }
            throw r2     // Catch:{ all -> 0x0100 }
        L_0x0095:
            r3 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = p000X.AnonymousClass000.A0E(r4, r11)     // Catch:{ all -> 0x0100 }
            r5.<init>(r2, r3)     // Catch:{ all -> 0x0100 }
            goto L_0x00e3
        L_0x00a0:
            r3 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = p000X.AnonymousClass000.A0E(r4, r11)     // Catch:{ all -> 0x0100 }
            r5.<init>(r2, r3)     // Catch:{ all -> 0x0100 }
            goto L_0x00e3
        L_0x00ab:
            r7 = move-exception
            X.A4h r5 = new X.A4h     // Catch:{ all -> 0x0100 }
            java.lang.String r9 = r7.getMessage()     // Catch:{ all -> 0x0100 }
            java.lang.String r10 = " (constructing arguments for "
            java.lang.String r12 = " at argument index "
            X.A4i[] r2 = r2.A04     // Catch:{ all -> 0x0100 }
            r2 = r2[r6]     // Catch:{ all -> 0x0100 }
            int r2 = r2.A00()     // Catch:{ all -> 0x0100 }
            java.lang.String r6 = ""
            r4 = 1
            if (r2 <= r4) goto L_0x00d5
            java.lang.String r3 = "-"
            int r2 = r2 + r8
            int r2 = r2 - r4
            java.lang.String r13 = p000X.AnonymousClass000.A07(r6, r8, r3, r2)     // Catch:{ all -> 0x0100 }
        L_0x00cb:
            java.lang.String r14 = ")"
            java.lang.String r2 = p000X.AnonymousClass000.A0P(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0100 }
            r5.<init>(r2, r7)     // Catch:{ all -> 0x0100 }
            goto L_0x00e3
        L_0x00d5:
            java.lang.String r13 = p000X.AnonymousClass000.A05(r6, r8)     // Catch:{ all -> 0x0100 }
            goto L_0x00cb
        L_0x00da:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = p000X.AnonymousClass000.A0E(r4, r11)     // Catch:{ all -> 0x0100 }
            r5.<init>(r2, r3)     // Catch:{ all -> 0x0100 }
        L_0x00e3:
            throw r5     // Catch:{ all -> 0x0100 }
        L_0x00e4:
            X.A4h r6 = new X.A4h     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = " got "
            int r4 = r7.size()     // Catch:{ all -> 0x0100 }
            java.lang.String r3 = " arguments, expected "
            int r2 = r2.A00     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = p000X.AnonymousClass000.A0I(r11, r5, r4, r3, r2)     // Catch:{ all -> 0x0100 }
            r6.<init>(r2)     // Catch:{ all -> 0x0100 }
            throw r6     // Catch:{ all -> 0x0100 }
        L_0x00f8:
            java.lang.Error r3 = new java.lang.Error     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = "processArguments failed"
            r3.<init>(r2)     // Catch:{ all -> 0x0100 }
            throw r3     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r2 = move-exception
            X.0Yk r0 = com.facebook.systrace.SystraceMessage.A00(r0)
            r0.A02()
            throw r2
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaModuleWrapper.invoke(int, com.facebook.react.bridge.ReadableNativeArray):void");
    }

    public JavaModuleWrapper(C23072A4q a4q, ModuleHolder moduleHolder) {
        this.mJSInstance = a4q;
        this.mModuleHolder = moduleHolder;
    }
}
