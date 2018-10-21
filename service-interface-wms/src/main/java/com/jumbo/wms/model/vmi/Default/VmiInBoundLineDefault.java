package com.jumbo.wms.model.vmi.Default;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Index;
import org.hibernate.annotations.OptimisticLockType;

import com.jumbo.wms.model.BaseModel;

/**
 * Vmi 退换货入库反馈信息明细
 */
@Entity
@Table(name = "T_VMI_INBOUND_LINE")
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.VERSION)
public class VmiInBoundLineDefault extends BaseModel {

    /**
     * 
     */
    private static final long serialVersionUID = -2052328509872744803L;

    /**
     * id
     */
    private Long id;

    /**
     * 数量
     */
    private Long qty;


    private String upc;

    private String extMemo;

    private VmiInBoundDefault ibid;

    /**
     * 版本
     */
    private int version;


    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_VMI_INBOUND_LINE", sequenceName = "S_T_VMI_INBOUND_LINE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VMI_INBOUND_LINE")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Version
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Column(name = "QTY")
    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    @Column(name = "UPC")
    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    @Column(name = "EXT_MEMO")
    public String getExtMemo() {
        return extMemo;
    }

    public void setExtMemo(String extMemo) {
        this.extMemo = extMemo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IB_ID")
    @Index(name = "PK_T_VMI_INBOUND_LINE")
    public VmiInBoundDefault getIbid() {
        return ibid;
    }

    public void setIbid(VmiInBoundDefault ibid) {
        this.ibid = ibid;
    }



}