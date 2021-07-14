最大连接数
SHOW VARIABLES LIKE '%max_connections%'

响应的连接数
SHOW GLOBAL STATUS LIKE 'max_used_connections';


#SET GLOBAL max_connections=1000
#SET GLOBAL wait_timeout=28800
SET GLOBAL thread_cache_size=16

SHOW GLOBAL VARIABLES LIKE 'wait_timeout';
SHOW STATUS LIKE '%Connection%';  

SHOW STATUS
SHOW GLOBAL STATUS LIKE 'Thread%';
SHOW VARIABLES LIKE 'thread_cache_size';

SHOW VARIABLES LIKE "%timeout%"

SHOW PROCESSLIST

==================================================

SHOW GLOBAL STATUS LIKE 'Thread%';
SHOW GLOBAL STATUS LIKE 'connections';

Threads_created/Connections 线程缓存的效率，比值越小越好
SELECT 300/338

SELECT client_ip,COUNT(client_ip) AS client_num FROM (SELECT SUBSTRING_INDEX(HOST,':' ,1) AS client_ip FROM information_schema.processlist ) AS connect_info GROUP BY client_ip ORDER BY client_num DESC;
SELECT * FROM information_schema.processlist WHERE Command != 'Sleep' ORDER BY TIME DESC;

SELECT CONCAT('kill ', id, ';') FROM information_schema.processlist WHERE Command != 'Sleep' AND TIME > 300 ORDER BY TIME DESC;


对于mysql服务器最大连接数值的设置范围比较理想的是：
服务器响应的最大连接数值占服务器上限连接数值的比例值在10%以上，如果在10%以下，说明mysql服务器最大连接上限值设置过高.

Max_used_connections / max_connections * 100% = 3/512 *100% ≈ 0.0058%

Communications link failure\n\nThe LAST packet sent successfully TO the SERVER was 0 milliseconds ago. The driver has NOT received ANY packets FROM the SERVER

     
        SELECT
        CONCAT(' select ',GROUP_CONCAT(COLUMN_NAME),' from ', TABLE_NAME,' ;')
        FROM information_schema.COLUMNS
        WHERE TABLE_NAME = 'ib1_procedures_procedure_block_steps_step_diag_parameters'
        AND TABLE_SCHEMA = 'plee_platform'
        AND COLUMN_NAME != 'platform_name'
        AND COLUMN_NAME != 'IB1_VERSION'
        AND COLUMN_NAME != 'diagnose_adr'
        AND COLUMN_NAME != 'STEP_DIAG_PARAMETERS_DATA_IDENTIFIER'

        AND COLUMN_NAME != 'create_time'
        AND COLUMN_NAME != 'update_time';  
        
 
 
 SELECT
CONCAT(GROUP_CONCAT(COLUMN_NAME))
FROM information_schema.COLUMNS
WHERE TABLE_NAME = 'IB2P_Basic'
AND TABLE_SCHEMA = 'plee_platform'
AND COLUMN_NAME != 'id'

AND COLUMN_NAME != 'create_time'
AND COLUMN_NAME != 'update_time'



INSERT INTO IB2P_Basic
(
platform_name,IB2P_VERSION,diagnose_adr,IB2P_NAME,IB2P_RELEASE_DATE,IB2P_filename,username,IB2P_VERSION_LOCAL,IB3P_Official_Release) 
SELECT 

platform_name,IB2P_VERSION,diagnose_adr,IB2P_NAME,IB2P_RELEASE_DATE,IB2P_filename,username,IB2P_VERSION_LOCAL,IB3P_Official_Release
FROM IB2P_Basic WHERE platform_name = 'MEB' AND IB2P_VERSION = 'V2.1' AND diagnose_adr = '0009'




