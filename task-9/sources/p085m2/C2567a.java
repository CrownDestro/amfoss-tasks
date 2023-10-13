package p085m2;

import java.util.HashMap;
import p003a2.C0008a;
import p063io.flutter.embedding.engine.FlutterJNI;
import p063io.flutter.view.C2280c;
import p091n2.C2672a;
import p091n2.C2701p;
import p162z1.C3627b;

/* renamed from: m2.a */
public class C2567a {

    /* renamed from: a */
    public final C2672a<Object> f8664a;

    /* renamed from: b */
    public final FlutterJNI f8665b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2569b f8666c;

    /* renamed from: d */
    final C2672a.C2677d<Object> f8667d;

    /* renamed from: m2.a$a */
    class C2568a implements C2672a.C2677d<Object> {
        C2568a() {
        }

        /* renamed from: a */
        public void mo9266a(Object obj, C2672a.C2678e<Object> eVar) {
            if (C2567a.this.f8666c == null) {
                eVar.mo9268a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            C3627b.m16092f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        C2567a.this.f8666c.mo8607c(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        C2567a.this.f8666c.mo8609e(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        C2567a.this.f8666c.mo8610f(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        C2567a.this.f8666c.mo8608d(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.mo9268a(null);
        }
    }

    /* renamed from: m2.a$b */
    public interface C2569b extends FlutterJNI.C2200a {
        /* renamed from: c */
        void mo8607c(String str);

        /* renamed from: d */
        void mo8608d(int i);

        /* renamed from: e */
        void mo8609e(String str);

        /* renamed from: f */
        void mo8610f(int i);
    }

    public C2567a(C0008a aVar, FlutterJNI flutterJNI) {
        C2568a aVar2 = new C2568a();
        this.f8667d = aVar2;
        C2672a<Object> aVar3 = new C2672a<>(aVar, "flutter/accessibility", C2701p.f9013a);
        this.f8664a = aVar3;
        aVar3.mo9421e(aVar2);
        this.f8665b = flutterJNI;
    }

    /* renamed from: b */
    public void mo9260b(int i, C2280c.C2287g gVar) {
        this.f8665b.dispatchSemanticsAction(i, gVar);
    }

    /* renamed from: c */
    public void mo9261c(int i, C2280c.C2287g gVar, Object obj) {
        this.f8665b.dispatchSemanticsAction(i, gVar, obj);
    }

    /* renamed from: d */
    public void mo9262d() {
        this.f8665b.setSemanticsEnabled(false);
    }

    /* renamed from: e */
    public void mo9263e() {
        this.f8665b.setSemanticsEnabled(true);
    }

    /* renamed from: f */
    public void mo9264f(int i) {
        this.f8665b.setAccessibilityFeatures(i);
    }

    /* renamed from: g */
    public void mo9265g(C2569b bVar) {
        this.f8666c = bVar;
        this.f8665b.setAccessibilityDelegate(bVar);
    }
}
