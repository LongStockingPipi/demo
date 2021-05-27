package com.example.entity;

import org.neo4j.ogm.annotation.*;

import java.util.List;

/**
 * @author Jason
 * @date 2021/3/29 21:24
 * @description
 */
@NodeEntity("JOB")
public class Job {

  @Id
  @GeneratedValue
  private Long id;

  @Property("name")
  private String name;

  @Property("processName")
  private String processName;

  @Property("version")
  private String version;

  @Relationship(type = "INPUT", direction = Relationship.INCOMING)
  private List<Table> inputs;

  @Relationship(type = "OUTPUT", direction = Relationship.OUTGOING)
  private List<Table> outputs;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProcessName() {
    return processName;
  }

  public void setProcessName(String processName) {
    this.processName = processName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public List<Table> getInputs() {
    return inputs;
  }

  public void setInputs(List<Table> inputs) {
    this.inputs = inputs;
  }

  public List<Table> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<Table> outputs) {
    this.outputs = outputs;
  }

  @Override
  public String toString() {
    return "Job{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", processName='" + processName + '\'' +
        ", version='" + version + '\'' +
        ", inputs=" + inputs +
        ", outputs=" + outputs +
        '}';
  }
}
