package p070k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: k.f */
abstract class C2342f<K, V> {

    /* renamed from: a */
    C2342f<K, V>.b f8083a;

    /* renamed from: b */
    C2342f<K, V>.c f8084b;

    /* renamed from: c */
    C2342f<K, V>.e f8085c;

    /* renamed from: k.f$a */
    final class C2343a<T> implements Iterator<T> {

        /* renamed from: d */
        final int f8086d;

        /* renamed from: e */
        int f8087e;

        /* renamed from: f */
        int f8088f;

        /* renamed from: g */
        boolean f8089g = false;

        C2343a(int i) {
            this.f8086d = i;
            this.f8087e = C2342f.this.mo8668d();
        }

        public boolean hasNext() {
            return this.f8088f < this.f8087e;
        }

        public T next() {
            if (hasNext()) {
                T b = C2342f.this.mo8666b(this.f8088f, this.f8086d);
                this.f8088f++;
                this.f8089g = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f8089g) {
                int i = this.f8088f - 1;
                this.f8088f = i;
                this.f8087e--;
                this.f8089g = false;
                C2342f.this.mo8672h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: k.f$b */
    final class C2344b implements Set<Map.Entry<K, V>> {
        C2344b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C2342f.this.mo8668d();
            for (Map.Entry entry : collection) {
                C2342f.this.mo8671g(entry.getKey(), entry.getValue());
            }
            return d != C2342f.this.mo8668d();
        }

        public void clear() {
            C2342f.this.mo8665a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C2342f.this.mo8669e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C2339c.m10867c(C2342f.this.mo8666b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C2342f.m10892k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C2342f.this.mo8668d() - 1; d >= 0; d--) {
                Object b = C2342f.this.mo8666b(d, 0);
                Object b2 = C2342f.this.mo8666b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C2342f.this.mo8668d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2346d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C2342f.this.mo8668d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: k.f$c */
    final class C2345c implements Set<K> {
        C2345c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C2342f.this.mo8665a();
        }

        public boolean contains(Object obj) {
            return C2342f.this.mo8669e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C2342f.m10891j(C2342f.this.mo8667c(), collection);
        }

        public boolean equals(Object obj) {
            return C2342f.m10892k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C2342f.this.mo8668d() - 1; d >= 0; d--) {
                Object b = C2342f.this.mo8666b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C2342f.this.mo8668d() == 0;
        }

        public Iterator<K> iterator() {
            return new C2343a(0);
        }

        public boolean remove(Object obj) {
            int e = C2342f.this.mo8669e(obj);
            if (e < 0) {
                return false;
            }
            C2342f.this.mo8672h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C2342f.m10893o(C2342f.this.mo8667c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C2342f.m10894p(C2342f.this.mo8667c(), collection);
        }

        public int size() {
            return C2342f.this.mo8668d();
        }

        public Object[] toArray() {
            return C2342f.this.mo8718q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C2342f.this.mo8719r(tArr, 0);
        }
    }

    /* renamed from: k.f$d */
    final class C2346d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: d */
        int f8093d;

        /* renamed from: e */
        int f8094e;

        /* renamed from: f */
        boolean f8095f = false;

        C2346d() {
            this.f8093d = C2342f.this.mo8668d() - 1;
            this.f8094e = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f8094e++;
                this.f8095f = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f8095f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C2339c.m10867c(entry.getKey(), C2342f.this.mo8666b(this.f8094e, 0)) && C2339c.m10867c(entry.getValue(), C2342f.this.mo8666b(this.f8094e, 1));
            }
        }

        public K getKey() {
            if (this.f8095f) {
                return C2342f.this.mo8666b(this.f8094e, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f8095f) {
                return C2342f.this.mo8666b(this.f8094e, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f8094e < this.f8093d;
        }

        public int hashCode() {
            if (this.f8095f) {
                int i = 0;
                Object b = C2342f.this.mo8666b(this.f8094e, 0);
                Object b2 = C2342f.this.mo8666b(this.f8094e, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f8095f) {
                C2342f.this.mo8672h(this.f8094e);
                this.f8094e--;
                this.f8093d--;
                this.f8095f = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f8095f) {
                return C2342f.this.mo8673i(this.f8094e, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: k.f$e */
    final class C2347e implements Collection<V> {
        C2347e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C2342f.this.mo8665a();
        }

        public boolean contains(Object obj) {
            return C2342f.this.mo8670f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C2342f.this.mo8668d() == 0;
        }

        public Iterator<V> iterator() {
            return new C2343a(1);
        }

        public boolean remove(Object obj) {
            int f = C2342f.this.mo8670f(obj);
            if (f < 0) {
                return false;
            }
            C2342f.this.mo8672h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C2342f.this.mo8668d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C2342f.this.mo8666b(i, 1))) {
                    C2342f.this.mo8672h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C2342f.this.mo8668d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C2342f.this.mo8666b(i, 1))) {
                    C2342f.this.mo8672h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C2342f.this.mo8668d();
        }

        public Object[] toArray() {
            return C2342f.this.mo8718q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C2342f.this.mo8719r(tArr, 1);
        }
    }

    C2342f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m10891j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m10892k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m10893o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m10894p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8665a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo8666b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo8667c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo8668d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo8669e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo8670f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo8671g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo8672h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo8673i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo8715l() {
        if (this.f8083a == null) {
            this.f8083a = new C2344b();
        }
        return this.f8083a;
    }

    /* renamed from: m */
    public Set<K> mo8716m() {
        if (this.f8084b == null) {
            this.f8084b = new C2345c();
        }
        return this.f8084b;
    }

    /* renamed from: n */
    public Collection<V> mo8717n() {
        if (this.f8085c == null) {
            this.f8085c = new C2347e();
        }
        return this.f8085c;
    }

    /* renamed from: q */
    public Object[] mo8718q(int i) {
        int d = mo8668d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo8666b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo8719r(T[] tArr, int i) {
        int d = mo8668d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo8666b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
