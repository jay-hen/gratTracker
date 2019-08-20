package com.jesshenry.grattracker.Models.data;

import com.jesshenry.grattracker.Models.Grat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface GratDao extends CrudRepository<Grat, Integer> {
}