set hive.vectorized.execution.enabled=false;
set hive.mapred.mode=nonstrict;
add jar ${system:maven.local.repository}/org/apache/hive/hcatalog/hive-hcatalog-core/${system:hive.version}/hive-hcatalog-core-${system:hive.version}.jar;

CREATE TEMPORARY TABLE parquet_table_json_partition_temp (
  id bigint COMMENT 'from deserializer',
  address struct<country:bigint,state:bigint> COMMENT 'from deserializer',
  reports array<bigint> COMMENT 'from deserializer')
PARTITIONED BY (
  ts string)
ROW FORMAT SERDE
'org.apache.hive.hcatalog.data.JsonSerDe'
STORED AS INPUTFORMAT
'org.apache.hadoop.mapred.TextInputFormat'
OUTPUTFORMAT
'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat';

LOAD DATA LOCAL INPATH '../../data/files/sample2.json' INTO TABLE parquet_table_json_partition_temp PARTITION(ts='20150101');

SELECT * FROM parquet_table_json_partition_temp ORDER BY id, address, reports LIMIT 100;

ALTER TABLE parquet_table_json_partition_temp
SET FILEFORMAT INPUTFORMAT 'org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat'
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat'
SERDE 'org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe';

SELECT * FROM parquet_table_json_partition_temp ORDER BY id, address, reports LIMIT 100;

CREATE TEMPORARY TABLE new_table_temp AS SELECT * FROM parquet_table_json_partition_temp ORDER BY id, address, reports LIMIT 100;

SELECT * FROM new_table_temp ORDER by id, address, reports;


