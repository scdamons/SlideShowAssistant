package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author sheld
 * 
 *         <pre>
 * CREATE TABLE SLIDE_DATA_TYPE (
                SLIDE_DATA_TYPE_ID IDENTITY NOT NULL,
                SLIDE_TYPE_NAME VARCHAR(60) NOT NULL,
                CONSTRAINT PK_SLIDE_DATA_TYPE PRIMARY KEY (SLIDE_DATA_TYPE_ID)
);
 *         </pre>
 */
@Entity
@Table(name = "SLIDE_DATA_TYPE")
public class SlideDataType {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "SLIDE_DATA_TYPE_ID")
  private int slideDateTypeId;

  @Column(name = "SLIDE_TYPE_NAME")
  private String slideTypeName;

  /**
   * @return SlideDateTypeId
   */
  public int getSlideDateTypeId() {
    return slideDateTypeId;
  }

  /**
   * @param slideDateTypeId
   */
  public void setSlideDateTypeId(int slideDateTypeId) {
    this.slideDateTypeId = slideDateTypeId;
  }

  /**
   * @return SlideTypeName
   */
  public String getSlideTypeName() {
    return slideTypeName;
  }

  /**
   * @param slideTypeName
   */
  public void setSlideTypeName(String slideTypeName) {
    this.slideTypeName = slideTypeName;
  }

}
