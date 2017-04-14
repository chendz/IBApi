package com.ib.client;

import java.util.ArrayList;

/**
 * 合约查找
 */
public interface ContractLookuper {
	ArrayList<ContractDetails> lookupContract(Contract contract);
}