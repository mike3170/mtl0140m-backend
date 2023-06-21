package com.stit.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
  @Column(name = "ID")
	private Long id;

  @Column(name = "ISBN")
	private String isbn;

  @Column(name = "TITLE")
	private String title;

	//@JoinColumn(name = "AUTHOR_ID", referencedColumnName = "ID")
  //@ManyToOne(optional = false)
	//private Author author;

  @Column(name = "author_id")
	private Long authorId;

	public Book() {
	}

	public Book(Long id) {
		this.id = id;
	}

	public Book(Long id, String isbn, String title) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	//public Author getAuthor() {
	//	return author;
	//}

	//public void setAuthor(Author author) {
	//	this.author= author;
	//}

	public Long getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId= authorId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Book)) {
			return false;
		}
		Book other = (Book) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Book{" + "id=" + id + ", isbn=" + isbn + ", title=" + title + '}';
	}

	
}
