def load():
    data = []
    with open('stats.data', 'r') as f:
        data = f.readlines()
    return data

def parse_line(line):
    return line.split('|')[1:-1]

def get_table_abbr(col):
    return col.split("_")[0]+'_'

if __name__ == '__main__':
    cmd = "alter table {} modify column {} set stats ('row_count'='{}', 'ndv'='{}', 'num_nulls'='{}', 'min_value'='{}', 'max_value'='{}', 'data_size'='{}');\n"
    table_dict= {
        'cd_':'customer_demographics',
        'r_':'reason',
        'd_':'date_dim',
        'w_':'warehouse',
        'cs_':'catalog_sales',
        'cc_':'call_center',
        'cr_':'catalog_returns',
        'hd_':'household_demographics',
        'ca_':'customer_address',
        'ib_':'income_band',
        'cp_':'catalog_page',
        'i_':'item',
        'wr_':'web_returns',
        'web_':'web_site',
        'ws_':'web_sales',
        's_':'store',
        't_':'time_dim',
        'wp_':'web_page',
        'sr_':'store_returns',
        'ss_':'store_sales',
        'sm_':'ship_mode',
        'c_':'customer',
        'inv_':'inventory',
        'p_':'promotion',
        'dv_':'dbgen_version'
    }
    data = load()
    with open("alter.sql", 'w') as f:
        for line in data:
            items = parse_line(line)
            col = items[0].strip()
            table = table_dict[get_table_abbr(col)]
            f.write(cmd.format(table, col, items[1].strip(), items[2].strip(), items[3].strip(), items[4].strip(), items[5].strip(), items[6].strip()))
