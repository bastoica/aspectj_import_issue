-- change PARAM_VALUE to CLOBs
ALTER TABLE COLUMNS_V2 ADD (TEMP CLOB NOT NULL);
UPDATE COLUMNS_V2 SET TEMP=TYPE_NAME;
ALTER TABLE COLUMNS_V2 DROP COLUMN TYPE_NAME;
ALTER TABLE COLUMNS_V2 RENAME COLUMN TEMP TO TYPE_NAME;

ALTER TABLE TABLE_PARAMS ADD (TEMP CLOB);
UPDATE TABLE_PARAMS SET TEMP=PARAM_VALUE, PARAM_VALUE=NULL;
ALTER TABLE TABLE_PARAMS DROP COLUMN PARAM_VALUE;
ALTER TABLE TABLE_PARAMS RENAME COLUMN TEMP TO PARAM_VALUE;

ALTER TABLE SERDE_PARAMS ADD (TEMP CLOB);
UPDATE SERDE_PARAMS SET TEMP=PARAM_VALUE, PARAM_VALUE=NULL;
ALTER TABLE SERDE_PARAMS DROP COLUMN PARAM_VALUE;
ALTER TABLE SERDE_PARAMS RENAME COLUMN TEMP TO PARAM_VALUE;

ALTER TABLE SD_PARAMS ADD (TEMP CLOB);
UPDATE SD_PARAMS SET TEMP=PARAM_VALUE, PARAM_VALUE=NULL;
ALTER TABLE SD_PARAMS DROP COLUMN PARAM_VALUE;
ALTER TABLE SD_PARAMS RENAME COLUMN TEMP TO PARAM_VALUE;

-- Expand the hive table name length to 256
ALTER TABLE TBLS MODIFY (TBL_NAME VARCHAR2(256));
ALTER TABLE NOTIFICATION_LOG MODIFY (TBL_NAME VARCHAR2(256));
ALTER TABLE PARTITION_EVENTS MODIFY (TBL_NAME VARCHAR2(256));
ALTER TABLE TAB_COL_STATS MODIFY (TABLE_NAME VARCHAR2(256));
ALTER TABLE PART_COL_STATS MODIFY (TABLE_NAME VARCHAR2(256));
ALTER TABLE COMPLETED_TXN_COMPONENTS MODIFY (CTC_TABLE VARCHAR2(256));

-- Expand the hive column name length to 767
ALTER TABLE COLUMNS_V2 MODIFY (COLUMN_NAME VARCHAR(767));
ALTER TABLE PART_COL_PRIVS MODIFY (COLUMN_NAME VARCHAR2(767));
ALTER TABLE TBL_COL_PRIVS MODIFY (COLUMN_NAME VARCHAR2(767));
ALTER TABLE SORT_COLS MODIFY (COLUMN_NAME VARCHAR2(767));
ALTER TABLE TAB_COL_STATS MODIFY (COLUMN_NAME VARCHAR2(767));
ALTER TABLE PART_COL_STATS MODIFY (COLUMN_NAME VARCHAR2(767));
