package p104p3;

import p034e3.C1780l;
import p127t2.C3187s;

/* renamed from: p3.h */
public final class C2938h {
    /* renamed from: a */
    public static final <E> C2935f<E> m13288a(int i, C2934e eVar, C1780l<? super E, C3187s> lVar) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == C2934e.SUSPEND) {
                i2 = C2935f.f9697a.mo10123a();
            }
            return new C2932d(i2, eVar, lVar);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && eVar == C2934e.DROP_OLDEST) ? new C2946m(lVar) : new C2932d(i, eVar, lVar) : new C2947n(lVar) : eVar == C2934e.SUSPEND ? new C2951r(lVar) : new C2932d(1, eVar, lVar);
        } else {
            if (eVar != C2934e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C2946m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C2935f m13289b(int i, C2934e eVar, C1780l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = C2934e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m13288a(i, eVar, lVar);
    }
}
