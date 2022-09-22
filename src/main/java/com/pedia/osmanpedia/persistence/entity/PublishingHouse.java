package com.pedia.osmanpedia.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publishing_house")
public class PublishingHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publishing_house")
    private Integer idPublishingHouse;

    @OneToMany(mappedBy = "idLiteratureCategory")
    private List<Book> book;

    private String nombre;

    private Boolean estado;

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public Integer getIdPublishingHouse() {
        return idPublishingHouse;
    }

    public void setIdPublishingHouse(Integer idPublishingHouse) {
        this.idPublishingHouse = idPublishingHouse;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
