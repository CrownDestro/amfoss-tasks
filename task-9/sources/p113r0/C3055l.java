package p113r0;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Objects;
import p091n2.C2688h;
import p091n2.C2689i;

/* renamed from: r0.l */
final class C3055l implements C2689i.C2693c {

    /* renamed from: d */
    private final Context f9965d;

    /* renamed from: e */
    private final C3043a f9966e;

    /* renamed from: f */
    private final C3057n f9967f;

    /* renamed from: g */
    private final C3062p f9968g;

    /* renamed from: h */
    private Activity f9969h;

    C3055l(Context context, C3043a aVar, C3057n nVar, C3062p pVar) {
        this.f9965d = context;
        this.f9966e = aVar;
        this.f9967f = nVar;
        this.f9968g = pVar;
    }

    /* renamed from: i */
    public void mo10376i(Activity activity) {
        this.f9969h = activity;
    }

    /* renamed from: l */
    public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
        String str = hVar.f9001a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                int parseInt = Integer.parseInt(hVar.f9002b.toString());
                C3062p pVar = this.f9968g;
                Context context = this.f9965d;
                Objects.requireNonNull(dVar);
                pVar.mo10380a(parseInt, context, new C3054k(dVar), new C3048e(dVar));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(hVar.f9002b.toString());
                C3057n nVar = this.f9967f;
                Activity activity = this.f9969h;
                Objects.requireNonNull(dVar);
                nVar.mo10379i(parseInt2, activity, new C3053j(dVar), new C3050g(dVar));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(hVar.f9002b.toString());
                C3057n nVar2 = this.f9967f;
                Context context2 = this.f9965d;
                Objects.requireNonNull(dVar);
                nVar2.mo10377d(parseInt3, context2, new C3051h(dVar));
                return;
            case 3:
                C3043a aVar = this.f9966e;
                Context context3 = this.f9965d;
                Objects.requireNonNull(dVar);
                aVar.mo10369a(context3, new C3046c(dVar), new C3049f(dVar));
                return;
            case 4:
                C3057n nVar3 = this.f9967f;
                Activity activity2 = this.f9969h;
                Objects.requireNonNull(dVar);
                nVar3.mo10378h((List) hVar.mo9431a(), activity2, new C3052i(dVar), new C3047d(dVar));
                return;
            default:
                dVar.mo9292c();
                return;
        }
    }
}
