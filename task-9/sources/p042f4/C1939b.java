package p042f4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p041f3.C1920g;
import p041f3.C1924k;
import p056h4.C2025c;
import p127t2.C3184p;

/* renamed from: f4.b */
public final class C1939b extends C2025c {

    /* renamed from: d */
    public static final C1940a f6908d = new C1940a((C1920g) null);

    /* renamed from: b */
    private final X509TrustManager f6909b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f6910c;

    /* renamed from: f4.b$a */
    public static final class C1940a {
        private C1940a() {
        }

        public /* synthetic */ C1940a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1939b mo7690a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C1924k.m9142h(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C1939b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C1939b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C1924k.m9142h(x509TrustManager, "trustManager");
        C1924k.m9142h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f6909b = x509TrustManager;
        this.f6910c = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List<Certificate> mo7687a(List<? extends Certificate> list, String str) {
        C1924k.m9142h(list, "chain");
        C1924k.m9142h(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f6910c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                C1924k.m9137c(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1939b) && ((C1939b) obj).f6909b == this.f6909b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f6909b);
    }
}
