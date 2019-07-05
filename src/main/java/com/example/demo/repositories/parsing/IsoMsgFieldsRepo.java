package com.example.demo.repositories.parsing;

import com.example.demo.models.IsoMsgFields;
import com.example.demo.models.keys.IsoMsgFieldsIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Repository
public interface IsoMsgFieldsRepo extends JpaRepository<IsoMsgFields, IsoMsgFieldsIdentity> {
}
