/* Copyright (C) 2013 Interactive Brokers LLC. All rights reserved.  This code is subject to the terms
 * and conditions of the IB API Non-Commercial License or the IB API Commercial License, as applicable. */

package com.ib.client;

/**
 * 佣金报告
 */
public class CommissionReport {

    public String m_execId;//订单执行代号
    public double m_commission;//佣金额
    public String m_currency;//货币
    public double m_realizedPNL;//现实的溢损额
    public double m_yield;//收益率
    //收益率赎回日期
    public int    m_yieldRedemptionDate; // YYYYMMDD format

    public CommissionReport() {
        m_commission = 0;
        m_realizedPNL = 0;
        m_yield = 0;
        m_yieldRedemptionDate = 0;
    }

    @Override
    public boolean equals(Object p_other) {
        if (this == p_other) {
            return true;
        }
        if (!(p_other instanceof CommissionReport)) {
            return false;
        }
        CommissionReport l_theOther = (CommissionReport)p_other;
        return m_execId.equals(l_theOther.m_execId);
    }

    @Override
    public int hashCode() {
        // Since equals() uses m_execId only, the hashCode should do as well.
        return m_execId == null ? 0 : m_execId.hashCode();
    }
}
