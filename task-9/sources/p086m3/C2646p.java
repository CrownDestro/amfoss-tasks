package p086m3;

import java.util.Comparator;
import p041f3.C1924k;
import p041f3.C1935v;
import p068j3.C2327c;
import p133u2.C3277y;

/* renamed from: m3.p */
class C2646p extends C2645o {
    /* renamed from: A */
    public static /* synthetic */ boolean m11981A(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11995y(str, str2, i, z);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m11982B(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m11996z(str, str2, z);
    }

    /* renamed from: m */
    public static final boolean m11983m(String str, String str2, boolean z) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m11988r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m11984n(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m11983m(str, str2, z);
    }

    /* renamed from: o */
    public static boolean m11985o(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: p */
    public static Comparator<String> m11986p(C1935v vVar) {
        C1924k.m9141g(vVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C1924k.m9140f(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11987q(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            p041f3.C1924k.m9141g(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            j3.c r0 = p086m3.C2647q.m12006K(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            u2.y r3 = (p133u2.C3277y) r3
            int r3 = r3.mo8654a()
            char r3 = r4.charAt(r3)
            boolean r3 = p086m3.C2628b.m11921c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p086m3.C2646p.m11987q(java.lang.CharSequence):boolean");
    }

    /* renamed from: r */
    public static final boolean m11988r(String str, int i, String str2, int i2, int i3, boolean z) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m11989s(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return m11988r(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    /* renamed from: t */
    public static String m11990t(CharSequence charSequence, int i) {
        C1924k.m9141g(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C3277y z = new C2327c(1, i).iterator();
                while (z.hasNext()) {
                    z.mo8654a();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C1924k.m9140f(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: u */
    public static final String m11991u(String str, char c, char c2, boolean z) {
        String sb;
        String str2;
        C1924k.m9141g(str, "<this>");
        if (!z) {
            sb = str.replace(c, c2);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (C2629c.m11922d(charAt, c, z)) {
                    charAt = c2;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        C1924k.m9140f(sb, str2);
        return sb;
    }

    /* renamed from: v */
    public static final String m11992v(String str, String str2, String str3, boolean z) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "oldValue");
        C1924k.m9141g(str3, "newValue");
        int i = 0;
        int N = C2647q.m12009N(str, str2, 0, z);
        if (N < 0) {
            return str;
        }
        int length = str2.length();
        int b = C2331f.m10816b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, N);
                sb.append(str3);
                i = N + length;
                if (N >= str.length() || (N = C2647q.m12009N(str, str2, N + b, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C1924k.m9140f(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, N);
                sb.append(str3);
                i = N + length;
                break;
            } while ((N = C2647q.m12009N(str, str2, N + b, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C1924k.m9140f(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: w */
    public static /* synthetic */ String m11993w(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m11991u(str, c, c2, z);
    }

    /* renamed from: x */
    public static /* synthetic */ String m11994x(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m11992v(str, str2, str3, z);
    }

    /* renamed from: y */
    public static boolean m11995y(String str, String str2, int i, boolean z) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m11988r(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: z */
    public static boolean m11996z(String str, String str2, boolean z) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m11988r(str, 0, str2, 0, str2.length(), z);
    }
}
