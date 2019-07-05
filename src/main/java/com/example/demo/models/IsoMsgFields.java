package com.example.demo.models;

import com.example.demo.models.keys.IsoMsgFieldsIdentity;
import lombok.Getter;

import javax.persistence.*;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Getter
@Entity(name = "IsoMsgFields")
@Table(name = "iso_msg_fields")
public class IsoMsgFields {

	@EmbeddedId
	private IsoMsgFieldsIdentity id;

	/*@Id
	@Column(name = "header_id")
	private int headerId;
	@Column(name = "bit_no")
	private int bitNo;
	@Column(name = "usage")
	private String usage;*/

	@Column(name = "sr_no")
	private long srNo;
	@Column(name = "field_name")
	private String fieldName;
	@Column(name = "field_desc")
	private String fieldDesc;
	@Column(name = "field_type")
	private String fieldType;
	@Column(name = "field_length")
	private int fieldLength;
	@Column(name = "presentation")
	private String presentation;
	@Column(name = "var_len_exp")
	private char varLenExp;
	@Column(name = "is_exceptional")
	private char isExceptional;
	@Column(name = "encoding")
	private String encoding;
}
