package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author Sheldon Damons 2019
 * 
 *         <pre>
CREATE TABLE PRESENTATION_SLIDES (
                PRESENTATION_SLIDES_ID IDENTITY NOT NULL,
                PRESENTATION_SLIDES_POSITION INTEGER NOT NULL,
                PRESENTATION_TEMPLATE_ID INTEGER NOT NULL,
                PRESENTATION_ID INTEGER NOT NULL,
                SLIDE_ID INTEGER NOT NULL,
                CONSTRAINT PK_PRESENTATION_SLIDES PRIMARY KEY (PRESENTATION_SLIDES_ID)
 *         </pre>
 */
@Entity
@Table(name = "PRESENTATION_SLIDES")
public class PresentationSlides {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "PRESENTATION_SLIDES_ID")
  private int presentationSlideId;
  @Column(name = "PRESENTATION_SLIDES_POSITION")
  private int presentationSlidePosition;
  @Column(name = "PRESENTATION_TEMPLATE_ID")
  private int presentationTemplateId;
  @Column(name = "PRESENTATION_ID")
  private int presentationId;
  @Column(name = "SLIDE_ID")
  private int slideId;

  public int getPresentationSlideId() {
    return presentationSlideId;
  }

  public void setPresentationSlideId(int presentationSlideId) {
    this.presentationSlideId = presentationSlideId;
  }

  public int getPresentationSlidePosition() {
    return presentationSlidePosition;
  }

  public void setPresentationSlidePosition(int presentationSlidePosition) {
    this.presentationSlidePosition = presentationSlidePosition;
  }

  public int getPresentationTemplateId() {
    return presentationTemplateId;
  }

  public void setPresentationTemplateId(int presentationTemplateId) {
    this.presentationTemplateId = presentationTemplateId;
  }

  public int getPresentationId() {
    return presentationId;
  }

  public void setPresentationId(int presentationId) {
    this.presentationId = presentationId;
  }

  public int getSlideId() {
    return slideId;
  }

  public void setSlideId(int slideId) {
    this.slideId = slideId;
  }


}
