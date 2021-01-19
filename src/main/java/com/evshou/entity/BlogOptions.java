package com.evshou.entity;

public class BlogOptions {
    private Integer optionsId;

    private String webtitle;

    private String webtitle2;

    private String weburl;

    private String webemail;

    public BlogOptions(Integer optionsId, String webtitle, String webtitle2, String weburl, String webemail) {
        this.optionsId = optionsId;
        this.webtitle = webtitle;
        this.webtitle2 = webtitle2;
        this.weburl = weburl;
        this.webemail = webemail;
    }

    public Integer getOptionsId() {
        return optionsId;
    }

    public void setOptionsId(Integer optionsId) {
        this.optionsId = optionsId;
    }

    public String getWebtitle() {
        return webtitle;
    }

    public void setWebtitle(String webtitle) {
        this.webtitle = webtitle == null ? null : webtitle.trim();
    }

    public String getWebtitle2() {
        return webtitle2;
    }

    public void setWebtitle2(String webtitle2) {
        this.webtitle2 = webtitle2 == null ? null : webtitle2.trim();
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl == null ? null : weburl.trim();
    }

    public String getWebemail() {
        return webemail;
    }

    public void setWebemail(String webemail) {
        this.webemail = webemail == null ? null : webemail.trim();
    }

    public BlogOptions() {
    }

    @Override
    public String toString() {
        return "BlogOptions{" +
                "optionsId=" + optionsId +
                ", webtitle='" + webtitle + '\'' +
                ", webtitle2='" + webtitle2 + '\'' +
                ", weburl='" + weburl + '\'' +
                ", webemail='" + webemail + '\'' +
                '}';
    }
}