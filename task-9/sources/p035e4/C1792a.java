package p035e4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p041f3.C1920g;
import p041f3.C1924k;
import p042f4.C1937a;
import p042f4.C1939b;
import p042f4.C1946g;
import p042f4.C1950i;
import p042f4.C1952j;
import p042f4.C1953k;
import p056h4.C2025c;
import p134u3.C3299c0;

/* renamed from: e4.a */
public final class C1792a extends C1809h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f6622e = (C1809h.f6654c.mo7502h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f */
    public static final C1793a f6623f = new C1793a((C1920g) null);

    /* renamed from: d */
    private final List<C1953k> f6624d;

    /* renamed from: e4.a$a */
    public static final class C1793a {
        private C1793a() {
        }

        public /* synthetic */ C1793a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1809h mo7467a() {
            if (mo7468b()) {
                return new C1792a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo7468b() {
            return C1792a.f6622e;
        }
    }

    public C1792a() {
        List i = C3263l.m14372i(C1937a.f6907a.mo7685a(), C1950i.f6926a.mo7700a(), new C1952j("com.google.android.gms.org.conscrypt"), C1946g.f6921a.mo7696a());
        ArrayList arrayList = new ArrayList();
        for (Object next : i) {
            if (((C1953k) next).mo7683c()) {
                arrayList.add(next);
            }
        }
        this.f6624d = arrayList;
    }

    /* renamed from: c */
    public C2025c mo7463c(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        C1939b a = C1939b.f6908d.mo7690a(x509TrustManager);
        return a != null ? a : super.mo7463c(x509TrustManager);
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        T t;
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        Iterator<T> it = this.f6624d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C1953k) t).mo7682b(sSLSocket)) {
                break;
            }
        }
        C1953k kVar = (C1953k) t;
        if (kVar != null) {
            kVar.mo7684d(sSLSocket, str, list);
        }
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        T t;
        C1924k.m9142h(sSLSocket, "sslSocket");
        Iterator<T> it = this.f6624d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C1953k) t).mo7682b(sSLSocket)) {
                break;
            }
        }
        C1953k kVar = (C1953k) t;
        if (kVar != null) {
            return kVar.mo7681a(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public boolean mo7466j(String str) {
        C1924k.m9142h(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
