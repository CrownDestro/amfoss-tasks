package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0613a;
import androidx.core.view.C0735z;
import androidx.core.view.accessibility.C0624d;
import androidx.core.view.accessibility.C0628e;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.k */
public class C1148k extends C0613a {

    /* renamed from: d */
    final RecyclerView f4036d;

    /* renamed from: e */
    private final C1149a f4037e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    public static class C1149a extends C0613a {

        /* renamed from: d */
        final C1148k f4038d;

        /* renamed from: e */
        private Map<View, C0613a> f4039e = new WeakHashMap();

        public C1149a(C1148k kVar) {
            this.f4038d = kVar;
        }

        /* renamed from: a */
        public boolean mo2665a(View view, AccessibilityEvent accessibilityEvent) {
            C0613a aVar = this.f4039e.get(view);
            return aVar != null ? aVar.mo2665a(view, accessibilityEvent) : super.mo2665a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C0628e mo2666b(View view) {
            C0613a aVar = this.f4039e.get(view);
            return aVar != null ? aVar.mo2666b(view) : super.mo2666b(view);
        }

        /* renamed from: f */
        public void mo2668f(View view, AccessibilityEvent accessibilityEvent) {
            C0613a aVar = this.f4039e.get(view);
            if (aVar != null) {
                aVar.mo2668f(view, accessibilityEvent);
            } else {
                super.mo2668f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo2669g(View view, C0624d dVar) {
            if (!this.f4038d.mo4722o() && this.f4038d.f4036d.getLayoutManager() != null) {
                this.f4038d.f4036d.getLayoutManager().mo4362R0(view, dVar);
                C0613a aVar = this.f4039e.get(view);
                if (aVar != null) {
                    aVar.mo2669g(view, dVar);
                    return;
                }
            }
            super.mo2669g(view, dVar);
        }

        /* renamed from: h */
        public void mo2670h(View view, AccessibilityEvent accessibilityEvent) {
            C0613a aVar = this.f4039e.get(view);
            if (aVar != null) {
                aVar.mo2670h(view, accessibilityEvent);
            } else {
                super.mo2670h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo2671i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0613a aVar = this.f4039e.get(viewGroup);
            return aVar != null ? aVar.mo2671i(viewGroup, view, accessibilityEvent) : super.mo2671i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo2672j(View view, int i, Bundle bundle) {
            if (this.f4038d.mo4722o() || this.f4038d.f4036d.getLayoutManager() == null) {
                return super.mo2672j(view, i, bundle);
            }
            C0613a aVar = this.f4039e.get(view);
            if (aVar != null) {
                if (aVar.mo2672j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2672j(view, i, bundle)) {
                return true;
            }
            return this.f4038d.f4036d.getLayoutManager().mo4398l1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo2673l(View view, int i) {
            C0613a aVar = this.f4039e.get(view);
            if (aVar != null) {
                aVar.mo2673l(view, i);
            } else {
                super.mo2673l(view, i);
            }
        }

        /* renamed from: m */
        public void mo2674m(View view, AccessibilityEvent accessibilityEvent) {
            C0613a aVar = this.f4039e.get(view);
            if (aVar != null) {
                aVar.mo2674m(view, accessibilityEvent);
            } else {
                super.mo2674m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C0613a mo4723n(View view) {
            return this.f4039e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo4724o(View view) {
            C0613a n = C0735z.m3219n(view);
            if (n != null && n != this) {
                this.f4039e.put(view, n);
            }
        }
    }

    public C1148k(RecyclerView recyclerView) {
        this.f4036d = recyclerView;
        C0613a n = mo4721n();
        this.f4037e = (n == null || !(n instanceof C1149a)) ? new C1149a(this) : (C1149a) n;
    }

    /* renamed from: f */
    public void mo2668f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2668f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo4722o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo3979N0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo2669g(View view, C0624d dVar) {
        super.mo2669g(view, dVar);
        if (!mo4722o() && this.f4036d.getLayoutManager() != null) {
            this.f4036d.getLayoutManager().mo4358P0(dVar);
        }
    }

    /* renamed from: j */
    public boolean mo2672j(View view, int i, Bundle bundle) {
        if (super.mo2672j(view, i, bundle)) {
            return true;
        }
        if (mo4722o() || this.f4036d.getLayoutManager() == null) {
            return false;
        }
        return this.f4036d.getLayoutManager().mo4394j1(i, bundle);
    }

    /* renamed from: n */
    public C0613a mo4721n() {
        return this.f4037e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4722o() {
        return this.f4036d.mo4122l0();
    }
}
