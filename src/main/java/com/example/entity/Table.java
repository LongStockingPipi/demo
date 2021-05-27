package com.example.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author Jason
 * @date 2021/3/27 23:32
 * @description
 */
@NodeEntity("TABLE")
public class Table {

  @Id
  @GeneratedValue
  private Long nodeId;

  @Property("name")
  private String name;

  @Property("desc")
  private String desc;

  @Property("version")
  private String version;

  @Property("db")
  private Integer db;

  public Long getNodeId() {
    return nodeId;
  }

  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Integer getDb() {
    return db;
  }

  public void setDb(Integer db) {
    this.db = db;
  }

  @Override
  public String toString() {
    return "Table{" +
        "nodeId=" + nodeId +
        ", name='" + name + '\'' +
        ", desc='" + desc + '\'' +
        ", version='" + version + '\'' +
        ", db=" + db +
        '}';
  }
}
