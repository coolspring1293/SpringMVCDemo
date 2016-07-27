    private StringBuilder mix(boolean flag,StringBuilder sql){
        if(flag){
            sql.append("SET ");
        }else{
            sql.append(", ");
        }
        return sql ;
    }
    
    private boolean change(boolean flag){
        if(flag){
            flag = !flag;
        }
        return flag;
    }
    
   

    
	@Override
	public void updateOrder_backup(OrderDto dto, boolean mark) {
		boolean flag = true;
		StringBuilder updateSql = new StringBuilder("UPDATE IOM_OM_ORDER ");
		List<Object> paramList = new ArrayList<Object>();
		
    	if(StringUtil.isNotEmpty(dto.getOrderCode())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ORDER_CODE = ? ");
    		paramList.add(dto.getOrderCode());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrder().getOrderTitle())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ORDER_TITLE = ? ");
    		paramList.add(dto.getOmOrder().getOrderTitle());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOrderState())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ORDER_STATE = ? ");
    		paramList.add(dto.getOrderState());
    	}
    	if(StringUtil.isNotEmpty(dto.getCustOrderCode())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("CUST_ORDER_CODE = ? ");
    		paramList.add(dto.getCustOrderCode());
    	}
    	
    	if(StringUtil.isNotEmpty((String) dto.getProcessInstanceCode())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("PROCESS_INSTANCE_CODE = ? ");
    		paramList.add(dto.getProcessInstanceCode());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getProductCode())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("PRODUCT_CODE = ? ");
    		paramList.add(dto.getProductCode());
    	}
    	if(StringUtil.isNotEmpty(dto.getEventCode())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("EVENT_CODE = ? ");
    		paramList.add(dto.getEventCode());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getServiceCode())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("SERVICE_CODE = ? ");
    		paramList.add(dto.getServiceCode());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getAreaId())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("AREA_ID = ? ");
    		paramList.add(dto.getAreaId());
    	}
    	if(dto.getOmOrder().getCreateDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("CREATE_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getOmOrder().getCreateDate()));
    	}
    	
    	if(dto.getOmOrder().getAcceptDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ACCEPT_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getOmOrder().getAcceptDate()));
    	}
    	
    	if(dto.getFinishDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("FINISH_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getFinishDate()));
    	}
    	if(dto.getStateDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("STATE_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getStateDate()));
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmServiceOrder().getSoType())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("SO_TYPE = ? ");
    		paramList.add(dto.getOmServiceOrder().getSoType());
    	}
    	
    	if(StringUtil.isNotEmpty( (String)dto.getOrderType())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ORDER_TYPE = ? ");
    		paramList.add(dto.getOrderType());
    	}
    	// TODO
    	if(dto.getDbTime() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("DB_TIME = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getDbTime()));
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrderKeyInfo().getAccNbr())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ACC_NBR = ? ");
    		paramList.add(dto.getOmOrderKeyInfo().getAccNbr());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrder().getExecuteSystem())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("EXECUTE_SYSTEM = ? ");
    		paramList.add(dto.getOmOrder().getExecuteSystem());
    	}
    	
    	if(dto.getOmOrder().getLimitDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("LIMIT_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getOmOrder().getLimitDate()));
    	}
    	
    	if(dto.getOmOrder().getAlertDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ALERT_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getOmOrder().getAlertDate()));
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmServiceOrder().getNeedChargeFlag())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("NEED_CHARGE_FLAG = ? ");
    		paramList.add(dto.getOmServiceOrder().getNeedChargeFlag());
    	}
    	if(dto.getOmServiceOrder().getActiveDate() != null){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ACTIVE_DATE = ? ");
    		paramList.add(ZDateUtils.dateToTimeStamp(dto.getOmServiceOrder().getActiveDate()));
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrder().getOrderPriority())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ORDER_PRIORITY = ? ");
    		paramList.add(dto.getOmOrder().getOrderPriority());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrderKeyInfo().getBindNbr())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("BIND_NBR = ? ");
    		paramList.add(dto.getOmOrderKeyInfo().getBindNbr());
    	}
    	if(StringUtil.isNotEmpty(dto.getOmOrderKeyInfo().getChargeNbr())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("CHARGE_NBR = ? ");
    		paramList.add(dto.getOmOrderKeyInfo().getChargeNbr());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrderExtend().getOtherChannelLogid())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("OTHER_CHANNEL_LOGID = ? ");
    		paramList.add(dto.getOmOrderExtend().getOtherChannelLogid());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmOrderExtend().getIsaleContactPhone())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ISALE_CONTACT_PHONE = ? ");
    		paramList.add(dto.getOmOrderExtend().getIsaleContactPhone());
    	}
    	if(StringUtil.isNotEmpty(dto.getOmOrderKeyInfo().getAddrName())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("ORDER_ADDR_NAME = ? ");
    		paramList.add(dto.getOmOrderKeyInfo().getAddrName());
    	}
    	
    	if(StringUtil.isNotEmpty(dto.getOmServiceOrder().getContact())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("CONTACT = ? ");
    		paramList.add(dto.getOmServiceOrder().getContact());
    	}
    	// TDOD
    	if(StringUtil.isNotEmpty(dto.getProdInstId())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("PROD_INST_ID = ? ");
    		paramList.add(dto.getProdInstId());
    	}
    	// TODO 就的	ORDERDTO中的“揽装人”？？ 骗子?
    	if(StringUtil.isNotEmpty(dto.getCheater())){
    		updateSql = this.mix(flag, updateSql);
    		flag = this.change(flag);
    		updateSql.append("CHEATER = ? ");
    		paramList.add(dto.getOmOrder().getCheater());
    	}
    	
    	
    	
    	updateSql.append("WHERE ORDER_ID = ? ");
    	paramList.add(dto.getOrderId());
    	
    	if(paramList.size() > 1){
        	if(mark){//异步
        		sqlPersistAtomService.put(dto.getOrderId(), updateSql.toString(), paramList.toArray());
        	}else{//同步
        		dynamicJdbcTemplate.update(updateSql.toString(), paramList.toArray());
        	}
    	}
    	
	}

