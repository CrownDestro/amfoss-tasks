package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C1205j;
import androidx.window.layout.C1210k;
import java.util.ArrayList;
import java.util.List;
import p041f3.C1924k;
import p101p0.C2905b;

/* renamed from: androidx.window.layout.i */
public final class C1204i {

    /* renamed from: a */
    public static final C1204i f4216a = new C1204i();

    private C1204i() {
    }

    /* renamed from: c */
    private final boolean m5968c(Activity activity, C2905b bVar) {
        Rect a = C1243y.f4277a.mo5068a(activity).mo5064a();
        if (bVar.mo10071e()) {
            return false;
        }
        if (bVar.mo10070d() != a.width() && bVar.mo10067a() != a.height()) {
            return false;
        }
        if (bVar.mo10070d() >= a.width() || bVar.mo10067a() >= a.height()) {
            return (bVar.mo10070d() == a.width() && bVar.mo10067a() == a.height()) ? false : true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1205j mo5013a(Activity activity, FoldingFeature foldingFeature) {
        C1210k.C1212b bVar;
        C1205j.C1208b bVar2;
        C1924k.m9141g(activity, "activity");
        C1924k.m9141g(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = C1210k.C1212b.f4229b.mo5024a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = C1210k.C1212b.f4229b.mo5025b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = C1205j.C1208b.f4222c;
        } else if (state != 2) {
            return null;
        } else {
            bVar2 = C1205j.C1208b.f4223d;
        }
        Rect bounds = foldingFeature.getBounds();
        C1924k.m9140f(bounds, "oemFeature.bounds");
        if (!m5968c(activity, new C2905b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        C1924k.m9140f(bounds2, "oemFeature.bounds");
        return new C1210k(new C2905b(bounds2), bVar, bVar2);
    }

    /* renamed from: b */
    public final C1240v mo5014b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        C1205j jVar;
        C1924k.m9141g(activity, "activity");
        C1924k.m9141g(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C1924k.m9140f(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C1204i iVar = f4216a;
                C1924k.m9140f(foldingFeature, "feature");
                jVar = iVar.mo5013a(activity, foldingFeature);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return new C1240v(arrayList);
    }
}
