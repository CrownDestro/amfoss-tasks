package p035e4;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: e4.d */
public final class C1799d extends C1809h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f6634e;

    /* renamed from: f */
    public static final C1800a f6635f;

    /* renamed from: d */
    private final Provider f6636d;

    /* renamed from: e4.d$a */
    public static final class C1800a {
        private C1800a() {
        }

        public /* synthetic */ C1800a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo7484a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        /* renamed from: b */
        public final C1799d mo7485b() {
            if (mo7486c()) {
                return new C1799d((C1920g) null);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean mo7486c() {
            return C1799d.f6634e;
        }
    }

    /* renamed from: e4.d$b */
    static final class C1801b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C1801b f6637a = new C1801b();

        C1801b() {
        }
    }

    static {
        C1800a aVar = new C1800a((C1920g) null);
        f6635f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.mo7484a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f6634e = z;
    }

    private C1799d() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        C1924k.m9137c(build, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.f6636d = build;
    }

    public /* synthetic */ C1799d(C1920g gVar) {
        this();
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C1809h.f6654c.mo7499b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo7464e(sSLSocket, str, list);
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo7465h(sSLSocket);
    }

    /* renamed from: n */
    public SSLContext mo7479n() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f6636d);
        C1924k.m9137c(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: o */
    public SSLSocketFactory mo7483o(X509TrustManager x509TrustManager) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        SSLContext n = mo7479n();
        n.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = n.getSocketFactory();
        Conscrypt.setUseEngineSocket(socketFactory, true);
        C1924k.m9137c(socketFactory, "newSSLContext().apply {\n…ineSocket(it, true)\n    }");
        return socketFactory;
    }

    /* renamed from: p */
    public X509TrustManager mo7480p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        C1924k.m9137c(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C1801b.f6637a);
                return x509TrustManager;
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
}
