package com.pedia.osmanpedia.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Integer idBook;

    private String nombre;

    private Long isbn;

    private Integer idLiteratureCategory;

    private Integer idPublishingHouse;

    @ManyToOne
    @JoinColumn(name = "idLiteratureCategory", insertable = false, updatable = false)
    private LiteratureCategory literatureCategory;

    @ManyToOne
    @JoinColumn(name = "idPublishingHouse", insertable = false, updatable = false)
    private PublishingHouse publishingHouse;

    private String url;

    private String contenido;

    private Boolean estado;


    public Integer getIdLiteratureCategory() {
        return idLiteratureCategory;
    }

    public void setIdLiteratureCategory(Integer idLiteratureCategory) {
        this.idLiteratureCategory = idLiteratureCategory;
    }

    public Integer getIdPublishingHouse() {
        return idPublishingHouse;
    }

    public void setIdPublishingHouse(Integer idPublishingHouse) {
        this.idPublishingHouse = idPublishingHouse;
    }

    public LiteratureCategory getLiteratureCategory() {
        return literatureCategory;
    }

    public void setLiteratureCategory(LiteratureCategory literatureCategory) {
        this.literatureCategory = literatureCategory;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
