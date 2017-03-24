package com.example.contacts.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class UrlEntity extends BaseEntity {

	public String getUrl() {
		return getClass().getSimpleName().toLowerCase() + "?id=" + getId();
	}

}
