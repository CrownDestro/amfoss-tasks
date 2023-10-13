package p057i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.b */
public class C2080b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: d */
    C2083c<K, V> f7288d;

    /* renamed from: e */
    private C2083c<K, V> f7289e;

    /* renamed from: f */
    private final WeakHashMap<C2086f<K, V>, Boolean> f7290f = new WeakHashMap<>();

    /* renamed from: g */
    private int f7291g = 0;

    /* renamed from: i.b$a */
    static class C2081a<K, V> extends C2085e<K, V> {
        C2081a(C2083c<K, V> cVar, C2083c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2083c<K, V> mo7848b(C2083c<K, V> cVar) {
            return cVar.f7295g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2083c<K, V> mo7849c(C2083c<K, V> cVar) {
            return cVar.f7294f;
        }
    }

    /* renamed from: i.b$b */
    private static class C2082b<K, V> extends C2085e<K, V> {
        C2082b(C2083c<K, V> cVar, C2083c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2083c<K, V> mo7848b(C2083c<K, V> cVar) {
            return cVar.f7294f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2083c<K, V> mo7849c(C2083c<K, V> cVar) {
            return cVar.f7295g;
        }
    }

    /* renamed from: i.b$c */
    static class C2083c<K, V> implements Map.Entry<K, V> {

        /* renamed from: d */
        final K f7292d;

        /* renamed from: e */
        final V f7293e;

        /* renamed from: f */
        C2083c<K, V> f7294f;

        /* renamed from: g */
        C2083c<K, V> f7295g;

        C2083c(K k, V v) {
            this.f7292d = k;
            this.f7293e = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2083c)) {
                return false;
            }
            C2083c cVar = (C2083c) obj;
            return this.f7292d.equals(cVar.f7292d) && this.f7293e.equals(cVar.f7293e);
        }

        public K getKey() {
            return this.f7292d;
        }

        public V getValue() {
            return this.f7293e;
        }

        public int hashCode() {
            return this.f7292d.hashCode() ^ this.f7293e.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f7292d + "=" + this.f7293e;
        }
    }

    /* renamed from: i.b$d */
    public class C2084d extends C2086f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: d */
        private C2083c<K, V> f7296d;

        /* renamed from: e */
        private boolean f7297e = true;

        C2084d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7856a(C2083c<K, V> cVar) {
            C2083c<K, V> cVar2 = this.f7296d;
            if (cVar == cVar2) {
                C2083c<K, V> cVar3 = cVar2.f7295g;
                this.f7296d = cVar3;
                this.f7297e = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C2083c<K, V> cVar;
            if (this.f7297e) {
                this.f7297e = false;
                cVar = C2080b.this.f7288d;
            } else {
                C2083c<K, V> cVar2 = this.f7296d;
                cVar = cVar2 != null ? cVar2.f7294f : null;
            }
            this.f7296d = cVar;
            return this.f7296d;
        }

        public boolean hasNext() {
            if (this.f7297e) {
                return C2080b.this.f7288d != null;
            }
            C2083c<K, V> cVar = this.f7296d;
            return (cVar == null || cVar.f7294f == null) ? false : true;
        }
    }

    /* renamed from: i.b$e */
    private static abstract class C2085e<K, V> extends C2086f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: d */
        C2083c<K, V> f7299d;

        /* renamed from: e */
        C2083c<K, V> f7300e;

        C2085e(C2083c<K, V> cVar, C2083c<K, V> cVar2) {
            this.f7299d = cVar2;
            this.f7300e = cVar;
        }

        /* renamed from: e */
        private C2083c<K, V> m9609e() {
            C2083c<K, V> cVar = this.f7300e;
            C2083c<K, V> cVar2 = this.f7299d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo7849c(cVar);
        }

        /* renamed from: a */
        public void mo7856a(C2083c<K, V> cVar) {
            if (this.f7299d == cVar && cVar == this.f7300e) {
                this.f7300e = null;
                this.f7299d = null;
            }
            C2083c<K, V> cVar2 = this.f7299d;
            if (cVar2 == cVar) {
                this.f7299d = mo7848b(cVar2);
            }
            if (this.f7300e == cVar) {
                this.f7300e = m9609e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C2083c<K, V> mo7848b(C2083c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C2083c<K, V> mo7849c(C2083c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C2083c<K, V> cVar = this.f7300e;
            this.f7300e = m9609e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f7300e != null;
        }
    }

    /* renamed from: i.b$f */
    public static abstract class C2086f<K, V> {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo7856a(C2083c<K, V> cVar);
    }

    /* renamed from: A */
    public Map.Entry<K, V> mo7838A() {
        return this.f7289e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C2083c<K, V> mo7839B(K k, V v) {
        C2083c<K, V> cVar = new C2083c<>(k, v);
        this.f7291g++;
        C2083c<K, V> cVar2 = this.f7289e;
        if (cVar2 == null) {
            this.f7288d = cVar;
        } else {
            cVar2.f7294f = cVar;
            cVar.f7295g = cVar2;
        }
        this.f7289e = cVar;
        return cVar;
    }

    /* renamed from: C */
    public V mo7833C(K k, V v) {
        C2083c y = mo7837y(k);
        if (y != null) {
            return y.f7293e;
        }
        mo7839B(k, v);
        return null;
    }

    /* renamed from: D */
    public V mo7834D(K k) {
        C2083c y = mo7837y(k);
        if (y == null) {
            return null;
        }
        this.f7291g--;
        if (!this.f7290f.isEmpty()) {
            for (C2086f<K, V> a : this.f7290f.keySet()) {
                a.mo7856a(y);
            }
        }
        C2083c<K, V> cVar = y.f7295g;
        C2083c<K, V> cVar2 = y.f7294f;
        if (cVar != null) {
            cVar.f7294f = cVar2;
        } else {
            this.f7288d = cVar2;
        }
        C2083c<K, V> cVar3 = y.f7294f;
        if (cVar3 != null) {
            cVar3.f7295g = cVar;
        } else {
            this.f7289e = cVar;
        }
        y.f7294f = null;
        y.f7295g = null;
        return y.f7293e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2080b)) {
            return false;
        }
        C2080b bVar = (C2080b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C2081a aVar = new C2081a(this.f7288d, this.f7289e);
        this.f7290f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<K, V>> mo7843s() {
        C2082b bVar = new C2082b(this.f7289e, this.f7288d);
        this.f7290f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int size() {
        return this.f7291g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: x */
    public Map.Entry<K, V> mo7846x() {
        return this.f7288d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C2083c<K, V> mo7837y(K k) {
        C2083c<K, V> cVar = this.f7288d;
        while (cVar != null && !cVar.f7292d.equals(k)) {
            cVar = cVar.f7294f;
        }
        return cVar;
    }

    /* renamed from: z */
    public C2080b<K, V>.d mo7847z() {
        C2080b<K, V>.d dVar = new C2084d();
        this.f7290f.put(dVar, Boolean.FALSE);
        return dVar;
    }
}
