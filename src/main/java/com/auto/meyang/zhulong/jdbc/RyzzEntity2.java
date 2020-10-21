package com.auto.meyang.zhulong.jdbc;

public class RyzzEntity2 {
    private  String    htmlkey  ;
    private  String  xmjl  ;
    private  String   zbr   ;
    private  String  ggmeta ;
    private  String   qyzcry  ;
    private  String  gg  ;
    private  String  gghtml ;

    public String getHtmlkey() {
        return htmlkey;
    }

    public void setHtmlkey(String htmlkey) {
        this.htmlkey = htmlkey;
    }

    public String getXmjl() {
        return xmjl;
    }

    public void setXmjl(String xmjl) {
        this.xmjl = xmjl;
    }

    public String getZbr() {
        return zbr;
    }

    public void setZbr(String zbr) {
        this.zbr = zbr;
    }

    public String getGgmeta() {
        return ggmeta;
    }

    public void setGgmeta(String ggmeta) {
        this.ggmeta = ggmeta;
    }

    public String getQyzcry() {
        return qyzcry;
    }

    public void setQyzcry(String qyzcry) {
        this.qyzcry = qyzcry;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getGghtml() {
        return gghtml;
    }

    public void setGghtml(String gghtml) {
        this.gghtml = gghtml;
    }

    public RyzzEntity2() {
    }

    public RyzzEntity2(String htmlkey, String xmjl, String zbr, String ggmeta, String qyzcry, String gg, String gghtml) {
        this.htmlkey = htmlkey;
        this.xmjl = xmjl;
        this.zbr = zbr;
        this.ggmeta = ggmeta;
        this.qyzcry = qyzcry;
        this.gg = gg;
        this.gghtml = gghtml;
    }

    @Override
    public String toString() {
        return "RyzzEntity2{" +
                "htmlkey='" + htmlkey + '\'' +
                ", xmjl='" + xmjl + '\'' +
                ", zbr='" + zbr + '\'' +
                ", ggmeta='" + ggmeta + '\'' +
                ", qyzcry='" + qyzcry + '\'' +
                ", gg='" + gg + '\'' +
                ", gghtml='" + gghtml + '\'' +
                '}';
    }
}
