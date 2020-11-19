package com.marciocavallieri.workshopmongodb.dominio;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Date data;		
	private String titulo;
	private String corpo;
	private Usuario autor;
	
	
	public Post () {
		
	}

	public Post(String id, Date data, String titulo, String corpo, Usuario autor) {
		super();
		this.id = id;
		this.data = data;
		this.titulo = titulo;
		this.corpo = corpo;
		this.autor = autor;
	}

	public String getId() {
		return id;
	}

	public Date getData() {
		return data;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCorpo() {
		return corpo;
	}
	
	public Usuario getAutor() {
		return autor;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}