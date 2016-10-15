package com.kepler.admin.transfer;

import java.io.Serializable;
import java.util.Collection;

import com.kepler.ack.Status;
import com.kepler.host.Host;

/**
 * @author kim 2015年7月24日
 */
public interface Transfers extends Serializable {

	public String service();

	public String version();

	public String method();

	/**
	 * 清理
	 */
	public void clear();

	/**
	 * 重置
	 */
	public void reset();

	/**
	 * 是否为激活状态
	 * 
	 * @return
	 */
	public boolean actived();

	/**
	 * 多个Local -> Target
	 * 
	 * @return
	 */
	public Collection<Transfer> transfers();

	public Transfer get(Host local, Host target);

	public Transfer put(Host local, Host target, Status status, long rtt);
}
