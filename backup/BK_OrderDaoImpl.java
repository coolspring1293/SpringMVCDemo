	public OmOrder getOmOrder(OrderDto orderDto){
		OmOrder omOrder = new OmOrder();
		omOrder.setId(orderDto.getOrderId());
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto = SqlBuildUtils.getSelectSql(omOrder);

		omOrder = dynamicJdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(), 
				asyncSqlDto.getParams(), OmOrderRowMapper);
		return omOrder;
	}
	
	
	

	public OmServiceOrder getOmServiceOrder(OrderDto orderDto, String dataSource) {
		OmServiceOrder omServiceOrder = new OmServiceOrder();
		omServiceOrder.setId(orderDto.getOmOrder().getServiceId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omServiceOrder);
		
		omServiceOrder = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmServiceOrderRowMapper);
		return omServiceOrder;
	}
	
	
	
	
	public OmCustOrder getOmCustOrder(OrderDto orderDto, String dataSource) {

		OmCustOrder omCustOrder = new OmCustOrder();
		omCustOrder.setId(orderDto.getOmServiceOrder().getCustOrderId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omCustOrder);

		omCustOrder = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmCustOrderRowMapper);
		return omCustOrder;
	}
	
	public OmOrderKeyInfo getOmOrderKeyInfo(OrderDto orderDto, String dataSource) {

		OmOrderKeyInfo omOrderKeyInfo = new OmOrderKeyInfo();
		omOrderKeyInfo.setId(orderDto.getOrderId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omOrderKeyInfo);
		
		omOrderKeyInfo = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmOrderKeyInfoRowMapper);
		return omOrderKeyInfo;
	} 
	

	public OmOrderExtend getOmOrderExtend(OrderDto orderDto, String dataSource) {

		OmOrderExtend omOrderExtend = new OmOrderExtend();
		omOrderExtend.setOrderId(orderDto.getOrderId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omOrderExtend);
		
		omOrderExtend = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmOrderExtendRowMapper);
		return omOrderExtend;
	} 
	

	public OmAgreementDiscount getOmAgreementDiscount(OrderDto orderDto, String dataSource) {

		OmAgreementDiscount omAgreementDiscount = new OmAgreementDiscount();
		omAgreementDiscount.setOrderId(orderDto.getOrderId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omAgreementDiscount);
		
		omAgreementDiscount = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmAgreementDiscountRowMapper);
		return omAgreementDiscount;
	} 
	

	public OmProductDiscount getOmProductDiscount(OrderDto orderDto, String dataSource) {

		OmProductDiscount omProductDiscount = new OmProductDiscount();
		omProductDiscount.setOrderId(orderDto.getOrderId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omProductDiscount);
		
		omProductDiscount = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmProductDiscountRowMapper);
		return omProductDiscount;
	} 
	

	public OmSoAccess getOmSoAccess(OrderDto orderDto, String dataSource) {

		OmSoAccess omSoAccess = new OmSoAccess();
		omSoAccess.setServiceOrderId(orderDto.getOmServiceOrder().getId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omSoAccess);
		
		omSoAccess = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmSoAccessRowMapper);
		return omSoAccess;
	} 
	

	public OmSoSla getOmSoSla(OrderDto orderDto, String dataSource) {

		OmSoSla omSoSla = new OmSoSla();
		omSoSla.setOrderId(orderDto.getOrderId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omSoSla);
		
		omSoSla = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmSoSlaRowMapper);
		return omSoSla;
	} 
	

	public OmIndepProdOrderEvt getOmIndepProdOrderEvt(OrderDto orderDto, String dataSource) {

		OmIndepProdOrderEvt omIndepProdOrderEvt = new OmIndepProdOrderEvt();
		omIndepProdOrderEvt.setServiceOrderId(orderDto.getOmServiceOrder().getId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omIndepProdOrderEvt);
		
		omIndepProdOrderEvt = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmIndepProdOrderEvtRowMapper);
		return omIndepProdOrderEvt;
	} 
	

	public PmIndepProdInst getPmIndepProdInst(OrderDto orderDto, String dataSource) {

		PmIndepProdInst pmIndepProdInst = new PmIndepProdInst();
		pmIndepProdInst.setIndepProdId(orderDto.getOmServiceOrder().getIndepProdId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(pmIndepProdInst);
		
		pmIndepProdInst = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), PmIndepProdInstRowMapper);
		return pmIndepProdInst;
	} 
	

	public PmResAssign getPmResAssign(OrderDto orderDto, String dataSource) {

		PmResAssign pmResAssign = new PmResAssign();
		
		// TODO check the primary key again
		pmResAssign.setId(orderDto.getOrderId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(pmResAssign);
		
		pmResAssign = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), PmResAssignRowMapper);
		return pmResAssign;
	} 
	

	public PmIndepProdInstRes getPmIndepProdInstRes(OrderDto orderDto, String dataSource) {

		PmIndepProdInstRes pmIndepProdInstRes = new PmIndepProdInstRes();
		
		// 产品实例资源配置有两个主键
		pmIndepProdInstRes.setIndepProdInstId(orderDto.getPmIndepProdInst().getId());
		pmIndepProdInstRes.setResAssignId(orderDto.getPmResAssign().getId());
		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(pmIndepProdInstRes);
		
		pmIndepProdInstRes = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), PmIndepProdInstResRowMapper);
		return pmIndepProdInstRes;
	} 
	

	public OmSoResAssign getOmSoResAssign(OrderDto orderDto, String dataSource) {

		OmSoResAssign omSoResAssign = new OmSoResAssign();
		omSoResAssign.setServiceOrderId(orderDto.getOmServiceOrder().getId());		
		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omSoResAssign);
		
		omSoResAssign = jdbcTemplate.queryForObject(asyncSqlDto.getSqlStr(),
				asyncSqlDto.getParams(), OmSoResAssignRowMapper);
		return omSoResAssign;
	} 
	
	
	public List<OmSoAccNbr> getOmSoAccNbrs(OrderDto orderDto, String dataSource) {
		List<OmSoAccNbr> omSoAccNbrs = new ArrayList<>();
		OmSoAccNbr omSoAccNbr = new OmSoAccNbr();
		
		omSoAccNbr.setServiceOrderId(orderDto.getOmServiceOrder().getId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omSoAccNbr);

		omSoAccNbrs = jdbcTemplate.query(asyncSqlDto.getSqlStr(), OmSoAccNbrRowMapper);
		
		return omSoAccNbrs;
	}

	
	public List<OmDependProdOrder> getOmDependProdOrders(OrderDto orderDto, String dataSource) {
		List<OmDependProdOrder> omDependProdOrders = new ArrayList<>();
		OmDependProdOrder omDependProdOrder = new OmDependProdOrder();

		omDependProdOrder.setServiceOrderId(orderDto.getOmServiceOrder().getId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omDependProdOrder);

		omDependProdOrders = jdbcTemplate.query(asyncSqlDto.getSqlStr(), OmDependProdOrderRowMapper);
		
		return omDependProdOrders;
	}



	public List<OmIndepProdOrderAttr> getOmIndepProdOrderAttrs(OrderDto orderDto, String dataSource) {
		List<OmIndepProdOrderAttr> omIndepProdOrderAttrs = new ArrayList<>();
		OmIndepProdOrderAttr omIndepProdOrderAttr = new OmIndepProdOrderAttr();

		omIndepProdOrderAttr.setServiceOrderId(orderDto.getOmServiceOrder().getId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omIndepProdOrderAttr);

		omIndepProdOrderAttrs = jdbcTemplate.query(asyncSqlDto.getSqlStr(), OmIndepProdOrderAttrRowMapper);
		
		return omIndepProdOrderAttrs;
	}



	public List<OmSoParty> getOmSoParties(OrderDto orderDto, String dataSource) {
		List<OmSoParty> omSoPartys = new ArrayList<>();
		OmSoParty omSoParty = new OmSoParty();

		omSoParty.setOrderId(orderDto.getOrderId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omSoParty);

		omSoPartys = jdbcTemplate.query(asyncSqlDto.getSqlStr(), OmSoPartyRowMapper);
		
		return omSoPartys;
	}



	public List<InfOrderRela> getInfOrderRelas(OrderDto orderDto, String dataSource) {
		List<InfOrderRela> infOrderRelas = new ArrayList<>();
		InfOrderRela infOrderRela = new InfOrderRela();

		
		infOrderRela.setServiceOrderId(orderDto.getOmServiceOrder().getId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(infOrderRela);

		infOrderRelas = jdbcTemplate.query(asyncSqlDto.getSqlStr(), InfOrderRelaRowMapper);
		
		return infOrderRelas;
	}



	public List<InfCrmOrderProdReala> getInfCrmOrderProdRealas(OrderDto orderDto, String dataSource) {
		List<InfCrmOrderProdReala> infCrmOrderProdRealas = new ArrayList<>();
		InfCrmOrderProdReala infCrmOrderProdReala = new InfCrmOrderProdReala();

		infCrmOrderProdReala.setOrderId(orderDto.getOrderId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(infCrmOrderProdReala);

		infCrmOrderProdRealas = jdbcTemplate.query(asyncSqlDto.getSqlStr(), InfCrmOrderProdRealaRowMapper);
		
		return infCrmOrderProdRealas;
	}



	public List<OmGroupOrderRela> getOmGroupOrderRelas(OrderDto orderDto, String dataSource) {
		List<OmGroupOrderRela> omGroupOrderRelas = new ArrayList<>();
		OmGroupOrderRela omGroupOrderRela = new OmGroupOrderRela();

		omGroupOrderRela.setServiceOrderId(orderDto.getOmServiceOrder().getId());

		AsyncSqlDto asyncSqlDto = new AsyncSqlDto();
		asyncSqlDto.setDataSource(dataSource);
		asyncSqlDto = SqlBuildUtils.getSelectSql(omGroupOrderRela);

		omGroupOrderRelas = jdbcTemplate.query(asyncSqlDto.getSqlStr(), OmGroupOrderRelaRowMapper);
		
		return omGroupOrderRelas;
	}


