package p085m2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003a2.C0008a;
import p012b2.C1253a;
import p091n2.C2688h;
import p091n2.C2689i;
import p091n2.C2703q;
import p162z1.C3623a;
import p162z1.C3627b;

/* renamed from: m2.b */
public class C2570b {

    /* renamed from: a */
    private final C2689i f8669a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1253a f8670b = C3623a.m16080e().mo11891a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<String, List<C2689i.C2694d>> f8671c = new HashMap();

    /* renamed from: d */
    final C2689i.C2693c f8672d;

    /* renamed from: m2.b$a */
    class C2571a implements C2689i.C2693c {
        C2571a() {
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            String str;
            if (C2570b.this.f8670b != null) {
                String str2 = hVar.f9001a;
                Map map = (Map) hVar.mo9431a();
                C3627b.m16092f("DeferredComponentChannel", "Received '" + str2 + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str3 = (String) map.get("componentName");
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1004447972:
                        if (str2.equals("uninstallDeferredComponent")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str2.equals("getDeferredComponentInstallState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str2.equals("installDeferredComponent")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        C2570b.this.f8670b.mo5080e(intValue, str3);
                        str = null;
                        break;
                    case 1:
                        str = C2570b.this.f8670b.mo5077b(intValue, str3);
                        break;
                    case 2:
                        C2570b.this.f8670b.mo5079d(intValue, str3);
                        if (!C2570b.this.f8671c.containsKey(str3)) {
                            C2570b.this.f8671c.put(str3, new ArrayList());
                        }
                        ((List) C2570b.this.f8671c.get(str3)).add(dVar);
                        return;
                    default:
                        dVar.mo9292c();
                        return;
                }
                dVar.mo9291b(str);
            }
        }
    }

    public C2570b(C0008a aVar) {
        C2571a aVar2 = new C2571a();
        this.f8672d = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/deferredcomponent", C2703q.f9016b);
        this.f8669a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* renamed from: c */
    public void mo9267c(C1253a aVar) {
        this.f8670b = aVar;
    }
}
