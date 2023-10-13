package p070k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: k.b */
public final class C2337b<E> implements Collection<E>, Set<E> {

    /* renamed from: h */
    private static final int[] f8056h = new int[0];

    /* renamed from: i */
    private static final Object[] f8057i = new Object[0];

    /* renamed from: j */
    private static Object[] f8058j;

    /* renamed from: k */
    private static int f8059k;

    /* renamed from: l */
    private static Object[] f8060l;

    /* renamed from: m */
    private static int f8061m;

    /* renamed from: d */
    private int[] f8062d;

    /* renamed from: e */
    Object[] f8063e;

    /* renamed from: f */
    int f8064f;

    /* renamed from: g */
    private C2342f<E, E> f8065g;

    /* renamed from: k.b$a */
    class C2338a extends C2342f<E, E> {
        C2338a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8665a() {
            C2337b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo8666b(int i, int i2) {
            return C2337b.this.f8063e[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo8667c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo8668d() {
            return C2337b.this.f8064f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo8669e(Object obj) {
            return C2337b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo8670f(Object obj) {
            return C2337b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo8671g(E e, E e2) {
            C2337b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8672h(int i) {
            C2337b.this.mo8674C(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo8673i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C2337b() {
        this(0);
    }

    public C2337b(int i) {
        if (i == 0) {
            this.f8062d = f8056h;
            this.f8063e = f8057i;
        } else {
            m10850s(i);
        }
        this.f8064f = 0;
    }

    /* renamed from: A */
    private int m10848A(Object obj, int i) {
        int i2 = this.f8064f;
        if (i2 == 0) {
            return -1;
        }
        int a = C2339c.m10865a(this.f8062d, i2, i);
        if (a < 0 || obj.equals(this.f8063e[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f8062d[i3] == i) {
            if (obj.equals(this.f8063e[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f8062d[i4] == i) {
            if (obj.equals(this.f8063e[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: B */
    private int m10849B() {
        int i = this.f8064f;
        if (i == 0) {
            return -1;
        }
        int a = C2339c.m10865a(this.f8062d, i, 0);
        if (a < 0 || this.f8063e[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f8062d[i2] == 0) {
            if (this.f8063e[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f8062d[i3] == 0) {
            if (this.f8063e[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: s */
    private void m10850s(int i) {
        if (i == 8) {
            synchronized (C2337b.class) {
                Object[] objArr = f8060l;
                if (objArr != null) {
                    this.f8063e = objArr;
                    f8060l = (Object[]) objArr[0];
                    this.f8062d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8061m--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C2337b.class) {
                Object[] objArr2 = f8058j;
                if (objArr2 != null) {
                    this.f8063e = objArr2;
                    f8058j = (Object[]) objArr2[0];
                    this.f8062d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8059k--;
                    return;
                }
            }
        }
        this.f8062d = new int[i];
        this.f8063e = new Object[i];
    }

    /* renamed from: y */
    private static void m10851y(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2337b.class) {
                if (f8061m < 10) {
                    objArr[0] = f8060l;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8060l = objArr;
                    f8061m++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C2337b.class) {
                if (f8059k < 10) {
                    objArr[0] = f8058j;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8058j = objArr;
                    f8059k++;
                }
            }
        }
    }

    /* renamed from: z */
    private C2342f<E, E> m10852z() {
        if (this.f8065g == null) {
            this.f8065g = new C2338a();
        }
        return this.f8065g;
    }

    /* renamed from: C */
    public E mo8674C(int i) {
        E[] eArr = this.f8063e;
        E e = eArr[i];
        int i2 = this.f8064f;
        if (i2 <= 1) {
            m10851y(this.f8062d, eArr, i2);
            this.f8062d = f8056h;
            this.f8063e = f8057i;
            this.f8064f = 0;
        } else {
            int[] iArr = this.f8062d;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f8064f = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f8063e;
                    System.arraycopy(objArr, i5, objArr, i, this.f8064f - i);
                }
                this.f8063e[this.f8064f] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m10850s(i3);
                this.f8064f--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f8062d, 0, i);
                    System.arraycopy(eArr, 0, this.f8063e, 0, i);
                }
                int i6 = this.f8064f;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f8062d, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f8063e, i, this.f8064f - i);
                }
            }
        }
        return e;
    }

    /* renamed from: D */
    public E mo8675D(int i) {
        return this.f8063e[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m10849B();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m10848A(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f8064f;
        int[] iArr = this.f8062d;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f8063e;
            m10850s(i5);
            int[] iArr2 = this.f8062d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8063e, 0, objArr.length);
            }
            m10851y(iArr, objArr, this.f8064f);
        }
        int i6 = this.f8064f;
        if (i3 < i6) {
            int[] iArr3 = this.f8062d;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f8063e;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f8064f - i3);
        }
        this.f8062d[i3] = i;
        this.f8063e[i3] = e;
        this.f8064f++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo8693x(this.f8064f + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f8064f;
        if (i != 0) {
            m10851y(this.f8062d, this.f8063e, i);
            this.f8062d = f8056h;
            this.f8063e = f8057i;
            this.f8064f = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f8064f) {
                try {
                    if (!set.contains(mo8675D(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f8062d;
        int i = this.f8064f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m10849B() : m10848A(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f8064f <= 0;
    }

    public Iterator<E> iterator() {
        return m10852z().mo8716m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo8674C(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f8064f - 1; i >= 0; i--) {
            if (!collection.contains(this.f8063e[i])) {
                mo8674C(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f8064f;
    }

    public Object[] toArray() {
        int i = this.f8064f;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f8063e, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f8064f) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f8064f);
        }
        System.arraycopy(this.f8063e, 0, tArr, 0, this.f8064f);
        int length = tArr.length;
        int i = this.f8064f;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8064f * 14);
        sb.append('{');
        for (int i = 0; i < this.f8064f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object D = mo8675D(i);
            if (D != this) {
                sb.append(D);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: x */
    public void mo8693x(int i) {
        int[] iArr = this.f8062d;
        if (iArr.length < i) {
            Object[] objArr = this.f8063e;
            m10850s(i);
            int i2 = this.f8064f;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f8062d, 0, i2);
                System.arraycopy(objArr, 0, this.f8063e, 0, this.f8064f);
            }
            m10851y(iArr, objArr, this.f8064f);
        }
    }
}
