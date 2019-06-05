package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author Sheldon Damons 2019
 * 
 *         <pre>
 * CREATE TABLE SLIDE_SLIDEDATA (
                SLIDE_SLIDEDATA_ID IDENTITY NOT NULL,
                SLIDE_DATA_ID INTEGER NOT NULL,
                SLIDE_ID INTEGER NOT NULL,
                CONSTRAINT PK_SLIDE_SLIDEDATA PRIMARY KEY (SLIDE_SLIDEDATA_ID)
 *         </pre>
 */
@Entity
@Table(name = "SLIDE_SLIDEDATA")
public class SlideSlideData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "SLIDE_SLIDEDATA_ID")
  private int slideSlideData;
  @Column(name = "SLIDE_DATA_ID")
  private int slideDataId;
  @Column(name = "SLIDE_ID")
  private int slideId;

  public int getSlideSlideData() {
    return slideSlideData;
  }

  public void setSlideSlideData(int slideSlideData) {
    this.slideSlideData = slideSlideData;
  }

  public int getSlideDataId() {
    return slideDataId;
  }

  public void setSlideDataId(int slideDataId) {
    this.slideDataId = slideDataId;
  }

  public int getSlideId() {
    return slideId;
  }

  public void setSlideId(int slideId) {
    this.slideId = slideId;
  }

}
