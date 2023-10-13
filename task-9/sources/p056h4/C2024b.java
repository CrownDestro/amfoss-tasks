package p056h4;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p041f3.C1924k;

/* renamed from: h4.b */
public final class C2024b implements C2028e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f7100a;

    public C2024b(X509Certificate... x509CertificateArr) {
        C1924k.m9142h(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C1924k.m9137c(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f7100a = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.X509Certificate mo7475a(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cert"
            p041f3.C1924k.m9142h(r5, r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.f7100a
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ Exception -> 0x002e }
            r5.verify(r3)     // Catch:{ Exception -> 0x002e }
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0018
            r1 = r2
        L_0x0032:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h4.C2024b.mo7475a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2024b) && C1924k.m9136b(((C2024b) obj).f7100a, this.f7100a));
    }

    public int hashCode() {
        return this.f7100a.hashCode();
    }
}
