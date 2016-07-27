<?php

$arr = array(
    "OmCustOrder",
    "OmOrder",
    "OmServiceOrder",
    "OmOrderKeyInfo",
    "OmOrderExtend",
    "OmAgreementDiscount",
    "OmProductDiscount",
    "OmSoAccess",
    "OmSoSla",
    "OmIndepProdOrderEvt",
    "PmIndepProdInst",
    "PmResAssign",
    "PmIndepProdInstRes",
    "OmSoResAssign"
);

foreach ($arr as $c){
    $d = lcfirst($c);
    $a = "    

    public $c get" . $c . "(OrderDto orderDto, String dataSource) {

        $c $d = new $c();
        $d.setId(orderDto.getOrderId());
        
        AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
        asyncSqlDto.setDataSource(dataSource);
        asyncSqlDto = SqlBuildUtils.getSelectSql($d);
        
        $d = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
                asyncSqlDto.getParams(), $c" . "RowMapper);
        return $d;
    } 
";
    //echo $a;
}




$brr = array(
    "OmSoAccNbr",
    "OmDependProdOrder",
    "OmIndepProdOrderAttr",
    "OmSoParty",
    "InfOrderRela",
    "InfCrmOrderProdReala",
    "OmGroupOrderRela",
);


foreach ($brr as $c) {
    $d = lcfirst($c);
    $a = "

    public List<$c> get" . $c . "s(OrderDto orderDto, String dataSource) {
        List<$c> " . $d ."s = new ArrayList<>();
        $c $d = new $c();

        $d.setServiceOrderId(orderDto.getOmServiceOrder().getId());

        AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
        asyncSqlDto.setDataSource(dataSource);
        asyncSqlDto = SqlBuildUtils.getSelectSql($d);

        $d"."s = jdbcTemplate.query(asyncSqlDto.getSqlStr(), $c" . "RowMapper);
        
        return $d" . "s;
    }

";
    //echo $a;


}



$crr = $arr + $brr;


foreach ($crr as $i) {
    
    $v = lcfirst($i);

    $a = 
"

    public int saveOmOrder(OmOrder omOrder) {
        AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
        asyncSqlDto = SqlBuildUtils.getInsertAsyncSql(omOrder);
        return dynamicJdbcTemplate.update(asyncSqlDto.getSqlStr(), 
                asyncSqlDto.getParams());
    }

";

    echo $a ;



}




