package p097o2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p085m2.C2577f;

/* renamed from: o2.a */
public class C2845a {

    /* renamed from: a */
    private final C2577f f9364a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f9365b;
    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})

    /* renamed from: c */
    final C2577f.C2579b f9366c;

    /* renamed from: o2.a$a */
    class C2846a implements C2577f.C2579b {
        C2846a() {
        }

        /* renamed from: a */
        public String mo9276a(String str, String str2) {
            Context a = C2845a.this.f9365b;
            if (str2 != null) {
                Locale b = C2845a.m12913b(str2);
                Configuration configuration = new Configuration(C2845a.this.f9365b.getResources().getConfiguration());
                configuration.setLocale(b);
                a = C2845a.this.f9365b.createConfigurationContext(configuration);
            }
            int identifier = a.getResources().getIdentifier(str, "string", C2845a.this.f9365b.getPackageName());
            if (identifier != 0) {
                return a.getResources().getString(identifier);
            }
            return null;
        }
    }

    public C2845a(Context context, C2577f fVar) {
        C2846a aVar = new C2846a();
        this.f9366c = aVar;
        this.f9365b = context;
        this.f9364a = fVar;
        fVar.mo9275c(aVar);
    }

    /* renamed from: b */
    public static Locale m12913b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            str4 = split[i];
        }
        return new Locale(str3, str4, str2);
    }

    /* renamed from: c */
    public Locale mo9820c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f9365b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale = locales.get(i2);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i >= 24) {
            LocaleList locales2 = this.f9365b.getResources().getConfiguration().getLocales();
            for (int i3 = 0; i3 < locales2.size(); i3++) {
                Locale locale2 = locales2.get(i3);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
        } else {
            Locale locale3 = this.f9365b.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
        }
        return list.get(0);
    }

    /* renamed from: d */
    public void mo9821d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f9364a.mo9274b(arrayList);
    }
}
