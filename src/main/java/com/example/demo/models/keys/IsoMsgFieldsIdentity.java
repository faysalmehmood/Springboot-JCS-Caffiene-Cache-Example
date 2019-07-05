package com.example.demo.models.keys;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Getter
@EqualsAndHashCode
@Embeddable
public class IsoMsgFieldsIdentity implements Serializable {
	@Column(name = "header_id")
	private int headerId;
	@Column(name = "bit_no")
	private int bitNo;
	@Column(name = "usage")
	private String usage;

	public IsoMsgFieldsIdentity(int headerId, int bitNo, String usage) {
		this.headerId = headerId;
		this.bitNo = bitNo;
		this.usage = usage;
	}


	public IsoMsgFieldsIdentity() {
	}
}
