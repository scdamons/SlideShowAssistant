package com.sheldondamons.slides.model.entity;

import java.sql.Date;

import javax.persistence.*;

/**
 * @author Sheldon Damons 2019
 * 
 *         <pre>
 * CREATE TABLE PRESENTATION (
                PRESENTATION_ID IDENTITY NOT NULL,
                PRESENTATION_DATE DATE NOT NULL,
                USER_GROUP_ID INTEGER NOT NULL,
                CONSTRAINT PK_PRESENTATION PRIMARY KEY (PRESENTATION_ID)
 *         </pre>
 */
@Entity
@Table(name = "PRESENTATION")
public class Presentation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "PRESENTATION_ID")
  private int presentationId;
  @Column(name = "PRESENTATION_DATE")
  private Date presentationDate;
  @Column(name = "USER_GROUP_ID")
  private int userGroupId;

  public int getPresentationId() {
    return presentationId;
  }

  public void setPresentationId(int presentationId) {
    this.presentationId = presentationId;
  }

  public Date getPresentationDate() {
    return presentationDate;
  }

  public void setPresentationDate(Date presentationDate) {
    this.presentationDate = presentationDate;
  }

  public int getUserGroupId() {
    return userGroupId;
  }

  public void setUserGroupId(int userGroupId) {
    this.userGroupId = userGroupId;
  }

}
