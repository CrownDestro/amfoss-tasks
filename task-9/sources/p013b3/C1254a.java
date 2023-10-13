package p013b3;

import p004a3.C0023a;
import p055h3.C2020c;
import p061i3.C2096a;

/* renamed from: b3.a */
public class C1254a extends C0023a {

    /* renamed from: b3.a$a */
    private static final class C1255a {

        /* renamed from: a */
        public static final C1255a f4288a = new C1255a();

        /* renamed from: b */
        public static final Integer f4289b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                b3.a$a r0 = new b3.a$a
                r0.<init>()
                f4288a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f4289b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b3.C1254a.C1255a.<clinit>():void");
        }

        private C1255a() {
        }
    }

    /* renamed from: c */
    private final boolean m6091c(int i) {
        Integer num = C1255a.f4289b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: b */
    public C2020c mo5082b() {
        return m6091c(34) ? new C2096a() : super.mo5082b();
    }
}
