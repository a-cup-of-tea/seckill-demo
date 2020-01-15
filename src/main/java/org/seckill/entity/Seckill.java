package org.seckill.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

//TODO 替代JDK8的LocalDate替代Date
@Repository
public class Seckill {
	/**
	 * 商品库存id
	 */
	private long seckillId;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 库存数量
	 */
	private int number;
	/**
	 * 秒杀开始时间
	 */
	private Date startTime;
	/**
	 * 秒杀结束时间
	 */
	private Date endTime;
	/**
	 * 创建时间
	 */
	private Date createTime;

	public long getSeckillId() {	return this.seckillId;	}
	public void setSeckillId(long seckillId) {	this.seckillId = seckillId;	}
	public String getName() {	return this.name;	}
	public void setName(String name) {	this.name = name;	}
	public int getNumber() {	return this.number;	}
	public void setNumber(int number) {	this.number = number;	}
	public Date getStartTime() {	return this.startTime;	}
	public void setStartTime(Date startTime) {	this.startTime = startTime;	}
	public Date getEndTime() {	return this.endTime;	}
	public void setEndTime(Date endTime) {	this.endTime = endTime;	}
	public Date getCreateTime() {	return this.createTime;	}
	public void setCreateTime(Date createTime) {	this.createTime = createTime;	}

	@Override
	public String toString() {
		return "Seckill{" +
				"seckillId=" + seckillId +
				", name='" + name + '\'' +
				", number=" + number +
				", startTime=" + startTime +
				", endTime=" + endTime +
				", createTime=" + createTime +
				'}';
	}
}
