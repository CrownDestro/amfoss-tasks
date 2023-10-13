package p108q1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: q1.q */
final class C2996q<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l */
    private static final Comparator<Comparable> f9836l = new C2997a();

    /* renamed from: d */
    Comparator<? super K> f9837d;

    /* renamed from: e */
    C3005g<K, V>[] f9838e;

    /* renamed from: f */
    final C3005g<K, V> f9839f;

    /* renamed from: g */
    int f9840g;

    /* renamed from: h */
    int f9841h;

    /* renamed from: i */
    int f9842i;

    /* renamed from: j */
    private C2996q<K, V>.d f9843j;

    /* renamed from: k */
    private C2996q<K, V>.e f9844k;

    /* renamed from: q1.q$a */
    class C2997a implements Comparator<Comparable> {
        C2997a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: q1.q$b */
    static final class C2998b<K, V> {

        /* renamed from: a */
        private C3005g<K, V> f9845a;

        /* renamed from: b */
        private int f9846b;

        /* renamed from: c */
        private int f9847c;

        /* renamed from: d */
        private int f9848d;

        C2998b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10291a(C3005g<K, V> gVar) {
            gVar.f9860f = null;
            gVar.f9858d = null;
            gVar.f9859e = null;
            gVar.f9866l = 1;
            int i = this.f9846b;
            if (i > 0) {
                int i2 = this.f9848d;
                if ((i2 & 1) == 0) {
                    this.f9848d = i2 + 1;
                    this.f9846b = i - 1;
                    this.f9847c++;
                }
            }
            gVar.f9858d = this.f9845a;
            this.f9845a = gVar;
            int i3 = this.f9848d + 1;
            this.f9848d = i3;
            int i4 = this.f9846b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f9848d = i3 + 1;
                this.f9846b = i4 - 1;
                this.f9847c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f9848d & i6) == i6) {
                    int i7 = this.f9847c;
                    if (i7 == 0) {
                        C3005g<K, V> gVar2 = this.f9845a;
                        C3005g<K, V> gVar3 = gVar2.f9858d;
                        C3005g<K, V> gVar4 = gVar3.f9858d;
                        gVar3.f9858d = gVar4.f9858d;
                        this.f9845a = gVar3;
                        gVar3.f9859e = gVar4;
                        gVar3.f9860f = gVar2;
                        gVar3.f9866l = gVar2.f9866l + 1;
                        gVar4.f9858d = gVar3;
                        gVar2.f9858d = gVar3;
                    } else {
                        if (i7 == 1) {
                            C3005g<K, V> gVar5 = this.f9845a;
                            C3005g<K, V> gVar6 = gVar5.f9858d;
                            this.f9845a = gVar6;
                            gVar6.f9860f = gVar5;
                            gVar6.f9866l = gVar5.f9866l + 1;
                            gVar5.f9858d = gVar6;
                        } else if (i7 != 2) {
                        }
                        this.f9847c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo10292b(int i) {
            this.f9846b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f9848d = 0;
            this.f9847c = 0;
            this.f9845a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3005g<K, V> mo10293c() {
            C3005g<K, V> gVar = this.f9845a;
            if (gVar.f9858d == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: q1.q$c */
    static class C2999c<K, V> {

        /* renamed from: a */
        private C3005g<K, V> f9849a;

        C2999c() {
        }

        /* renamed from: a */
        public C3005g<K, V> mo10294a() {
            C3005g<K, V> gVar = this.f9849a;
            if (gVar == null) {
                return null;
            }
            C3005g<K, V> gVar2 = gVar.f9858d;
            gVar.f9858d = null;
            C3005g<K, V> gVar3 = gVar.f9860f;
            while (true) {
                C3005g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C3005g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f9858d = gVar5;
                    gVar3 = gVar2.f9859e;
                } else {
                    this.f9849a = gVar5;
                    return gVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo10295b(C3005g<K, V> gVar) {
            C3005g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f9858d = gVar2;
                gVar2 = gVar;
                gVar = gVar.f9859e;
            }
            this.f9849a = gVar2;
        }
    }

    /* renamed from: q1.q$d */
    final class C3000d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: q1.q$d$a */
        class C3001a extends C2996q<K, V>.f<Map.Entry<K, V>> {
            C3001a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo10309a();
            }
        }

        C3000d() {
        }

        public void clear() {
            C2996q.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C2996q.this.mo10279e((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3001a();
        }

        public boolean remove(Object obj) {
            C3005g e;
            if (!(obj instanceof Map.Entry) || (e = C2996q.this.mo10279e((Map.Entry) obj)) == null) {
                return false;
            }
            C2996q.this.mo10283h(e, true);
            return true;
        }

        public int size() {
            return C2996q.this.f9840g;
        }
    }

    /* renamed from: q1.q$e */
    final class C3002e extends AbstractSet<K> {

        /* renamed from: q1.q$e$a */
        class C3003a extends C2996q<K, V>.f<K> {
            C3003a() {
                super();
            }

            public K next() {
                return mo10309a().f9863i;
            }
        }

        C3002e() {
        }

        public void clear() {
            C2996q.this.clear();
        }

        public boolean contains(Object obj) {
            return C2996q.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C3003a();
        }

        public boolean remove(Object obj) {
            return C2996q.this.mo10284i(obj) != null;
        }

        public int size() {
            return C2996q.this.f9840g;
        }
    }

    /* renamed from: q1.q$f */
    abstract class C3004f<T> implements Iterator<T> {

        /* renamed from: d */
        C3005g<K, V> f9854d;

        /* renamed from: e */
        C3005g<K, V> f9855e = null;

        /* renamed from: f */
        int f9856f;

        C3004f() {
            this.f9854d = C2996q.this.f9839f.f9861g;
            this.f9856f = C2996q.this.f9841h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C3005g<K, V> mo10309a() {
            C3005g<K, V> gVar = this.f9854d;
            C2996q qVar = C2996q.this;
            if (gVar == qVar.f9839f) {
                throw new NoSuchElementException();
            } else if (qVar.f9841h == this.f9856f) {
                this.f9854d = gVar.f9861g;
                this.f9855e = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f9854d != C2996q.this.f9839f;
        }

        public final void remove() {
            C3005g<K, V> gVar = this.f9855e;
            if (gVar != null) {
                C2996q.this.mo10283h(gVar, true);
                this.f9855e = null;
                this.f9856f = C2996q.this.f9841h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: q1.q$g */
    static final class C3005g<K, V> implements Map.Entry<K, V> {

        /* renamed from: d */
        C3005g<K, V> f9858d;

        /* renamed from: e */
        C3005g<K, V> f9859e;

        /* renamed from: f */
        C3005g<K, V> f9860f;

        /* renamed from: g */
        C3005g<K, V> f9861g;

        /* renamed from: h */
        C3005g<K, V> f9862h;

        /* renamed from: i */
        final K f9863i;

        /* renamed from: j */
        final int f9864j;

        /* renamed from: k */
        V f9865k;

        /* renamed from: l */
        int f9866l;

        C3005g() {
            this.f9863i = null;
            this.f9864j = -1;
            this.f9862h = this;
            this.f9861g = this;
        }

        C3005g(C3005g<K, V> gVar, K k, int i, C3005g<K, V> gVar2, C3005g<K, V> gVar3) {
            this.f9858d = gVar;
            this.f9863i = k;
            this.f9864j = i;
            this.f9866l = 1;
            this.f9861g = gVar2;
            this.f9862h = gVar3;
            gVar3.f9861g = this;
            gVar2.f9862h = this;
        }

        /* renamed from: a */
        public C3005g<K, V> mo10312a() {
            C3005g<K, V> gVar = this;
            for (C3005g<K, V> gVar2 = this.f9859e; gVar2 != null; gVar2 = gVar2.f9859e) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C3005g<K, V> mo10313b() {
            C3005g<K, V> gVar = this;
            for (C3005g<K, V> gVar2 = this.f9860f; gVar2 != null; gVar2 = gVar2.f9860f) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f9863i
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f9865k
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p108q1.C2996q.C3005g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f9863i;
        }

        public V getValue() {
            return this.f9865k;
        }

        public int hashCode() {
            K k = this.f9863i;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f9865k;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f9865k;
            this.f9865k = v;
            return v2;
        }

        public String toString() {
            return this.f9863i + "=" + this.f9865k;
        }
    }

    static {
        Class<C2996q> cls = C2996q.class;
    }

    C2996q() {
        this((Comparator) null);
    }

    C2996q(Comparator<? super K> comparator) {
        this.f9840g = 0;
        this.f9841h = 0;
        this.f9837d = comparator == null ? f9836l : comparator;
        this.f9839f = new C3005g<>();
        C3005g<K, V>[] gVarArr = new C3005g[16];
        this.f9838e = gVarArr;
        this.f9842i = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: a */
    private void m13588a() {
        C3005g<K, V>[] b = m13589b(this.f9838e);
        this.f9838e = b;
        this.f9842i = (b.length / 2) + (b.length / 4);
    }

    /* renamed from: b */
    static <K, V> C3005g<K, V>[] m13589b(C3005g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C3005g<K, V>[] gVarArr2 = new C3005g[(length * 2)];
        C2999c cVar = new C2999c();
        C2998b bVar = new C2998b();
        C2998b bVar2 = new C2998b();
        for (int i = 0; i < length; i++) {
            C3005g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo10295b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C3005g a = cVar.mo10294a();
                    if (a == null) {
                        break;
                    } else if ((a.f9864j & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo10292b(i2);
                bVar2.mo10292b(i3);
                cVar.mo10295b(gVar);
                while (true) {
                    C3005g a2 = cVar.mo10294a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f9864j & length) == 0) {
                        bVar.mo10291a(a2);
                    } else {
                        bVar2.mo10291a(a2);
                    }
                }
                C3005g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo10293c() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo10293c();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }

    /* renamed from: c */
    private boolean m13590c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    private void m13591g(C3005g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C3005g<K, V> gVar2 = gVar.f9859e;
            C3005g<K, V> gVar3 = gVar.f9860f;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f9866l : 0;
            int i3 = gVar3 != null ? gVar3.f9866l : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C3005g<K, V> gVar4 = gVar3.f9859e;
                C3005g<K, V> gVar5 = gVar3.f9860f;
                int i5 = gVar5 != null ? gVar5.f9866l : 0;
                if (gVar4 != null) {
                    i = gVar4.f9866l;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m13594l(gVar3);
                }
                m13593k(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C3005g<K, V> gVar6 = gVar2.f9859e;
                C3005g<K, V> gVar7 = gVar2.f9860f;
                int i7 = gVar7 != null ? gVar7.f9866l : 0;
                if (gVar6 != null) {
                    i = gVar6.f9866l;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m13593k(gVar2);
                }
                m13594l(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f9866l = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f9866l = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f9858d;
        }
    }

    /* renamed from: j */
    private void m13592j(C3005g<K, V> gVar, C3005g<K, V> gVar2) {
        C3005g<K, V> gVar3 = gVar.f9858d;
        gVar.f9858d = null;
        if (gVar2 != null) {
            gVar2.f9858d = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f9864j;
            C3005g<K, V>[] gVarArr = this.f9838e;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f9859e == gVar) {
            gVar3.f9859e = gVar2;
        } else {
            gVar3.f9860f = gVar2;
        }
    }

    /* renamed from: k */
    private void m13593k(C3005g<K, V> gVar) {
        C3005g<K, V> gVar2 = gVar.f9859e;
        C3005g<K, V> gVar3 = gVar.f9860f;
        C3005g<K, V> gVar4 = gVar3.f9859e;
        C3005g<K, V> gVar5 = gVar3.f9860f;
        gVar.f9860f = gVar4;
        if (gVar4 != null) {
            gVar4.f9858d = gVar;
        }
        m13592j(gVar, gVar3);
        gVar3.f9859e = gVar;
        gVar.f9858d = gVar3;
        int i = 0;
        int max = Math.max(gVar2 != null ? gVar2.f9866l : 0, gVar4 != null ? gVar4.f9866l : 0) + 1;
        gVar.f9866l = max;
        if (gVar5 != null) {
            i = gVar5.f9866l;
        }
        gVar3.f9866l = Math.max(max, i) + 1;
    }

    /* renamed from: l */
    private void m13594l(C3005g<K, V> gVar) {
        C3005g<K, V> gVar2 = gVar.f9859e;
        C3005g<K, V> gVar3 = gVar.f9860f;
        C3005g<K, V> gVar4 = gVar2.f9859e;
        C3005g<K, V> gVar5 = gVar2.f9860f;
        gVar.f9859e = gVar5;
        if (gVar5 != null) {
            gVar5.f9858d = gVar;
        }
        m13592j(gVar, gVar2);
        gVar2.f9860f = gVar;
        gVar.f9858d = gVar2;
        int i = 0;
        int max = Math.max(gVar3 != null ? gVar3.f9866l : 0, gVar5 != null ? gVar5.f9866l : 0) + 1;
        gVar.f9866l = max;
        if (gVar4 != null) {
            i = gVar4.f9866l;
        }
        gVar2.f9866l = Math.max(max, i) + 1;
    }

    /* renamed from: m */
    private static int m13595m(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public void clear() {
        Arrays.fill(this.f9838e, (Object) null);
        this.f9840g = 0;
        this.f9841h++;
        C3005g<K, V> gVar = this.f9839f;
        C3005g<K, V> gVar2 = gVar.f9861g;
        while (gVar2 != gVar) {
            C3005g<K, V> gVar3 = gVar2.f9861g;
            gVar2.f9862h = null;
            gVar2.f9861g = null;
            gVar2 = gVar3;
        }
        gVar.f9862h = gVar;
        gVar.f9861g = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo10281f(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3005g<K, V> mo10278d(K k, boolean z) {
        int i;
        C3005g<K, V> gVar;
        C3005g<K, V> gVar2;
        Comparator<? super K> comparator = this.f9837d;
        C3005g<K, V>[] gVarArr = this.f9838e;
        int m = m13595m(k.hashCode());
        int length = (gVarArr.length - 1) & m;
        C3005g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f9836l ? (Comparable) k : null;
            while (true) {
                K k2 = gVar3.f9863i;
                int compareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (compareTo == 0) {
                    return gVar3;
                }
                C3005g<K, V> gVar4 = compareTo < 0 ? gVar3.f9859e : gVar3.f9860f;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = compareTo;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C3005g<K, V> gVar5 = this.f9839f;
        if (gVar != null) {
            gVar2 = new C3005g<>(gVar, k, m, gVar5, gVar5.f9862h);
            if (i < 0) {
                gVar.f9859e = gVar2;
            } else {
                gVar.f9860f = gVar2;
            }
            m13591g(gVar, true);
        } else if (comparator != f9836l || (k instanceof Comparable)) {
            gVar2 = new C3005g<>(gVar, k, m, gVar5, gVar5.f9862h);
            gVarArr[length] = gVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i2 = this.f9840g;
        this.f9840g = i2 + 1;
        if (i2 > this.f9842i) {
            m13588a();
        }
        this.f9841h++;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3005g<K, V> mo10279e(Map.Entry<?, ?> entry) {
        C3005g<K, V> f = mo10281f(entry.getKey());
        if (f != null && m13590c(f.f9865k, entry.getValue())) {
            return f;
        }
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C2996q<K, V>.d dVar = this.f9843j;
        if (dVar != null) {
            return dVar;
        }
        C2996q<K, V>.d dVar2 = new C3000d();
        this.f9843j = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C3005g<K, V> mo10281f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo10278d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C3005g f = mo10281f(obj);
        if (f != null) {
            return f.f9865k;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10283h(C3005g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C3005g<K, V> gVar2 = gVar.f9862h;
            gVar2.f9861g = gVar.f9861g;
            gVar.f9861g.f9862h = gVar2;
            gVar.f9862h = null;
            gVar.f9861g = null;
        }
        C3005g<K, V> gVar3 = gVar.f9859e;
        C3005g<K, V> gVar4 = gVar.f9860f;
        C3005g<K, V> gVar5 = gVar.f9858d;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m13592j(gVar, gVar3);
                gVar.f9859e = null;
            } else if (gVar4 != null) {
                m13592j(gVar, gVar4);
                gVar.f9860f = null;
            } else {
                m13592j(gVar, (C3005g<K, V>) null);
            }
            m13591g(gVar5, false);
            this.f9840g--;
            this.f9841h++;
            return;
        }
        C3005g<K, V> b = gVar3.f9866l > gVar4.f9866l ? gVar3.mo10313b() : gVar4.mo10312a();
        mo10283h(b, false);
        C3005g<K, V> gVar6 = gVar.f9859e;
        if (gVar6 != null) {
            i = gVar6.f9866l;
            b.f9859e = gVar6;
            gVar6.f9858d = b;
            gVar.f9859e = null;
        } else {
            i = 0;
        }
        C3005g<K, V> gVar7 = gVar.f9860f;
        if (gVar7 != null) {
            i2 = gVar7.f9866l;
            b.f9860f = gVar7;
            gVar7.f9858d = b;
            gVar.f9860f = null;
        }
        b.f9866l = Math.max(i, i2) + 1;
        m13592j(gVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3005g<K, V> mo10284i(Object obj) {
        C3005g<K, V> f = mo10281f(obj);
        if (f != null) {
            mo10283h(f, true);
        }
        return f;
    }

    public Set<K> keySet() {
        C2996q<K, V>.e eVar = this.f9844k;
        if (eVar != null) {
            return eVar;
        }
        C2996q<K, V>.e eVar2 = new C3002e();
        this.f9844k = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C3005g d = mo10278d(k, true);
        V v2 = d.f9865k;
        d.f9865k = v;
        return v2;
    }

    public V remove(Object obj) {
        C3005g i = mo10284i(obj);
        if (i != null) {
            return i.f9865k;
        }
        return null;
    }

    public int size() {
        return this.f9840g;
    }
}
