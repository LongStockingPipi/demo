package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.springframework.util.Assert.notEmpty;

/**
 * @author Jason
 * @date 2021/3/27 23:07
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JobRepositoryTest {

  @Autowired
  private JobRepository jobRepository;

  @Test
  public void successForReadJobByName() {
    List<Job> jobs = jobRepository.findJobByName("trace-scala-u-cbt");
    notEmpty(jobs, "the result is empty!");
    Job job = jobs.get(0);
    List<Table> inputs = job.getInputs();
    List<Table> outputs = job.getOutputs();
    notEmpty(inputs, "inputs is empty!");
    notEmpty(outputs, "outputs is empty!");

    assert 1 == inputs.size();
    assert 2 == outputs.size();
    
    System.out.println(job.toString());
  }

  @Test
  public void successForReadJobById() {
    List<Job> jobs = jobRepository.findJobById(1l);
    notEmpty(jobs, "the result is empty!");
    Job job = jobs.get(0);
    List<Table> inputs = job.getInputs();
    List<Table> outputs = job.getOutputs();
    notEmpty(inputs, "inputs is empty!");
    notEmpty(outputs, "outputs is empty!");

    assert 2 == inputs.size();
    assert 2 == outputs.size();

    System.out.println(job.toString());
  }


}
