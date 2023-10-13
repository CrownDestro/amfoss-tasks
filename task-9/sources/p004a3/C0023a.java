package p004a3;

import p041f3.C1924k;
import p163z2.C3628a;

/* renamed from: a3.a */
public class C0023a extends C3628a {

    /* renamed from: a3.a$a */
    private static final class C0024a {

        /* renamed from: a */
        public static final C0024a f111a = new C0024a();

        /* renamed from: b */
        public static final Integer f112b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                a3.a$a r0 = new a3.a$a
                r0.<init>()
                f111a = r0
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
                f112b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p004a3.C0023a.C0024a.<clinit>():void");
        }

        private C0024a() {
        }
    }

    /* renamed from: c */
    private final boolean m84c(int i) {
        Integer num = C0024a.f112b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void mo57a(Throwable th, Throwable th2) {
        C1924k.m9141g(th, "cause");
        C1924k.m9141g(th2, "exception");
        if (m84c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo57a(th, th2);
        }
    }
}
