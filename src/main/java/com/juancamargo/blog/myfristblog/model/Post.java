package com.juancamargo.blog.myfristblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="TB_POST")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

    @NotBlank
    @Lob
    private String texto;

    //Getters Settes

    public Long getId() {return Id;    }

    public void setId(Long Id) {this.Id = Id;    }

    public String getTitulo() {return titulo;    }

    public void setTitulo(String titulo) {this.titulo = titulo;    }

    public String getAutor() {return autor;    }

    public void setAutor(String autor) {this.autor = autor;    }

    public LocalDate getData() {return data;    }

    public void setData(LocalDate data) {this.data = data;    }

    public String getTexto() {return texto;    }

    public void setTexto(String texto) {this.texto = texto;    }
}
