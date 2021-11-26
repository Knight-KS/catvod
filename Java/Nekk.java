package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReq;
import com.github.catvod.crawler.SpiderUrl;
import com.github.catvod.spider.merge.C0260YV;
import com.github.catvod.spider.merge.C0337cw;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Nekk extends C0260YV {

    /* renamed from: w */
    private ArrayList<String> f22w = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo51B(String str, int i) {
        if (i == 1) {
            return URLDecoder.decode(str);
        }
        return i == 2 ? URLDecoder.decode(new String(Base64.decode(str, 0))) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M4 */
    public void mo2M4(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f567us = jSONObject.optString(C0337cw.m1497us(-88910988351590L));
            this.f562bI = jSONObject.optString(C0337cw.m1497us(-88928168220774L));
            this.f566tC = jSONObject.optJSONObject(C0337cw.m1497us(-88949643057254L));
            this.f558M4 = jSONObject.optJSONObject(C0337cw.m1497us(-88979707828326L));
            this.f565o = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-89009772599398L)));
            this.f553BL = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-89069902141542L)));
            this.f563fv = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-89108556847206L)));
            this.f552B = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-89151506520166L)));
            this.f557K = jSONObject.optString(C0337cw.m1497us(-89194456193126L)).split(C0337cw.m1497us(-89245995800678L));
            this.f560TZ = jSONObject.optString(C0337cw.m1497us(-89258880702566L)).split(C0337cw.m1497us(-89301830375526L));
            this.f555DS = jSONObject.optString(C0337cw.m1497us(-89314715277414L)).split(C0337cw.m1497us(-89349075015782L));
            this.f561W = jSONObject.optString(C0337cw.m1497us(-89361959917670L)).split(C0337cw.m1497us(-89404909590630L));
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0193, code lost:
        r12 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String categoryContent(java.lang.String r11, java.lang.String r12, boolean r13, java.util.HashMap<java.lang.String, java.lang.String> r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            r13.<init>()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r0 = r10.f567us     // Catch:{ Exception -> 0x02b2 }
            r13.append(r0)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String[] r0 = r10.f557K     // Catch:{ Exception -> 0x02b2 }
            r1 = 0
            r0 = r0[r1]     // Catch:{ Exception -> 0x02b2 }
            r13.append(r0)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x02b2 }
            if (r14 == 0) goto L_0x0061
            int r0 = r14.size()     // Catch:{ Exception -> 0x02b2 }
            if (r0 <= 0) goto L_0x0061
            r2 = -89473629067366(0xffffae9fcc1f679a, double:NaN)
            java.lang.String r0 = com.github.catvod.spider.merge.C0337cw.m1497us(r2)     // Catch:{ Exception -> 0x02b2 }
            boolean r0 = r14.containsKey(r0)     // Catch:{ Exception -> 0x02b2 }
            if (r0 == 0) goto L_0x0061
            r2 = -89490808936550(0xffffae9bcc1f679a, double:NaN)
            java.lang.String r0 = com.github.catvod.spider.merge.C0337cw.m1497us(r2)     // Catch:{ Exception -> 0x02b2 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02b2 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02b2 }
            if (r0 <= 0) goto L_0x0061
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            r11.<init>()     // Catch:{ Exception -> 0x02b2 }
            r11.append(r13)     // Catch:{ Exception -> 0x02b2 }
            r2 = -89507988805734(0xffffae97cc1f679a, double:NaN)
            java.lang.String r13 = com.github.catvod.spider.merge.C0337cw.m1497us(r2)     // Catch:{ Exception -> 0x02b2 }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x02b2 }
            r11.append(r13)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x02b2 }
            goto L_0x0070
        L_0x0061:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            r0.<init>()     // Catch:{ Exception -> 0x02b2 }
            r0.append(r13)     // Catch:{ Exception -> 0x02b2 }
            r0.append(r11)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x02b2 }
        L_0x0070:
            if (r14 == 0) goto L_0x00c7
            int r13 = r14.size()     // Catch:{ Exception -> 0x02b2 }
            if (r13 <= 0) goto L_0x00c7
            java.util.Set r13 = r14.keySet()     // Catch:{ Exception -> 0x02b2 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x02b2 }
        L_0x0080:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x02b2 }
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r13.next()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02b2 }
            java.lang.Object r2 = r14.get(r0)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x02b2 }
            int r3 = r2.length()     // Catch:{ Exception -> 0x02b2 }
            if (r3 <= 0) goto L_0x0080
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            r3.<init>()     // Catch:{ Exception -> 0x02b2 }
            r3.append(r11)     // Catch:{ Exception -> 0x02b2 }
            r4 = -89525168674918(0xffffae93cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            r3.append(r11)     // Catch:{ Exception -> 0x02b2 }
            r3.append(r0)     // Catch:{ Exception -> 0x02b2 }
            r4 = -89533758609510(0xffffae91cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            r3.append(r11)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = java.net.URLEncoder.encode(r2)     // Catch:{ Exception -> 0x02b2 }
            r3.append(r11)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x02b2 }
            goto L_0x0080
        L_0x00c7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            r13.<init>()     // Catch:{ Exception -> 0x02b2 }
            r13.append(r11)     // Catch:{ Exception -> 0x02b2 }
            r2 = -89542348544102(0xffffae8fcc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r2)     // Catch:{ Exception -> 0x02b2 }
            r13.append(r11)     // Catch:{ Exception -> 0x02b2 }
            r13.append(r12)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String[] r11 = r10.f557K     // Catch:{ Exception -> 0x02b2 }
            r14 = 1
            r11 = r11[r14]     // Catch:{ Exception -> 0x02b2 }
            r13.append(r11)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r13.toString()     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.crawler.SpiderUrl r13 = new com.github.catvod.crawler.SpiderUrl     // Catch:{ Exception -> 0x02b2 }
            java.util.HashMap r0 = r10.mo849jx(r11)     // Catch:{ Exception -> 0x02b2 }
            r13.<init>(r11, r0)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.crawler.SpiderReqResult r13 = com.github.catvod.crawler.SpiderReq.get(r13)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r0 = r13.content     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r10.mo850us(r0, r11)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.B9 r11 = com.github.catvod.spider.merge.C0538uH.m2218us(r11)     // Catch:{ Exception -> 0x02b2 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x02b2 }
            r0.<init>()     // Catch:{ Exception -> 0x02b2 }
            r2 = -89572413315174(0xffffae88cc1f679a, double:NaN)
            java.lang.String r2 = com.github.catvod.spider.merge.C0337cw.m1497us(r2)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.wf r2 = r11.mo432wI(r2)     // Catch:{ Exception -> 0x02b2 }
            int r3 = r2.size()     // Catch:{ Exception -> 0x02b2 }
            if (r3 != 0) goto L_0x0120
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x02b2 }
            r3 = r12
            goto L_0x0194
        L_0x0120:
            r12 = -1
            r3 = -1
            r4 = 0
        L_0x0123:
            int r5 = r2.size()     // Catch:{ Exception -> 0x02b2 }
            if (r4 >= r5) goto L_0x0193
            java.lang.Object r5 = r2.get(r4)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.Nu r5 = (com.github.catvod.spider.merge.C0111Nu) r5     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = r5.mo419f()     // Catch:{ Exception -> 0x02b2 }
            if (r3 != r12) goto L_0x0163
            r7 = -89641132791910(0xffffae78cc1f679a, double:NaN)
            java.lang.String r7 = com.github.catvod.spider.merge.C0337cw.m1497us(r7)     // Catch:{ Exception -> 0x02b2 }
            boolean r7 = r5.mo400GE(r7)     // Catch:{ Exception -> 0x02b2 }
            if (r7 == 0) goto L_0x0163
            java.util.regex.Pattern r3 = r10.f552B     // Catch:{ Exception -> 0x02b2 }
            r7 = -89679787497574(0xffffae6fcc1f679a, double:NaN)
            java.lang.String r7 = com.github.catvod.spider.merge.C0337cw.m1497us(r7)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r7 = r5.mo223S(r7)     // Catch:{ Exception -> 0x02b2 }
            java.util.regex.Matcher r3 = r3.matcher(r7)     // Catch:{ Exception -> 0x02b2 }
            boolean r7 = r3.find()     // Catch:{ Exception -> 0x02b2 }
            if (r7 == 0) goto L_0x0162
            int r3 = r10.mo52o(r3)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x0163
        L_0x0162:
            r3 = 0
        L_0x0163:
            r7 = -89701262334054(0xffffae6acc1f679a, double:NaN)
            java.lang.String r7 = com.github.catvod.spider.merge.C0337cw.m1497us(r7)     // Catch:{ Exception -> 0x02b2 }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x02b2 }
            if (r6 == 0) goto L_0x0190
            java.util.regex.Pattern r12 = r10.f552B     // Catch:{ Exception -> 0x02b2 }
            r6 = -89714147235942(0xffffae67cc1f679a, double:NaN)
            java.lang.String r2 = com.github.catvod.spider.merge.C0337cw.m1497us(r6)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r2 = r5.mo223S(r2)     // Catch:{ Exception -> 0x02b2 }
            java.util.regex.Matcher r12 = r12.matcher(r2)     // Catch:{ Exception -> 0x02b2 }
            boolean r2 = r12.find()     // Catch:{ Exception -> 0x02b2 }
            if (r2 == 0) goto L_0x0193
            int r12 = r10.mo52o(r12)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x0194
        L_0x0190:
            int r4 = r4 + 1
            goto L_0x0123
        L_0x0193:
            r12 = 0
        L_0x0194:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x02b2 }
            r2.<init>()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r13 = r13.content     // Catch:{ Exception -> 0x02b2 }
            r4 = -89735622072422(0xffffae62cc1f679a, double:NaN)
            java.lang.String r4 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            boolean r13 = r13.contains(r4)     // Catch:{ Exception -> 0x02b2 }
            if (r13 != 0) goto L_0x0266
            r4 = -89787161679974(0xffffae56cc1f679a, double:NaN)
            java.lang.String r13 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.wf r11 = r11.mo432wI(r13)     // Catch:{ Exception -> 0x02b2 }
        L_0x01b7:
            int r13 = r11.size()     // Catch:{ Exception -> 0x02b2 }
            if (r1 >= r13) goto L_0x0266
            java.lang.Object r13 = r11.get(r1)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.Nu r13 = (com.github.catvod.spider.merge.C0111Nu) r13     // Catch:{ Exception -> 0x02b2 }
            r4 = -89963255339110(0xffffae2dcc1f679a, double:NaN)
            java.lang.String r4 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.Nu r4 = r13.mo427sn(r4)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r4 = r4.mo419f()     // Catch:{ Exception -> 0x02b2 }
            r5 = -89993320110182(0xffffae26cc1f679a, double:NaN)
            java.lang.String r5 = com.github.catvod.spider.merge.C0337cw.m1497us(r5)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.Nu r5 = r13.mo427sn(r5)     // Catch:{ Exception -> 0x02b2 }
            r6 = -90083514423398(0xffffae11cc1f679a, double:NaN)
            java.lang.String r6 = com.github.catvod.spider.merge.C0337cw.m1497us(r6)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r5 = r5.mo223S(r6)     // Catch:{ Exception -> 0x02b2 }
            r6 = -90143643965542(0xffffae03cc1f679a, double:NaN)
            java.lang.String r6 = com.github.catvod.spider.merge.C0337cw.m1497us(r6)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.Nu r6 = r13.mo427sn(r6)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r6 = r6.mo419f()     // Catch:{ Exception -> 0x02b2 }
            java.util.regex.Pattern r7 = r10.f553BL     // Catch:{ Exception -> 0x02b2 }
            r8 = -90203773507686(0xffffadf5cc1f679a, double:NaN)
            java.lang.String r8 = com.github.catvod.spider.merge.C0337cw.m1497us(r8)     // Catch:{ Exception -> 0x02b2 }
            com.github.catvod.spider.merge.Nu r13 = r13.mo427sn(r8)     // Catch:{ Exception -> 0x02b2 }
            r8 = -90293967820902(0xffffade0cc1f679a, double:NaN)
            java.lang.String r8 = com.github.catvod.spider.merge.C0337cw.m1497us(r8)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r13 = r13.mo223S(r8)     // Catch:{ Exception -> 0x02b2 }
            java.util.regex.Matcher r13 = r7.matcher(r13)     // Catch:{ Exception -> 0x02b2 }
            boolean r7 = r13.find()     // Catch:{ Exception -> 0x02b2 }
            if (r7 != 0) goto L_0x0226
            goto L_0x0262
        L_0x0226:
            java.lang.String r13 = r13.group(r14)     // Catch:{ Exception -> 0x02b2 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x02b2 }
            r7.<init>()     // Catch:{ Exception -> 0x02b2 }
            r8 = -90315442657382(0xffffaddbcc1f679a, double:NaN)
            java.lang.String r8 = com.github.catvod.spider.merge.C0337cw.m1497us(r8)     // Catch:{ Exception -> 0x02b2 }
            r7.put(r8, r13)     // Catch:{ Exception -> 0x02b2 }
            r8 = -90345507428454(0xffffadd4cc1f679a, double:NaN)
            java.lang.String r13 = com.github.catvod.spider.merge.C0337cw.m1497us(r8)     // Catch:{ Exception -> 0x02b2 }
            r7.put(r13, r4)     // Catch:{ Exception -> 0x02b2 }
            r8 = -90384162134118(0xffffadcbcc1f679a, double:NaN)
            java.lang.String r13 = com.github.catvod.spider.merge.C0337cw.m1497us(r8)     // Catch:{ Exception -> 0x02b2 }
            r7.put(r13, r5)     // Catch:{ Exception -> 0x02b2 }
            r4 = -90418521872486(0xffffadc3cc1f679a, double:NaN)
            java.lang.String r13 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            r7.put(r13, r6)     // Catch:{ Exception -> 0x02b2 }
            r2.put(r7)     // Catch:{ Exception -> 0x02b2 }
        L_0x0262:
            int r1 = r1 + 1
            goto L_0x01b7
        L_0x0266:
            r4 = -90470061480038(0xffffadb7cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r4)     // Catch:{ Exception -> 0x02b2 }
            r0.put(r11, r3)     // Catch:{ Exception -> 0x02b2 }
            r3 = -90491536316518(0xffffadb2cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r3)     // Catch:{ Exception -> 0x02b2 }
            r0.put(r11, r12)     // Catch:{ Exception -> 0x02b2 }
            r3 = -90534485989478(0xffffada8cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r3)     // Catch:{ Exception -> 0x02b2 }
            r13 = 48
            r0.put(r11, r13)     // Catch:{ Exception -> 0x02b2 }
            r3 = -90560255793254(0xffffada2cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r3)     // Catch:{ Exception -> 0x02b2 }
            if (r12 > r14) goto L_0x029c
            int r12 = r2.length()     // Catch:{ Exception -> 0x02b2 }
            goto L_0x029e
        L_0x029c:
            int r12 = r12 * 48
        L_0x029e:
            r0.put(r11, r12)     // Catch:{ Exception -> 0x02b2 }
            r11 = -90586025597030(0xffffad9ccc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r11)     // Catch:{ Exception -> 0x02b2 }
            r0.put(r11, r2)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x02b2 }
            return r11
        L_0x02b2:
            r11 = move-exception
            com.github.catvod.crawler.SpiderDebug.log(r11)
            r11 = -90607500433510(0xffffad97cc1f679a, double:NaN)
            java.lang.String r11 = com.github.catvod.spider.merge.C0337cw.m1497us(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Nekk.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: fv */
    public boolean mo5fv(String str, boolean z) {
        if (z) {
            if (!(str.equals(C0337cw.m1497us(-89417794492518L)) || str.equals(C0337cw.m1497us(-89430679394406L)) || str.equals(C0337cw.m1497us(-89447859263590L)) || str.equals(C0337cw.m1497us(-89460744165478L))) || this.f22w.contains(str)) {
                return false;
            }
            this.f22w.add(str);
            return true;
        } else if (this.f22w.contains(str)) {
            return false;
        } else {
            this.f22w.add(str);
            return true;
        }
    }

    public void init(Context context) {
        super.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo52o(Matcher matcher) {
        return Integer.parseInt(matcher.group(1).trim());
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = this.f567us + C0337cw.m1497us(-90611795400806L) + URLEncoder.encode(str) + C0337cw.m1497us(-90757824288870L) + System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject(SpiderReq.get(new SpiderUrl(str2, mo849jx(str2))).content);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (jSONObject.getInt(C0337cw.m1497us(-90848018602086L)) > 0) {
                JSONArray jSONArray2 = new JSONArray(jSONObject.getString(C0337cw.m1497us(-90873788405862L)));
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String string = jSONObject3.getString(C0337cw.m1497us(-90895263242342L));
                    String string2 = jSONObject3.getString(C0337cw.m1497us(-90908148144230L));
                    String string3 = jSONObject3.getString(C0337cw.m1497us(-90929622980710L));
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(C0337cw.m1497us(-90946802849894L), string);
                    jSONObject4.put(C0337cw.m1497us(-90976867620966L), string2);
                    jSONObject4.put(C0337cw.m1497us(-91015522326630L), string3);
                    jSONObject4.put(C0337cw.m1497us(-91049882064998L), C0337cw.m1497us(-91101421672550L));
                    jSONArray.put(jSONObject4);
                }
            }
            jSONObject2.put(C0337cw.m1497us(-91105716639846L), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return C0337cw.m1497us(-91127191476326L);
        }
    }
}

