#查询条件配置中增加字段长度，带出长度的SQL
update setup_constant_sql set sql_remark='select a.data_type as code, a.character_maximum_length as name from information_schema.columns a where a.table_schema=\'lmis_bcs\' and a.table_name=? and a.column_name=?' where sql_code='get_data_type'