package com.digitalinnovation.personipa.utils;

import com.digitalinnovation.personipa.dto.request.PhoneDTO;
import com.digitalinnovation.personipa.entity.Phone;
import com.digitalinnovation.personipa.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999999999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final  Long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
