package p035e4;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: e4.f */
public class C1805f extends C1809h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f6647d;

    /* renamed from: e */
    public static final C1806a f6648e = new C1806a((C1920g) null);

    /* renamed from: e4.f$a */
    public static final class C1806a {
        private C1806a() {
        }

        public /* synthetic */ C1806a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1805f mo7492a() {
            if (mo7493b()) {
                return new C1805f();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo7493b() {
            return C1805f.f6647d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            e4.f$a r0 = new e4.f$a
            r1 = 0
            r0.<init>(r1)
            f6648e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = p086m3.C2645o.m11977i(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = 0
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            f6647d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035e4.C1805f.<clinit>():void");
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b = C1809h.f6654c.mo7499b(list);
        C1924k.m9137c(sSLParameters, "sslParameters");
        Object[] array = b.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (C1924k.m9136b(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
