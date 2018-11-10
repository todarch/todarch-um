package com.todarch.um.rest.account;

import com.todarch.um.Endpoints;
import com.todarch.um.application.user.UserQueryService;
import com.todarch.um.application.user.model.UserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class AccountController {

  private final UserQueryService userQueryService;

  /**
   * Returns current user account information.
   *
   * @return user dto
   */
  @GetMapping(Endpoints.ACCOUNT)
  public ResponseEntity<UserDto> currentUserAccount() {
    UserDto account = userQueryService.getAccount();

    return ResponseEntity.ok(account);
  }
}

