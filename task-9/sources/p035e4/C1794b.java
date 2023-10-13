package p035e4;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p041f3.C1920g;
import p041f3.C1924k;
import p042f4.C1939b;
import p042f4.C1946g;
import p042f4.C1948h;
import p042f4.C1950i;
import p042f4.C1952j;
import p042f4.C1953k;
import p042f4.C1954l;
import p056h4.C2025c;
import p056h4.C2028e;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: e4.b */
public final class C1794b extends C1809h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f6625f;

    /* renamed from: g */
    public static final C1795a f6626g = new C1795a((C1920g) null);

    /* renamed from: d */
    private final List<C1953k> f6627d;

    /* renamed from: e */
    private final C1948h f6628e;

    /* renamed from: e4.b$a */
    public static final class C1795a {
        private C1795a() {
        }

        public /* synthetic */ C1795a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1809h mo7473a() {
            if (mo7474b()) {
                return new C1794b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo7474b() {
            return C1794b.f6625f;
        }
    }

    /* renamed from: e4.b$b */
    public static final class C1796b implements C2028e {

        /* renamed from: a */
        private final X509TrustManager f6629a;

        /* renamed from: b */
        private final Method f6630b;

        public C1796b(X509TrustManager x509TrustManager, Method method) {
            C1924k.m9142h(x509TrustManager, "trustManager");
            C1924k.m9142h(method, "findByIssuerAndSignatureMethod");
            this.f6629a = x509TrustManager;
            this.f6630b = method;
        }

        /* renamed from: a */
        public X509Certificate mo7475a(X509Certificate x509Certificate) {
            C1924k.m9142h(x509Certificate, "cert");
            try {
                Object invoke = this.f6630b.invoke(this.f6629a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new C3184p("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1796b)) {
                return false;
            }
            C1796b bVar = (C1796b) obj;
            return C1924k.m9136b(this.f6629a, bVar.f6629a) && C1924k.m9136b(this.f6630b, bVar.f6630b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f6629a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f6630b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f6629a + ", findByIssuerAndSignatureMethod=" + this.f6630b + ")";
        }
    }

    static {
        int i;
        boolean z = true;
        boolean z2 = false;
        if (C1809h.f6654c.mo7502h() && (i = Build.VERSION.SDK_INT) < 30) {
            if (i >= 21) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalStateException(("Expected Android API level 21+ but was " + i).toString());
            }
        } else {
            z = false;
        }
        f6625f = z;
    }

    public C1794b() {
        List i = C3263l.m14372i(C1954l.C1955a.m9223b(C1954l.f6930i, (String) null, 1, (Object) null), C1950i.f6926a.mo7700a(), new C1952j("com.google.android.gms.org.conscrypt"), C1946g.f6921a.mo7696a());
        ArrayList arrayList = new ArrayList();
        for (Object next : i) {
            if (((C1953k) next).mo7683c()) {
                arrayList.add(next);
            }
        }
        this.f6627d = arrayList;
        this.f6628e = C1948h.f6922d.mo7699a();
    }

    /* renamed from: c */
    public C2025c mo7463c(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        C1939b a = C1939b.f6908d.mo7690a(x509TrustManager);
        return a != null ? a : super.mo7463c(x509TrustManager);
    }

    /* renamed from: d */
    public C2028e mo7469d(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            C1924k.m9137c(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C1796b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo7469d(x509TrustManager);
        }
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<C3299c0> list) {
        T t;
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        Iterator<T> it = this.f6627d.iterator();
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

    /* renamed from: f */
    public void mo7470f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C1924k.m9142h(socket, "socket");
        C1924k.m9142h(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        T t;
        C1924k.m9142h(sSLSocket, "sslSocket");
        Iterator<T> it = this.f6627d.iterator();
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

    /* renamed from: i */
    public Object mo7471i(String str) {
        C1924k.m9142h(str, "closer");
        return this.f6628e.mo7697a(str);
    }

    /* renamed from: j */
    public boolean mo7466j(String str) {
        C1924k.m9142h(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        C1924k.m9137c(instance, "NetworkSecurityPolicy.getInstance()");
        return instance.isCleartextTrafficPermitted();
    }

    /* renamed from: m */
    public void mo7472m(String str, Object obj) {
        C1924k.m9142h(str, "message");
        if (!this.f6628e.mo7698b(obj)) {
            C1809h.m8836l(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
