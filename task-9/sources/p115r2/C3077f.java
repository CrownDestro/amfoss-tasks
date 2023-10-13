package p115r2;

import java.util.ArrayList;
import java.util.Map;
import p091n2.C2672a;
import p091n2.C2679b;
import p091n2.C2687g;
import p115r2.C3068a;

/* renamed from: r2.f */
public final /* synthetic */ class C3077f {
    /* renamed from: a */
    public static C2687g<Object> m13794a() {
        return C3068a.C3071c.f9989d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m13795b(C3068a.C3070b bVar, Object obj, C2672a.C2678e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.mo10398c((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = C3068a.m13775a(th);
        }
        eVar.mo9268a(arrayList);
    }

    /* renamed from: c */
    public static /* synthetic */ void m13796c(C3068a.C3070b bVar, Object obj, C2672a.C2678e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo10397b((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = C3068a.m13775a(th);
        }
        eVar.mo9268a(arrayList);
    }

    /* renamed from: d */
    public static /* synthetic */ void m13797d(C3068a.C3070b bVar, Object obj, C2672a.C2678e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo10399d((String) arrayList2.get(0), (C3068a.C3072d) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = C3068a.m13775a(th);
        }
        eVar.mo9268a(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m13798e(C3068a.C3070b bVar, Object obj, C2672a.C2678e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            bVar.mo10396a();
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = C3068a.m13775a(th);
        }
        eVar.mo9268a(arrayList);
    }

    /* renamed from: f */
    public static void m13799f(C2679b bVar, C3068a.C3070b bVar2) {
        C2672a aVar = new C2672a(bVar, "dev.flutter.pigeon.UrlLauncherApi.canLaunchUrl", m13794a());
        if (bVar2 != null) {
            aVar.mo9421e(new C3073b(bVar2));
        } else {
            aVar.mo9421e((C2672a.C2677d) null);
        }
        C2672a aVar2 = new C2672a(bVar, "dev.flutter.pigeon.UrlLauncherApi.launchUrl", m13794a());
        if (bVar2 != null) {
            aVar2.mo9421e(new C3074c(bVar2));
        } else {
            aVar2.mo9421e((C2672a.C2677d) null);
        }
        C2672a aVar3 = new C2672a(bVar, "dev.flutter.pigeon.UrlLauncherApi.openUrlInWebView", m13794a());
        if (bVar2 != null) {
            aVar3.mo9421e(new C3075d(bVar2));
        } else {
            aVar3.mo9421e((C2672a.C2677d) null);
        }
        C2672a aVar4 = new C2672a(bVar, "dev.flutter.pigeon.UrlLauncherApi.closeWebView", m13794a());
        if (bVar2 != null) {
            aVar4.mo9421e(new C3076e(bVar2));
        } else {
            aVar4.mo9421e((C2672a.C2677d) null);
        }
    }
}
