package com.practice;
public class KeyModel {
	private String key;
	private int value;
	public KeyModel(String K, int V) {
		super();
		this.key = K;
		this.value = V;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String K) {
		this.key = K;
	}

	public void setValue(int V) {
		this.value = V;
	}

	public int getValue() {
		return this.value;
	}
}