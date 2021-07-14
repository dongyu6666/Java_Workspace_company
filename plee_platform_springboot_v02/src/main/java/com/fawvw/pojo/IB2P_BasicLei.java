package com.fawvw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IB2P_BasicLei {

    private Integer id;

    private String platform_name;
    private String IB2P_VERSION;
    private String diagnose_adr;
    private String IB2P_NAME;

    private String IB2P_RELEASE_DATE;
    private String IB2P_filename;


    private String username;
    private String IB2P_VERSION_LOCAL;
    private String IB3P_Official_Release;

}
