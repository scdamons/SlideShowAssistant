package com.sheldondamons.slides.model.entity;

import javax.persistence.*;

/**
 * @author sheld
 *
 * <pre>CREATE TABLE SLIDE (
                SLIDE_ID IDENTITY NOT NULL,
                SLIDE_TITLE VARCHAR(60) NOT NULL,
                SLIDE_META VARCHAR(2048),
                CONSTRAINT PK_SLIDE PRIMARY KEY (SLIDE_ID))</pre>

 */
@Entity
@Table(name="SLIDE")
public class Slide {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SLIDE_ID")
	private int slideId;

	@Column(name="SLIDE_TITLE")
	private String slideTitle;

	@Column(name="SLIDE_META")
	private String slideMeta;

	public int getSlideId() {
		return slideId;
	}

	public void setSlideId(int slideId) {
		this.slideId = slideId;
	}

	public String getSlideTitle() {
		return slideTitle;
	}

	public void setSlideTitle(String slideTitle) {
		this.slideTitle = slideTitle;
	}

	public String getSlideMeta() {
		return slideMeta;
	}

	public void setSlideMeta(String slideMeta) {
		this.slideMeta = slideMeta;
	}


}
