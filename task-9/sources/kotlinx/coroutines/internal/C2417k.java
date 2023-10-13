package kotlinx.coroutines.internal;

import java.util.ArrayList;
import p041f3.C1920g;

/* renamed from: kotlinx.coroutines.internal.k */
public final class C2417k<E> {
    /* renamed from: a */
    public static <E> Object m11268a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m11269b(Object obj, int i, C1920g gVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m11268a(obj);
    }

    /* renamed from: c */
    public static final Object m11270c(Object obj, E e) {
        if (obj == null) {
            return m11268a(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m11268a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m11268a(arrayList);
    }
}
