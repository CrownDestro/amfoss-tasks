package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.e0 */
class C0889e0 {

    /* renamed from: a */
    private final ArrayList<Fragment> f3135a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0880d0> f3136b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C0863c0> f3137c = new HashMap<>();

    /* renamed from: d */
    private C0956z f3138d;

    C0889e0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3450A(C0956z zVar) {
        this.f3138d = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C0863c0 mo3451B(String str, C0863c0 c0Var) {
        return (C0863c0) (c0Var != null ? this.f3137c.put(str, c0Var) : this.f3137c.remove(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3452a(Fragment fragment) {
        if (!this.f3135a.contains(fragment)) {
            synchronized (this.f3135a) {
                this.f3135a.add(fragment);
            }
            fragment.f2978o = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3453b() {
        this.f3136b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3454c(String str) {
        return this.f3136b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3455d(int i) {
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null) {
                next.mo3430t(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3456e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3136b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0880d0 next : this.f3136b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.mo3423k();
                    printWriter.println(k);
                    k.mo3260e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3135a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3135a.get(i).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo3457f(String str) {
        C0880d0 d0Var = this.f3136b.get(str);
        if (d0Var != null) {
            return d0Var.mo3423k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3458g(int i) {
        for (int size = this.f3135a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3135a.get(size);
            if (fragment != null && fragment.f2937A == i) {
                return fragment;
            }
        }
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null) {
                Fragment k = next.mo3423k();
                if (k.f2937A == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo3459h(String str) {
        if (str != null) {
            for (int size = this.f3135a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3135a.get(size);
                if (fragment != null && str.equals(fragment.f2939C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null) {
                Fragment k = next.mo3423k();
                if (str.equals(k.f2939C)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3460i(String str) {
        Fragment g;
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null && (g = next.mo3423k().mo3266g(str)) != null) {
                return g;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo3461j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f2947K;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3135a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3135a.get(i);
            if (fragment2.f2947K == viewGroup && (view2 = fragment2.f2948L) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3135a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3135a.get(indexOf);
            if (fragment3.f2947K == viewGroup && (view = fragment3.f2948L) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C0880d0> mo3462k() {
        ArrayList arrayList = new ArrayList();
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> mo3463l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0880d0> it = this.f3136b.values().iterator();
        while (it.hasNext()) {
            C0880d0 next = it.next();
            arrayList.add(next != null ? next.mo3423k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ArrayList<C0863c0> mo3464m() {
        return new ArrayList<>(this.f3137c.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0880d0 mo3465n(String str) {
        return this.f3136b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List<Fragment> mo3466o() {
        ArrayList arrayList;
        if (this.f3135a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3135a) {
            arrayList = new ArrayList(this.f3135a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0956z mo3467p() {
        return this.f3138d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0863c0 mo3468q(String str) {
        return this.f3137c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3469r(C0880d0 d0Var) {
        Fragment k = d0Var.mo3423k();
        if (!mo3454c(k.f2972i)) {
            this.f3136b.put(k.f2972i, d0Var);
            if (k.f2943G) {
                if (k.f2942F) {
                    this.f3138d.mo3714e(k);
                } else {
                    this.f3138d.mo3724o(k);
                }
                k.f2943G = false;
            }
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3470s(C0880d0 d0Var) {
        Fragment k = d0Var.mo3423k();
        if (k.f2942F) {
            this.f3138d.mo3724o(k);
        }
        if (this.f3136b.put(k.f2972i, (Object) null) != null && C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3471t() {
        Iterator<Fragment> it = this.f3135a.iterator();
        while (it.hasNext()) {
            C0880d0 d0Var = this.f3136b.get(it.next().f2972i);
            if (d0Var != null) {
                d0Var.mo3424m();
            }
        }
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null) {
                next.mo3424m();
                Fragment k = next.mo3423k();
                if (k.f2979p && !k.mo3246Y()) {
                    if (k.f2980q && !this.f3137c.containsKey(k.f2972i)) {
                        next.mo3428r();
                    }
                    mo3470s(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3472u(Fragment fragment) {
        synchronized (this.f3135a) {
            this.f3135a.remove(fragment);
        }
        fragment.f2978o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3473v() {
        this.f3136b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3474w(List<String> list) {
        this.f3135a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo3457f(next);
                if (f != null) {
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo3452a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3475x(ArrayList<C0863c0> arrayList) {
        this.f3137c.clear();
        Iterator<C0863c0> it = arrayList.iterator();
        while (it.hasNext()) {
            C0863c0 next = it.next();
            this.f3137c.put(next.f3047e, next);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ArrayList<String> mo3476y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3136b.size());
        for (C0880d0 next : this.f3136b.values()) {
            if (next != null) {
                Fragment k = next.mo3423k();
                next.mo3428r();
                arrayList.add(k.f2972i);
                if (C0937w.m4207H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.f2968e);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public ArrayList<String> mo3477z() {
        synchronized (this.f3135a) {
            if (this.f3135a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3135a.size());
            Iterator<Fragment> it = this.f3135a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2972i);
                if (C0937w.m4207H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2972i + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
