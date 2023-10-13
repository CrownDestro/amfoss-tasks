package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.layout.C1205j;
import androidx.window.layout.C1210k;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p034e3.C1780l;
import p041f3.C1920g;
import p041f3.C1924k;
import p041f3.C1925l;
import p101p0.C2905b;
import p101p0.C2909e;
import p101p0.C2910f;

/* renamed from: androidx.window.layout.m */
public final class C1220m {

    /* renamed from: b */
    public static final C1221a f4240b = new C1221a((C1920g) null);

    /* renamed from: c */
    private static final String f4241c = C1220m.class.getSimpleName();

    /* renamed from: a */
    private final C2910f.C2912b f4242a;

    /* renamed from: androidx.window.layout.m$a */
    public static final class C1221a {
        private C1221a() {
        }

        public /* synthetic */ C1221a(C1920g gVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: a */
        public final int mo5037a(SidecarDeviceState sidecarDeviceState) {
            C1924k.m9141g(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        /* renamed from: b */
        public final int mo5038b(SidecarDeviceState sidecarDeviceState) {
            C1924k.m9141g(sidecarDeviceState, "sidecarDeviceState");
            int a = mo5037a(sidecarDeviceState);
            if (a < 0 || a > 4) {
                return 0;
            }
            return a;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: c */
        public final List<SidecarDisplayFeature> mo5039c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C1924k.m9141g(sidecarWindowLayoutInfo, "info");
            try {
                List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? C3263l.m14369f() : list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return C3263l.m14369f();
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: d */
        public final void mo5040d(SidecarDeviceState sidecarDeviceState, int i) {
            C1924k.m9141g(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                Class<SidecarDeviceState> cls = SidecarDeviceState.class;
                try {
                    cls.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.m$b */
    static final class C1222b extends C1925l implements C1780l<SidecarDisplayFeature, Boolean> {

        /* renamed from: e */
        public static final C1222b f4243e = new C1222b();

        C1222b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo3836n(SidecarDisplayFeature sidecarDisplayFeature) {
            C1924k.m9141g(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.window.layout.m$c */
    static final class C1223c extends C1925l implements C1780l<SidecarDisplayFeature, Boolean> {

        /* renamed from: e */
        public static final C1223c f4244e = new C1223c();

        C1223c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo3836n(SidecarDisplayFeature sidecarDisplayFeature) {
            C1924k.m9141g(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* renamed from: androidx.window.layout.m$d */
    static final class C1224d extends C1925l implements C1780l<SidecarDisplayFeature, Boolean> {

        /* renamed from: e */
        public static final C1224d f4245e = new C1224d();

        C1224d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo3836n(SidecarDisplayFeature sidecarDisplayFeature) {
            C1924k.m9141g(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.window.layout.m$e */
    static final class C1225e extends C1925l implements C1780l<SidecarDisplayFeature, Boolean> {

        /* renamed from: e */
        public static final C1225e f4246e = new C1225e();

        C1225e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo3836n(SidecarDisplayFeature sidecarDisplayFeature) {
            C1924k.m9141g(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public C1220m() {
        this((C2910f.C2912b) null, 1, (C1920g) null);
    }

    public C1220m(C2910f.C2912b bVar) {
        C1924k.m9141g(bVar, "verificationMode");
        this.f4242a = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1220m(C2910f.C2912b bVar, int i, C1920g gVar) {
        this((i & 1) != 0 ? C2910f.C2912b.QUIET : bVar);
    }

    /* renamed from: b */
    private final boolean m6011b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C1924k.m9136b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C1924k.m9136b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* renamed from: c */
    private final boolean m6012c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!m6011b(list.get(i), list2.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5032a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C1924k.m9136b(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C1221a aVar = f4240b;
        return aVar.mo5038b(sidecarDeviceState) == aVar.mo5038b(sidecarDeviceState2);
    }

    /* renamed from: d */
    public final boolean mo5033d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C1924k.m9136b(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C1221a aVar = f4240b;
        return m6012c(aVar.mo5039c(sidecarWindowLayoutInfo), aVar.mo5039c(sidecarWindowLayoutInfo2));
    }

    /* renamed from: e */
    public final C1240v mo5034e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        C1924k.m9141g(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new C1240v(C3263l.m14369f());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C1221a aVar = f4240b;
        aVar.mo5040d(sidecarDeviceState2, aVar.mo5038b(sidecarDeviceState));
        return new C1240v(mo5035f(aVar.mo5039c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* renamed from: f */
    public final List<C1198e> mo5035f(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        C1924k.m9141g(list, "sidecarDisplayFeatures");
        C1924k.m9141g(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature g : list) {
            C1198e g2 = mo5036g(g, sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C1198e mo5036g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C1210k.C1212b bVar;
        C1205j.C1208b bVar2;
        C1924k.m9141g(sidecarDisplayFeature, "feature");
        C1924k.m9141g(sidecarDeviceState, "deviceState");
        C2910f.C2911a aVar = C2910f.f9645a;
        String str = f4241c;
        C1924k.m9140f(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C2910f.C2911a.m13216b(aVar, sidecarDisplayFeature, str, this.f4242a, (C2909e) null, 4, (Object) null).mo10078c("Type must be either TYPE_FOLD or TYPE_HINGE", C1222b.f4243e).mo10078c("Feature bounds must not be 0", C1223c.f4244e).mo10078c("TYPE_FOLD must have 0 area", C1224d.f4245e).mo10078c("Feature be pinned to either left or top", C1225e.f4246e).mo10077a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = C1210k.C1212b.f4229b.mo5024a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = C1210k.C1212b.f4229b.mo5025b();
        }
        int b = f4240b.mo5038b(sidecarDeviceState);
        if (b == 0 || b == 1) {
            return null;
        }
        if (b == 2) {
            bVar2 = C1205j.C1208b.f4223d;
        } else if (b != 3 && b == 4) {
            return null;
        } else {
            bVar2 = C1205j.C1208b.f4222c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C1924k.m9140f(rect, "feature.rect");
        return new C1210k(new C2905b(rect), bVar, bVar2);
    }
}
