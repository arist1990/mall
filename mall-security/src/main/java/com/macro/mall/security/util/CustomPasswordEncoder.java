package com.macro.mall.security.util;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.toString().contentEquals(s);
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return false;
    }
}
