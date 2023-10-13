package p056h4;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p041f3.C1924k;
import p127t2.C3184p;
import p140v3.C3422a;
import p140v3.C3423b;

/* renamed from: h4.d */
public final class C2027d implements HostnameVerifier {

    /* renamed from: a */
    public static final C2027d f7102a = new C2027d();

    private C2027d() {
    }

    /* renamed from: b */
    private final List<String> m9313b(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C3263l.m14369f();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C1924k.m9136b(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C3263l.m14369f();
        }
    }

    /* renamed from: d */
    private final boolean m9314d(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C2646p.m11982B(str, ".", false, 2, (Object) null) && !C2646p.m11984n(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !C2646p.m11982B(str2, ".", false, 2, (Object) null) && !C2646p.m11984n(str2, "..", false, 2, (Object) null)) {
                if (!C2646p.m11984n(str, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!C2646p.m11984n(str2, ".", false, 2, (Object) null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                C1924k.m9137c(locale, "Locale.US");
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(locale);
                    C1924k.m9137c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C2647q.m12002G(lowerCase, "*", false, 2, (Object) null)) {
                        return C1924k.m9136b(str3, lowerCase);
                    }
                    if (!C2646p.m11982B(lowerCase, "*.", false, 2, (Object) null) || C2647q.m12012Q(lowerCase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < lowerCase.length() || C1924k.m9136b("*.", lowerCase)) {
                        return false;
                    }
                    String substring = lowerCase.substring(1);
                    C1924k.m9137c(substring, "(this as java.lang.String).substring(startIndex)");
                    if (!C2646p.m11984n(str3, substring, false, 2, (Object) null)) {
                        return false;
                    }
                    int length = str3.length() - substring.length();
                    return length <= 0 || C2647q.m12017V(str3, '.', length + -1, false, 4, (Object) null) == -1;
                }
                throw new C3184p("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m9315e(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        C1924k.m9137c(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            C1924k.m9137c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> b = m9313b(x509Certificate, 2);
            if ((b instanceof Collection) && b.isEmpty()) {
                return false;
            }
            for (String d : b) {
                if (f7102a.m9314d(lowerCase, d)) {
                    return true;
                }
            }
            return false;
        }
        throw new C3184p("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: f */
    private final boolean m9316f(String str, X509Certificate x509Certificate) {
        String e = C3422a.m15060e(str);
        List<String> b = m9313b(x509Certificate, 7);
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        for (String e2 : b) {
            if (C1924k.m9136b(e, C3422a.m15060e(e2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> mo7765a(X509Certificate x509Certificate) {
        C1924k.m9142h(x509Certificate, "certificate");
        return C3271t.m14393H(m9313b(x509Certificate, 7), m9313b(x509Certificate, 2));
    }

    /* renamed from: c */
    public final boolean mo7766c(String str, X509Certificate x509Certificate) {
        C1924k.m9142h(str, "host");
        C1924k.m9142h(x509Certificate, "certificate");
        return C3423b.m15088f(str) ? m9316f(str, x509Certificate) : m9315e(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C1924k.m9142h(str, "host");
        C1924k.m9142h(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo7766c(str, (X509Certificate) certificate);
            }
            throw new C3184p("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
