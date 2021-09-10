package com.telefonica.queryclient.repository;

import com.telefonica.queryclient.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

public List<Client> findByTypeDocumentAndNumberDocument(String typeDocument,String numberDocument);


}
