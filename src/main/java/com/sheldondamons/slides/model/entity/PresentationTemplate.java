package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author sheld
 * 
 *         <pre>
 *         CREATE TABLE PRESENTATION_TEMPLATE ( PRESENTATION_TEMPLATE_ID IDENTITY NOT NULL,
 *         PRESENTATION_TEMPLATE_NAME VARCHAR(60) NOT NULL, CONSTRAINT PK_PRESENTATION_TEMPLATE PRIMARY KEY
 *         (PRESENTATION_TEMPLATE_ID) );
 * 
 *         <pre>
 */
@Entity
@Table(name="PRESENTATION_TEMPLATE")
public class PresentationTemplate {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRESENTATION_TEMPLATE_ID")
	private int PresentationTemplateId;
	
	@Column(name="PRESENTATION_TEMPLATE_NAME")
	private String PresentationTemplateName;
	
	public int getPresentationTemplateId() {
		return PresentationTemplateId;
	}
	public void setPresentationTemplateId(int presentationTemplateId) {
		PresentationTemplateId = presentationTemplateId;
	}
	public String getPresentationTemplateName() {
		return PresentationTemplateName;
	}
	public void setPresentationTemplateName(String presentationTemplateName) {
		PresentationTemplateName = presentationTemplateName;
	}
	
}
