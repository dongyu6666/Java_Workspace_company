package com.fawvw.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IB1_DIAG_INFOS_DIAG_INFOLei {

    private Integer id;

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String DESC;
    private String DIAG_PROTOCOL;
    private String TRANSPORT_PROTOCOL;
    private String ECU_ID;
    private String PDX;


}
