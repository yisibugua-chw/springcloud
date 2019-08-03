package com.example.demo.model;

import javax.persistence.Table;

@Table(name = "configProperties")
public class ConfigProperties {

	private Integer id;
	
	private String akey;
	
	private String avalue;
	
	private String application;
	
	private String aprofile;
	
	private String label;

	public ConfigProperties(Integer id, String akey, String avalue, String application, String aprofile, String label) {
		super();
		this.id = id;
		this.akey = akey;
		this.avalue = avalue;
		this.application = application;
		this.aprofile = aprofile;
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAkey() {
		return akey;
	}

	public void setAkey(String akey) {
		this.akey = akey;
	}

	public String getAvalue() {
		return avalue;
	}

	public void setAvalue(String avalue) {
		this.avalue = avalue;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getAprofile() {
		return aprofile;
	}

	public void setAprofile(String aprofile) {
		this.aprofile = aprofile;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "ConfigProperties [id=" + id + ", akey=" + akey + ", avalue=" + avalue + ", application=" + application
				+ ", aprofile=" + aprofile + ", label=" + label + "]";
	}
	

	
	
}
