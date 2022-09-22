package com.pedia.osmanpedia.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "literature_category")
public class LiteratureCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_literature_category")
    private Integer idLiteratureCategory;

    private String nombre;

    private Boolean estado;

    @OneToMany(mappedBy = "literatureCategory")
    private List<Book>  book;



    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public Integer getIdLiteratureCategory() {
        return idLiteratureCategory;
    }

    public void setIdLiteratureCategory(Integer idLiteratureCategory) {
        this.idLiteratureCategory = idLiteratureCategory;
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
