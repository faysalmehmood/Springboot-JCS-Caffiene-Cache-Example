package com.example.demo.repositories.parsing;

import com.example.demo.models.IsoMsgHeaders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fmehmood
 * @since June, 19 2019
 */

@Repository
public interface IsoMsgHeadersRepo extends CrudRepository<IsoMsgHeaders, Long> {

}
