package com.mpm.projects.plumber;

public class Status {

	private final int code;
	private final String message;

	public Status(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public long getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
