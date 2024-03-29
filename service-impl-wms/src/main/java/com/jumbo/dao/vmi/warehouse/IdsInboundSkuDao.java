package com.jumbo.dao.vmi.warehouse;

import loxia.dao.GenericEntityDao;

import org.springframework.transaction.annotation.Transactional;

import com.jumbo.wms.model.warehouse.IdsInboundSku;

@Transactional
public interface IdsInboundSkuDao extends GenericEntityDao<IdsInboundSku, Long> {

}
