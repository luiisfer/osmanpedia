package com.pedia.osmanpedia.domain;

public class BookDomain {

    private int bookId;
    private String name;
    private Long isbnId;
    private int categoryId;
    private int publishingId;
    private String urlString;
    private String contentString;
    private boolean active;
    private LiteratureCategoryDomain literatureCategoryDomain;
    private PublishingHouseDomain publishingHouseDomain;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getIsbnId() {
        return isbnId;
    }

    public void setIsbnId(Long isbnId) {
        this.isbnId = isbnId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPublishingId() {
        return publishingId;
    }

    public void setPublishingId(int publishingId) {
        this.publishingId = publishingId;
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public String getContentString() {
        return contentString;
    }

    public void setContentString(String contentString) {
        this.contentString = contentString;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LiteratureCategoryDomain getLiteratureCategoryDomain() {
        return literatureCategoryDomain;
    }

    public void setLiteratureCategoryDomain(LiteratureCategoryDomain literatureCategoryDomain) {
        this.literatureCategoryDomain = literatureCategoryDomain;
    }

    public PublishingHouseDomain getPublishingHouseDomain() {
        return publishingHouseDomain;
    }

    public void setPublishingHouseDomain(PublishingHouseDomain publishingHouseDomain) {
        this.publishingHouseDomain = publishingHouseDomain;
    }
}
