package androidx.window.layout;

import p041f3.C1920g;

/* renamed from: androidx.window.layout.j */
public interface C1205j extends C1198e {

    /* renamed from: androidx.window.layout.j$a */
    public static final class C1206a {

        /* renamed from: b */
        public static final C1207a f4217b = new C1207a((C1920g) null);

        /* renamed from: c */
        public static final C1206a f4218c = new C1206a("NONE");

        /* renamed from: d */
        public static final C1206a f4219d = new C1206a("FULL");

        /* renamed from: a */
        private final String f4220a;

        /* renamed from: androidx.window.layout.j$a$a */
        public static final class C1207a {
            private C1207a() {
            }

            public /* synthetic */ C1207a(C1920g gVar) {
                this();
            }
        }

        private C1206a(String str) {
            this.f4220a = str;
        }

        public String toString() {
            return this.f4220a;
        }
    }

    /* renamed from: androidx.window.layout.j$b */
    public static final class C1208b {

        /* renamed from: b */
        public static final C1209a f4221b = new C1209a((C1920g) null);

        /* renamed from: c */
        public static final C1208b f4222c = new C1208b("FLAT");

        /* renamed from: d */
        public static final C1208b f4223d = new C1208b("HALF_OPENED");

        /* renamed from: a */
        private final String f4224a;

        /* renamed from: androidx.window.layout.j$b$a */
        public static final class C1209a {
            private C1209a() {
            }

            public /* synthetic */ C1209a(C1920g gVar) {
                this();
            }
        }

        private C1208b(String str) {
            this.f4224a = str;
        }

        public String toString() {
            return this.f4224a;
        }
    }

    /* renamed from: b */
    C1206a mo5015b();

    C1208b getState();
}
