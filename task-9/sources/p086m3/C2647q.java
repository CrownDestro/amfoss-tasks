package p086m3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p034e3.C1780l;
import p034e3.C1784p;
import p041f3.C1924k;
import p041f3.C1925l;
import p068j3.C2324a;
import p068j3.C2327c;
import p080l3.C2480d;
import p127t2.C3177k;
import p127t2.C3183o;
import p133u2.C3277y;

/* renamed from: m3.q */
class C2647q extends C2646p {

    /* renamed from: m3.q$a */
    static final class C2648a extends C1925l implements C1784p<CharSequence, Integer, C3177k<? extends Integer, ? extends Integer>> {

        /* renamed from: e */
        final /* synthetic */ char[] f8871e;

        /* renamed from: f */
        final /* synthetic */ boolean f8872f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2648a(char[] cArr, boolean z) {
            super(2);
            this.f8871e = cArr;
            this.f8872f = z;
        }

        /* renamed from: a */
        public final C3177k<Integer, Integer> mo9330a(CharSequence charSequence, int i) {
            C1924k.m9141g(charSequence, "$this$$receiver");
            int S = C2647q.m12014S(charSequence, this.f8871e, i, this.f8872f);
            if (S < 0) {
                return null;
            }
            return C3183o.m14061a(Integer.valueOf(S), 1);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Object mo3735l(Object obj, Object obj2) {
            return mo9330a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: m3.q$b */
    static final class C2649b extends C1925l implements C1784p<CharSequence, Integer, C3177k<? extends Integer, ? extends Integer>> {

        /* renamed from: e */
        final /* synthetic */ List<String> f8873e;

        /* renamed from: f */
        final /* synthetic */ boolean f8874f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2649b(List<String> list, boolean z) {
            super(2);
            this.f8873e = list;
            this.f8874f = z;
        }

        /* renamed from: a */
        public final C3177k<Integer, Integer> mo9331a(CharSequence charSequence, int i) {
            C1924k.m9141g(charSequence, "$this$$receiver");
            C3177k C = C2647q.m12005J(charSequence, this.f8873e, i, this.f8874f, false);
            if (C != null) {
                return C3183o.m14061a(C.mo10542c(), Integer.valueOf(((String) C.mo10543d()).length()));
            }
            return null;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Object mo3735l(Object obj, Object obj2) {
            return mo9331a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: m3.q$c */
    static final class C2650c extends C1925l implements C1780l<C2327c, String> {

        /* renamed from: e */
        final /* synthetic */ CharSequence f8875e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2650c(CharSequence charSequence) {
            super(1);
            this.f8875e = charSequence;
        }

        /* renamed from: a */
        public final String mo3836n(C2327c cVar) {
            C1924k.m9141g(cVar, "it");
            return C2647q.m12037p0(this.f8875e, cVar);
        }
    }

    /* renamed from: A0 */
    public static CharSequence m11997A0(CharSequence charSequence) {
        C1924k.m9141g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C2628b.m11921c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: D */
    public static final boolean m11999D(CharSequence charSequence, char c, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        return m12012Q(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: E */
    public static final boolean m12000E(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m12013R(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m12011P(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public static /* synthetic */ boolean m12001F(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m11999D(charSequence, c, z);
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m12002G(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m12000E(charSequence, charSequence2, z);
    }

    /* renamed from: H */
    public static final boolean m12003H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C2646p.m11984n((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m12026e0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m12004I(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m12003H(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final C3177k<Integer, String> m12005J(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            C2324a cVar = !z2 ? new C2327c(C2331f.m10816b(i, 0), charSequence.length()) : C2331f.m10821g(C2331f.m10818d(i, m12007L(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = cVar.mo8648s();
                int x = cVar.mo8650x();
                int y = cVar.mo8651y();
                if ((y > 0 && i2 <= x) || (y < 0 && x <= i2)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (C2646p.m11988r(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == x) {
                                break;
                            }
                            i2 += y;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int s = cVar.mo8648s();
            int x2 = cVar.mo8650x();
            int y2 = cVar.mo8651y();
            if ((y2 > 0 && s <= x2) || (y2 < 0 && x2 <= s)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (m12026e0(str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == x2) {
                            break;
                        }
                        s = i2 + y2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return C3183o.m14061a(Integer.valueOf(i2), str);
        }
        String str4 = (String) C3271t.m14395J(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int R = !z2 ? m12013R(charSequence2, str5, i3, false, 4, (Object) null) : m12018W(charSequence2, str5, i3, false, 4, (Object) null);
        if (R < 0) {
            return null;
        }
        return C3183o.m14061a(Integer.valueOf(R), str4);
    }

    /* renamed from: K */
    public static final C2327c m12006K(CharSequence charSequence) {
        C1924k.m9141g(charSequence, "<this>");
        return new C2327c(0, charSequence.length() - 1);
    }

    /* renamed from: L */
    public static final int m12007L(CharSequence charSequence) {
        C1924k.m9141g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: M */
    public static final int m12008M(CharSequence charSequence, char c, int i, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m12014S(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: N */
    public static final int m12009N(CharSequence charSequence, String str, int i, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m12011P(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: O */
    private static final int m12010O(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C2324a cVar = !z2 ? new C2327c(C2331f.m10816b(i, 0), C2331f.m10818d(i2, charSequence.length())) : C2331f.m10821g(C2331f.m10818d(i, m12007L(charSequence)), C2331f.m10816b(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int s = cVar.mo8648s();
            int x = cVar.mo8650x();
            int y = cVar.mo8651y();
            if ((y <= 0 || s > x) && (y >= 0 || x > s)) {
                return -1;
            }
            while (true) {
                if (m12026e0(charSequence2, 0, charSequence, s, charSequence2.length(), z)) {
                    return s;
                }
                if (s == x) {
                    return -1;
                }
                s += y;
            }
        } else {
            int s2 = cVar.mo8648s();
            int x2 = cVar.mo8650x();
            int y2 = cVar.mo8651y();
            if ((y2 <= 0 || s2 > x2) && (y2 >= 0 || x2 > s2)) {
                return -1;
            }
            while (true) {
                if (C2646p.m11988r((String) charSequence2, 0, (String) charSequence, s2, charSequence2.length(), z)) {
                    return s2;
                }
                if (s2 == x2) {
                    return -1;
                }
                s2 += y2;
            }
        }
    }

    /* renamed from: P */
    static /* synthetic */ int m12011P(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m12010O(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: Q */
    public static /* synthetic */ int m12012Q(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m12008M(charSequence, c, i, z);
    }

    /* renamed from: R */
    public static /* synthetic */ int m12013R(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m12009N(charSequence, str, i, z);
    }

    /* renamed from: S */
    public static final int m12014S(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C3277y z3 = new C2327c(C2331f.m10816b(i, 0), m12007L(charSequence)).iterator();
            while (z3.hasNext()) {
                int a = z3.mo8654a();
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C2629c.m11922d(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C3257h.m14326q(cArr), i);
    }

    /* renamed from: T */
    public static final int m12015T(CharSequence charSequence, char c, int i, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m12019X(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: U */
    public static final int m12016U(CharSequence charSequence, String str, int i, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(str, "string");
        return (z || !(charSequence instanceof String)) ? m12010O(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: V */
    public static /* synthetic */ int m12017V(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m12007L(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m12015T(charSequence, c, i, z);
    }

    /* renamed from: W */
    public static /* synthetic */ int m12018W(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m12007L(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m12016U(charSequence, str, i, z);
    }

    /* renamed from: X */
    public static final int m12019X(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d = C2331f.m10818d(i, m12007L(charSequence)); -1 < d; d--) {
                char charAt = charSequence.charAt(d);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C2629c.m11922d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return d;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C3257h.m14326q(cArr), i);
    }

    /* renamed from: Y */
    public static final C2480d<String> m12020Y(CharSequence charSequence) {
        C1924k.m9141g(charSequence, "<this>");
        return m12034m0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: Z */
    public static final List<String> m12021Z(CharSequence charSequence) {
        C1924k.m9141g(charSequence, "<this>");
        return C2487j.m11480j(m12020Y(charSequence));
    }

    /* renamed from: a0 */
    private static final C2480d<C2327c> m12022a0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m12029h0(i2);
        return new C2631e(charSequence, i, i2, new C2648a(cArr, z));
    }

    /* renamed from: b0 */
    private static final C2480d<C2327c> m12023b0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m12029h0(i2);
        return new C2631e(charSequence, i, i2, new C2649b(C3255g.m14310b(strArr), z));
    }

    /* renamed from: c0 */
    static /* synthetic */ C2480d m12024c0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m12022a0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: d0 */
    static /* synthetic */ C2480d m12025d0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m12023b0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: e0 */
    public static final boolean m12026e0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C2629c.m11922d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public static String m12027f0(String str, CharSequence charSequence) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(charSequence, "prefix");
        if (!m12036o0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C1924k.m9140f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: g0 */
    public static String m12028g0(String str, CharSequence charSequence) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(charSequence, "suffix");
        if (!m12004I(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C1924k.m9140f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h0 */
    public static final void m12029h0(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: i0 */
    public static final List<String> m12030i0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(cArr, "delimiters");
        if (cArr.length == 1) {
            return m12031j0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C2327c> c = C2487j.m11473c(m12024c0(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C3264m.m14377n(c, 10));
        for (C2327c p0 : c) {
            arrayList.add(m12037p0(charSequence, p0));
        }
        return arrayList;
    }

    /* renamed from: j0 */
    private static final List<String> m12031j0(CharSequence charSequence, String str, boolean z, int i) {
        m12029h0(i);
        int i2 = 0;
        int N = m12009N(charSequence, str, 0, z);
        if (N == -1 || i == 1) {
            return C3262k.m14365b(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C2331f.m10818d(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, N).toString());
            i2 = str.length() + N;
            if ((z2 && arrayList.size() == i - 1) || (N = m12009N(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, N).toString());
            i2 = str.length() + N;
            break;
        } while ((N = m12009N(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: k0 */
    public static /* synthetic */ List m12032k0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m12030i0(charSequence, cArr, z, i);
    }

    /* renamed from: l0 */
    public static final C2480d<String> m12033l0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(strArr, "delimiters");
        return C2487j.m11478h(m12025d0(charSequence, strArr, 0, z, i, 2, (Object) null), new C2650c(charSequence));
    }

    /* renamed from: m0 */
    public static /* synthetic */ C2480d m12034m0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m12033l0(charSequence, strArr, z, i);
    }

    /* renamed from: n0 */
    public static final boolean m12035n0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C2646p.m11982B((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m12026e0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: o0 */
    public static /* synthetic */ boolean m12036o0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m12035n0(charSequence, charSequence2, z);
    }

    /* renamed from: p0 */
    public static final String m12037p0(CharSequence charSequence, C2327c cVar) {
        C1924k.m9141g(charSequence, "<this>");
        C1924k.m9141g(cVar, "range");
        return charSequence.subSequence(cVar.mo8658D().intValue(), cVar.mo8657C().intValue() + 1).toString();
    }

    /* renamed from: q0 */
    public static final String m12038q0(String str, char c, String str2) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "missingDelimiterValue");
        int Q = m12012Q(str, c, 0, false, 6, (Object) null);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(Q + 1, str.length());
        C1924k.m9140f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: r0 */
    public static final String m12039r0(String str, String str2, String str3) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "delimiter");
        C1924k.m9141g(str3, "missingDelimiterValue");
        int R = m12013R(str, str2, 0, false, 6, (Object) null);
        if (R == -1) {
            return str3;
        }
        String substring = str.substring(R + str2.length(), str.length());
        C1924k.m9140f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: s0 */
    public static /* synthetic */ String m12040s0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m12038q0(str, c, str2);
    }

    /* renamed from: t0 */
    public static /* synthetic */ String m12041t0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m12039r0(str, str2, str3);
    }

    /* renamed from: u0 */
    public static final String m12042u0(String str, char c, String str2) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "missingDelimiterValue");
        int V = m12017V(str, c, 0, false, 6, (Object) null);
        if (V == -1) {
            return str2;
        }
        String substring = str.substring(V + 1, str.length());
        C1924k.m9140f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: v0 */
    public static /* synthetic */ String m12043v0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m12042u0(str, c, str2);
    }

    /* renamed from: w0 */
    public static final String m12044w0(String str, char c, String str2) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "missingDelimiterValue");
        int Q = m12012Q(str, c, 0, false, 6, (Object) null);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(0, Q);
        C1924k.m9140f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: x0 */
    public static final String m12045x0(String str, String str2, String str3) {
        C1924k.m9141g(str, "<this>");
        C1924k.m9141g(str2, "delimiter");
        C1924k.m9141g(str3, "missingDelimiterValue");
        int R = m12013R(str, str2, 0, false, 6, (Object) null);
        if (R == -1) {
            return str3;
        }
        String substring = str.substring(0, R);
        C1924k.m9140f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: y0 */
    public static /* synthetic */ String m12046y0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m12044w0(str, c, str2);
    }

    /* renamed from: z0 */
    public static /* synthetic */ String m12047z0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m12045x0(str, str2, str3);
    }
}
