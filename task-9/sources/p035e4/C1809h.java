package p035e4;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p041f3.C1920g;
import p041f3.C1924k;
import p042f4.C1941c;
import p056h4.C2022a;
import p056h4.C2024b;
import p056h4.C2025c;
import p056h4.C2028e;
import p062i4.C2111f;
import p127t2.C3184p;
import p134u3.C3288b0;
import p134u3.C3299c0;

/* renamed from: e4.h */
public class C1809h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile C1809h f6652a;

    /* renamed from: b */
    private static final Logger f6653b = Logger.getLogger(C3288b0.class.getName());

    /* renamed from: c */
    public static final C1810a f6654c;

    /* renamed from: e4.h$a */
    public static final class C1810a {
        private C1810a() {
        }

        public /* synthetic */ C1810a(C1920g gVar) {
            this();
        }

        /* renamed from: d */
        private final C1809h m8852d() {
            C1941c.f6913c.mo7692b();
            C1809h a = C1792a.f6623f.mo7467a();
            if (a == null && (a = C1794b.f6626g.mo7473a()) == null) {
                C1924k.m9150p();
            }
            return a;
        }

        /* renamed from: e */
        private final C1809h m8853e() {
            C1807g a;
            C1797c a2;
            C1799d b;
            if (m8856j() && (b = C1799d.f6635f.mo7485b()) != null) {
                return b;
            }
            if (m8855i() && (a2 = C1797c.f6632f.mo7481a()) != null) {
                return a2;
            }
            if (m8857k() && (a = C1807g.f6650f.mo7494a()) != null) {
                return a;
            }
            C1805f a3 = C1805f.f6648e.mo7492a();
            if (a3 != null) {
                return a3;
            }
            C1809h a4 = C1802e.f6638i.mo7491a();
            return a4 != null ? a4 : new C1809h();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final C1809h m8854f() {
            return mo7502h() ? m8852d() : m8853e();
        }

        /* renamed from: i */
        private final boolean m8855i() {
            Provider provider = Security.getProviders()[0];
            C1924k.m9137c(provider, "Security.getProviders()[0]");
            return C1924k.m9136b("BC", provider.getName());
        }

        /* renamed from: j */
        private final boolean m8856j() {
            Provider provider = Security.getProviders()[0];
            C1924k.m9137c(provider, "Security.getProviders()[0]");
            return C1924k.m9136b("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        private final boolean m8857k() {
            Provider provider = Security.getProviders()[0];
            C1924k.m9137c(provider, "Security.getProviders()[0]");
            return C1924k.m9136b("OpenJSSE", provider.getName());
        }

        /* renamed from: b */
        public final List<String> mo7499b(List<? extends C3299c0> list) {
            C1924k.m9142h(list, "protocols");
            ArrayList<C3299c0> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((C3299c0) next) != C3299c0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C3264m.m14377n(arrayList, 10));
            for (C3299c0 c0Var : arrayList) {
                arrayList2.add(c0Var.toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] mo7500c(List<? extends C3299c0> list) {
            C1924k.m9142h(list, "protocols");
            C2111f fVar = new C2111f();
            for (String next : mo7499b(list)) {
                fVar.mo7913U(next.length());
                fVar.mo7908P(next);
            }
            return fVar.mo7905L();
        }

        /* renamed from: g */
        public final C1809h mo7501g() {
            return C1809h.f6652a;
        }

        /* renamed from: h */
        public final boolean mo7502h() {
            return C1924k.m9136b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C1810a aVar = new C1810a((C1920g) null);
        f6654c = aVar;
        f6652a = aVar.m8854f();
    }

    /* renamed from: l */
    public static /* synthetic */ void m8836l(C1809h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            hVar.mo7497k(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: b */
    public void mo7487b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
    }

    /* renamed from: c */
    public C2025c mo7463c(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        return new C2022a(mo7469d(x509TrustManager));
    }

    /* renamed from: d */
    public C2028e mo7469d(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C1924k.m9137c(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C2024b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
    }

    /* renamed from: f */
    public void mo7470f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C1924k.m9142h(socket, "socket");
        C1924k.m9142h(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public final String mo7496g() {
        return "OkHttp";
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: i */
    public Object mo7471i(String str) {
        C1924k.m9142h(str, "closer");
        if (f6653b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo7466j(String str) {
        C1924k.m9142h(str, "hostname");
        return true;
    }

    /* renamed from: k */
    public void mo7497k(String str, int i, Throwable th) {
        C1924k.m9142h(str, "message");
        f6653b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: m */
    public void mo7472m(String str, Object obj) {
        C1924k.m9142h(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo7497k(str, 5, (Throwable) obj);
    }

    /* renamed from: n */
    public SSLContext mo7479n() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C1924k.m9137c(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: o */
    public SSLSocketFactory mo7483o(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        try {
            SSLContext n = mo7479n();
            n.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = n.getSocketFactory();
            C1924k.m9137c(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: p */
    public X509TrustManager mo7480p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        C1924k.m9137c(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers == null) {
            C1924k.m9150p();
        }
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new C3184p("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C1924k.m9137c(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C1924k.m9137c(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
