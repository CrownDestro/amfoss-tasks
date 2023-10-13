package p005a4;

import java.net.ProtocolException;
import p041f3.C1920g;
import p041f3.C1924k;
import p134u3.C3299c0;

/* renamed from: a4.k */
public final class C0037k {

    /* renamed from: d */
    public static final C0038a f136d = new C0038a((C1920g) null);

    /* renamed from: a */
    public final C3299c0 f137a;

    /* renamed from: b */
    public final int f138b;

    /* renamed from: c */
    public final String f139c;

    /* renamed from: a4.k$a */
    public static final class C0038a {
        private C0038a() {
        }

        public /* synthetic */ C0038a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C0037k mo90a(String str) {
            C3299c0 c0Var;
            String str2;
            C1924k.m9142h(str, "statusLine");
            int i = 9;
            if (C2646p.m11982B(str, "HTTP/1.", false, 2, (Object) null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    c0Var = C3299c0.HTTP_1_0;
                } else if (charAt == 1) {
                    c0Var = C3299c0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (C2646p.m11982B(str, "ICY ", false, 2, (Object) null)) {
                c0Var = C3299c0.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C1924k.m9137c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C1924k.m9137c(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new C0037k(c0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public C0037k(C3299c0 c0Var, int i, String str) {
        C1924k.m9142h(c0Var, "protocol");
        C1924k.m9142h(str, "message");
        this.f137a = c0Var;
        this.f138b = i;
        this.f139c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f137a == C3299c0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f138b);
        sb.append(' ');
        sb.append(this.f139c);
        String sb2 = sb.toString();
        C1924k.m9137c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
