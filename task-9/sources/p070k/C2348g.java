package p070k;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: k.g */
public class C2348g<K, V> {

    /* renamed from: g */
    static Object[] f8098g;

    /* renamed from: h */
    static int f8099h;

    /* renamed from: i */
    static Object[] f8100i;

    /* renamed from: j */
    static int f8101j;

    /* renamed from: d */
    int[] f8102d;

    /* renamed from: e */
    Object[] f8103e;

    /* renamed from: f */
    int f8104f;

    public C2348g() {
        this.f8102d = C2339c.f8067a;
        this.f8103e = C2339c.f8069c;
        this.f8104f = 0;
    }

    public C2348g(int i) {
        if (i == 0) {
            this.f8102d = C2339c.f8067a;
            this.f8103e = C2339c.f8069c;
        } else {
            m10911a(i);
        }
        this.f8104f = 0;
    }

    public C2348g(C2348g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo8791j(gVar);
        }
    }

    /* renamed from: a */
    private void m10911a(int i) {
        Class<C2348g> cls = C2348g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f8100i;
                if (objArr != null) {
                    this.f8103e = objArr;
                    f8100i = (Object[]) objArr[0];
                    this.f8102d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8101j--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f8098g;
                if (objArr2 != null) {
                    this.f8103e = objArr2;
                    f8098g = (Object[]) objArr2[0];
                    this.f8102d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8099h--;
                    return;
                }
            }
        }
        this.f8102d = new int[i];
        this.f8103e = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m10912b(int[] iArr, int i, int i2) {
        try {
            return C2339c.m10865a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m10913d(int[] iArr, Object[] objArr, int i) {
        Class<C2348g> cls = C2348g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f8101j < 10) {
                    objArr[0] = f8100i;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8100i = objArr;
                    f8101j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f8099h < 10) {
                    objArr[0] = f8098g;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8098g = objArr;
                    f8099h++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo8777c(int i) {
        int i2 = this.f8104f;
        int[] iArr = this.f8102d;
        if (iArr.length < i) {
            Object[] objArr = this.f8103e;
            m10911a(i);
            if (this.f8104f > 0) {
                System.arraycopy(iArr, 0, this.f8102d, 0, i2);
                System.arraycopy(objArr, 0, this.f8103e, 0, i2 << 1);
            }
            m10913d(iArr, objArr, i2);
        }
        if (this.f8104f != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f8104f;
        if (i > 0) {
            int[] iArr = this.f8102d;
            Object[] objArr = this.f8103e;
            this.f8102d = C2339c.f8067a;
            this.f8103e = C2339c.f8069c;
            this.f8104f = 0;
            m10913d(iArr, objArr, i);
        }
        if (this.f8104f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo8783f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo8787h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8781e(Object obj, int i) {
        int i2 = this.f8104f;
        if (i2 == 0) {
            return -1;
        }
        int b = m10912b(this.f8102d, i2, i);
        if (b < 0 || obj.equals(this.f8103e[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f8102d[i3] == i) {
            if (obj.equals(this.f8103e[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f8102d[i4] == i) {
            if (obj.equals(this.f8103e[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2348g) {
            C2348g gVar = (C2348g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f8104f) {
                try {
                    Object i2 = mo8789i(i);
                    Object m = mo8794m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f8104f) {
                try {
                    Object i4 = mo8789i(i3);
                    Object m2 = mo8794m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo8783f(Object obj) {
        return obj == null ? mo8784g() : mo8781e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8784g() {
        int i = this.f8104f;
        if (i == 0) {
            return -1;
        }
        int b = m10912b(this.f8102d, i, 0);
        if (b < 0 || this.f8103e[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f8102d[i2] == 0) {
            if (this.f8103e[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f8102d[i3] == 0) {
            if (this.f8103e[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo8783f(obj);
        return f >= 0 ? this.f8103e[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8787h(Object obj) {
        int i = this.f8104f * 2;
        Object[] objArr = this.f8103e;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f8102d;
        Object[] objArr = this.f8103e;
        int i = this.f8104f;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo8789i(int i) {
        return this.f8103e[i << 1];
    }

    public boolean isEmpty() {
        return this.f8104f <= 0;
    }

    /* renamed from: j */
    public void mo8791j(C2348g<? extends K, ? extends V> gVar) {
        int i = gVar.f8104f;
        mo8777c(this.f8104f + i);
        if (this.f8104f != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo8789i(i2), gVar.mo8794m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f8102d, 0, this.f8102d, 0, i);
            System.arraycopy(gVar.f8103e, 0, this.f8103e, 0, i << 1);
            this.f8104f = i;
        }
    }

    /* renamed from: k */
    public V mo8792k(int i) {
        V[] vArr = this.f8103e;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f8104f;
        int i4 = 0;
        if (i3 <= 1) {
            m10913d(this.f8102d, vArr, i3);
            this.f8102d = C2339c.f8067a;
            this.f8103e = C2339c.f8069c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f8102d;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f8103e;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f8103e;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m10911a(i6);
                if (i3 == this.f8104f) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f8102d, 0, i);
                        System.arraycopy(vArr, 0, this.f8103e, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f8102d, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f8103e, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f8104f) {
            this.f8104f = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo8793l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f8103e;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo8794m(int i) {
        return this.f8103e[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f8104f;
        if (k == null) {
            i2 = mo8784g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo8781e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f8103e;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f8102d;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f8103e;
            m10911a(i6);
            if (i3 == this.f8104f) {
                int[] iArr2 = this.f8102d;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f8103e, 0, objArr.length);
                }
                m10913d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f8102d;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f8103e;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f8104f - i5) << 1);
        }
        int i8 = this.f8104f;
        if (i3 == i8) {
            int[] iArr4 = this.f8102d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f8103e;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f8104f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo8783f(obj);
        if (f >= 0) {
            return mo8792k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo8783f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo8794m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo8792k(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo8783f(k);
        if (f >= 0) {
            return mo8793l(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo8783f(k);
        if (f < 0) {
            return false;
        }
        V m = mo8794m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo8793l(f, v2);
        return true;
    }

    public int size() {
        return this.f8104f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8104f * 28);
        sb.append('{');
        for (int i = 0; i < this.f8104f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo8789i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo8794m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
