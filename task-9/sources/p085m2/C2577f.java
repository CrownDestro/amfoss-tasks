package p085m2;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0008a;
import p091n2.C2685e;
import p091n2.C2688h;
import p091n2.C2689i;
import p162z1.C3627b;

/* renamed from: m2.f */
public class C2577f {

    /* renamed from: a */
    public final C2689i f8679a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2579b f8680b;

    /* renamed from: c */
    public final C2689i.C2693c f8681c;

    /* renamed from: m2.f$a */
    class C2578a implements C2689i.C2693c {
        C2578a() {
        }

        /* renamed from: l */
        public void mo7778l(C2688h hVar, C2689i.C2694d dVar) {
            if (C2577f.this.f8680b != null) {
                String str = hVar.f9001a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.mo9292c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) hVar.mo9431a();
                try {
                    dVar.mo9291b(C2577f.this.f8680b.mo9276a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e) {
                    dVar.mo9290a("error", e.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: m2.f$b */
    public interface C2579b {
        /* renamed from: a */
        String mo9276a(String str, String str2);
    }

    public C2577f(C0008a aVar) {
        C2578a aVar2 = new C2578a();
        this.f8681c = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/localization", C2685e.f9000a);
        this.f8679a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* renamed from: b */
    public void mo9274b(List<Locale> list) {
        C3627b.m16092f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            C3627b.m16092f("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? next.getScript() : "");
            arrayList.add(next.getVariant());
        }
        this.f8679a.mo9432c("setLocale", arrayList);
    }

    /* renamed from: c */
    public void mo9275c(C2579b bVar) {
        this.f8680b = bVar;
    }
}
