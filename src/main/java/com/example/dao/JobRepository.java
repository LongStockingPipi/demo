package com.example.dao;

import com.example.entity.Job;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jason
 * @date 2021/3/27 23:38
 * @description
 */
@Repository
public interface JobRepository extends Neo4jRepository<Job, Long> {

  @Query("match p = (:TABLE) - [:INPUT] -> (j:JOB) - [:OUTPUT] - (:TABLE) where j.name = $name return p")
  List<Job> findJobByName(@Param("name") String name);

  @Query("match p = (:TABLE) - [:INPUT] -> (j:JOB) - [:OUTPUT] - (:TABLE) where id(j) = $id return p")
  List<Job> findJobById(@Param("id") Long id);

}
