package com.example.demo.ExcellenceRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ExcellenceClassesModel;


@Repository
public interface ExcellenceJpaRepository extends JpaRepository<ExcellenceClassesModel,Integer> {

}
