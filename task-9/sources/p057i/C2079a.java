package p057i;

import java.util.HashMap;
import java.util.Map;
import p057i.C2080b;

/* renamed from: i.a */
public class C2079a<K, V> extends C2080b<K, V> {

    /* renamed from: h */
    private final HashMap<K, C2080b.C2083c<K, V>> f7287h = new HashMap<>();

    /* renamed from: C */
    public V mo7833C(K k, V v) {
        C2080b.C2083c y = mo7837y(k);
        if (y != null) {
            return y.f7293e;
        }
        this.f7287h.put(k, mo7839B(k, v));
        return null;
    }

    /* renamed from: D */
    public V mo7834D(K k) {
        V D = super.mo7834D(k);
        this.f7287h.remove(k);
        return D;
    }

    /* renamed from: E */
    public Map.Entry<K, V> mo7835E(K k) {
        if (contains(k)) {
            return this.f7287h.get(k).f7295g;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f7287h.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C2080b.C2083c<K, V> mo7837y(K k) {
        return this.f7287h.get(k);
    }
}
