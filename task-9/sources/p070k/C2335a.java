package p070k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: k.a */
public class C2335a<K, V> extends C2348g<K, V> implements Map<K, V> {

    /* renamed from: k */
    C2342f<K, V> f8054k;

    /* renamed from: k.a$a */
    class C2336a extends C2342f<K, V> {
        C2336a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8665a() {
            C2335a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo8666b(int i, int i2) {
            return C2335a.this.f8103e[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo8667c() {
            return C2335a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo8668d() {
            return C2335a.this.f8104f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo8669e(Object obj) {
            return C2335a.this.mo8783f(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo8670f(Object obj) {
            return C2335a.this.mo8787h(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo8671g(K k, V v) {
            C2335a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8672h(int i) {
            C2335a.this.mo8792k(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo8673i(int i, V v) {
            return C2335a.this.mo8793l(i, v);
        }
    }

    public C2335a() {
    }

    public C2335a(int i) {
        super(i);
    }

    public C2335a(C2348g gVar) {
        super(gVar);
    }

    /* renamed from: n */
    private C2342f<K, V> m10837n() {
        if (this.f8054k == null) {
            this.f8054k = new C2336a();
        }
        return this.f8054k;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m10837n().mo8715l();
    }

    public Set<K> keySet() {
        return m10837n().mo8716m();
    }

    /* renamed from: o */
    public boolean mo8662o(Collection<?> collection) {
        return C2342f.m10894p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo8777c(this.f8104f + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m10837n().mo8717n();
    }
}
