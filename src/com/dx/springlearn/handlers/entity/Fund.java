package com.dx.springlearn.handlers.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Fund implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer fund_id;
	private Integer user_id;
	private String bankCard;
	private String payPass;
	private BigDecimal BTC;
	private BigDecimal ETH;
	private BigDecimal EOS;
	private BigDecimal USDT;
	private BigDecimal TXBC;

	public Integer getFund_id() {
		return fund_id;
	}

	public void setFund_id(Integer fund_id) {
		this.fund_id = fund_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getPayPass() {
		return payPass;
	}

	public void setPayPass(String payPass) {
		this.payPass = payPass;
	}

	public BigDecimal getBTC() {
		return BTC;
	}

	public void setBTC(BigDecimal bTC) {
		BTC = bTC;
	}

	public BigDecimal getETH() {
		return ETH;
	}

	public void setETH(BigDecimal eTH) {
		ETH = eTH;
	}

	public BigDecimal getEOS() {
		return EOS;
	}

	public void setEOS(BigDecimal eOS) {
		EOS = eOS;
	}

	public BigDecimal getUSDT() {
		return USDT;
	}

	public void setUSDT(BigDecimal uSDT) {
		USDT = uSDT;
	}

	public BigDecimal getTXBC() {
		return TXBC;
	}

	public void setTXBC(BigDecimal tXBC) {
		TXBC = tXBC;
	}

	@Override
	public String toString() {
		return "Fund [fund_id=" + fund_id + ", user_id=" + user_id + ", bankCard=" + bankCard + ", payPass=" + payPass
				+ ", BTC=" + BTC + ", ETH=" + ETH + ", EOS=" + EOS + ", USDT=" + USDT + ", TXBC=" + TXBC + "]";
	}

	public Fund(Integer fund_id, Integer user_id, String bankCard, String payPass, BigDecimal bTC, BigDecimal eTH,
			BigDecimal eOS, BigDecimal uSDT, BigDecimal tXBC) {
		super();
		this.fund_id = fund_id;
		this.user_id = user_id;
		this.bankCard = bankCard;
		this.payPass = payPass;
		BTC = bTC;
		ETH = eTH;
		EOS = eOS;
		USDT = uSDT;
		TXBC = tXBC;
	}

	public Fund() {
		super();
		// TODO Auto-generated constructor stub
	}

}
