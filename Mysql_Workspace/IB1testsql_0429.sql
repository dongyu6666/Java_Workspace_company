#所有Block
SELECT * FROM ib1_procedures_procedure_block_parameters_parameter
WHERE platform_name = 'MEB' AND IB1_VERSION = '1.7' AND diagnose_adr = '0009'




SELECT * FROM ib1_procedures_procedure_block_steps_step
WHERE platform_name = 'MEB' AND IB1_VERSION = '1.7' AND diagnose_adr = '0009' AND BLOCK_NAME = 'Verbaupruefung (Master)'



SELECT * FROM ib1_procedures_procedure_block_steps_step_diag_parameters
WHERE platform_name = 'MEB' AND IB1_VERSION = '1.7' AND diagnose_adr = '0009' AND BLOCK_NAME = 'Verbaupruefung (Master)' AND STEP_NAME = 'VW/Audi-Teilenummer lesen'



SELECT ib.IB1_RELEASE_DATE, ipp.BLOCK_NAME, iss.STEP_NAME, issp.DIAG_PARAMETER_SHORT_NAME
FROM ib1_basic AS ib, ib1_procedures_procedure AS ipp, ib1_procedures_procedure_block_steps_step AS iss,ib1_procedures_procedure_block_steps_step_diag_parameters AS issp
WHERE ib.platform_name = ipp.platform_name

SELECT 
ib.IB1_RELEASE_DATE, 
ipp.BLOCK_NAME, 
iss.STEP_NAME,
issp.DIAG_PARAMETER_SHORT_NAME
FROM ib1_basic AS ib RIGHT JOIN ib1_procedures_procedure AS ipp 
ON ib.platform_name = ipp.platform_name 
AND ib.diagnose_adr = ipp.diagnose_adr 
AND ib.IB1_VERSION = ipp.IB1_VERSION
RIGHT JOIN ib1_procedures_procedure_block_steps_step AS iss
ON ipp.platform_name = iss.platform_name 
AND ipp.diagnose_adr = iss.diagnose_adr 
AND ipp.IB1_VERSION = iss.IB1_VERSION
RIGHT JOIN ib1_procedures_procedure_block_steps_step_diag_parameters AS issp
ON iss.platform_name = issp.platform_name 
AND iss.diagnose_adr = issp.diagnose_adr 
AND iss.IB1_VERSION = issp.IB1_VERSION

SELECT 
ib.IB1_RELEASE_DATE, 
ipp.BLOCK_NAME
FROM ib1_basic AS ib RIGHT JOIN ib1_procedures_procedure AS ipp 
ON ib.platform_name = ipp.platform_name 
AND ib.diagnose_adr = ipp.diagnose_adr 

SELECT 
ipp.BLOCK_NAME, 
ib.IB1_RELEASE_DATE
FROM ib1_procedures_procedure AS ipp RIGHT JOIN ib1_basic AS ib 
#ON ib.platform_name = ipp.platform_name 
#AND ib.diagnose_adr = ipp.diagnose_adr 

ON ib.platform_name = 'MEB'
AND ib.diagnose_adr = '0009'
AND ib.IB1_VERSION = '1.7' 

SELECT 
ib.IB1_RELEASE_DATE, 
ipp.BLOCK_NAME
FROM ib1_basic AS ib , ib1_procedures_procedure AS ipp 
where ib.platform_name = ipp.platform_name 
AND ib.diagnose_adr = ipp.diagnose_adr 
=====================================================
select
ib.platform_name,
ib.diagnose_adr,
ib.IB1_VERSION,
ib.IB1_NAME,
ib.IB1_RELEASE_DATE IB1_RELEASE_DATE,
ib.IB1_IBN_REQUIRED,
ib.IB1_filename,

ipp.PROCEDURE_NAME,
ipp.BLOCK_KD_relevant,
ipp.BLOCK_P_relevant,
ipp.BLOCK_optional,
ipp.BLOCK_shortname,
ipp.BLOCK_standardIBNB,
ipp.BLOCK_version,
ipp.BLOCK_NAME,
ipp.BLOCK_NAME_EN,
ipp.BLOCK_DESC,
ipp.BLOCK_TAGS_TAG,
ipp.BLOCK_AREA,
ipp.BLOCK_LOGICAL_LINK,
ipp.BLOCK_CONDITIONS_MANUAL_OPERATIONS,
ipp.BLOCK_IBNZ_VSI,

iss.STEP_NAME,
iss.STEP_DESC,
iss.STEP_DIAG_SERVICE_IDENTIFIER,
iss.STEP_DIAG_SERVICE_LONG_NAME,
iss.STEP_DIAG_SERVICE_SHORT_NAME,
iss.STEP_DIAG_PARAMETERS_DATA_IDENTIFIER,

issdp.DIAG_PARAMETER_LONG_NAME,
issdp.DIAG_PARAMETER_SHORT_NAME,
issdp.DIAG_PARAMETER_MESSAGE_TYPE,
issdp.DIAG_PARAMETER_RESPONSE_SHORT_NAME,
issdp.DIAG_PARAMETER_PATH,
issdp.DIAG_PARAMETER_DATATYPE,
issdp.DIAG_PARAMETER_VALUE_PROXY_VALUE

from ib1_basic AS ib left join ib1_procedures_procedure AS ipp
ON ib.platform_name = ipp.platform_name 
AND ib.diagnose_adr = ipp.diagnose_adr 
AND ib.IB1_VERSION = ipp.IB1_VERSION

LEFT JOIN ib1_procedures_procedure_block_steps_step AS iss
ON ipp.platform_name = iss.platform_name 
AND ipp.diagnose_adr = iss.diagnose_adr 
AND ipp.IB1_VERSION = iss.IB1_VERSION
AND ipp.BLOCK_NAME = iss.BLOCK_NAME

INner JOIN IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS AS issdp
ON iss.platform_name = issdp.platform_name 
AND iss.diagnose_adr = issdp.diagnose_adr 
AND iss.IB1_VERSION = issdp.IB1_VERSION
AND iss.BLOCK_NAME = issdp.BLOCK_NAME
AND iss.STEP_NAME = issdp.STEP_NAME




