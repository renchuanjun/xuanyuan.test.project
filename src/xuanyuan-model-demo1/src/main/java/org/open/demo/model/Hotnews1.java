package org.open.demo.model;

import java.util.Date;

public class Hotnews1 {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private Integer authorId;

    /**
     * 
     */
    private Date createTm;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 
     */
    public Date getCreateTm() {
        return createTm;
    }

    /**
     * 
     */
    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }

    /**
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }
}