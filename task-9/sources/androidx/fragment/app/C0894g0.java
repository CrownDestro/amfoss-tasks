package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p070k.C2335a;
import p083m0.C2517e;

/* renamed from: androidx.fragment.app.g0 */
class C0894g0 {

    /* renamed from: a */
    static final C0904i0 f3169a = (Build.VERSION.SDK_INT >= 21 ? new C0896h0() : null);

    /* renamed from: b */
    static final C0904i0 f3170b = m4025b();

    /* renamed from: a */
    static void m4024a(Fragment fragment, Fragment fragment2, boolean z, C2335a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.mo3304t();
        } else {
            fragment.mo3304t();
        }
    }

    /* renamed from: b */
    private static C0904i0 m4025b() {
        try {
            return C2517e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static void m4026c(C2335a<String, String> aVar, C2335a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo8794m(size))) {
                aVar.mo8792k(size);
            }
        }
    }

    /* renamed from: d */
    static void m4027d(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }
}
