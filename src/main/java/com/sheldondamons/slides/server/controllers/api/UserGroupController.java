package com.sheldondamons.slides.server.controllers.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sheldondamons.slides.model.entity.UserGroup;
import com.sheldondamons.slides.model.repository.UserGroupRepository;

/**
 * @author Sheldon Damons 2019
 *
 */
@RestController
@RequestMapping(value = "/api")
public class UserGroupController {

  @Autowired
  private UserGroupRepository slideRepository;

  @RequestMapping(method = RequestMethod.GET, value="/user-group")
  public List<UserGroup> getUserGroups() {
    List<UserGroup> retList = new ArrayList<>();
    slideRepository.findAll().forEach(retList::add);
    return retList;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/user-group/{user-group-id}")
  public Optional<UserGroup> getUserGroups(@PathVariable(value = "user-group-id") int userGroupId) {
    return slideRepository.findById(userGroupId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/user-group")
  public UserGroup createUserGroup(UserGroup userGroup) {
    return slideRepository.save(userGroup);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/user-group/{user-group-id}")
  public UserGroup updateUserGroup(UserGroup userGroup) {
    return slideRepository.save(userGroup);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/user-group/{user-group-id}")
  public void deleteUserGroup(UserGroup userGroup) {
    slideRepository.delete(userGroup);
    return;
  }

}
