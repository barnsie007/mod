package com.acme.modres.mbean;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OpMetadataList {
	
	private List<OpMetadata> opMetadatList = new ArrayList<>();
	
	public void addOpMetadata(OpMetadata opMetadata) {
		opMetadatList.add(opMetadata);
	}

}
