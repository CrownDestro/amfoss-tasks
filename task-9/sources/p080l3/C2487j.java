package p080l3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p034e3.C1780l;
import p041f3.C1924k;
import p048g3.C1964a;

/* renamed from: l3.j */
class C2487j extends C2486i {

    /* renamed from: l3.j$a */
    public static final class C2488a implements Iterable<T>, C1964a {

        /* renamed from: d */
        final /* synthetic */ C2480d f8489d;

        public C2488a(C2480d dVar) {
            this.f8489d = dVar;
        }

        public Iterator<T> iterator() {
            return this.f8489d.iterator();
        }
    }

    /* renamed from: c */
    public static <T> Iterable<T> m11473c(C2480d<? extends T> dVar) {
        C1924k.m9141g(dVar, "<this>");
        return new C2488a(dVar);
    }

    /* renamed from: d */
    public static <T> C2480d<T> m11474d(C2480d<? extends T> dVar, int i) {
        C1924k.m9141g(dVar, "<this>");
        if (i >= 0) {
            return i == 0 ? dVar : dVar instanceof C2479c ? ((C2479c) dVar).mo9091a(i) : new C2477b(dVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: e */
    public static final <T, A extends Appendable> A m11475e(C2480d<? extends T> dVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C1780l<? super T, ? extends CharSequence> lVar) {
        C1924k.m9141g(dVar, "<this>");
        C1924k.m9141g(a, "buffer");
        C1924k.m9141g(charSequence, "separator");
        C1924k.m9141g(charSequence2, "prefix");
        C1924k.m9141g(charSequence3, "postfix");
        C1924k.m9141g(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : dVar) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C2636h.m11965a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: f */
    public static final <T> String m11476f(C2480d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C1780l<? super T, ? extends CharSequence> lVar) {
        C1924k.m9141g(dVar, "<this>");
        C1924k.m9141g(charSequence, "separator");
        C1924k.m9141g(charSequence2, "prefix");
        C1924k.m9141g(charSequence3, "postfix");
        C1924k.m9141g(charSequence4, "truncated");
        String sb = ((StringBuilder) m11475e(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C1924k.m9140f(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: g */
    public static /* synthetic */ String m11477g(C2480d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C1780l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m11476f(dVar, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: h */
    public static <T, R> C2480d<R> m11478h(C2480d<? extends T> dVar, C1780l<? super T, ? extends R> lVar) {
        C1924k.m9141g(dVar, "<this>");
        C1924k.m9141g(lVar, "transform");
        return new C2489k(dVar, lVar);
    }

    /* renamed from: i */
    public static final <T, C extends Collection<? super T>> C m11479i(C2480d<? extends T> dVar, C c) {
        C1924k.m9141g(dVar, "<this>");
        C1924k.m9141g(c, "destination");
        for (Object add : dVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: j */
    public static <T> List<T> m11480j(C2480d<? extends T> dVar) {
        C1924k.m9141g(dVar, "<this>");
        return C3263l.m14374k(m11481k(dVar));
    }

    /* renamed from: k */
    public static final <T> List<T> m11481k(C2480d<? extends T> dVar) {
        C1924k.m9141g(dVar, "<this>");
        return (List) m11479i(dVar, new ArrayList());
    }
}
