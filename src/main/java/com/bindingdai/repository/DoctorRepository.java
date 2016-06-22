package com.bindingdai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bindingdai.model.DoctorEntity;
/**
 * Created by daibinding on 16/4/19.
 */
@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity,Integer>{

}
