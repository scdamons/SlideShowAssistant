package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * 
 * @author sheld
 * <pre>CREATE TABLE PRESENTATION_TEMPLATE_SLIDE (
                PRESENTATION_TEMPLATE_SLIDE_ID IDENTITY NOT NULL,
                PRESENTATION_TEMPLATE_SLIDE_POSITION INTEGER NOT NULL,
                PRESENTATION_TEMPLATE_ID INTEGER NOT NULL,
                SLIDE_ID INTEGER NOT NULL,
                CONSTRAINT PK_PRESENTATION_TEMPLATE_SLIDE PRIMARY KEY (PRESENTATION_TEMPLATE_SLIDE_ID)<pre>
 */
@Entity
@Table(name="PRESENTATION_TEMPLATE_SLIDE")
public class PresentationTemplateSlide {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "PRESENTATION_TEMPLATE_SLIDE_ID")
  private int presentationTemplateSlideId;

	@Column(name="PRESENTATION_TEMPLATE_SLIDE_POSITION")
	private int presentationTemplateSlidePosition ;
	
	@Column(name="SLIDE_ID")
	private int slideId;
	
  // @ManyToOne
  // @JoinColumn(name = "SLIDE_ID")
  // private Slide slide;

	@Column(name = "PRESENTATION_TEMPLATE_ID")
	private int presentationTemplateId;
	
  // @ManyToOne
  // @JoinColumn(name = "PRESENTATION_TEMPLATE_ID")
  // private PresentationTemplate presentationTemplate;

}
