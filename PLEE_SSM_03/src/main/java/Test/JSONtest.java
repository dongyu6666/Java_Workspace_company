package Test;

import com.alibaba.fastjson.JSONArray;

public class JSONtest {

    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        String sss = "{\n" +
                "    \"error\": \"null\",\n" +
                "    \"info\": \"offer all IB1_BZD info\",\n" +
                "    \"para\": [\n" +
                "        {\n" +
                "            \"ADDITIONAL_IDENTS\": [\n" +
                "                {\n" +
                "                    \"IDENTS_IDENT_NAME\": \"VW Coding Value\",\n" +
                "                    \"diagnose_adr\": \"0015\",\n" +
                "                    \"IDENTS_IDENT_DID\": \"0x0600\",\n" +
                "                    \"platform_name\": \"MEB\",\n" +
                "                    \"id\": 1,\n" +
                "                    \"IDENTS_IDENT_BGONLINE\": \"AMJ, AMK, AML\",\n" +
                "                    \"IB1_VERSION\": \"1_16\",\n" +
                "                    \"IB1_NAME\": \"Airbag_MQB37W\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"IDENTS_IDENT_NAME\": \"VW_Application_data_set_identification (Teil 1, 15 Byte)\",\n" +
                "                    \"diagnose_adr\": \"0015\",\n" +
                "                    \"IDENTS_IDENT_COMMENT\": \"Nur “data_set_version” dokumentieren\",\n" +
                "                    \"IDENTS_IDENT_DID\": \"0xF1B1\",\n" +
                "                    \"platform_name\": \"MEB\",\n" +
                "                    \"id\": 2,\n" +
                "                    \"IDENTS_IDENT_BGONLINE\": \"AMT\",\n" +
                "                    \"IB1_VERSION\": \"1_16\",\n" +
                "                    \"IB1_NAME\": \"Airbag_MQB37W\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"IDENTS_IDENT_NAME\": \"VW_Application_data_set_identification (Teil 2, 15 Byte)\",\n" +
                "                    \"diagnose_adr\": \"0015\",\n" +
                "                    \"IDENTS_IDENT_COMMENT\": \"Nur “data_set_version” dokumentieren\",\n" +
                "                    \"IDENTS_IDENT_DID\": \"0xF1B1\",\n" +
                "                    \"platform_name\": \"MEB\",\n" +
                "                    \"id\": 3,\n" +
                "                    \"IDENTS_IDENT_BGONLINE\": \"AMU\",\n" +
                "                    \"IB1_VERSION\": \"1_16\",\n" +
                "                    \"IB1_NAME\": \"Airbag_MQB37W\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"ADDITIONAL_IDENTS_DESC\": [\n" +
                "                {\n" +
                "                    \"IDENTS_DESC\": \"Die drei Sonderbaugruppen AMJ, AMK, AML werden vorbehaltlich in die IB-1 aufgenommen. Es ist noch unklar, ob diese zwangsläufig dokumentiert werden müssen. Nach einer noch ausstehenden Entscheidung, können diese ggf. wieder entfallen.\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"IDENTS\": [],\n" +
                "            \"IDENTS_DESC\": [],\n" +
                "            \"BASIC\": [\n" +
                "                {\n" +
                "                    \"s42_ATTRIBUTES_ADDED\": \"true\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"true\"\n" +
                "}";

    }
}
