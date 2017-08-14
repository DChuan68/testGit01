package demo;

import java.io.Serializable;

public class Fu extends FuFu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String aaa;
	private String bbb;
	
	
	
	public String getAaa() {
		return aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	public String getBbb() {
		return bbb;
	}
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	
	
	
}
