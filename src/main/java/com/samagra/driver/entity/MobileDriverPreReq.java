package com.samagra.driver.entity;

import com.samagra.enums.MobileOSType;
import com.samagra.enums.MobileRemotePlatform;
import com.samagra.enums.RunMode;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverPreReq {
    private MobileOSType mobileOSType;
    private MobileRemotePlatform mobileRemotePlatform;
}
