package com.garcia.pontointeligente.api.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class Response <T> {
	
	@Getter
	@Setter
	private T data;
	
	@Setter
	private List<String> errors;

	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}

}
