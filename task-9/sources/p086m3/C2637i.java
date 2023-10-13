package p086m3;

import java.util.ArrayList;
import java.util.List;
import p016c.C1279j;
import p034e3.C1780l;
import p041f3.C1924k;
import p041f3.C1925l;

/* renamed from: m3.i */
class C2637i extends C2636h {

    /* renamed from: m3.i$a */
    static final class C2638a extends C1925l implements C1780l<String, String> {

        /* renamed from: e */
        public static final C2638a f8869e = new C2638a();

        C2638a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo3836n(String str) {
            C1924k.m9141g(str, "line");
            return str;
        }
    }

    /* renamed from: m3.i$b */
    static final class C2639b extends C1925l implements C1780l<String, String> {

        /* renamed from: e */
        final /* synthetic */ String f8870e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2639b(String str) {
            super(1);
            this.f8870e = str;
        }

        /* renamed from: a */
        public final String mo3836n(String str) {
            C1924k.m9141g(str, "line");
            return this.f8870e + str;
        }
    }

    /* renamed from: b */
    private static final C1780l<String, String> m11966b(String str) {
        return str.length() == 0 ? C2638a.f8869e : new C2639b(str);
    }

    /* renamed from: c */
    private static final int m11967c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C2628b.m11921c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m11968d(String str, String str2) {
        String n;
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "newIndent");
        List<String> Z = C2647q.m12021Z(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : Z) {
            if (!C2646p.m11987q((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3264m.m14377n(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m11967c(c)));
        }
        Integer num = (Integer) C3271t.m14392G(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * Z.size());
        C1780l<String, String> b = m11966b(str2);
        int g = C3263l.m14370g(Z);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : Z) {
            int i2 = i + 1;
            if (i < 0) {
                C3263l.m14376m();
            }
            String str3 = (String) next2;
            if ((i == 0 || i == g) && C2646p.m11987q(str3)) {
                str3 = null;
            } else {
                String B0 = C2652s.m12054B0(str3, intValue);
                if (!(B0 == null || (n = b.mo3836n(B0)) == null)) {
                    str3 = n;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) C3271t.m14388C(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C1780l) null, C1279j.f4399K0, (Object) null)).toString();
        C1924k.m9140f(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static final String m11969e(String str, String str2, String str3) {
        int i;
        String n;
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "newIndent");
        C1924k.m9141g(str3, "marginPrefix");
        if (!C2646p.m11987q(str3)) {
            List<String> Z = C2647q.m12021Z(str);
            int length = str.length() + (str2.length() * Z.size());
            C1780l<String, String> b = m11966b(str2);
            int g = C3263l.m14370g(Z);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T next : Z) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C3263l.m14376m();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i2 == 0 || i2 == g) && C2646p.m11987q(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C2628b.m11921c(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C2646p.m11981A(str4, str3, i, false, 4, (Object) null)) {
                            C1924k.m9139e(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i5 + str3.length());
                            C1924k.m9140f(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (n = b.mo3836n(str5)) == null)) {
                        str4 = n;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C3271t.m14388C(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C1780l) null, C1279j.f4399K0, (Object) null)).toString();
            C1924k.m9140f(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m11970f(String str) {
        C1924k.m9141g(str, "<this>");
        return m11968d(str, "");
    }

    /* renamed from: g */
    public static final String m11971g(String str, String str2) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "marginPrefix");
        return m11969e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m11972h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m11971g(str, str2);
    }
}
