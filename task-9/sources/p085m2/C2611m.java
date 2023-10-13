package p085m2;

import java.util.HashMap;
import java.util.Map;
import p003a2.C0008a;
import p091n2.C2672a;
import p091n2.C2684d;
import p162z1.C3627b;

/* renamed from: m2.m */
public class C2611m {

    /* renamed from: a */
    public final C2672a<Object> f8789a;

    /* renamed from: m2.m$a */
    public static class C2612a {

        /* renamed from: a */
        private final C2672a<Object> f8790a;

        /* renamed from: b */
        private Map<String, Object> f8791b = new HashMap();

        C2612a(C2672a<Object> aVar) {
            this.f8790a = aVar;
        }

        /* renamed from: a */
        public void mo9294a() {
            C3627b.m16092f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f8791b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f8791b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f8791b.get("platformBrightness"));
            this.f8790a.mo9419c(this.f8791b);
        }

        /* renamed from: b */
        public C2612a mo9295b(boolean z) {
            this.f8791b.put("brieflyShowPassword", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: c */
        public C2612a mo9296c(boolean z) {
            this.f8791b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: d */
        public C2612a mo9297d(C2613b bVar) {
            this.f8791b.put("platformBrightness", bVar.f8795d);
            return this;
        }

        /* renamed from: e */
        public C2612a mo9298e(float f) {
            this.f8791b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        /* renamed from: f */
        public C2612a mo9299f(boolean z) {
            this.f8791b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: m2.m$b */
    public enum C2613b {
        light("light"),
        dark("dark");
        

        /* renamed from: d */
        public String f8795d;

        private C2613b(String str) {
            this.f8795d = str;
        }
    }

    public C2611m(C0008a aVar) {
        this.f8789a = new C2672a<>(aVar, "flutter/settings", C2684d.f8999a);
    }

    /* renamed from: a */
    public C2612a mo9293a() {
        return new C2612a(this.f8789a);
    }
}
