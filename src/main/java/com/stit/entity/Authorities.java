/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stit.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "AUTHORITIES")
@NamedQueries({
	@NamedQuery(name = "Authorities.findAll", query = "SELECT a FROM Authorities a")})
public class Authorities implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "USERNAME")
	private String username;
	@Basic(optional = false)
  @Column(name = "AUTHORITY")
	private String authority;

	public Authorities() {
	}

	public Authorities(String username) {
		this.username = username;
	}

	public Authorities(String username, String authority) {
		this.username = username;
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (username != null ? username.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Authorities)) {
			return false;
		}
		Authorities other = (Authorities) object;
		if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.stit.entity.Authorities[ username=" + username + " ]";
	}
	
}
