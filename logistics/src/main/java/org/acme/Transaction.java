package org.acme;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class Transaction {

    @DataField(pos = 1)
    private String origin;
    @DataField(pos = 2)
    private Double weight;
    @DataField(pos = 3)
    private boolean special;
    
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
    
    
}
