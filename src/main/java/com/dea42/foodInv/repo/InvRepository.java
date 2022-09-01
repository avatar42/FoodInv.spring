package com.dea42.foodInv.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dea42.foodInv.entity.Inv;

/**
 * Title: InvRepository <br>
 * Description: Class for the Inv Repository. <br>
 * Copyright: Copyright (c) 2001-2022<br>
 * Company: RMRR<br>
 *
 * @author Gened by com.dea42.build.GenSpring version 0.7.2<br>
 * @version 0.7.2<br>
 */
@Repository
public interface InvRepository extends CrudRepository<Inv, Long>,
JpaSpecificationExecutor<Inv> {
}
