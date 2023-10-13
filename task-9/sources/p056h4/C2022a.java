package p056h4;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;

/* renamed from: h4.a */
public final class C2022a extends C2025c {

    /* renamed from: c */
    public static final C2023a f7098c = new C2023a((C1920g) null);

    /* renamed from: b */
    private final C2028e f7099b;

    /* renamed from: h4.a$a */
    public static final class C2023a {
        private C2023a() {
        }

        public /* synthetic */ C2023a(C1920g gVar) {
            this();
        }
    }

    public C2022a(C2028e eVar) {
        C1924k.m9142h(eVar, "trustRootIndex");
        this.f7099b = eVar;
    }

    /* renamed from: b */
    private final boolean m9308b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C1924k.m9136b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public List<Certificate> mo7687a(List<? extends Certificate> list, String str) {
        C1924k.m9142h(list, "chain");
        C1924k.m9142h(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C1924k.m9137c(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj != null) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                X509Certificate a = this.f7099b.mo7475a(x509Certificate);
                if (a != null) {
                    if (arrayList.size() > 1 || (!C1924k.m9136b(x509Certificate, a))) {
                        arrayList.add(a);
                    }
                    if (m9308b(a, a)) {
                        return arrayList;
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    C1924k.m9137c(it, "queue.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (m9308b(x509Certificate, x509Certificate2)) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        } else {
                            throw new C3184p("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                i++;
            } else {
                throw new C3184p("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2022a) && C1924k.m9136b(((C2022a) obj).f7099b, this.f7099b);
    }

    public int hashCode() {
        return this.f7099b.hashCode();
    }
}
