package com.telefonica.queryclient.repository;

import com.telefonica.queryclient.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


}
