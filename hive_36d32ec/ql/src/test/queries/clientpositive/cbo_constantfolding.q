EXPLAIN CBO SELECT DATE_ADD('2023-01-01', 1);
EXPLAIN CBO SELECT DATE_SUB('2023-01-01', 1);
EXPLAIN CBO SELECT FROM_UNIXTIME(1672560000);
EXPLAIN CBO SELECT TO_UNIX_TIMESTAMP(DATE '2023-01-01');
EXPLAIN CBO SELECT UNIX_TIMESTAMP(DATE '2023-01-01');