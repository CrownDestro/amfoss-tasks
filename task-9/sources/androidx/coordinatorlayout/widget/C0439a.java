package androidx.coordinatorlayout.widget;

import androidx.core.util.C0609e;
import androidx.core.util.C0610f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p070k.C2348g;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0439a<T> {

    /* renamed from: a */
    private final C0609e<ArrayList<T>> f2240a = new C0610f(10);

    /* renamed from: b */
    private final C2348g<T, ArrayList<T>> f2241b = new C2348g<>();

    /* renamed from: c */
    private final ArrayList<T> f2242c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2243d = new HashSet<>();

    /* renamed from: e */
    private void m2095e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f2241b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2095e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m2096f() {
        ArrayList<T> b = this.f2240a.mo2664b();
        return b == null ? new ArrayList<>() : b;
    }

    /* renamed from: k */
    private void m2097k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2240a.mo2663a(arrayList);
    }

    /* renamed from: a */
    public void mo2408a(T t, T t2) {
        if (!this.f2241b.containsKey(t) || !this.f2241b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f2241b.get(t);
        if (arrayList == null) {
            arrayList = m2096f();
            this.f2241b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo2409b(T t) {
        if (!this.f2241b.containsKey(t)) {
            this.f2241b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo2410c() {
        int size = this.f2241b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2241b.mo8794m(i);
            if (m != null) {
                m2097k(m);
            }
        }
        this.f2241b.clear();
    }

    /* renamed from: d */
    public boolean mo2411d(T t) {
        return this.f2241b.containsKey(t);
    }

    /* renamed from: g */
    public List mo2412g(T t) {
        return this.f2241b.get(t);
    }

    /* renamed from: h */
    public List<T> mo2413h(T t) {
        int size = this.f2241b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2241b.mo8794m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2241b.mo8789i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo2414i() {
        this.f2242c.clear();
        this.f2243d.clear();
        int size = this.f2241b.size();
        for (int i = 0; i < size; i++) {
            m2095e(this.f2241b.mo8789i(i), this.f2242c, this.f2243d);
        }
        return this.f2242c;
    }

    /* renamed from: j */
    public boolean mo2415j(T t) {
        int size = this.f2241b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2241b.mo8794m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
