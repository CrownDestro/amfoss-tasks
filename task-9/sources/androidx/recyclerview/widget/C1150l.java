package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
class C1150l {
    /* renamed from: a */
    static int m5699a(RecyclerView.C1064a0 a0Var, C1143i iVar, View view, View view2, RecyclerView.C1084o oVar, boolean z) {
        if (oVar.mo4350K() == 0 || a0Var.mo4196b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo4396k0(view) - oVar.mo4396k0(view2)) + 1;
        }
        return Math.min(iVar.mo4711n(), iVar.mo4701d(view2) - iVar.mo4704g(view));
    }

    /* renamed from: b */
    static int m5700b(RecyclerView.C1064a0 a0Var, C1143i iVar, View view, View view2, RecyclerView.C1084o oVar, boolean z, boolean z2) {
        if (oVar.mo4350K() == 0 || a0Var.mo4196b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo4196b() - Math.max(oVar.mo4396k0(view), oVar.mo4396k0(view2))) - 1) : Math.max(0, Math.min(oVar.mo4396k0(view), oVar.mo4396k0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(iVar.mo4701d(view2) - iVar.mo4704g(view))) / ((float) (Math.abs(oVar.mo4396k0(view) - oVar.mo4396k0(view2)) + 1)))) + ((float) (iVar.mo4710m() - iVar.mo4704g(view))));
    }

    /* renamed from: c */
    static int m5701c(RecyclerView.C1064a0 a0Var, C1143i iVar, View view, View view2, RecyclerView.C1084o oVar, boolean z) {
        if (oVar.mo4350K() == 0 || a0Var.mo4196b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo4196b();
        }
        return (int) ((((float) (iVar.mo4701d(view2) - iVar.mo4704g(view))) / ((float) (Math.abs(oVar.mo4396k0(view) - oVar.mo4396k0(view2)) + 1))) * ((float) a0Var.mo4196b()));
    }
}
