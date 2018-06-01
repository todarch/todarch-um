package com.todarch.um.helper;

import com.todarch.um.domain.shared.Email;
import com.todarch.um.domain.shared.RawPassword;

public final class TestUser {

  private TestUser() {
    throw new AssertionError("Cannot create a object from utility class");
  }

  public static final Email EMAIL = Email.from("selim@sevgi.com");
  public static final RawPassword RAW_PASSWORD = RawPassword.from("12345678");

}