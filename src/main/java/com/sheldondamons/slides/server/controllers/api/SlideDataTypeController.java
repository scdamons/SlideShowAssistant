package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.SlideDataType;
import com.sheldondamons.slides.model.repository.SlideDataTypeRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class SlideDataTypeController {

  @Autowired
  private SlideDataTypeRepository slideRepository;

  @RequestMapping(method = RequestMethod.GET, value="/slide-data-type")
  public List<SlideDataType> getSlideDataTypes() {
    List<SlideDataType> retList = new ArrayList<>();
    slideRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/slide-data-type/{slide-data-type-id}")
  public Optional<SlideDataType> getSlideDataTypes(@PathVariable(value = "slide-data-type-id") int slideDataTypeId) {
    return slideRepository.findById(slideDataTypeId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/slide-data-type")
  public SlideDataType createSlideDataType(SlideDataType slideDataType) {
    return slideRepository.save(slideDataType);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/slide-data-type/{slide-data-type-id}")
  public SlideDataType updateSlideDataType(SlideDataType slideDataType) {
    return slideRepository.save(slideDataType);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/slide-data-type/{slide-data-type-id}")
  public void deleteSlideDataType(SlideDataType slideDataType) {
    slideRepository.delete(slideDataType);
    return;
  }

}
