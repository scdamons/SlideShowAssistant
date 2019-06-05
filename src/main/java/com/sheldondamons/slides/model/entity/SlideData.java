package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author sheld
 * 
 *         <pre>
 * CREATE TABLE SLIDE_DATA (
                SLIDE_DATA_ID IDENTITY NOT NULL,
                SLIDE_DATA_TEXT VARCHAR(8192),
                SLIDE_DATA_BINARY BINARY,
                SLIDE_DATA_TYPE_ID INTEGER NOT NULL,
                CONSTRAINT PK_SLIDE_DATA PRIMARY KEY (SLIDE_DATA_ID)
 *         </pre>
 */
/**
 * @author Sheldon Damons 2019
 *
 */
@Entity
@Table(name = "SLIDE_DATA")
public class SlideData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "SLIDE_DATA_ID")
  private int slideDataId;

  @Column(name = "SLIDE_DATA_TEXT")
  private String slideDataText;

  @Column(name = "SLIDE_DATA_BINARY")
  private byte[] slideDataBinary;

  @Column(name = "SLIDE_DATA_TYPE_ID")
  private int slideDataTypeId;

  /**
   * @return slideDataId
   */
  public int getSlideDataId() {
    return slideDataId;
  }

  /**
   * @param slideDataId
   */
  public void setSlideDataId(int slideDataId) {
    this.slideDataId = slideDataId;
  }

  /**
   * @return slideDataText
   */
  public String getSlideDataText() {
    return slideDataText;
  }

  /**
   * @param slideDataText
   */
  public void setSlideDataText(String slideDataText) {
    this.slideDataText = slideDataText;
  }

  /**
   * @return slideDataBinary
   */
  public byte[] getSlideDataBinary() {
    return slideDataBinary;
  }

  /**
   * @param slideDataBinary
   */
  public void setSlideDataBinary(byte[] slideDataBinary) {
    this.slideDataBinary = slideDataBinary;
  }

  /**
   * @return the slideDataTypeId
   */
  public int getSlideDataTypeId() {
    return slideDataTypeId;
  }

  /**
   * @param slideDataTypeId
   */
  public void setSlideDataTypeId(int slideDataTypeId) {
    this.slideDataTypeId = slideDataTypeId;
  }

}
