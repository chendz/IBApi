/* Copyright (C) 2013 Interactive Brokers LLC. All rights reserved.  This code is subject to the terms
 * and conditions of the IB API Non-Commercial License or the IB API Commercial License, as applicable. */

package com.ib.client;

public class Execution {
    private int 	m_orderId;//订单代号
    private int 	m_clientId;//下达订单的客户代号
    private String 	m_execId;//独特的订单执行代号
    private String 	m_time;//订单执行时间
    private String 	m_acctNumber;//客户的账号号码
    private String 	m_exchange;//执行订单的交易所
    private String 	m_side;//确定交易是卖出或买进，值为BOT买进和SLD卖出
    private double 	m_shares;//执行的股数
    private double 	m_price;//订单的执行价格，不包括佣金
    private int		m_permId;//用于确定订单的TWS代号，在整个TWS运行期间保持不变
    private int     m_liquidation;//确认在必要时最后清算的头寸
    private double	m_cumQty;//累积数量。用于正常交易，组合交易和组合边
    private double	m_avgPrice;//平均价格
    private String  m_orderRef;//
    private String 	m_evRule;
    private double 	m_evMultiplier;//在价格改变是1的情况下，合约的市值改变大约是多少
    private String m_modelCode;

    // Get
    public int orderId()         { return m_orderId; }
    public int clientId()        { return m_clientId; }
    public String execId()       { return m_execId; }
    public String time()         { return m_time; }
    public String acctNumber()   { return m_acctNumber; }
    public String exchange()     { return m_exchange; }
    public String side()         { return m_side; }
    public double shares()          { return m_shares; }
    public double price()        { return m_price; }
    public int permId()          { return m_permId; }
    public int liquidation()     { return m_liquidation; }
    public double cumQty()          { return m_cumQty; }
    public double avgPrice()     { return m_avgPrice; }
    public String orderRef()     { return m_orderRef; }
    public String evRule()       { return m_evRule; }
    public double evMultiplier() { return m_evMultiplier; }
    public String modelCode()    { return m_modelCode; }
    
    // Set 
    public void orderId(int orderId)              { m_orderId = orderId; }
    public void clientId(int clientId)            { m_clientId = clientId; }
    public void execId(String execId)             { m_execId = execId; }
    public void time(String time)                 { m_time = time; }
    public void acctNumber(String acctNumber)     { m_acctNumber = acctNumber; }
    public void exchange(String exchange)         { m_exchange = exchange; }
    public void side(String side)                 { m_side = side; }
    public void shares(double shares)                { m_shares = shares; }
    public void price(double price)               { m_price = price; }
    public void permId(int permId)                { m_permId = permId; }
    public void liquidation(int liquidation)      { m_liquidation = liquidation; }
    public void cumQty(double cumQty)             { m_cumQty = cumQty; }
    public void avgPrice(double avgPrice)         { m_avgPrice = avgPrice; }
    public void orderRef(String orderRef)         { m_orderRef = orderRef; }
    public void evRule(String evRule)             { m_evRule = evRule; }
    public void evMultiplier(double evMultiplier) { m_evMultiplier = evMultiplier; }
    public void modelCode(String modelCode)       { m_modelCode = modelCode; }
    
    public Execution() {
        m_orderId = 0;
        m_clientId = 0;
        m_shares = 0;
        m_price = 0;
        m_permId = 0;
        m_liquidation = 0;
        m_cumQty = 0;
        m_avgPrice = 0;
        m_evMultiplier = 0;
    }

    public Execution( int p_orderId, int p_clientId, String p_execId, String p_time,
                      String p_acctNumber, String p_exchange, String p_side, int p_shares,
                      double p_price, int p_permId, int p_liquidation, int p_cumQty,
                      double p_avgPrice, String p_orderRef, String p_evRule, double p_evMultiplier,
                      String p_modelCode) {
        m_orderId = p_orderId;
        m_clientId = p_clientId;
        m_execId = p_execId;
        m_time = p_time;
      	m_acctNumber = p_acctNumber;
      	m_exchange = p_exchange;
      	m_side = p_side;
      	m_shares = p_shares;
      	m_price = p_price;
        m_permId = p_permId;
        m_liquidation = p_liquidation;
        m_cumQty = p_cumQty;
        m_avgPrice = p_avgPrice;
        m_orderRef = p_orderRef;
        m_evRule = p_evRule;
        m_evMultiplier = p_evMultiplier;
        m_modelCode = p_modelCode;
    }

    @Override
    public boolean equals(Object p_other) {
        if (this == p_other) {
            return true;
        }
        if (!(p_other instanceof Execution)) {
            return false;
        }
        Execution l_theOther = (Execution)p_other;
        return m_execId.equals(l_theOther.m_execId);
    }

    @Override
    public int hashCode() {
        // Since equals() uses m_execId only, the hashCode should do as well.
        return m_execId != null ? m_execId.hashCode() : 0;
    }
}
