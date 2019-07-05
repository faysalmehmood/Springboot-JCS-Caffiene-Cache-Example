CREATE TABLE
    iso_msg_headers
    (
        header_id SMALLINT NOT NULL,
        header_desc VARCHAR(60),
        protocol_id VARCHAR(12),
        message_source CHAR(2),
        version_no CHAR(2),
        field_in_error VARCHAR(3),
        extra_use CHAR(2),
        rec_no INTEGER,
        PRIMARY KEY (header_id) CONSTRAINT xpkiso_msg_headers
    );

CREATE TABLE
    iso_msg_fields
    (
        sr_no SERIAL NOT NULL,
        header_id INTEGER NOT NULL,
        bit_no SMALLINT NOT NULL,
        usage VARCHAR(5) NOT NULL,
        field_name VARCHAR(30),
        field_desc VARCHAR(180),
        field_type VARCHAR(3) NOT NULL,
        field_length SMALLINT,
        presentation VARCHAR(20),
        requirements VARCHAR(180),
        var_len_exp CHAR(1) DEFAULT '0',
        is_exceptional CHAR(1),
        encoding VARCHAR(20),
        dbit_flag CHAR(1),
        last_updated_at DATETIME YEAR TO SECOND,
        rec_no INTEGER,
        PRIMARY KEY (header_id, bit_no, usage),
        UNIQUE (sr_no)
    );