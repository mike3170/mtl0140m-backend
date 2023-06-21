package com.stit.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHOR")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
  @Column(name = "ID")
	private Long id;

  @Column(name = "AGE")
	private Long age;

  @Column(name = "NAME")
	private String name;

  @Column(name = "GENRE")
	private String genre;

	//@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true , mappedBy = "author")
	//@OneToMany(mappedBy = "author")
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="author_id", referencedColumnName = "id")
	@OrderBy("id")
	private List<Book> bookList;

	public Author() {
	}

	public Author(Long id) {
		this.id = id;
	}

	public Author(Long id, long age, String name, String genre) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
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
		if (!(object instanceof Author)) {
			return false;
		}
		Author other = (Author) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Author{" + "id=" + id + ", age=" + age + ", name=" + name + ", genre=" + genre + '}';
	}
	
	
}
