package com.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {
	@UniqueConstraint(columnNames = {"cronKey"},name = "cron-name-unique")	
})
public class Cron {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String cronKey;
	
	@Column(nullable = false)
	private String cronValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCronKey() {
		return cronKey;
	}

	public void setCronKey(String cronKey) {
		this.cronKey = cronKey;
	}

	public String getCronValue() {
		return cronValue;
	}

	public void setCronValue(String cronValue) {
		this.cronValue = cronValue;
	}

	@Override
	public String toString() {
		return "Cron [id=" + id + ", cronKey=" + cronKey + ", cronValue=" + cronValue + "]";
	}
	
	
}
