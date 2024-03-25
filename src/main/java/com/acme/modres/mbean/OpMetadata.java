package com.acme.modres.mbean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OpMetadata {
	
	private String name;
	private String description;
	//TODO signature, assume empty for now
	private String type;
	private int impact;

}
