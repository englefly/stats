sql """
alter table customer_demographics modify column cd_dep_employed_count set stats ('row_count'='1920800', 'ndv'='7', 'num_nulls'='0', 'min_value'='0', 'max_value'='6', 'data_size'='7683200')
"""

sql """
alter table date_dim modify column d_day_name set stats ('row_count'='73049', 'ndv'='7', 'num_nulls'='0', 'min_value'='Friday', 'max_value'='Wednesday', 'data_size'='521779')
"""

sql """
alter table date_dim modify column d_following_holiday set stats ('row_count'='73049', 'ndv'='2', 'num_nulls'='0', 'min_value'='N', 'max_value'='Y', 'data_size'='73049')
"""

sql """
alter table date_dim modify column d_same_day_ly set stats ('row_count'='73049', 'ndv'='72450', 'num_nulls'='0', 'min_value'='2414657', 'max_value'='2487705', 'data_size'='292196')
"""

sql """
alter table warehouse modify column w_city set stats ('row_count'='20', 'ndv'='12', 'num_nulls'='0', 'min_value'='Fairview', 'max_value'='Shiloh', 'data_size'='183')
"""

sql """
alter table warehouse modify column w_street_type set stats ('row_count'='20', 'ndv'='14', 'num_nulls'='0', 'min_value'='', 'max_value'='Wy', 'data_size'='71')
"""

sql """
alter table catalog_sales modify column cs_call_center_sk set stats ('row_count'='1439980416', 'ndv'='42', 'num_nulls'='7199711', 'min_value'='1', 'max_value'='42', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_net_paid_inc_ship set stats ('row_count'='1439980416', 'ndv'='2505826', 'num_nulls'='0', 'min_value'='0.00', 'max_value'='43956.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_sales_price set stats ('row_count'='1439980416', 'ndv'='29306', 'num_nulls'='7200276', 'min_value'='0.00', 'max_value'='300.00', 'data_size'='5759921664')
"""

sql """
alter table call_center modify column cc_class set stats ('row_count'='42', 'ndv'='3', 'num_nulls'='0', 'min_value'='large', 'max_value'='small', 'data_size'='226')
"""

sql """
alter table call_center modify column cc_country set stats ('row_count'='42', 'ndv'='1', 'num_nulls'='0', 'min_value'='United States', 'max_value'='United States', 'data_size'='546')
"""

sql """
alter table call_center modify column cc_county set stats ('row_count'='42', 'ndv'='16', 'num_nulls'='0', 'min_value'='Barrow County', 'max_value'='Williamson County', 'data_size'='627')
"""

sql """
alter table call_center modify column cc_mkt_class set stats ('row_count'='42', 'ndv'='36', 'num_nulls'='0', 'min_value'='A bit narrow forms matter animals. Consist', 'max_value'='Yesterday new men can make moreov', 'data_size'='1465')
"""

sql """
alter table call_center modify column cc_sq_ft set stats ('row_count'='42', 'ndv'='31', 'num_nulls'='0', 'min_value'='-1890660328', 'max_value'='2122480316', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_state set stats ('row_count'='42', 'ndv'='14', 'num_nulls'='0', 'min_value'='FL', 'max_value'='WV', 'data_size'='84')
"""

sql """
alter table inventory modify column inv_warehouse_sk set stats ('row_count'='783000000', 'ndv'='20', 'num_nulls'='0', 'min_value'='1', 'max_value'='20', 'data_size'='6264000000')
"""

sql """
alter table catalog_returns modify column cr_refunded_addr_sk set stats ('row_count'='143996756', 'ndv'='6015811', 'num_nulls'='2881609', 'min_value'='1', 'max_value'='6000000', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_refunded_cash set stats ('row_count'='143996756', 'ndv'='1107525', 'num_nulls'='2879192', 'min_value'='0.00', 'max_value'='26955.24', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_refunded_cdemo_sk set stats ('row_count'='143996756', 'ndv'='1916366', 'num_nulls'='2881314', 'min_value'='1', 'max_value'='1920800', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_return_amt_inc_tax set stats ('row_count'='143996756', 'ndv'='1544502', 'num_nulls'='2881886', 'min_value'='0.00', 'max_value'='30418.06', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_returning_addr_sk set stats ('row_count'='143996756', 'ndv'='6015811', 'num_nulls'='2883215', 'min_value'='1', 'max_value'='6000000', 'data_size'='1151974048')
"""

sql """
alter table household_demographics modify column hd_buy_potential set stats ('row_count'='7200', 'ndv'='6', 'num_nulls'='0', 'min_value'='0-500', 'max_value'='Unknown', 'data_size'='54000')
"""

sql """
alter table customer_address modify column ca_address_id set stats ('row_count'='6000000', 'ndv'='5984931', 'num_nulls'='0', 'min_value'='AAAAAAAAAAAAABAA', 'max_value'='AAAAAAAAPPPPPEAA', 'data_size'='96000000')
"""

sql """
alter table customer_address modify column ca_address_sk set stats ('row_count'='6000000', 'ndv'='6015811', 'num_nulls'='0', 'min_value'='1', 'max_value'='6000000', 'data_size'='48000000')
"""

sql """
alter table customer_address modify column ca_country set stats ('row_count'='6000000', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='United States', 'data_size'='75661794')
"""

sql """
alter table customer_address modify column ca_location_type set stats ('row_count'='6000000', 'ndv'='4', 'num_nulls'='0', 'min_value'='', 'max_value'='single family', 'data_size'='52372545')
"""

sql """
alter table customer_address modify column ca_street_number set stats ('row_count'='6000000', 'ndv'='1002', 'num_nulls'='0', 'min_value'='', 'max_value'='999', 'data_size'='16837336')
"""

sql """
alter table customer_address modify column ca_suite_number set stats ('row_count'='6000000', 'ndv'='76', 'num_nulls'='0', 'min_value'='', 'max_value'='Suite Y', 'data_size'='45911575')
"""

sql """
alter table catalog_page modify column cp_catalog_page_id set stats ('row_count'='30000', 'ndv'='29953', 'num_nulls'='0', 'min_value'='AAAAAAAAAAABAAAA', 'max_value'='AAAAAAAAPPPGAAAA', 'data_size'='480000')
"""

sql """
alter table item modify column i_rec_end_date set stats ('row_count'='300000', 'ndv'='3', 'num_nulls'='150000', 'min_value'='1999-10-27', 'max_value'='2001-10-26', 'data_size'='1200000')
"""

sql """
alter table web_returns modify column wr_refunded_addr_sk set stats ('row_count'='71997522', 'ndv'='6015811', 'num_nulls'='3239971', 'min_value'='1', 'max_value'='6000000', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_reversed_charge set stats ('row_count'='71997522', 'ndv'='692680', 'num_nulls'='3239546', 'min_value'='0.00', 'max_value'='23194.77', 'data_size'='287990088')
"""

sql """
alter table web_site modify column web_state set stats ('row_count'='54', 'ndv'='18', 'num_nulls'='0', 'min_value'='AL', 'max_value'='WV', 'data_size'='108')
"""

sql """
alter table promotion modify column p_end_date_sk set stats ('row_count'='1500', 'ndv'='683', 'num_nulls'='18', 'min_value'='2450113', 'max_value'='2450967', 'data_size'='12000')
"""

sql """
alter table web_sales modify column ws_bill_hdemo_sk set stats ('row_count'='720000376', 'ndv'='7251', 'num_nulls'='180139', 'min_value'='1', 'max_value'='7200', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_ext_ship_cost set stats ('row_count'='720000376', 'ndv'='567477', 'num_nulls'='180084', 'min_value'='0.00', 'max_value'='14950.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_ship_addr_sk set stats ('row_count'='720000376', 'ndv'='6015811', 'num_nulls'='179848', 'min_value'='1', 'max_value'='6000000', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_ship_mode_sk set stats ('row_count'='720000376', 'ndv'='20', 'num_nulls'='180017', 'min_value'='1', 'max_value'='20', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_warehouse_sk set stats ('row_count'='720000376', 'ndv'='20', 'num_nulls'='180105', 'min_value'='1', 'max_value'='20', 'data_size'='5760003008')
"""

sql """
alter table store modify column s_company_name set stats ('row_count'='1002', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='6965')
"""

sql """
alter table store modify column s_gmt_offset set stats ('row_count'='1002', 'ndv'='4', 'num_nulls'='6', 'min_value'='-8.00', 'max_value'='-5.00', 'data_size'='4008')
"""

sql """
alter table store modify column s_manager set stats ('row_count'='1002', 'ndv'='739', 'num_nulls'='0', 'min_value'='', 'max_value'='Zane Clifton', 'data_size'='12649')
"""

sql """
alter table store modify column s_street_number set stats ('row_count'='1002', 'ndv'='521', 'num_nulls'='0', 'min_value'='', 'max_value'='999', 'data_size'='2874')
"""

sql """
alter table time_dim modify column t_meal_time set stats ('row_count'='86400', 'ndv'='4', 'num_nulls'='0', 'min_value'='', 'max_value'='lunch', 'data_size'='248400')
"""

sql """
alter table time_dim modify column t_time set stats ('row_count'='86400', 'ndv'='86684', 'num_nulls'='0', 'min_value'='0', 'max_value'='86399', 'data_size'='345600')
"""

sql """
alter table web_page modify column wp_creation_date_sk set stats ('row_count'='3000', 'ndv'='199', 'num_nulls'='33', 'min_value'='2450604', 'max_value'='2450815', 'data_size'='24000')
"""

sql """
alter table web_page modify column wp_customer_sk set stats ('row_count'='3000', 'ndv'='713', 'num_nulls'='2147', 'min_value'='9522', 'max_value'='11995685', 'data_size'='24000')
"""

sql """
alter table web_page modify column wp_max_ad_count set stats ('row_count'='3000', 'ndv'='5', 'num_nulls'='31', 'min_value'='0', 'max_value'='4', 'data_size'='12000')
"""

sql """
alter table web_page modify column wp_url set stats ('row_count'='3000', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='http://www.foo.com', 'data_size'='53406')
"""

sql """
alter table store_returns modify column sr_refunded_cash set stats ('row_count'='287999764', 'ndv'='928470', 'num_nulls'='10081294', 'min_value'='0.00', 'max_value'='18173.96', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_return_tax set stats ('row_count'='287999764', 'ndv'='117247', 'num_nulls'='10081332', 'min_value'='0.00', 'max_value'='1682.04', 'data_size'='1151999056')
"""

sql """
alter table store_sales modify column ss_customer_sk set stats ('row_count'='2879987999', 'ndv'='12157481', 'num_nulls'='129590766', 'min_value'='1', 'max_value'='12000000', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_hdemo_sk set stats ('row_count'='2879987999', 'ndv'='7251', 'num_nulls'='129594559', 'min_value'='1', 'max_value'='7200', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_store_sk set stats ('row_count'='2879987999', 'ndv'='499', 'num_nulls'='129572050', 'min_value'='1', 'max_value'='1000', 'data_size'='23039903992')
"""

sql """
alter table ship_mode modify column sm_ship_mode_id set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='AAAAAAAAABAAAAAA', 'max_value'='AAAAAAAAPAAAAAAA', 'data_size'='320')
"""

sql """
alter table ship_mode modify column sm_ship_mode_sk set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='1', 'max_value'='20', 'data_size'='160')
"""

sql """
alter table customer modify column c_first_name set stats ('row_count'='12000000', 'ndv'='5140', 'num_nulls'='0', 'min_value'='', 'max_value'='Zulma', 'data_size'='67593278')
"""

sql """
alter table customer modify column c_first_sales_date_sk set stats ('row_count'='12000000', 'ndv'='3644', 'num_nulls'='419856', 'min_value'='2448998', 'max_value'='2452648', 'data_size'='96000000')
"""

sql """
alter table customer modify column c_first_shipto_date_sk set stats ('row_count'='12000000', 'ndv'='3644', 'num_nulls'='420769', 'min_value'='2449028', 'max_value'='2452678', 'data_size'='96000000')
"""

sql """
alter table customer_demographics modify column cd_dep_college_count set stats ('row_count'='1920800', 'ndv'='7', 'num_nulls'='0', 'min_value'='0', 'max_value'='6', 'data_size'='7683200')
"""

sql """
alter table date_dim modify column d_dow set stats ('row_count'='73049', 'ndv'='7', 'num_nulls'='0', 'min_value'='0', 'max_value'='6', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_fy_quarter_seq set stats ('row_count'='73049', 'ndv'='801', 'num_nulls'='0', 'min_value'='1', 'max_value'='801', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_qoy set stats ('row_count'='73049', 'ndv'='4', 'num_nulls'='0', 'min_value'='1', 'max_value'='4', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_quarter_seq set stats ('row_count'='73049', 'ndv'='801', 'num_nulls'='0', 'min_value'='1', 'max_value'='801', 'data_size'='292196')
"""

sql """
alter table warehouse modify column w_street_name set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='', 'max_value'='Wilson Elm', 'data_size'='176')
"""

sql """
alter table warehouse modify column w_suite_number set stats ('row_count'='20', 'ndv'='18', 'num_nulls'='0', 'min_value'='', 'max_value'='Suite X', 'data_size'='150')
"""

sql """
alter table catalog_sales modify column cs_bill_cdemo_sk set stats ('row_count'='1439980416', 'ndv'='1916366', 'num_nulls'='7202134', 'min_value'='1', 'max_value'='1920800', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_bill_hdemo_sk set stats ('row_count'='1439980416', 'ndv'='7251', 'num_nulls'='7198837', 'min_value'='1', 'max_value'='7200', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_ext_ship_cost set stats ('row_count'='1439980416', 'ndv'='573238', 'num_nulls'='7202537', 'min_value'='0.00', 'max_value'='14994.00', 'data_size'='5759921664')
"""

sql """
alter table call_center modify column cc_name set stats ('row_count'='42', 'ndv'='21', 'num_nulls'='0', 'min_value'='California', 'max_value'='Pacific Northwest_2', 'data_size'='572')
"""

sql """
alter table call_center modify column cc_street_name set stats ('row_count'='42', 'ndv'='21', 'num_nulls'='0', 'min_value'='1st', 'max_value'='Willow', 'data_size'='356')
"""

sql """
alter table call_center modify column cc_zip set stats ('row_count'='42', 'ndv'='19', 'num_nulls'='0', 'min_value'='18605', 'max_value'='98048', 'data_size'='210')
"""

sql """
alter table inventory modify column inv_quantity_on_hand set stats ('row_count'='783000000', 'ndv'='1006', 'num_nulls'='39153758', 'min_value'='0', 'max_value'='1000', 'data_size'='3132000000')
"""

sql """
alter table catalog_returns modify column cr_catalog_page_sk set stats ('row_count'='143996756', 'ndv'='17005', 'num_nulls'='2882502', 'min_value'='1', 'max_value'='25207', 'data_size'='1151974048')
"""

sql """
alter table household_demographics modify column hd_income_band_sk set stats ('row_count'='7200', 'ndv'='20', 'num_nulls'='0', 'min_value'='1', 'max_value'='20', 'data_size'='57600')
"""

sql """
alter table catalog_page modify column cp_description set stats ('row_count'='30000', 'ndv'='30141', 'num_nulls'='0', 'min_value'='', 'max_value'='Youngsters worry both workers. Fascinating characters take cheap never alive studies. Direct, old', 'data_size'='2215634')
"""

sql """
alter table item modify column i_item_id set stats ('row_count'='300000', 'ndv'='150851', 'num_nulls'='0', 'min_value'='AAAAAAAAAAAABAAA', 'max_value'='AAAAAAAAPPPPBAAA', 'data_size'='4800000')
"""

sql """
alter table web_returns modify column wr_account_credit set stats ('row_count'='71997522', 'ndv'='683955', 'num_nulls'='3241972', 'min_value'='0.00', 'max_value'='23166.33', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_net_loss set stats ('row_count'='71997522', 'ndv'='815608', 'num_nulls'='3240573', 'min_value'='0.50', 'max_value'='15887.84', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_return_amt set stats ('row_count'='71997522', 'ndv'='808311', 'num_nulls'='3238405', 'min_value'='0.00', 'max_value'='29191.00', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_return_amt_inc_tax set stats ('row_count'='71997522', 'ndv'='1359913', 'num_nulls'='3239765', 'min_value'='0.00', 'max_value'='30393.01', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_return_quantity set stats ('row_count'='71997522', 'ndv'='100', 'num_nulls'='3238643', 'min_value'='1', 'max_value'='100', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_returning_addr_sk set stats ('row_count'='71997522', 'ndv'='6015811', 'num_nulls'='3239658', 'min_value'='1', 'max_value'='6000000', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_returning_customer_sk set stats ('row_count'='71997522', 'ndv'='12119220', 'num_nulls'='3237281', 'min_value'='1', 'max_value'='12000000', 'data_size'='575980176')
"""

sql """
alter table web_site modify column web_mkt_desc set stats ('row_count'='54', 'ndv'='38', 'num_nulls'='0', 'min_value'='Acres see else children. Mutual too', 'max_value'='Windows increase to a differences. Other parties might in', 'data_size'='3473')
"""

sql """
alter table web_site modify column web_mkt_id set stats ('row_count'='54', 'ndv'='6', 'num_nulls'='1', 'min_value'='1', 'max_value'='6', 'data_size'='216')
"""

sql """
alter table web_site modify column web_rec_end_date set stats ('row_count'='54', 'ndv'='3', 'num_nulls'='27', 'min_value'='1999-08-16', 'max_value'='2001-08-15', 'data_size'='216')
"""

sql """
alter table web_site modify column web_site_id set stats ('row_count'='54', 'ndv'='27', 'num_nulls'='0', 'min_value'='AAAAAAAAABAAAAAA', 'max_value'='AAAAAAAAPBAAAAAA', 'data_size'='864')
"""

sql """
alter table web_site modify column web_street_type set stats ('row_count'='54', 'ndv'='20', 'num_nulls'='0', 'min_value'='Ave', 'max_value'='Wy', 'data_size'='208')
"""

sql """
alter table promotion modify column p_channel_demo set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1479')
"""

sql """
alter table promotion modify column p_channel_details set stats ('row_count'='1500', 'ndv'='1490', 'num_nulls'='0', 'min_value'='', 'max_value'='Young, valuable companies watch walls. Payments can flour', 'data_size'='59126')
"""

sql """
alter table promotion modify column p_channel_event set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1482')
"""

sql """
alter table promotion modify column p_discount_active set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1473')
"""

sql """
alter table promotion modify column p_promo_sk set stats ('row_count'='1500', 'ndv'='1489', 'num_nulls'='0', 'min_value'='1', 'max_value'='1500', 'data_size'='12000')
"""

sql """
alter table promotion modify column p_purpose set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='10374')
"""

sql """
alter table web_sales modify column ws_bill_cdemo_sk set stats ('row_count'='720000376', 'ndv'='1916366', 'num_nulls'='179788', 'min_value'='1', 'max_value'='1920800', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_sold_date_sk set stats ('row_count'='720000376', 'ndv'='1820', 'num_nulls'='179921', 'min_value'='2450816', 'max_value'='2452642', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_web_site_sk set stats ('row_count'='720000376', 'ndv'='54', 'num_nulls'='179930', 'min_value'='1', 'max_value'='54', 'data_size'='5760003008')
"""

sql """
alter table store modify column s_city set stats ('row_count'='1002', 'ndv'='55', 'num_nulls'='0', 'min_value'='', 'max_value'='Woodlawn', 'data_size'='9238')
"""

sql """
alter table store modify column s_company_id set stats ('row_count'='1002', 'ndv'='1', 'num_nulls'='7', 'min_value'='1', 'max_value'='1', 'data_size'='4008')
"""

sql """
alter table store modify column s_county set stats ('row_count'='1002', 'ndv'='28', 'num_nulls'='0', 'min_value'='', 'max_value'='Ziebach County', 'data_size'='14291')
"""

sql """
alter table store modify column s_geography_class set stats ('row_count'='1002', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='6972')
"""

sql """
alter table store modify column s_hours set stats ('row_count'='1002', 'ndv'='4', 'num_nulls'='0', 'min_value'='', 'max_value'='8AM-8AM', 'data_size'='7088')
"""

sql """
alter table store modify column s_store_id set stats ('row_count'='1002', 'ndv'='501', 'num_nulls'='0', 'min_value'='AAAAAAAAAABAAAAA', 'max_value'='AAAAAAAAPPBAAAAA', 'data_size'='16032')
"""

sql """
alter table store modify column s_zip set stats ('row_count'='1002', 'ndv'='354', 'num_nulls'='0', 'min_value'='', 'max_value'='99454', 'data_size'='4975')
"""

sql """
alter table time_dim modify column t_am_pm set stats ('row_count'='86400', 'ndv'='2', 'num_nulls'='0', 'min_value'='AM', 'max_value'='PM', 'data_size'='172800')
"""

sql """
alter table time_dim modify column t_minute set stats ('row_count'='86400', 'ndv'='60', 'num_nulls'='0', 'min_value'='0', 'max_value'='59', 'data_size'='345600')
"""

sql """
alter table web_page modify column wp_web_page_id set stats ('row_count'='3000', 'ndv'='1501', 'num_nulls'='0', 'min_value'='AAAAAAAAAABAAAAA', 'max_value'='AAAAAAAAPPKAAAAA', 'data_size'='48000')
"""

sql """
alter table web_page modify column wp_web_page_sk set stats ('row_count'='3000', 'ndv'='2984', 'num_nulls'='0', 'min_value'='1', 'max_value'='3000', 'data_size'='24000')
"""

sql """
alter table store_returns modify column sr_return_amt set stats ('row_count'='287999764', 'ndv'='671228', 'num_nulls'='10080055', 'min_value'='0.00', 'max_value'='19434.00', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_returned_date_sk set stats ('row_count'='287999764', 'ndv'='2010', 'num_nulls'='10079607', 'min_value'='2450820', 'max_value'='2452822', 'data_size'='2303998112')
"""

sql """
alter table store_sales modify column ss_ext_tax set stats ('row_count'='2879987999', 'ndv'='149597', 'num_nulls'='129588732', 'min_value'='0.00', 'max_value'='1797.48', 'data_size'='11519951996')
"""

sql """
alter table customer modify column c_current_cdemo_sk set stats ('row_count'='12000000', 'ndv'='1913901', 'num_nulls'='419895', 'min_value'='1', 'max_value'='1920800', 'data_size'='96000000')
"""

sql """
alter table customer modify column c_customer_id set stats ('row_count'='12000000', 'ndv'='11921032', 'num_nulls'='0', 'min_value'='AAAAAAAAAAAAABAA', 'max_value'='AAAAAAAAPPPPPKAA', 'data_size'='192000000')
"""

sql """
alter table date_dim modify column d_current_day set stats ('row_count'='73049', 'ndv'='1', 'num_nulls'='0', 'min_value'='N', 'max_value'='N', 'data_size'='73049')
"""

sql """
alter table date_dim modify column d_current_month set stats ('row_count'='73049', 'ndv'='2', 'num_nulls'='0', 'min_value'='N', 'max_value'='Y', 'data_size'='73049')
"""

sql """
alter table date_dim modify column d_date set stats ('row_count'='73049', 'ndv'='73250', 'num_nulls'='0', 'min_value'='1900-01-02', 'max_value'='2100-01-01', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_moy set stats ('row_count'='73049', 'ndv'='12', 'num_nulls'='0', 'min_value'='1', 'max_value'='12', 'data_size'='292196')
"""

sql """
alter table warehouse modify column w_gmt_offset set stats ('row_count'='20', 'ndv'='3', 'num_nulls'='1', 'min_value'='-7.00', 'max_value'='-5.00', 'data_size'='80')
"""

sql """
alter table warehouse modify column w_warehouse_sk set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='1', 'max_value'='20', 'data_size'='160')
"""

sql """
alter table warehouse modify column w_warehouse_sq_ft set stats ('row_count'='20', 'ndv'='19', 'num_nulls'='1', 'min_value'='73065', 'max_value'='977787', 'data_size'='80')
"""

sql """
alter table catalog_sales modify column cs_ext_sales_price set stats ('row_count'='1439980416', 'ndv'='1100662', 'num_nulls'='7199625', 'min_value'='0.00', 'max_value'='29943.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_ext_wholesale_cost set stats ('row_count'='1439980416', 'ndv'='393180', 'num_nulls'='7199876', 'min_value'='1.00', 'max_value'='10000.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_item_sk set stats ('row_count'='1439980416', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_net_paid_inc_tax set stats ('row_count'='1439980416', 'ndv'='2422238', 'num_nulls'='7200702', 'min_value'='0.00', 'max_value'='32376.27', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_ship_date_sk set stats ('row_count'='1439980416', 'ndv'='1933', 'num_nulls'='7200707', 'min_value'='2450817', 'max_value'='2452744', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_warehouse_sk set stats ('row_count'='1439980416', 'ndv'='20', 'num_nulls'='7200688', 'min_value'='1', 'max_value'='20', 'data_size'='11519843328')
"""

sql """
alter table call_center modify column cc_division set stats ('row_count'='42', 'ndv'='6', 'num_nulls'='0', 'min_value'='1', 'max_value'='6', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_division_name set stats ('row_count'='42', 'ndv'='6', 'num_nulls'='0', 'min_value'='able', 'max_value'='pri', 'data_size'='164')
"""

sql """
alter table call_center modify column cc_manager set stats ('row_count'='42', 'ndv'='28', 'num_nulls'='0', 'min_value'='Alden Snyder', 'max_value'='Wayne Ray', 'data_size'='519')
"""

sql """
alter table call_center modify column cc_rec_start_date set stats ('row_count'='42', 'ndv'='4', 'num_nulls'='0', 'min_value'='1998-01-01', 'max_value'='2002-01-01', 'data_size'='168')
"""

sql """
alter table catalog_returns modify column cr_call_center_sk set stats ('row_count'='143996756', 'ndv'='42', 'num_nulls'='2881668', 'min_value'='1', 'max_value'='42', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_net_loss set stats ('row_count'='143996756', 'ndv'='911034', 'num_nulls'='2881704', 'min_value'='0.50', 'max_value'='16095.08', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_refunded_customer_sk set stats ('row_count'='143996756', 'ndv'='12156363', 'num_nulls'='2879017', 'min_value'='1', 'max_value'='12000000', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_refunded_hdemo_sk set stats ('row_count'='143996756', 'ndv'='7251', 'num_nulls'='2882107', 'min_value'='1', 'max_value'='7200', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_returning_customer_sk set stats ('row_count'='143996756', 'ndv'='12157481', 'num_nulls'='2879023', 'min_value'='1', 'max_value'='12000000', 'data_size'='1151974048')
"""

sql """
alter table customer_address modify column ca_gmt_offset set stats ('row_count'='6000000', 'ndv'='6', 'num_nulls'='180219', 'min_value'='-10.00', 'max_value'='-5.00', 'data_size'='24000000')
"""

sql """
alter table item modify column i_color set stats ('row_count'='300000', 'ndv'='93', 'num_nulls'='0', 'min_value'='', 'max_value'='yellow', 'data_size'='1610293')
"""

sql """
alter table item modify column i_manufact set stats ('row_count'='300000', 'ndv'='1004', 'num_nulls'='0', 'min_value'='', 'max_value'='pripripri', 'data_size'='3379693')
"""

sql """
alter table item modify column i_product_name set stats ('row_count'='300000', 'ndv'='294994', 'num_nulls'='0', 'min_value'='', 'max_value'='pripripripripriought', 'data_size'='6849199')
"""

sql """
alter table web_returns modify column wr_returned_time_sk set stats ('row_count'='71997522', 'ndv'='87677', 'num_nulls'='3238574', 'min_value'='0', 'max_value'='86399', 'data_size'='575980176')
"""

sql """
alter table web_site modify column web_manager set stats ('row_count'='54', 'ndv'='40', 'num_nulls'='0', 'min_value'='', 'max_value'='William Young', 'data_size'='658')
"""

sql """
alter table web_site modify column web_mkt_class set stats ('row_count'='54', 'ndv'='40', 'num_nulls'='0', 'min_value'='', 'max_value'='Written, political plans show to the models. T', 'data_size'='1822')
"""

sql """
alter table web_site modify column web_rec_start_date set stats ('row_count'='54', 'ndv'='4', 'num_nulls'='2', 'min_value'='1997-08-16', 'max_value'='2001-08-16', 'data_size'='216')
"""

sql """
alter table web_site modify column web_street_number set stats ('row_count'='54', 'ndv'='36', 'num_nulls'='0', 'min_value'='', 'max_value'='983', 'data_size'='154')
"""

sql """
alter table promotion modify column p_channel_catalog set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1482')
"""

sql """
alter table promotion modify column p_promo_id set stats ('row_count'='1500', 'ndv'='1519', 'num_nulls'='0', 'min_value'='AAAAAAAAAABAAAAA', 'max_value'='AAAAAAAAPPEAAAAA', 'data_size'='24000')
"""

sql """
alter table web_sales modify column ws_bill_customer_sk set stats ('row_count'='720000376', 'ndv'='12103729', 'num_nulls'='179817', 'min_value'='1', 'max_value'='12000000', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_list_price set stats ('row_count'='720000376', 'ndv'='29396', 'num_nulls'='180053', 'min_value'='1.00', 'max_value'='300.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_sales_price set stats ('row_count'='720000376', 'ndv'='29288', 'num_nulls'='180005', 'min_value'='0.00', 'max_value'='300.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_ship_hdemo_sk set stats ('row_count'='720000376', 'ndv'='7251', 'num_nulls'='179824', 'min_value'='1', 'max_value'='7200', 'data_size'='5760003008')
"""

sql """
alter table store modify column s_closed_date_sk set stats ('row_count'='1002', 'ndv'='163', 'num_nulls'='729', 'min_value'='2450820', 'max_value'='2451313', 'data_size'='8016')
"""

sql """
alter table store modify column s_division_id set stats ('row_count'='1002', 'ndv'='1', 'num_nulls'='6', 'min_value'='1', 'max_value'='1', 'data_size'='4008')
"""

sql """
alter table store modify column s_market_desc set stats ('row_count'='1002', 'ndv'='765', 'num_nulls'='0', 'min_value'='', 'max_value'='Yesterday left factors handle continuing co', 'data_size'='57638')
"""

sql """
alter table store modify column s_market_id set stats ('row_count'='1002', 'ndv'='10', 'num_nulls'='8', 'min_value'='1', 'max_value'='10', 'data_size'='4008')
"""

sql """
alter table store modify column s_state set stats ('row_count'='1002', 'ndv'='22', 'num_nulls'='0', 'min_value'='', 'max_value'='WV', 'data_size'='1994')
"""

sql """
alter table store modify column s_store_sk set stats ('row_count'='1002', 'ndv'='988', 'num_nulls'='0', 'min_value'='1', 'max_value'='1002', 'data_size'='8016')
"""

sql """
alter table store modify column s_street_name set stats ('row_count'='1002', 'ndv'='549', 'num_nulls'='0', 'min_value'='', 'max_value'='Woodland Oak', 'data_size'='8580')
"""

sql """
alter table web_page modify column wp_access_date_sk set stats ('row_count'='3000', 'ndv'='101', 'num_nulls'='31', 'min_value'='2452548', 'max_value'='2452648', 'data_size'='24000')
"""

sql """
alter table web_page modify column wp_char_count set stats ('row_count'='3000', 'ndv'='1883', 'num_nulls'='42', 'min_value'='303', 'max_value'='8523', 'data_size'='12000')
"""

sql """
alter table store_returns modify column sr_addr_sk set stats ('row_count'='287999764', 'ndv'='6015811', 'num_nulls'='10082311', 'min_value'='1', 'max_value'='6000000', 'data_size'='2303998112')
"""

sql """
alter table store_returns modify column sr_return_time_sk set stats ('row_count'='287999764', 'ndv'='32660', 'num_nulls'='10082805', 'min_value'='28799', 'max_value'='61199', 'data_size'='2303998112')
"""

sql """
alter table store_returns modify column sr_store_sk set stats ('row_count'='287999764', 'ndv'='499', 'num_nulls'='10081871', 'min_value'='1', 'max_value'='1000', 'data_size'='2303998112')
"""

sql """
alter table store_sales modify column ss_coupon_amt set stats ('row_count'='2879987999', 'ndv'='1161208', 'num_nulls'='129609101', 'min_value'='0.00', 'max_value'='19778.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_sales_price set stats ('row_count'='2879987999', 'ndv'='19780', 'num_nulls'='129598061', 'min_value'='0.00', 'max_value'='200.00', 'data_size'='11519951996')
"""

sql """
alter table customer modify column c_birth_country set stats ('row_count'='12000000', 'ndv'='211', 'num_nulls'='0', 'min_value'='', 'max_value'='ZIMBABWE', 'data_size'='100750845')
"""

sql """
alter table customer modify column c_birth_month set stats ('row_count'='12000000', 'ndv'='12', 'num_nulls'='419629', 'min_value'='1', 'max_value'='12', 'data_size'='48000000')
"""

sql """
alter table customer modify column c_customer_sk set stats ('row_count'='12000000', 'ndv'='12157481', 'num_nulls'='0', 'min_value'='1', 'max_value'='12000000', 'data_size'='96000000')
"""

sql """
alter table customer modify column c_email_address set stats ('row_count'='12000000', 'ndv'='11642077', 'num_nulls'='0', 'min_value'='', 'max_value'='Zulma.Young@aDhzZzCzYN.edu', 'data_size'='318077849')
"""

sql """
alter table customer modify column c_last_review_date_sk set stats ('row_count'='12000000', 'ndv'='366', 'num_nulls'='419900', 'min_value'='2452283', 'max_value'='2452648', 'data_size'='96000000')
"""

sql """
alter table customer modify column c_preferred_cust_flag set stats ('row_count'='12000000', 'ndv'='3', 'num_nulls'='0', 'min_value'='', 'max_value'='Y', 'data_size'='11580510')
"""

sql """
alter table dbgen_version modify column dv_version set stats ('row_count'='1', 'ndv'='1', 'num_nulls'='0', 'min_value'='3.2.0', 'max_value'='3.2.0', 'data_size'='5')
"""

sql """
alter table customer_demographics modify column cd_purchase_estimate set stats ('row_count'='1920800', 'ndv'='20', 'num_nulls'='0', 'min_value'='500', 'max_value'='10000', 'data_size'='7683200')
"""

sql """
alter table reason modify column r_reason_id set stats ('row_count'='65', 'ndv'='65', 'num_nulls'='0', 'min_value'='AAAAAAAAABAAAAAA', 'max_value'='AAAAAAAAPDAAAAAA', 'data_size'='1040')
"""

sql """
alter table reason modify column r_reason_sk set stats ('row_count'='65', 'ndv'='65', 'num_nulls'='0', 'min_value'='1', 'max_value'='65', 'data_size'='520')
"""

sql """
alter table date_dim modify column d_current_week set stats ('row_count'='73049', 'ndv'='1', 'num_nulls'='0', 'min_value'='N', 'max_value'='N', 'data_size'='73049')
"""

sql """
alter table date_dim modify column d_first_dom set stats ('row_count'='73049', 'ndv'='2410', 'num_nulls'='0', 'min_value'='2415021', 'max_value'='2488070', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_fy_year set stats ('row_count'='73049', 'ndv'='202', 'num_nulls'='0', 'min_value'='1900', 'max_value'='2100', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_last_dom set stats ('row_count'='73049', 'ndv'='2419', 'num_nulls'='0', 'min_value'='2415020', 'max_value'='2488372', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_month_seq set stats ('row_count'='73049', 'ndv'='2398', 'num_nulls'='0', 'min_value'='0', 'max_value'='2400', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_quarter_name set stats ('row_count'='73049', 'ndv'='799', 'num_nulls'='0', 'min_value'='1900Q1', 'max_value'='2100Q1', 'data_size'='438294')
"""

sql """
alter table warehouse modify column w_county set stats ('row_count'='20', 'ndv'='14', 'num_nulls'='0', 'min_value'='Bronx County', 'max_value'='Ziebach County', 'data_size'='291')
"""

sql """
alter table warehouse modify column w_street_number set stats ('row_count'='20', 'ndv'='19', 'num_nulls'='0', 'min_value'='', 'max_value'='957', 'data_size'='54')
"""

sql """
alter table warehouse modify column w_warehouse_name set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='', 'max_value'='Therefore urg', 'data_size'='307')
"""

sql """
alter table catalog_sales modify column cs_ext_discount_amt set stats ('row_count'='1439980416', 'ndv'='1100115', 'num_nulls'='7201054', 'min_value'='0.00', 'max_value'='29982.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_net_paid_inc_ship_tax set stats ('row_count'='1439980416', 'ndv'='3312360', 'num_nulls'='0', 'min_value'='0.00', 'max_value'='46593.36', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_promo_sk set stats ('row_count'='1439980416', 'ndv'='1489', 'num_nulls'='7202844', 'min_value'='1', 'max_value'='1500', 'data_size'='11519843328')
"""

sql """
alter table call_center modify column cc_call_center_id set stats ('row_count'='42', 'ndv'='21', 'num_nulls'='0', 'min_value'='AAAAAAAAABAAAAAA', 'max_value'='AAAAAAAAPBAAAAAA', 'data_size'='672')
"""

sql """
alter table call_center modify column cc_employees set stats ('row_count'='42', 'ndv'='30', 'num_nulls'='0', 'min_value'='69020', 'max_value'='6879074', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_suite_number set stats ('row_count'='42', 'ndv'='18', 'num_nulls'='0', 'min_value'='Suite 0', 'max_value'='Suite W', 'data_size'='326')
"""

sql """
alter table catalog_returns modify column cr_item_sk set stats ('row_count'='143996756', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_reason_sk set stats ('row_count'='143996756', 'ndv'='65', 'num_nulls'='2881950', 'min_value'='1', 'max_value'='65', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_return_ship_cost set stats ('row_count'='143996756', 'ndv'='483467', 'num_nulls'='2883436', 'min_value'='0.00', 'max_value'='14273.28', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_ship_mode_sk set stats ('row_count'='143996756', 'ndv'='20', 'num_nulls'='2879879', 'min_value'='1', 'max_value'='20', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_store_credit set stats ('row_count'='143996756', 'ndv'='802237', 'num_nulls'='2880469', 'min_value'='0.00', 'max_value'='23215.15', 'data_size'='575987024')
"""

sql """
alter table customer_address modify column ca_city set stats ('row_count'='6000000', 'ndv'='977', 'num_nulls'='0', 'min_value'='', 'max_value'='Zion', 'data_size'='52096290')
"""

sql """
alter table customer_address modify column ca_state set stats ('row_count'='6000000', 'ndv'='52', 'num_nulls'='0', 'min_value'='', 'max_value'='WY', 'data_size'='11640128')
"""

sql """
alter table customer_address modify column ca_street_name set stats ('row_count'='6000000', 'ndv'='8173', 'num_nulls'='0', 'min_value'='', 'max_value'='Woodland Woodland', 'data_size'='50697257')
"""

sql """
alter table customer_address modify column ca_street_type set stats ('row_count'='6000000', 'ndv'='21', 'num_nulls'='0', 'min_value'='', 'max_value'='Wy', 'data_size'='24441630')
"""

sql """
alter table catalog_page modify column cp_catalog_number set stats ('row_count'='30000', 'ndv'='109', 'num_nulls'='297', 'min_value'='1', 'max_value'='109', 'data_size'='120000')
"""

sql """
alter table catalog_page modify column cp_catalog_page_number set stats ('row_count'='30000', 'ndv'='279', 'num_nulls'='294', 'min_value'='1', 'max_value'='277', 'data_size'='120000')
"""

sql """
alter table catalog_page modify column cp_catalog_page_sk set stats ('row_count'='30000', 'ndv'='30439', 'num_nulls'='0', 'min_value'='1', 'max_value'='30000', 'data_size'='240000')
"""

sql """
alter table catalog_page modify column cp_start_date_sk set stats ('row_count'='30000', 'ndv'='91', 'num_nulls'='286', 'min_value'='2450815', 'max_value'='2453005', 'data_size'='120000')
"""

sql """
alter table item modify column i_rec_start_date set stats ('row_count'='300000', 'ndv'='4', 'num_nulls'='784', 'min_value'='1997-10-27', 'max_value'='2001-10-27', 'data_size'='1200000')
"""

sql """
alter table item modify column i_units set stats ('row_count'='300000', 'ndv'='22', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='1253652')
"""

sql """
alter table web_returns modify column wr_refunded_hdemo_sk set stats ('row_count'='71997522', 'ndv'='7251', 'num_nulls'='3238545', 'min_value'='1', 'max_value'='7200', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_return_ship_cost set stats ('row_count'='71997522', 'ndv'='451263', 'num_nulls'='3239048', 'min_value'='0.00', 'max_value'='14352.10', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_returned_date_sk set stats ('row_count'='71997522', 'ndv'='2188', 'num_nulls'='3239259', 'min_value'='2450819', 'max_value'='2453002', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_returning_cdemo_sk set stats ('row_count'='71997522', 'ndv'='1916366', 'num_nulls'='3239192', 'min_value'='1', 'max_value'='1920800', 'data_size'='575980176')
"""

sql """
alter table web_site modify column web_suite_number set stats ('row_count'='54', 'ndv'='38', 'num_nulls'='0', 'min_value'='Suite 100', 'max_value'='Suite Y', 'data_size'='430')
"""

sql """
alter table promotion modify column p_start_date_sk set stats ('row_count'='1500', 'ndv'='685', 'num_nulls'='23', 'min_value'='2450096', 'max_value'='2450915', 'data_size'='12000')
"""

sql """
alter table web_sales modify column ws_coupon_amt set stats ('row_count'='720000376', 'ndv'='1505315', 'num_nulls'='179933', 'min_value'='0.00', 'max_value'='28824.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_ext_wholesale_cost set stats ('row_count'='720000376', 'ndv'='393180', 'num_nulls'='180060', 'min_value'='1.00', 'max_value'='10000.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_net_paid_inc_ship set stats ('row_count'='720000376', 'ndv'='2414838', 'num_nulls'='0', 'min_value'='0.00', 'max_value'='44263.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_ship_date_sk set stats ('row_count'='720000376', 'ndv'='1952', 'num_nulls'='180011', 'min_value'='2450817', 'max_value'='2452762', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_web_page_sk set stats ('row_count'='720000376', 'ndv'='2984', 'num_nulls'='179732', 'min_value'='1', 'max_value'='3000', 'data_size'='5760003008')
"""

sql """
alter table store modify column s_country set stats ('row_count'='1002', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='United States', 'data_size'='12961')
"""

sql """
alter table store modify column s_store_name set stats ('row_count'='1002', 'ndv'='11', 'num_nulls'='0', 'min_value'='', 'max_value'='pri', 'data_size'='3916')
"""

sql """
alter table time_dim modify column t_second set stats ('row_count'='86400', 'ndv'='60', 'num_nulls'='0', 'min_value'='0', 'max_value'='59', 'data_size'='345600')
"""

sql """
alter table time_dim modify column t_sub_shift set stats ('row_count'='86400', 'ndv'='4', 'num_nulls'='0', 'min_value'='afternoon', 'max_value'='night', 'data_size'='597600')
"""

sql """
alter table web_page modify column wp_image_count set stats ('row_count'='3000', 'ndv'='7', 'num_nulls'='26', 'min_value'='1', 'max_value'='7', 'data_size'='12000')
"""

sql """
alter table web_page modify column wp_type set stats ('row_count'='3000', 'ndv'='8', 'num_nulls'='0', 'min_value'='', 'max_value'='welcome', 'data_size'='18867')
"""

sql """
alter table store_returns modify column sr_customer_sk set stats ('row_count'='287999764', 'ndv'='12157481', 'num_nulls'='10081624', 'min_value'='1', 'max_value'='12000000', 'data_size'='2303998112')
"""

sql """
alter table store_returns modify column sr_hdemo_sk set stats ('row_count'='287999764', 'ndv'='7251', 'num_nulls'='10083275', 'min_value'='1', 'max_value'='7200', 'data_size'='2303998112')
"""

sql """
alter table store_sales modify column ss_addr_sk set stats ('row_count'='2879987999', 'ndv'='6015811', 'num_nulls'='129589799', 'min_value'='1', 'max_value'='6000000', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_item_sk set stats ('row_count'='2879987999', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_quantity set stats ('row_count'='2879987999', 'ndv'='100', 'num_nulls'='129584258', 'min_value'='1', 'max_value'='100', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_ticket_number set stats ('row_count'='2879987999', 'ndv'='238830448', 'num_nulls'='0', 'min_value'='1', 'max_value'='240000000', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_wholesale_cost set stats ('row_count'='2879987999', 'ndv'='9905', 'num_nulls'='129590273', 'min_value'='1.00', 'max_value'='100.00', 'data_size'='11519951996')
"""

sql """
alter table ship_mode modify column sm_type set stats ('row_count'='20', 'ndv'='6', 'num_nulls'='0', 'min_value'='EXPRESS', 'max_value'='TWO DAY', 'data_size'='150')
"""

sql """
alter table customer modify column c_current_addr_sk set stats ('row_count'='12000000', 'ndv'='5243359', 'num_nulls'='0', 'min_value'='3', 'max_value'='6000000', 'data_size'='96000000')
"""

sql """
alter table customer modify column c_last_name set stats ('row_count'='12000000', 'ndv'='4990', 'num_nulls'='0', 'min_value'='', 'max_value'='Zuniga', 'data_size'='70991730')
"""

sql """
alter table dbgen_version modify column dv_cmdline_args set stats ('row_count'='1', 'ndv'='1', 'num_nulls'='0', 'min_value'='-SCALE 1000 -PARALLEL 64 -CHILD 1 -TERMINATE N -DIR /mnt/datadisk0/tpcds1t/tpcds-data', 'max_value'='-SCALE 1000 -PARALLEL 64 -CHILD 1 -TERMINATE N -DIR /mnt/datadisk0/tpcds1t/tpcds-data', 'data_size'='86')
"""

sql """
alter table date_dim modify column d_current_quarter set stats ('row_count'='73049', 'ndv'='2', 'num_nulls'='0', 'min_value'='N', 'max_value'='Y', 'data_size'='73049')
"""

sql """
alter table date_dim modify column d_date_sk set stats ('row_count'='73049', 'ndv'='73042', 'num_nulls'='0', 'min_value'='2415022', 'max_value'='2488070', 'data_size'='584392')
"""

sql """
alter table date_dim modify column d_holiday set stats ('row_count'='73049', 'ndv'='2', 'num_nulls'='0', 'min_value'='N', 'max_value'='Y', 'data_size'='73049')
"""

sql """
alter table warehouse modify column w_country set stats ('row_count'='20', 'ndv'='1', 'num_nulls'='0', 'min_value'='United States', 'max_value'='United States', 'data_size'='260')
"""

sql """
alter table warehouse modify column w_state set stats ('row_count'='20', 'ndv'='13', 'num_nulls'='0', 'min_value'='AL', 'max_value'='TN', 'data_size'='40')
"""

sql """
alter table catalog_sales modify column cs_bill_addr_sk set stats ('row_count'='1439980416', 'ndv'='6015811', 'num_nulls'='7199539', 'min_value'='1', 'max_value'='6000000', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_bill_customer_sk set stats ('row_count'='1439980416', 'ndv'='12157481', 'num_nulls'='7201919', 'min_value'='1', 'max_value'='12000000', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_net_paid set stats ('row_count'='1439980416', 'ndv'='1809875', 'num_nulls'='7197668', 'min_value'='0.00', 'max_value'='29943.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_ship_addr_sk set stats ('row_count'='1439980416', 'ndv'='6015811', 'num_nulls'='7198232', 'min_value'='1', 'max_value'='6000000', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_ship_mode_sk set stats ('row_count'='1439980416', 'ndv'='20', 'num_nulls'='7201083', 'min_value'='1', 'max_value'='20', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_sold_date_sk set stats ('row_count'='1439980416', 'ndv'='1835', 'num_nulls'='7203326', 'min_value'='2450815', 'max_value'='2452654', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_sold_time_sk set stats ('row_count'='1439980416', 'ndv'='87677', 'num_nulls'='7201329', 'min_value'='0', 'max_value'='86399', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_wholesale_cost set stats ('row_count'='1439980416', 'ndv'='9905', 'num_nulls'='7201098', 'min_value'='1.00', 'max_value'='100.00', 'data_size'='5759921664')
"""

sql """
alter table call_center modify column cc_company_name set stats ('row_count'='42', 'ndv'='6', 'num_nulls'='0', 'min_value'='able', 'max_value'='pri', 'data_size'='160')
"""

sql """
alter table call_center modify column cc_market_manager set stats ('row_count'='42', 'ndv'='35', 'num_nulls'='0', 'min_value'='Cesar Allen', 'max_value'='William Larsen', 'data_size'='524')
"""

sql """
alter table call_center modify column cc_mkt_id set stats ('row_count'='42', 'ndv'='6', 'num_nulls'='0', 'min_value'='1', 'max_value'='6', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_street_type set stats ('row_count'='42', 'ndv'='11', 'num_nulls'='0', 'min_value'='Avenue', 'max_value'='Way', 'data_size'='184')
"""

sql """
alter table catalog_returns modify column cr_return_tax set stats ('row_count'='143996756', 'ndv'='149828', 'num_nulls'='2881611', 'min_value'='0.00', 'max_value'='2511.58', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_returning_cdemo_sk set stats ('row_count'='143996756', 'ndv'='1916366', 'num_nulls'='2880543', 'min_value'='1', 'max_value'='1920800', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_returning_hdemo_sk set stats ('row_count'='143996756', 'ndv'='7251', 'num_nulls'='2882692', 'min_value'='1', 'max_value'='7200', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_reversed_charge set stats ('row_count'='143996756', 'ndv'='802509', 'num_nulls'='2881215', 'min_value'='0.00', 'max_value'='24033.84', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_warehouse_sk set stats ('row_count'='143996756', 'ndv'='20', 'num_nulls'='2882192', 'min_value'='1', 'max_value'='20', 'data_size'='1151974048')
"""

sql """
alter table household_demographics modify column hd_demo_sk set stats ('row_count'='7200', 'ndv'='7251', 'num_nulls'='0', 'min_value'='1', 'max_value'='7200', 'data_size'='57600')
"""

sql """
alter table household_demographics modify column hd_vehicle_count set stats ('row_count'='7200', 'ndv'='6', 'num_nulls'='0', 'min_value'='-1', 'max_value'='4', 'data_size'='28800')
"""

sql """
alter table customer_address modify column ca_zip set stats ('row_count'='6000000', 'ndv'='9253', 'num_nulls'='0', 'min_value'='', 'max_value'='99981', 'data_size'='29097610')
"""

sql """
alter table income_band modify column ib_income_band_sk set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='1', 'max_value'='20', 'data_size'='160')
"""

sql """
alter table catalog_page modify column cp_type set stats ('row_count'='30000', 'ndv'='4', 'num_nulls'='0', 'min_value'='', 'max_value'='quarterly', 'data_size'='227890')
"""

sql """
alter table item modify column i_brand set stats ('row_count'='300000', 'ndv'='714', 'num_nulls'='0', 'min_value'='', 'max_value'='univunivamalg #9', 'data_size'='4834917')
"""

sql """
alter table item modify column i_formulation set stats ('row_count'='300000', 'ndv'='224757', 'num_nulls'='0', 'min_value'='', 'max_value'='yellow98911509228741', 'data_size'='5984460')
"""

sql """
alter table item modify column i_item_desc set stats ('row_count'='300000', 'ndv'='217721', 'num_nulls'='0', 'min_value'='', 'max_value'='Youngsters used to save quite colour', 'data_size'='30093342')
"""

sql """
alter table web_returns modify column wr_fee set stats ('row_count'='71997522', 'ndv'='9958', 'num_nulls'='3238926', 'min_value'='0.50', 'max_value'='100.00', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_item_sk set stats ('row_count'='71997522', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_reason_sk set stats ('row_count'='71997522', 'ndv'='65', 'num_nulls'='3238897', 'min_value'='1', 'max_value'='65', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_refunded_customer_sk set stats ('row_count'='71997522', 'ndv'='12117831', 'num_nulls'='3242433', 'min_value'='1', 'max_value'='12000000', 'data_size'='575980176')
"""

sql """
alter table web_site modify column web_city set stats ('row_count'='54', 'ndv'='31', 'num_nulls'='0', 'min_value'='', 'max_value'='Woodlawn', 'data_size'='491')
"""

sql """
alter table web_site modify column web_close_date_sk set stats ('row_count'='54', 'ndv'='18', 'num_nulls'='10', 'min_value'='2441265', 'max_value'='2446218', 'data_size'='432')
"""

sql """
alter table web_site modify column web_company_id set stats ('row_count'='54', 'ndv'='6', 'num_nulls'='0', 'min_value'='1', 'max_value'='6', 'data_size'='216')
"""

sql """
alter table web_site modify column web_company_name set stats ('row_count'='54', 'ndv'='7', 'num_nulls'='0', 'min_value'='', 'max_value'='pri', 'data_size'='203')
"""

sql """
alter table web_site modify column web_county set stats ('row_count'='54', 'ndv'='25', 'num_nulls'='0', 'min_value'='', 'max_value'='Williamson County', 'data_size'='762')
"""

sql """
alter table web_site modify column web_name set stats ('row_count'='54', 'ndv'='10', 'num_nulls'='0', 'min_value'='', 'max_value'='site_8', 'data_size'='312')
"""

sql """
alter table web_site modify column web_open_date_sk set stats ('row_count'='54', 'ndv'='27', 'num_nulls'='1', 'min_value'='2450373', 'max_value'='2450807', 'data_size'='432')
"""

sql """
alter table promotion modify column p_channel_dmail set stats ('row_count'='1500', 'ndv'='3', 'num_nulls'='0', 'min_value'='', 'max_value'='Y', 'data_size'='1483')
"""

sql """
alter table promotion modify column p_channel_press set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1481')
"""

sql """
alter table promotion modify column p_channel_radio set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1479')
"""

sql """
alter table promotion modify column p_cost set stats ('row_count'='1500', 'ndv'='1', 'num_nulls'='18', 'min_value'='1000.00', 'max_value'='1000.00', 'data_size'='12000')
"""

sql """
alter table web_sales modify column ws_ext_tax set stats ('row_count'='720000376', 'ndv'='211413', 'num_nulls'='179695', 'min_value'='0.00', 'max_value'='2682.90', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_item_sk set stats ('row_count'='720000376', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_net_paid set stats ('row_count'='720000376', 'ndv'='1749360', 'num_nulls'='179970', 'min_value'='0.00', 'max_value'='29810.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_net_paid_inc_ship_tax set stats ('row_count'='720000376', 'ndv'='3224829', 'num_nulls'='0', 'min_value'='0.00', 'max_value'='46004.19', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_net_paid_inc_tax set stats ('row_count'='720000376', 'ndv'='2354996', 'num_nulls'='179972', 'min_value'='0.00', 'max_value'='32492.90', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_order_number set stats ('row_count'='720000376', 'ndv'='60401176', 'num_nulls'='0', 'min_value'='1', 'max_value'='60000000', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_quantity set stats ('row_count'='720000376', 'ndv'='100', 'num_nulls'='179781', 'min_value'='1', 'max_value'='100', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_ship_cdemo_sk set stats ('row_count'='720000376', 'ndv'='1916366', 'num_nulls'='180290', 'min_value'='1', 'max_value'='1920800', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_sold_time_sk set stats ('row_count'='720000376', 'ndv'='87677', 'num_nulls'='179980', 'min_value'='0', 'max_value'='86399', 'data_size'='5760003008')
"""

sql """
alter table store modify column s_street_type set stats ('row_count'='1002', 'ndv'='21', 'num_nulls'='0', 'min_value'='', 'max_value'='Wy', 'data_size'='4189')
"""

sql """
alter table web_page modify column wp_autogen_flag set stats ('row_count'='3000', 'ndv'='3', 'num_nulls'='0', 'min_value'='', 'max_value'='Y', 'data_size'='2962')
"""

sql """
alter table web_page modify column wp_rec_start_date set stats ('row_count'='3000', 'ndv'='4', 'num_nulls'='29', 'min_value'='1997-09-03', 'max_value'='2001-09-03', 'data_size'='12000')
"""

sql """
alter table store_returns modify column sr_net_loss set stats ('row_count'='287999764', 'ndv'='714210', 'num_nulls'='10080716', 'min_value'='0.50', 'max_value'='10776.08', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_return_amt_inc_tax set stats ('row_count'='287999764', 'ndv'='1259368', 'num_nulls'='10076879', 'min_value'='0.00', 'max_value'='20454.63', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_return_quantity set stats ('row_count'='287999764', 'ndv'='100', 'num_nulls'='10082815', 'min_value'='1', 'max_value'='100', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_return_ship_cost set stats ('row_count'='287999764', 'ndv'='355844', 'num_nulls'='10081927', 'min_value'='0.00', 'max_value'='9767.34', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_reversed_charge set stats ('row_count'='287999764', 'ndv'='700618', 'num_nulls'='10085976', 'min_value'='0.00', 'max_value'='17339.42', 'data_size'='1151999056')
"""

sql """
alter table store_sales modify column ss_net_paid_inc_tax set stats ('row_count'='2879987999', 'ndv'='1681767', 'num_nulls'='129609050', 'min_value'='0.00', 'max_value'='21769.48', 'data_size'='11519951996')
"""

sql """
alter table customer modify column c_birth_day set stats ('row_count'='12000000', 'ndv'='31', 'num_nulls'='420361', 'min_value'='1', 'max_value'='31', 'data_size'='48000000')
"""

sql """
alter table customer_demographics modify column cd_credit_rating set stats ('row_count'='1920800', 'ndv'='4', 'num_nulls'='0', 'min_value'='Good', 'max_value'='Unknown', 'data_size'='13445600')
"""

sql """
alter table customer_demographics modify column cd_demo_sk set stats ('row_count'='1920800', 'ndv'='1916366', 'num_nulls'='0', 'min_value'='1', 'max_value'='1920800', 'data_size'='15366400')
"""

sql """
alter table customer_demographics modify column cd_dep_count set stats ('row_count'='1920800', 'ndv'='7', 'num_nulls'='0', 'min_value'='0', 'max_value'='6', 'data_size'='7683200')
"""

sql """
alter table customer_demographics modify column cd_education_status set stats ('row_count'='1920800', 'ndv'='7', 'num_nulls'='0', 'min_value'='2 yr Degree', 'max_value'='Unknown', 'data_size'='18384800')
"""

sql """
alter table customer_demographics modify column cd_gender set stats ('row_count'='1920800', 'ndv'='2', 'num_nulls'='0', 'min_value'='F', 'max_value'='M', 'data_size'='1920800')
"""

sql """
alter table customer_demographics modify column cd_marital_status set stats ('row_count'='1920800', 'ndv'='5', 'num_nulls'='0', 'min_value'='D', 'max_value'='W', 'data_size'='1920800')
"""

sql """
alter table date_dim modify column d_date_id set stats ('row_count'='73049', 'ndv'='72907', 'num_nulls'='0', 'min_value'='AAAAAAAAAAAAFCAA', 'max_value'='AAAAAAAAPPPPECAA', 'data_size'='1168784')
"""

sql """
alter table date_dim modify column d_fy_week_seq set stats ('row_count'='73049', 'ndv'='10448', 'num_nulls'='0', 'min_value'='1', 'max_value'='10436', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_year set stats ('row_count'='73049', 'ndv'='202', 'num_nulls'='0', 'min_value'='1900', 'max_value'='2100', 'data_size'='292196')
"""

sql """
alter table warehouse modify column w_warehouse_id set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='AAAAAAAAABAAAAAA', 'max_value'='AAAAAAAAPAAAAAAA', 'data_size'='320')
"""

sql """
alter table catalog_sales modify column cs_ext_list_price set stats ('row_count'='1439980416', 'ndv'='1160303', 'num_nulls'='7199542', 'min_value'='1.00', 'max_value'='30000.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_ext_tax set stats ('row_count'='1439980416', 'ndv'='215267', 'num_nulls'='7200412', 'min_value'='0.00', 'max_value'='2673.27', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_quantity set stats ('row_count'='1439980416', 'ndv'='100', 'num_nulls'='7202885', 'min_value'='1', 'max_value'='100', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_ship_cdemo_sk set stats ('row_count'='1439980416', 'ndv'='1916366', 'num_nulls'='7200151', 'min_value'='1', 'max_value'='1920800', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_ship_customer_sk set stats ('row_count'='1439980416', 'ndv'='12157481', 'num_nulls'='7201507', 'min_value'='1', 'max_value'='12000000', 'data_size'='11519843328')
"""

sql """
alter table call_center modify column cc_company set stats ('row_count'='42', 'ndv'='6', 'num_nulls'='0', 'min_value'='1', 'max_value'='6', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_mkt_desc set stats ('row_count'='42', 'ndv'='33', 'num_nulls'='0', 'min_value'='Arms increase controversial, present so', 'max_value'='Young tests could buy comfortable, local users
"""

sql """ o', 'data_size'='2419')
"""

sql """
alter table call_center modify column cc_open_date_sk set stats ('row_count'='42', 'ndv'='21', 'num_nulls'='0', 'min_value'='2450794', 'max_value'='2451146', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_rec_end_date set stats ('row_count'='42', 'ndv'='3', 'num_nulls'='21', 'min_value'='2000-01-01', 'max_value'='2001-12-31', 'data_size'='168')
"""

sql """
alter table catalog_returns modify column cr_order_number set stats ('row_count'='143996756', 'ndv'='93476424', 'num_nulls'='0', 'min_value'='2', 'max_value'='160000000', 'data_size'='1151974048')
"""

sql """
alter table catalog_returns modify column cr_return_amount set stats ('row_count'='143996756', 'ndv'='882831', 'num_nulls'='2880424', 'min_value'='0.00', 'max_value'='28805.04', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_returned_date_sk set stats ('row_count'='143996756', 'ndv'='2108', 'num_nulls'='0', 'min_value'='2450821', 'max_value'='2452924', 'data_size'='1151974048')
"""

sql """
alter table income_band modify column ib_upper_bound set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='10000', 'max_value'='200000', 'data_size'='80')
"""

sql """
alter table catalog_page modify column cp_department set stats ('row_count'='30000', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='DEPARTMENT', 'data_size'='297110')
"""

sql """
alter table catalog_page modify column cp_end_date_sk set stats ('row_count'='30000', 'ndv'='97', 'num_nulls'='302', 'min_value'='2450844', 'max_value'='2453186', 'data_size'='120000')
"""

sql """
alter table item modify column i_brand_id set stats ('row_count'='300000', 'ndv'='951', 'num_nulls'='763', 'min_value'='1001001', 'max_value'='10016017', 'data_size'='1200000')
"""

sql """
alter table item modify column i_category set stats ('row_count'='300000', 'ndv'='11', 'num_nulls'='0', 'min_value'='', 'max_value'='Women', 'data_size'='1766742')
"""

sql """
alter table item modify column i_class_id set stats ('row_count'='300000', 'ndv'='16', 'num_nulls'='722', 'min_value'='1', 'max_value'='16', 'data_size'='1200000')
"""

sql """
alter table item modify column i_item_sk set stats ('row_count'='300000', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='2400000')
"""

sql """
alter table item modify column i_manufact_id set stats ('row_count'='300000', 'ndv'='1005', 'num_nulls'='761', 'min_value'='1', 'max_value'='1000', 'data_size'='1200000')
"""

sql """
alter table item modify column i_wholesale_cost set stats ('row_count'='300000', 'ndv'='7243', 'num_nulls'='740', 'min_value'='0.02', 'max_value'='89.49', 'data_size'='1200000')
"""

sql """
alter table web_returns modify column wr_refunded_cdemo_sk set stats ('row_count'='71997522', 'ndv'='1916366', 'num_nulls'='3240352', 'min_value'='1', 'max_value'='1920800', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_return_tax set stats ('row_count'='71997522', 'ndv'='137392', 'num_nulls'='3237729', 'min_value'='0.00', 'max_value'='2551.16', 'data_size'='287990088')
"""

sql """
alter table web_returns modify column wr_returning_hdemo_sk set stats ('row_count'='71997522', 'ndv'='7251', 'num_nulls'='3238239', 'min_value'='1', 'max_value'='7200', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_web_page_sk set stats ('row_count'='71997522', 'ndv'='2984', 'num_nulls'='3240387', 'min_value'='1', 'max_value'='3000', 'data_size'='575980176')
"""

sql """
alter table web_site modify column web_class set stats ('row_count'='54', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='371')
"""

sql """
alter table web_site modify column web_zip set stats ('row_count'='54', 'ndv'='32', 'num_nulls'='0', 'min_value'='14593', 'max_value'='99431', 'data_size'='270')
"""

sql """
alter table promotion modify column p_channel_email set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1480')
"""

sql """
alter table promotion modify column p_item_sk set stats ('row_count'='1500', 'ndv'='1467', 'num_nulls'='19', 'min_value'='184', 'max_value'='299990', 'data_size'='12000')
"""

sql """
alter table promotion modify column p_promo_name set stats ('row_count'='1500', 'ndv'='11', 'num_nulls'='0', 'min_value'='', 'max_value'='pri', 'data_size'='5896')
"""

sql """
alter table web_sales modify column ws_ext_discount_amt set stats ('row_count'='720000376', 'ndv'='1093513', 'num_nulls'='179851', 'min_value'='0.00', 'max_value'='29982.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_ext_list_price set stats ('row_count'='720000376', 'ndv'='1160303', 'num_nulls'='179866', 'min_value'='1.00', 'max_value'='30000.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_wholesale_cost set stats ('row_count'='720000376', 'ndv'='9905', 'num_nulls'='179834', 'min_value'='1.00', 'max_value'='100.00', 'data_size'='2880001504')
"""

sql """
alter table store modify column s_market_manager set stats ('row_count'='1002', 'ndv'='732', 'num_nulls'='0', 'min_value'='', 'max_value'='Zane Perez', 'data_size'='12823')
"""

sql """
alter table store modify column s_number_employees set stats ('row_count'='1002', 'ndv'='101', 'num_nulls'='8', 'min_value'='200', 'max_value'='300', 'data_size'='4008')
"""

sql """
alter table store modify column s_rec_end_date set stats ('row_count'='1002', 'ndv'='3', 'num_nulls'='501', 'min_value'='1999-03-13', 'max_value'='2001-03-12', 'data_size'='4008')
"""

sql """
alter table store modify column s_rec_start_date set stats ('row_count'='1002', 'ndv'='4', 'num_nulls'='7', 'min_value'='1997-03-13', 'max_value'='2001-03-13', 'data_size'='4008')
"""

sql """
alter table store modify column s_suite_number set stats ('row_count'='1002', 'ndv'='76', 'num_nulls'='0', 'min_value'='', 'max_value'='Suite Y', 'data_size'='7866')
"""

sql """
alter table time_dim modify column t_hour set stats ('row_count'='86400', 'ndv'='24', 'num_nulls'='0', 'min_value'='0', 'max_value'='23', 'data_size'='345600')
"""

sql """
alter table time_dim modify column t_shift set stats ('row_count'='86400', 'ndv'='3', 'num_nulls'='0', 'min_value'='first', 'max_value'='third', 'data_size'='460800')
"""

sql """
alter table web_page modify column wp_link_count set stats ('row_count'='3000', 'ndv'='24', 'num_nulls'='27', 'min_value'='2', 'max_value'='25', 'data_size'='12000')
"""

sql """
alter table web_page modify column wp_rec_end_date set stats ('row_count'='3000', 'ndv'='3', 'num_nulls'='1500', 'min_value'='1999-09-03', 'max_value'='2001-09-02', 'data_size'='12000')
"""

sql """
alter table store_returns modify column sr_cdemo_sk set stats ('row_count'='287999764', 'ndv'='1916366', 'num_nulls'='10076902', 'min_value'='1', 'max_value'='1920800', 'data_size'='2303998112')
"""

sql """
alter table store_returns modify column sr_item_sk set stats ('row_count'='287999764', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='2303998112')
"""

sql """
alter table store_sales modify column ss_cdemo_sk set stats ('row_count'='2879987999', 'ndv'='1916366', 'num_nulls'='129602155', 'min_value'='1', 'max_value'='1920800', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_ext_discount_amt set stats ('row_count'='2879987999', 'ndv'='1161208', 'num_nulls'='129609101', 'min_value'='0.00', 'max_value'='19778.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_ext_wholesale_cost set stats ('row_count'='2879987999', 'ndv'='393180', 'num_nulls'='129595018', 'min_value'='1.00', 'max_value'='10000.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_list_price set stats ('row_count'='2879987999', 'ndv'='19640', 'num_nulls'='129597020', 'min_value'='1.00', 'max_value'='200.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_net_paid set stats ('row_count'='2879987999', 'ndv'='1288646', 'num_nulls'='129599407', 'min_value'='0.00', 'max_value'='19972.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_sold_date_sk set stats ('row_count'='2879987999', 'ndv'='1820', 'num_nulls'='129600843', 'min_value'='2450816', 'max_value'='2452642', 'data_size'='23039903992')
"""

sql """
alter table store_sales modify column ss_sold_time_sk set stats ('row_count'='2879987999', 'ndv'='47252', 'num_nulls'='129593012', 'min_value'='28800', 'max_value'='75599', 'data_size'='23039903992')
"""

sql """
alter table ship_mode modify column sm_carrier set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='AIRBORNE', 'max_value'='ZOUROS', 'data_size'='133')
"""

sql """
alter table customer modify column c_birth_year set stats ('row_count'='12000000', 'ndv'='69', 'num_nulls'='419584', 'min_value'='1924', 'max_value'='1992', 'data_size'='48000000')
"""

sql """
alter table customer modify column c_login set stats ('row_count'='12000000', 'ndv'='1', 'num_nulls'='0', 'min_value'='', 'max_value'='', 'data_size'='0')
"""

sql """
alter table customer modify column c_salutation set stats ('row_count'='12000000', 'ndv'='7', 'num_nulls'='0', 'min_value'='', 'max_value'='Sir', 'data_size'='37544445')
"""

sql """
alter table reason modify column r_reason_desc set stats ('row_count'='65', 'ndv'='64', 'num_nulls'='0', 'min_value'='Did not fit', 'max_value'='unauthoized purchase', 'data_size'='848')
"""

sql """
alter table date_dim modify column d_current_year set stats ('row_count'='73049', 'ndv'='2', 'num_nulls'='0', 'min_value'='N', 'max_value'='Y', 'data_size'='73049')
"""

sql """
alter table date_dim modify column d_dom set stats ('row_count'='73049', 'ndv'='31', 'num_nulls'='0', 'min_value'='1', 'max_value'='31', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_same_day_lq set stats ('row_count'='73049', 'ndv'='72231', 'num_nulls'='0', 'min_value'='2414930', 'max_value'='2487978', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_week_seq set stats ('row_count'='73049', 'ndv'='10448', 'num_nulls'='0', 'min_value'='1', 'max_value'='10436', 'data_size'='292196')
"""

sql """
alter table date_dim modify column d_weekend set stats ('row_count'='73049', 'ndv'='2', 'num_nulls'='0', 'min_value'='N', 'max_value'='Y', 'data_size'='73049')
"""

sql """
alter table warehouse modify column w_zip set stats ('row_count'='20', 'ndv'='18', 'num_nulls'='0', 'min_value'='19231', 'max_value'='89275', 'data_size'='100')
"""

sql """
alter table catalog_sales modify column cs_catalog_page_sk set stats ('row_count'='1439980416', 'ndv'='17005', 'num_nulls'='7199032', 'min_value'='1', 'max_value'='25207', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_coupon_amt set stats ('row_count'='1439980416', 'ndv'='1578778', 'num_nulls'='7198116', 'min_value'='0.00', 'max_value'='28730.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_list_price set stats ('row_count'='1439980416', 'ndv'='29396', 'num_nulls'='7201549', 'min_value'='1.00', 'max_value'='300.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_net_profit set stats ('row_count'='1439980416', 'ndv'='2058398', 'num_nulls'='0', 'min_value'='-10000.00', 'max_value'='19962.00', 'data_size'='5759921664')
"""

sql """
alter table catalog_sales modify column cs_order_number set stats ('row_count'='1439980416', 'ndv'='159051824', 'num_nulls'='0', 'min_value'='1', 'max_value'='160000000', 'data_size'='11519843328')
"""

sql """
alter table catalog_sales modify column cs_ship_hdemo_sk set stats ('row_count'='1439980416', 'ndv'='7251', 'num_nulls'='7201542', 'min_value'='1', 'max_value'='7200', 'data_size'='11519843328')
"""

sql """
alter table call_center modify column cc_call_center_sk set stats ('row_count'='42', 'ndv'='42', 'num_nulls'='0', 'min_value'='1', 'max_value'='42', 'data_size'='336')
"""

sql """
alter table call_center modify column cc_city set stats ('row_count'='42', 'ndv'='17', 'num_nulls'='0', 'min_value'='Antioch', 'max_value'='Spring Hill', 'data_size'='386')
"""

sql """
alter table call_center modify column cc_closed_date_sk set stats ('row_count'='42', 'ndv'='0', 'num_nulls'='42', 'min_value'='NULL', 'max_value'='NULL', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_gmt_offset set stats ('row_count'='42', 'ndv'='4', 'num_nulls'='0', 'min_value'='-8.00', 'max_value'='-5.00', 'data_size'='168')
"""

sql """
alter table call_center modify column cc_hours set stats ('row_count'='42', 'ndv'='3', 'num_nulls'='0', 'min_value'='8AM-12AM', 'max_value'='8AM-8AM', 'data_size'='300')
"""

sql """
alter table call_center modify column cc_street_number set stats ('row_count'='42', 'ndv'='21', 'num_nulls'='0', 'min_value'='38', 'max_value'='999', 'data_size'='120')
"""

sql """
alter table call_center modify column cc_tax_percentage set stats ('row_count'='42', 'ndv'='12', 'num_nulls'='0', 'min_value'='0.00', 'max_value'='0.12', 'data_size'='168')
"""

sql """
alter table inventory modify column inv_date_sk set stats ('row_count'='783000000', 'ndv'='261', 'num_nulls'='0', 'min_value'='2450815', 'max_value'='2452635', 'data_size'='6264000000')
"""

sql """
alter table inventory modify column inv_item_sk set stats ('row_count'='783000000', 'ndv'='295433', 'num_nulls'='0', 'min_value'='1', 'max_value'='300000', 'data_size'='6264000000')
"""

sql """
alter table catalog_returns modify column cr_fee set stats ('row_count'='143996756', 'ndv'='9958', 'num_nulls'='2882168', 'min_value'='0.50', 'max_value'='100.00', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_return_quantity set stats ('row_count'='143996756', 'ndv'='100', 'num_nulls'='2878774', 'min_value'='1', 'max_value'='100', 'data_size'='575987024')
"""

sql """
alter table catalog_returns modify column cr_returned_time_sk set stats ('row_count'='143996756', 'ndv'='87677', 'num_nulls'='0', 'min_value'='0', 'max_value'='86399', 'data_size'='1151974048')
"""

sql """
alter table household_demographics modify column hd_dep_count set stats ('row_count'='7200', 'ndv'='10', 'num_nulls'='0', 'min_value'='0', 'max_value'='9', 'data_size'='28800')
"""

sql """
alter table customer_address modify column ca_county set stats ('row_count'='6000000', 'ndv'='1825', 'num_nulls'='0', 'min_value'='', 'max_value'='Ziebach County', 'data_size'='81254984')
"""

sql """
alter table income_band modify column ib_lower_bound set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='0', 'max_value'='190001', 'data_size'='80')
"""

sql """
alter table item modify column i_category_id set stats ('row_count'='300000', 'ndv'='10', 'num_nulls'='766', 'min_value'='1', 'max_value'='10', 'data_size'='1200000')
"""

sql """
alter table item modify column i_class set stats ('row_count'='300000', 'ndv'='100', 'num_nulls'='0', 'min_value'='', 'max_value'='womens watch', 'data_size'='2331199')
"""

sql """
alter table item modify column i_container set stats ('row_count'='300000', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='2094652')
"""

sql """
alter table item modify column i_current_price set stats ('row_count'='300000', 'ndv'='9685', 'num_nulls'='775', 'min_value'='0.09', 'max_value'='99.99', 'data_size'='1200000')
"""

sql """
alter table item modify column i_manager_id set stats ('row_count'='300000', 'ndv'='100', 'num_nulls'='744', 'min_value'='1', 'max_value'='100', 'data_size'='1200000')
"""

sql """
alter table item modify column i_size set stats ('row_count'='300000', 'ndv'='8', 'num_nulls'='0', 'min_value'='', 'max_value'='small', 'data_size'='1296134')
"""

sql """
alter table web_returns modify column wr_order_number set stats ('row_count'='71997522', 'ndv'='42383708', 'num_nulls'='0', 'min_value'='1', 'max_value'='60000000', 'data_size'='575980176')
"""

sql """
alter table web_returns modify column wr_refunded_cash set stats ('row_count'='71997522', 'ndv'='955369', 'num_nulls'='3240493', 'min_value'='0.00', 'max_value'='26992.92', 'data_size'='287990088')
"""

sql """
alter table web_site modify column web_country set stats ('row_count'='54', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='United States', 'data_size'='689')
"""

sql """
alter table web_site modify column web_gmt_offset set stats ('row_count'='54', 'ndv'='4', 'num_nulls'='1', 'min_value'='-8.00', 'max_value'='-5.00', 'data_size'='216')
"""

sql """
alter table web_site modify column web_market_manager set stats ('row_count'='54', 'ndv'='46', 'num_nulls'='0', 'min_value'='', 'max_value'='Zachery Oneil', 'data_size'='691')
"""

sql """
alter table web_site modify column web_site_sk set stats ('row_count'='54', 'ndv'='54', 'num_nulls'='0', 'min_value'='1', 'max_value'='54', 'data_size'='432')
"""

sql """
alter table web_site modify column web_street_name set stats ('row_count'='54', 'ndv'='53', 'num_nulls'='0', 'min_value'='', 'max_value'='Wilson Ridge', 'data_size'='471')
"""

sql """
alter table web_site modify column web_tax_percentage set stats ('row_count'='54', 'ndv'='13', 'num_nulls'='1', 'min_value'='0.00', 'max_value'='0.12', 'data_size'='216')
"""

sql """
alter table promotion modify column p_channel_tv set stats ('row_count'='1500', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='N', 'data_size'='1481')
"""

sql """
alter table promotion modify column p_response_targe set stats ('row_count'='1500', 'ndv'='1', 'num_nulls'='27', 'min_value'='1', 'max_value'='1', 'data_size'='6000')
"""

sql """
alter table web_sales modify column ws_bill_addr_sk set stats ('row_count'='720000376', 'ndv'='6015742', 'num_nulls'='179648', 'min_value'='1', 'max_value'='6000000', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_ext_sales_price set stats ('row_count'='720000376', 'ndv'='1091003', 'num_nulls'='180023', 'min_value'='0.00', 'max_value'='29810.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_net_profit set stats ('row_count'='720000376', 'ndv'='2014057', 'num_nulls'='0', 'min_value'='-10000.00', 'max_value'='19840.00', 'data_size'='2880001504')
"""

sql """
alter table web_sales modify column ws_promo_sk set stats ('row_count'='720000376', 'ndv'='1489', 'num_nulls'='180016', 'min_value'='1', 'max_value'='1500', 'data_size'='5760003008')
"""

sql """
alter table web_sales modify column ws_ship_customer_sk set stats ('row_count'='720000376', 'ndv'='12074547', 'num_nulls'='179966', 'min_value'='1', 'max_value'='12000000', 'data_size'='5760003008')
"""

sql """
alter table store modify column s_division_name set stats ('row_count'='1002', 'ndv'='2', 'num_nulls'='0', 'min_value'='', 'max_value'='Unknown', 'data_size'='6965')
"""

sql """
alter table store modify column s_floor_space set stats ('row_count'='1002', 'ndv'='752', 'num_nulls'='6', 'min_value'='5002549', 'max_value'='9997773', 'data_size'='4008')
"""

sql """
alter table store modify column s_tax_precentage set stats ('row_count'='1002', 'ndv'='12', 'num_nulls'='8', 'min_value'='0.00', 'max_value'='0.11', 'data_size'='4008')
"""

sql """
alter table time_dim modify column t_time_id set stats ('row_count'='86400', 'ndv'='85663', 'num_nulls'='0', 'min_value'='AAAAAAAAAAAABAAA', 'max_value'='AAAAAAAAPPPPAAAA', 'data_size'='1382400')
"""

sql """
alter table time_dim modify column t_time_sk set stats ('row_count'='86400', 'ndv'='87677', 'num_nulls'='0', 'min_value'='0', 'max_value'='86399', 'data_size'='691200')
"""

sql """
alter table store_returns modify column sr_fee set stats ('row_count'='287999764', 'ndv'='9958', 'num_nulls'='10081860', 'min_value'='0.50', 'max_value'='100.00', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_reason_sk set stats ('row_count'='287999764', 'ndv'='65', 'num_nulls'='10087936', 'min_value'='1', 'max_value'='65', 'data_size'='2303998112')
"""

sql """
alter table store_returns modify column sr_store_credit set stats ('row_count'='287999764', 'ndv'='698161', 'num_nulls'='10077188', 'min_value'='0.00', 'max_value'='17792.48', 'data_size'='1151999056')
"""

sql """
alter table store_returns modify column sr_ticket_number set stats ('row_count'='287999764', 'ndv'='168770768', 'num_nulls'='0', 'min_value'='1', 'max_value'='240000000', 'data_size'='2303998112')
"""

sql """
alter table store_sales modify column ss_ext_list_price set stats ('row_count'='2879987999', 'ndv'='770971', 'num_nulls'='129593800', 'min_value'='1.00', 'max_value'='20000.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_ext_sales_price set stats ('row_count'='2879987999', 'ndv'='754248', 'num_nulls'='129589177', 'min_value'='0.00', 'max_value'='19972.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_net_profit set stats ('row_count'='2879987999', 'ndv'='1497362', 'num_nulls'='129572933', 'min_value'='-10000.00', 'max_value'='9986.00', 'data_size'='11519951996')
"""

sql """
alter table store_sales modify column ss_promo_sk set stats ('row_count'='2879987999', 'ndv'='1489', 'num_nulls'='129597096', 'min_value'='1', 'max_value'='1500', 'data_size'='23039903992')
"""

sql """
alter table ship_mode modify column sm_code set stats ('row_count'='20', 'ndv'='4', 'num_nulls'='0', 'min_value'='AIR', 'max_value'='SURFACE', 'data_size'='87')
"""

sql """
alter table ship_mode modify column sm_contract set stats ('row_count'='20', 'ndv'='20', 'num_nulls'='0', 'min_value'='2mM8l', 'max_value'='yVfotg7Tio3MVhBg6Bkn', 'data_size'='252')
"""

sql """
alter table customer modify column c_current_hdemo_sk set stats ('row_count'='12000000', 'ndv'='7251', 'num_nulls'='418736', 'min_value'='1', 'max_value'='7200', 'data_size'='96000000')
"""

sql """
alter table dbgen_version modify column dv_create_date set stats ('row_count'='1', 'ndv'='1', 'num_nulls'='0', 'min_value'='2023-07-06', 'max_value'='2023-07-06', 'data_size'='4')
"""

sql """
alter table dbgen_version modify column dv_create_time set stats ('row_count'='1', 'ndv'='1', 'num_nulls'='0', 'min_value'='2017-05-13 00:00:00', 'max_value'='2017-05-13 00:00:00', 'data_size'='8')
"""
