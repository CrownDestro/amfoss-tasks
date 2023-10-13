package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.p008os.C0548d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p041f3.C1920g;
import p041f3.C1924k;
import p065j0.C2312c;
import p110q3.C3034f;
import p127t2.C3183o;

/* renamed from: androidx.lifecycle.x */
public final class C1026x {

    /* renamed from: f */
    public static final C1027a f3457f = new C1027a((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Class<? extends Object>[] f3458g;

    /* renamed from: a */
    private final Map<String, Object> f3459a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C2312c.C2315c> f3460b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, Object> f3461c = new LinkedHashMap();

    /* renamed from: d */
    private final Map<String, C3034f<Object>> f3462d = new LinkedHashMap();

    /* renamed from: e */
    private final C2312c.C2315c f3463e = new C1025w(this);

    /* renamed from: androidx.lifecycle.x$a */
    public static final class C1027a {
        private C1027a() {
        }

        public /* synthetic */ C1027a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo3834a(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1026x.f3458g) {
                C1924k.m9138d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<? extends java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.lifecycle.x$a r0 = new androidx.lifecycle.x$a
            r1 = 0
            r0.<init>(r1)
            f3457f = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            java.lang.Class<int[]> r3 = int[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 6
            r0[r3] = r2
            r2 = 7
            java.lang.Class<long[]> r3 = long[].class
            r0[r2] = r3
            r2 = 8
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            r2 = 9
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r0[r2] = r3
            r2 = 10
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            r0[r2] = r3
            r2 = 11
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 12
            r0[r3] = r2
            r2 = 13
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Character.TYPE
            r3 = 14
            r0[r3] = r2
            r2 = 15
            java.lang.Class<char[]> r3 = char[].class
            r0[r2] = r3
            r2 = 16
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r2] = r3
            r2 = 17
            java.lang.Class<java.lang.CharSequence[]> r3 = java.lang.CharSequence[].class
            r0[r2] = r3
            r2 = 18
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 19
            r0[r3] = r2
            r2 = 20
            java.lang.Class<float[]> r3 = float[].class
            r0[r2] = r3
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r3 = 21
            r0[r3] = r2
            r2 = 22
            java.lang.Class<android.os.Parcelable[]> r4 = android.os.Parcelable[].class
            r0[r2] = r4
            r2 = 23
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            r0[r2] = r4
            java.lang.Class r2 = java.lang.Short.TYPE
            r4 = 24
            r0[r4] = r2
            r2 = 25
            java.lang.Class<short[]> r4 = short[].class
            r0[r2] = r4
            r2 = 26
            java.lang.Class<android.util.SparseArray> r4 = android.util.SparseArray.class
            r0[r2] = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x00ad
            java.lang.Class<android.util.Size> r4 = android.util.Size.class
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            r5 = 27
            r0[r5] = r4
            r4 = 28
            if (r2 < r3) goto L_0x00b8
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
        L_0x00b8:
            r0[r4] = r1
            f3458g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1026x.<clinit>():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m4531d(C1026x xVar) {
        C1924k.m9141g(xVar, "this$0");
        for (Map.Entry entry : C3248c0.m14291i(xVar.f3460b).entrySet()) {
            xVar.mo3833e((String) entry.getKey(), ((C2312c.C2315c) entry.getValue()).mo153a());
        }
        Set<String> keySet = xVar.f3459a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(xVar.f3459a.get(next));
        }
        return C0548d.m2516a(C3183o.m14061a("keys", arrayList), C3183o.m14061a("values", arrayList2));
    }

    /* renamed from: c */
    public final C2312c.C2315c mo3832c() {
        return this.f3463e;
    }

    /* renamed from: e */
    public final <T> void mo3833e(String str, T t) {
        C1924k.m9141g(str, "key");
        if (f3457f.mo3834a(t)) {
            Object obj = this.f3461c.get(str);
            C1012r rVar = obj instanceof C1012r ? (C1012r) obj : null;
            if (rVar != null) {
                rVar.mo3744i(t);
            } else {
                this.f3459a.put(str, t);
            }
            C3034f fVar = this.f3462d.get(str);
            if (fVar != null) {
                fVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C1924k.m9138d(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }
}
