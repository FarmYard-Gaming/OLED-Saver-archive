package android.support.p006v4.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.graphics.b */
public class C0265b {

    /* renamed from: android.support.v4.graphics.b$a */
    private static class C0266a {

        /* renamed from: a */
        int f763a;

        /* renamed from: b */
        boolean f764b;

        C0266a() {
        }
    }

    /* renamed from: android.support.v4.graphics.b$b */
    public static class C0267b {

        /* renamed from: a */
        public char f765a;

        /* renamed from: b */
        public float[] f766b;

        C0267b(char c, float[] fArr) {
            this.f765a = c;
            this.f766b = fArr;
        }

        C0267b(C0267b bVar) {
            this.f765a = bVar.f765a;
            this.f766b = C0265b.m1128a(bVar.f766b, 0, bVar.f766b.length);
        }

        /* renamed from: a */
        private static void m1133a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
            double d11 = (sin2 * (-d3) * sin) + (cos2 * d4 * cos);
            double d12 = d9 / ((double) ceil);
            int i = 0;
            while (i < ceil) {
                double d13 = d8 + d12;
                double sin3 = Math.sin(d13);
                double cos3 = Math.cos(d13);
                double d14 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * sin3);
                double d15 = (d4 * cos * sin3) + (d3 * sin * cos3) + d2;
                double d16 = (((-d3) * cos) * sin3) - ((d4 * sin) * cos3);
                double d17 = (cos3 * d4 * cos) + (sin3 * (-d3) * sin);
                double tan = Math.tan((d13 - d8) / 2.0d);
                double sqrt = ((Math.sqrt((tan * (3.0d * tan)) + 4.0d) - 1.0d) * Math.sin(d13 - d8)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d10 * sqrt) + d5), (float) ((d11 * sqrt) + d6), (float) (d14 - (sqrt * d16)), (float) (d15 - (sqrt * d17)), (float) d14, (float) d15);
                i++;
                d11 = d17;
                d10 = d16;
                d8 = d13;
                d6 = d15;
                d5 = d14;
            }
        }

        /* renamed from: a */
        private static void m1134a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
            double d4 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
            double d5 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
            double d6 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
            double d7 = d3 - d5;
            double d8 = d4 - d6;
            double d9 = (d3 + d5) / 2.0d;
            double d10 = (d4 + d6) / 2.0d;
            double d11 = (d7 * d7) + (d8 * d8);
            if (d11 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d12 = (1.0d / d11) - 0.25d;
            if (d12 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d11);
                float sqrt = (float) (Math.sqrt(d11) / 1.99999d);
                m1134a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d12);
            double d13 = d7 * sqrt2;
            double d14 = d8 * sqrt2;
            if (z == z2) {
                d = d9 - d14;
                d2 = d13 + d10;
            } else {
                d = d14 + d9;
                d2 = d10 - d13;
            }
            double atan2 = Math.atan2(d4 - d2, d3 - d);
            double atan22 = Math.atan2(d6 - d2, d5 - d) - atan2;
            if (z2 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d15 = ((double) f5) * d;
            double d16 = d2 * ((double) f6);
            m1133a(path, (d15 * cos) - (d16 * sin), (d15 * sin) + (d16 * cos), (double) f5, (double) f6, (double) f, (double) f2, radians, atan2, atan22);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: int} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m1135a(android.graphics.Path r19, float[] r20, char r21, char r22, float[] r23) {
            /*
                r9 = 2
                r3 = 0
                r8 = r20[r3]
                r3 = 1
                r7 = r20[r3]
                r3 = 2
                r5 = r20[r3]
                r3 = 3
                r3 = r20[r3]
                r4 = 4
                r6 = r20[r4]
                r4 = 5
                r4 = r20[r4]
                switch(r22) {
                    case 65: goto L_0x005c;
                    case 67: goto L_0x0056;
                    case 72: goto L_0x0053;
                    case 76: goto L_0x0050;
                    case 77: goto L_0x0050;
                    case 81: goto L_0x0059;
                    case 83: goto L_0x0059;
                    case 84: goto L_0x0050;
                    case 86: goto L_0x0053;
                    case 90: goto L_0x0042;
                    case 97: goto L_0x005c;
                    case 99: goto L_0x0056;
                    case 104: goto L_0x0053;
                    case 108: goto L_0x0050;
                    case 109: goto L_0x0050;
                    case 113: goto L_0x0059;
                    case 115: goto L_0x0059;
                    case 116: goto L_0x0050;
                    case 118: goto L_0x0053;
                    case 122: goto L_0x0042;
                    default: goto L_0x0016;
                }
            L_0x0016:
                r13 = r9
            L_0x0017:
                r9 = 0
                r14 = r9
                r15 = r4
                r16 = r6
                r10 = r3
                r11 = r5
                r17 = r7
                r18 = r8
            L_0x0022:
                r0 = r23
                int r3 = r0.length
                if (r14 >= r3) goto L_0x040f
                switch(r22) {
                    case 65: goto L_0x03c9;
                    case 67: goto L_0x01af;
                    case 72: goto L_0x0125;
                    case 76: goto L_0x00ed;
                    case 77: goto L_0x0096;
                    case 81: goto L_0x02c1;
                    case 83: goto L_0x0239;
                    case 84: goto L_0x0333;
                    case 86: goto L_0x0158;
                    case 97: goto L_0x037b;
                    case 99: goto L_0x0171;
                    case 104: goto L_0x010b;
                    case 108: goto L_0x00cb;
                    case 109: goto L_0x005f;
                    case 113: goto L_0x028b;
                    case 115: goto L_0x01e5;
                    case 116: goto L_0x02ef;
                    case 118: goto L_0x013e;
                    default: goto L_0x002a;
                }
            L_0x002a:
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r17
                r9 = r18
            L_0x0033:
                int r3 = r14 + r13
                r14 = r3
                r15 = r4
                r16 = r6
                r10 = r5
                r11 = r7
                r17 = r8
                r18 = r9
                r21 = r22
                goto L_0x0022
            L_0x0042:
                r19.close()
                r0 = r19
                r0.moveTo(r6, r4)
                r3 = r4
                r5 = r6
                r7 = r4
                r8 = r6
                r13 = r9
                goto L_0x0017
            L_0x0050:
                r9 = 2
                r13 = r9
                goto L_0x0017
            L_0x0053:
                r9 = 1
                r13 = r9
                goto L_0x0017
            L_0x0056:
                r9 = 6
                r13 = r9
                goto L_0x0017
            L_0x0059:
                r9 = 4
                r13 = r9
                goto L_0x0017
            L_0x005c:
                r9 = 7
                r13 = r9
                goto L_0x0017
            L_0x005f:
                int r3 = r14 + 0
                r3 = r23[r3]
                float r12 = r18 + r3
                int r3 = r14 + 1
                r3 = r23[r3]
                float r3 = r3 + r17
                if (r14 <= 0) goto L_0x0082
                int r4 = r14 + 0
                r4 = r23[r4]
                int r5 = r14 + 1
                r5 = r23[r5]
                r0 = r19
                r0.rLineTo(r4, r5)
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x0082:
                int r4 = r14 + 0
                r4 = r23[r4]
                int r5 = r14 + 1
                r5 = r23[r5]
                r0 = r19
                r0.rMoveTo(r4, r5)
                r4 = r3
                r6 = r12
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x0096:
                int r3 = r14 + 0
                r12 = r23[r3]
                int r3 = r14 + 1
                r3 = r23[r3]
                if (r14 <= 0) goto L_0x00b6
                int r4 = r14 + 0
                r4 = r23[r4]
                int r5 = r14 + 1
                r5 = r23[r5]
                r0 = r19
                r0.lineTo(r4, r5)
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x00b6:
                int r4 = r14 + 0
                r4 = r23[r4]
                int r5 = r14 + 1
                r5 = r23[r5]
                r0 = r19
                r0.moveTo(r4, r5)
                r4 = r3
                r6 = r12
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x00cb:
                int r3 = r14 + 0
                r3 = r23[r3]
                int r4 = r14 + 1
                r4 = r23[r4]
                r0 = r19
                r0.rLineTo(r3, r4)
                int r3 = r14 + 0
                r3 = r23[r3]
                float r12 = r18 + r3
                int r3 = r14 + 1
                r3 = r23[r3]
                float r3 = r3 + r17
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x00ed:
                int r3 = r14 + 0
                r3 = r23[r3]
                int r4 = r14 + 1
                r4 = r23[r4]
                r0 = r19
                r0.lineTo(r3, r4)
                int r3 = r14 + 0
                r12 = r23[r3]
                int r3 = r14 + 1
                r3 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x010b:
                int r3 = r14 + 0
                r3 = r23[r3]
                r4 = 0
                r0 = r19
                r0.rLineTo(r3, r4)
                int r3 = r14 + 0
                r3 = r23[r3]
                float r12 = r18 + r3
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r17
                r9 = r12
                goto L_0x0033
            L_0x0125:
                int r3 = r14 + 0
                r3 = r23[r3]
                r0 = r19
                r1 = r17
                r0.lineTo(r3, r1)
                int r3 = r14 + 0
                r12 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r17
                r9 = r12
                goto L_0x0033
            L_0x013e:
                r3 = 0
                int r4 = r14 + 0
                r4 = r23[r4]
                r0 = r19
                r0.rLineTo(r3, r4)
                int r3 = r14 + 0
                r3 = r23[r3]
                float r3 = r3 + r17
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r18
                goto L_0x0033
            L_0x0158:
                int r3 = r14 + 0
                r3 = r23[r3]
                r0 = r19
                r1 = r18
                r0.lineTo(r1, r3)
                int r3 = r14 + 0
                r3 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r18
                goto L_0x0033
            L_0x0171:
                int r3 = r14 + 0
                r4 = r23[r3]
                int r3 = r14 + 1
                r5 = r23[r3]
                int r3 = r14 + 2
                r6 = r23[r3]
                int r3 = r14 + 3
                r7 = r23[r3]
                int r3 = r14 + 4
                r8 = r23[r3]
                int r3 = r14 + 5
                r9 = r23[r3]
                r3 = r19
                r3.rCubicTo(r4, r5, r6, r7, r8, r9)
                int r3 = r14 + 2
                r3 = r23[r3]
                float r11 = r18 + r3
                int r3 = r14 + 3
                r3 = r23[r3]
                float r10 = r17 + r3
                int r3 = r14 + 4
                r3 = r23[r3]
                float r12 = r18 + r3
                int r3 = r14 + 5
                r3 = r23[r3]
                float r3 = r3 + r17
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x01af:
                int r3 = r14 + 0
                r4 = r23[r3]
                int r3 = r14 + 1
                r5 = r23[r3]
                int r3 = r14 + 2
                r6 = r23[r3]
                int r3 = r14 + 3
                r7 = r23[r3]
                int r3 = r14 + 4
                r8 = r23[r3]
                int r3 = r14 + 5
                r9 = r23[r3]
                r3 = r19
                r3.cubicTo(r4, r5, r6, r7, r8, r9)
                int r3 = r14 + 4
                r12 = r23[r3]
                int r3 = r14 + 5
                r3 = r23[r3]
                int r4 = r14 + 2
                r11 = r23[r4]
                int r4 = r14 + 3
                r10 = r23[r4]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x01e5:
                r4 = 0
                r5 = 0
                r3 = 99
                r0 = r21
                if (r0 == r3) goto L_0x01ff
                r3 = 115(0x73, float:1.61E-43)
                r0 = r21
                if (r0 == r3) goto L_0x01ff
                r3 = 67
                r0 = r21
                if (r0 == r3) goto L_0x01ff
                r3 = 83
                r0 = r21
                if (r0 != r3) goto L_0x0203
            L_0x01ff:
                float r4 = r18 - r11
                float r5 = r17 - r10
            L_0x0203:
                int r3 = r14 + 0
                r6 = r23[r3]
                int r3 = r14 + 1
                r7 = r23[r3]
                int r3 = r14 + 2
                r8 = r23[r3]
                int r3 = r14 + 3
                r9 = r23[r3]
                r3 = r19
                r3.rCubicTo(r4, r5, r6, r7, r8, r9)
                int r3 = r14 + 0
                r3 = r23[r3]
                float r11 = r18 + r3
                int r3 = r14 + 1
                r3 = r23[r3]
                float r10 = r17 + r3
                int r3 = r14 + 2
                r3 = r23[r3]
                float r12 = r18 + r3
                int r3 = r14 + 3
                r3 = r23[r3]
                float r3 = r3 + r17
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x0239:
                r3 = 99
                r0 = r21
                if (r0 == r3) goto L_0x0251
                r3 = 115(0x73, float:1.61E-43)
                r0 = r21
                if (r0 == r3) goto L_0x0251
                r3 = 67
                r0 = r21
                if (r0 == r3) goto L_0x0251
                r3 = 83
                r0 = r21
                if (r0 != r3) goto L_0x0422
            L_0x0251:
                r3 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 * r18
                float r4 = r3 - r11
                r3 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 * r17
                float r5 = r3 - r10
            L_0x025d:
                int r3 = r14 + 0
                r6 = r23[r3]
                int r3 = r14 + 1
                r7 = r23[r3]
                int r3 = r14 + 2
                r8 = r23[r3]
                int r3 = r14 + 3
                r9 = r23[r3]
                r3 = r19
                r3.cubicTo(r4, r5, r6, r7, r8, r9)
                int r3 = r14 + 0
                r11 = r23[r3]
                int r3 = r14 + 1
                r10 = r23[r3]
                int r3 = r14 + 2
                r12 = r23[r3]
                int r3 = r14 + 3
                r3 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x028b:
                int r3 = r14 + 0
                r3 = r23[r3]
                int r4 = r14 + 1
                r4 = r23[r4]
                int r5 = r14 + 2
                r5 = r23[r5]
                int r6 = r14 + 3
                r6 = r23[r6]
                r0 = r19
                r0.rQuadTo(r3, r4, r5, r6)
                int r3 = r14 + 0
                r3 = r23[r3]
                float r11 = r18 + r3
                int r3 = r14 + 1
                r3 = r23[r3]
                float r10 = r17 + r3
                int r3 = r14 + 2
                r3 = r23[r3]
                float r12 = r18 + r3
                int r3 = r14 + 3
                r3 = r23[r3]
                float r3 = r3 + r17
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x02c1:
                int r3 = r14 + 0
                r3 = r23[r3]
                int r4 = r14 + 1
                r4 = r23[r4]
                int r5 = r14 + 2
                r5 = r23[r5]
                int r6 = r14 + 3
                r6 = r23[r6]
                r0 = r19
                r0.quadTo(r3, r4, r5, r6)
                int r3 = r14 + 0
                r11 = r23[r3]
                int r3 = r14 + 1
                r10 = r23[r3]
                int r3 = r14 + 2
                r12 = r23[r3]
                int r3 = r14 + 3
                r3 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x02ef:
                r4 = 0
                r3 = 0
                r5 = 113(0x71, float:1.58E-43)
                r0 = r21
                if (r0 == r5) goto L_0x0309
                r5 = 116(0x74, float:1.63E-43)
                r0 = r21
                if (r0 == r5) goto L_0x0309
                r5 = 81
                r0 = r21
                if (r0 == r5) goto L_0x0309
                r5 = 84
                r0 = r21
                if (r0 != r5) goto L_0x030d
            L_0x0309:
                float r4 = r18 - r11
                float r3 = r17 - r10
            L_0x030d:
                int r5 = r14 + 0
                r5 = r23[r5]
                int r6 = r14 + 1
                r6 = r23[r6]
                r0 = r19
                r0.rQuadTo(r4, r3, r5, r6)
                float r11 = r18 + r4
                float r10 = r17 + r3
                int r3 = r14 + 0
                r3 = r23[r3]
                float r12 = r18 + r3
                int r3 = r14 + 1
                r3 = r23[r3]
                float r3 = r3 + r17
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x0333:
                r3 = 113(0x71, float:1.58E-43)
                r0 = r21
                if (r0 == r3) goto L_0x034b
                r3 = 116(0x74, float:1.63E-43)
                r0 = r21
                if (r0 == r3) goto L_0x034b
                r3 = 81
                r0 = r21
                if (r0 == r3) goto L_0x034b
                r3 = 84
                r0 = r21
                if (r0 != r3) goto L_0x0357
            L_0x034b:
                r3 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 * r18
                float r18 = r3 - r11
                r3 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 * r17
                float r17 = r3 - r10
            L_0x0357:
                int r3 = r14 + 0
                r3 = r23[r3]
                int r4 = r14 + 1
                r4 = r23[r4]
                r0 = r19
                r1 = r18
                r2 = r17
                r0.quadTo(r1, r2, r3, r4)
                int r3 = r14 + 0
                r12 = r23[r3]
                int r3 = r14 + 1
                r3 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r17
                r7 = r18
                r8 = r3
                r9 = r12
                goto L_0x0033
            L_0x037b:
                int r3 = r14 + 5
                r3 = r23[r3]
                float r6 = r3 + r18
                int r3 = r14 + 6
                r3 = r23[r3]
                float r7 = r3 + r17
                int r3 = r14 + 0
                r8 = r23[r3]
                int r3 = r14 + 1
                r9 = r23[r3]
                int r3 = r14 + 2
                r10 = r23[r3]
                int r3 = r14 + 3
                r3 = r23[r3]
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x03c5
                r11 = 1
            L_0x039d:
                int r3 = r14 + 4
                r3 = r23[r3]
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x03c7
                r12 = 1
            L_0x03a7:
                r3 = r19
                r4 = r18
                r5 = r17
                m1134a((android.graphics.Path) r3, (float) r4, (float) r5, (float) r6, (float) r7, (float) r8, (float) r9, (float) r10, (boolean) r11, (boolean) r12)
                int r3 = r14 + 5
                r3 = r23[r3]
                float r11 = r18 + r3
                int r3 = r14 + 6
                r3 = r23[r3]
                float r10 = r17 + r3
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r10
                r9 = r11
                goto L_0x0033
            L_0x03c5:
                r11 = 0
                goto L_0x039d
            L_0x03c7:
                r12 = 0
                goto L_0x03a7
            L_0x03c9:
                int r3 = r14 + 5
                r6 = r23[r3]
                int r3 = r14 + 6
                r7 = r23[r3]
                int r3 = r14 + 0
                r8 = r23[r3]
                int r3 = r14 + 1
                r9 = r23[r3]
                int r3 = r14 + 2
                r10 = r23[r3]
                int r3 = r14 + 3
                r3 = r23[r3]
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x040b
                r11 = 1
            L_0x03e7:
                int r3 = r14 + 4
                r3 = r23[r3]
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x040d
                r12 = 1
            L_0x03f1:
                r3 = r19
                r4 = r18
                r5 = r17
                m1134a((android.graphics.Path) r3, (float) r4, (float) r5, (float) r6, (float) r7, (float) r8, (float) r9, (float) r10, (boolean) r11, (boolean) r12)
                int r3 = r14 + 5
                r11 = r23[r3]
                int r3 = r14 + 6
                r10 = r23[r3]
                r4 = r15
                r6 = r16
                r5 = r10
                r7 = r11
                r8 = r10
                r9 = r11
                goto L_0x0033
            L_0x040b:
                r11 = 0
                goto L_0x03e7
            L_0x040d:
                r12 = 0
                goto L_0x03f1
            L_0x040f:
                r3 = 0
                r20[r3] = r18
                r3 = 1
                r20[r3] = r17
                r3 = 2
                r20[r3] = r11
                r3 = 3
                r20[r3] = r10
                r3 = 4
                r20[r3] = r16
                r3 = 5
                r20[r3] = r15
                return
            L_0x0422:
                r5 = r17
                r4 = r18
                goto L_0x025d
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.graphics.C0265b.C0267b.m1135a(android.graphics.Path, float[], char, char, float[]):void");
        }

        /* renamed from: a */
        public static void m1136a(C0267b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m1135a(path, fArr, c, bVarArr[i].f765a, bVarArr[i].f766b);
                c = bVarArr[i].f765a;
            }
        }

        /* renamed from: a */
        public void mo1101a(C0267b bVar, C0267b bVar2, float f) {
            for (int i = 0; i < bVar.f766b.length; i++) {
                this.f766b[i] = (bVar.f766b[i] * (1.0f - f)) + (bVar2.f766b[i] * f);
            }
        }
    }

    /* renamed from: a */
    private static int m1123a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static Path m1124a(String str) {
        Path path = new Path();
        C0267b[] b = m1131b(str);
        if (b == null) {
            return null;
        }
        try {
            C0267b.m1136a(b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1125a(java.lang.String r7, int r8, android.support.p006v4.graphics.C0265b.C0266a r9) {
        /*
            r1 = 0
            r5 = 1
            r9.f764b = r1
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r8
        L_0x0008:
            int r6 = r7.length()
            if (r4 >= r6) goto L_0x0018
            char r6 = r7.charAt(r4)
            switch(r6) {
                case 32: goto L_0x001b;
                case 44: goto L_0x001b;
                case 45: goto L_0x001e;
                case 46: goto L_0x0027;
                case 69: goto L_0x0031;
                case 101: goto L_0x0031;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r3 == 0) goto L_0x0033
        L_0x0018:
            r9.f763a = r4
            return
        L_0x001b:
            r0 = r1
            r3 = r5
            goto L_0x0016
        L_0x001e:
            if (r4 == r8) goto L_0x0015
            if (r0 != 0) goto L_0x0015
            r9.f764b = r5
            r0 = r1
            r3 = r5
            goto L_0x0016
        L_0x0027:
            if (r2 != 0) goto L_0x002c
            r0 = r1
            r2 = r5
            goto L_0x0016
        L_0x002c:
            r9.f764b = r5
            r0 = r1
            r3 = r5
            goto L_0x0016
        L_0x0031:
            r0 = r5
            goto L_0x0016
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.graphics.C0265b.m1125a(java.lang.String, int, android.support.v4.graphics.b$a):void");
    }

    /* renamed from: a */
    private static void m1126a(ArrayList<C0267b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0267b(c, fArr));
    }

    /* renamed from: a */
    public static boolean m1127a(C0267b[] bVarArr, C0267b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f765a != bVarArr2[i].f765a || bVarArr[i].f766b.length != bVarArr2[i].f766b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static float[] m1128a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: a */
    public static C0267b[] m1129a(C0267b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0267b[] bVarArr2 = new C0267b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0267b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: b */
    public static void m1130b(C0267b[] bVarArr, C0267b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f765a = bVarArr2[i].f765a;
            for (int i2 = 0; i2 < bVarArr2[i].f766b.length; i2++) {
                bVarArr[i].f766b[i2] = bVarArr2[i].f766b[i2];
            }
        }
    }

    /* renamed from: b */
    public static C0267b[] m1131b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m1123a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m1126a((ArrayList<C0267b>) arrayList, trim.charAt(0), m1132c(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m1126a((ArrayList<C0267b>) arrayList, str.charAt(i2), new float[0]);
        }
        return (C0267b[]) arrayList.toArray(new C0267b[arrayList.size()]);
    }

    /* renamed from: c */
    private static float[] m1132c(String str) {
        int i;
        int i2 = 0;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0266a aVar = new C0266a();
            int length = str.length();
            int i3 = 1;
            while (i3 < length) {
                m1125a(str, i3, aVar);
                int i4 = aVar.f763a;
                if (i3 < i4) {
                    i = i2 + 1;
                    fArr[i2] = Float.parseFloat(str.substring(i3, i4));
                } else {
                    i = i2;
                }
                if (aVar.f764b) {
                    i3 = i4;
                    i2 = i;
                } else {
                    i3 = i4 + 1;
                    i2 = i;
                }
            }
            return m1128a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}
