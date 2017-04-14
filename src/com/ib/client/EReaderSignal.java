package com.ib.client;

/**
 * 信号灯接口
 */
public interface EReaderSignal {
	void issueSignal();
    void waitForSignal();
}
