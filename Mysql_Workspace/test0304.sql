#查询部门科组人名卡号
SELECT d.id,d.de_name,b.bu_name,k.ke_name,z.zu_name,n.id,n.name,n.card_id
FROM `name` AS n 
INNER JOIN `zu` AS z ON z.id = n.zu_id
INNER JOIN `ke` AS k ON k.id = z.ke_id
INNER JOIN `bu` AS b ON b.id = k.bu_id
INNER JOIN `department` AS d ON d.id = b.de_id

WHERE n.id =  '10'


ALTER TABLE `test`.`department` ADD COLUMN `no3` INT(2) NULL; 

