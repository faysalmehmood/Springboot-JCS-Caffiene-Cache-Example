package com.example.demo.models;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Getter
@Entity
public class IsoMsgHeaders {

	@Id
	private long headerId;
	private String headerDesc;
	private String protocolId;
	private String messageSource;
	private String versionNo;

}
