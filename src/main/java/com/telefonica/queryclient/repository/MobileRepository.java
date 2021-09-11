package com.telefonica.queryclient.repository;


import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository  extends JpaRepository<Mobile,Long> {
    @Query(value = "SELECT M.* FROM MOBILE M " +
          "INNER JOIN CLIENT C ON C.CLIENTID = M.CLIENTFK " +
            " WHERE " +
            "C.TYPE_DOCUMENT = ?1 AND C.NUMBER_DOCUMENT = ?2 ",nativeQuery = true)

public List<Mobile> findByTypedocumentAndNumberDocument(String typedocument, String numberDocument);

}
