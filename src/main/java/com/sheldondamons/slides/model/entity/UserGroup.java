package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author Sheldon Damons 2019
 * 
 *         <pre>
 * CREATE TABLE USER_GROUP (
                USER_GROUP_ID IDENTITY NOT NULL,
                USER_GROUP_NAME VARCHAR(60) NOT NULL,
                CONSTRAINT PK_USER_GROUP PRIMARY KEY (USER_GROUP_ID)
 *         </pre>
 */
@Entity
@Table(name = "USER_GROUP")
public class UserGroup {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "USER_GROUP_ID")
  private int userGroupId;
  @Column(name = "USER_GROUP_NAME")
  private String userGroupName;

  public int getUserGroupId() {
    return userGroupId;
  }

  public void setUserGroupId(int userGroupId) {
    this.userGroupId = userGroupId;
  }

  public String getUserGroupName() {
    return userGroupName;
  }

  public void setUserGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
  }

}
