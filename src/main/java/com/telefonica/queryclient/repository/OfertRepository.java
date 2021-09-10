package com.telefonica.queryclient.repository;


import com.telefonica.queryclient.model.entity.Ofert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertRepository extends JpaRepository<Ofert,Long> {


}
