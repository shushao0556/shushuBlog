package com.evshou.entity;

public class BlogLinks {
    private Long linksId;

    private String linksName;

    private String linksUrl;

    private String linksImage;

    private Integer linksTarget;

    private String linksDescription;

    private String linksNote;

    public Long getLinksId() {
        return linksId;
    }

    public void setLinksId(Long linksId) {
        this.linksId = linksId;
    }

    public String getLinksName() {
        return linksName;
    }

    public void setLinksName(String linksName) {
        this.linksName = linksName == null ? null : linksName.trim();
    }

    public String getLinksUrl() {
        return linksUrl;
    }

    public void setLinksUrl(String linksUrl) {
        this.linksUrl = linksUrl == null ? null : linksUrl.trim();
    }

    public String getLinksImage() {
        return linksImage;
    }

    public void setLinksImage(String linksImage) {
        this.linksImage = linksImage == null ? null : linksImage.trim();
    }

    public Integer getLinksTarget() {
        return linksTarget;
    }

    public void setLinksTarget(Integer linksTarget) {
        this.linksTarget = linksTarget;
    }

    public String getLinksDescription() {
        return linksDescription;
    }

    public void setLinksDescription(String linksDescription) {
        this.linksDescription = linksDescription == null ? null : linksDescription.trim();
    }

    public String getLinksNote() {
        return linksNote;
    }

    public void setLinksNote(String linksNote) {
        this.linksNote = linksNote == null ? null : linksNote.trim();
    }
}