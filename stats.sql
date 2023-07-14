select col_id, count, ndv, null_count, min, max, data_size_in_bytes  from column_statistics where db_id=1213448 and  part_id is null;

-- alter table item modify column i_class_id set stats ('row_count'='204000', 'ndv'='16', 'min_value'='1', 'max_value'='16', 'avg_size'='816000', 'max_size'='816000' )
-- alter table item modify column {} set stats ('row_count'='{}', 'ndv'='{}', 'null_count'='{}', 'min_value'='{}', 'max_value'='{}', 'dataSize'='{}')