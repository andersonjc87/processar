package com.yoda.movement.colletion.ted.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movimento_cobranca")
public class MovementColletionEntity {
    
    @Id
    @Column(name = "cd_movimento_cobranca")
    private Long movColletionId;
    
    @Column(name = "cd_arquivo_linha")
	private Long lineArchive;
    
    @Column(name = "cd_tipo_transacao")
	private Long typeTransfer;
    
    @Column(name = "cd_subemissor")
	private Long subemitt;
    
    @Column(name = "nr_banco")
	private Long bank;
    
    @Column(name = "dt_criacao")
	private LocalDateTime creationDate;
    
    @Column(name = "dt_alteracao")
	private LocalDateTime alterationDate;
    
    @Column(name = "ds_status")
	private String status;
    
    @Column(name = "cd_tipo_inscricao")
	private Long incriType;
    
    @Column(name = "ds_inscricao")
	private Long incription;
    
    @Column(name = "ds_nosso_numero")
	private String numberOur;
    
    @Column(name = "ds_seu_numero")
	private String numberYour;
    
    @Column(name = "dt_vencimento")
	private LocalDateTime maturityDate;
    
    @Column(name = "vl_nominal")
	private BigDecimal nominal;
    
    @Column(name = "vl_tarifa_cobranca")
	private BigDecimal colletionRate;
    
    @Column(name = "vl_outros_debitos")
	private BigDecimal otherDebit;
    
    @Column(name = "vl_iof")
	private BigDecimal iofValue;
    
    @Column(name = "vl_abatimento")
	private BigDecimal abatimentoValue;
    
    @Column(name = "vl_pago")
	private BigDecimal pagoValue;
    
    @Column(name = "vl_desconto")
	private BigDecimal descontValue;
    
    @Column(name = "vl_mora")
	private BigDecimal moraValue;
    
    @Column(name = "vl_outros_creditos")
	private BigDecimal otherCredit;
    
    @Column(name = "dt_credito")
	private LocalDateTime creditDate;
    
    @Column(name = "nr_agencia")
	private Long agencyNumber;
    
    @Column(name = "nr_conta")
	private Long accountNumber;
    
    @Column(name = "nr_sequencial")
	private Long sequencialNumber;
    
    @Column(name = "nm_contraparte")
	private String contraParteName;
    
    @Column(name = "nr_documento")
	private Long docNumber;
    
	@Column(name = "cd_arquivo_linha_u")
	private Long arqLineU;
	
	@Column (name = "ds_titulo_cdt")
	private String titleCdt;
	
	@Column (name = "dt_ocorrencia")
	private LocalDateTime OccurDate;
	 
	@Column (name = "vl_liquido")
	private BigDecimal liquiValue;
	
	@Column (name = "dt_emissao")
	private LocalDateTime emissDate;
	
	@Column (name = "tx_codigo_barras")
	private String codeBarra;
	
	@Column (name = "nm_pagador")
	private String pagName;
	
	@Column (name = "cd_tipo_inscricao_favorecido")
	private Long inscTypFavor;
	
	

	public Long getMovColletionId() {
		return movColletionId;
	}

	public void setMovColletionId(Long movColletionId) {
		this.movColletionId = movColletionId;
	}

	public Long getLineArchive() {
		return lineArchive;
	}

	public void setLineArchive(Long lineArchive) {
		this.lineArchive = lineArchive;
	}

	public Long getTypeTransfer() {
		return typeTransfer;
	}

	public void setTypeTransfer(Long typeTransfer) {
		this.typeTransfer = typeTransfer;
	}

	public Long getSubemitt() {
		return subemitt;
	}

	public void setSubemitt(Long subemitt) {
		this.subemitt = subemitt;
	}

	public Long getBank() {
		return bank;
	}

	public void setBank(Long bank) {
		this.bank = bank;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getAlterationDate() {
		return alterationDate;
	}

	public void setAlterationDate(LocalDateTime alterationDate) {
		this.alterationDate = alterationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getIncriType() {
		return incriType;
	}

	public void setIncriType(Long incriType) {
		this.incriType = incriType;
	}

	public Long getIncription() {
		return incription;
	}

	public void setIncription(Long incription) {
		this.incription = incription;
	}

	public String getNumberOur() {
		return numberOur;
	}

	public void setNumberOur(String numberOur) {
		this.numberOur = numberOur;
	}

	public String getNumberYour() {
		return numberYour;
	}

	public void setNumberYour(String numberYour) {
		this.numberYour = numberYour;
	}

	public LocalDateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getNominal() {
		return nominal;
	}

	public void setNominal(BigDecimal nominal) {
		this.nominal = nominal;
	}

	public BigDecimal getColletionRate() {
		return colletionRate;
	}

	public void setColletionRate(BigDecimal colletionRate) {
		this.colletionRate = colletionRate;
	}

	public BigDecimal getOtherDebit() {
		return otherDebit;
	}

	public void setOtherDebit(BigDecimal otherDebit) {
		this.otherDebit = otherDebit;
	}

	public BigDecimal getIofValue() {
		return iofValue;
	}

	public void setIofValue(BigDecimal iofValue) {
		this.iofValue = iofValue;
	}

	public BigDecimal getAbatimentoValue() {
		return abatimentoValue;
	}

	public void setAbatimentoValue(BigDecimal abatimentoValue) {
		this.abatimentoValue = abatimentoValue;
	}

	public BigDecimal getPagoValue() {
		return pagoValue;
	}

	public void setPagoValue(BigDecimal pagoValue) {
		this.pagoValue = pagoValue;
	}

	public BigDecimal getDescontValue() {
		return descontValue;
	}

	public void setDescontValue(BigDecimal descontValue) {
		this.descontValue = descontValue;
	}

	public BigDecimal getMoraValue() {
		return moraValue;
	}

	public void setMoraValue(BigDecimal moraValue) {
		this.moraValue = moraValue;
	}

	public BigDecimal getOtherCredit() {
		return otherCredit;
	}

	public void setOtherCredit(BigDecimal otherCredit) {
		this.otherCredit = otherCredit;
	}

	public LocalDateTime getCreditDate() {
		return creditDate;
	}

	public void setCreditDate(LocalDateTime creditDate) {
		this.creditDate = creditDate;
	}

	public Long getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(Long agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getSequencialNumber() {
		return sequencialNumber;
	}

	public void setSequencialNumber(Long sequencialNumber) {
		this.sequencialNumber = sequencialNumber;
	}

	public String getContraParteName() {
		return contraParteName;
	}

	public void setContraParteName(String contraParteName) {
		this.contraParteName = contraParteName;
	}

	public Long getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(Long docNumber) {
		this.docNumber = docNumber;
	}

	public Long getArqLineU() {
		return arqLineU;
	}

	public void setArqLineU(Long arqLineU) {
		this.arqLineU = arqLineU;
	}

	public String getTitleCdt() {
		return titleCdt;
	}

	public void setTitleCdt(String titleCdt) {
		this.titleCdt = titleCdt;
	}

	public LocalDateTime getOccurDate() {
		return OccurDate;
	}

	public void setOccurDate(LocalDateTime occurDate) {
		OccurDate = occurDate;
	}

	public BigDecimal getLiquiValue() {
		return liquiValue;
	}

	public void setLiquiValue(BigDecimal liquiValue) {
		this.liquiValue = liquiValue;
	}

	public LocalDateTime getEmissDate() {
		return emissDate;
	}

	public void setEmissDate(LocalDateTime emissDate) {
		this.emissDate = emissDate;
	}

	public String getCodeBarra() {
		return codeBarra;
	}

	public void setCodeBarra(String codeBarra) {
		this.codeBarra = codeBarra;
	}

	public String getPagName() {
		return pagName;
	}

	public void setPagName(String pagName) {
		this.pagName = pagName;
	}

	public Long getInscTypFavor() {
		return inscTypFavor;
	}

	public void setInscTypFavor(Long inscTypFavor) {
		this.inscTypFavor = inscTypFavor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovementColletionEntity [movColletionId=");
		builder.append(movColletionId);
		builder.append(", lineArchive=");
		builder.append(lineArchive);
		builder.append(", typeTransfer=");
		builder.append(typeTransfer);
		builder.append(", subemitt=");
		builder.append(subemitt);
		builder.append(", bank=");
		builder.append(bank);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", alterationDate=");
		builder.append(alterationDate);
		builder.append(", status=");
		builder.append(status);
		builder.append(", incriType=");
		builder.append(incriType);
		builder.append(", incription=");
		builder.append(incription);
		builder.append(", numberOur=");
		builder.append(numberOur);
		builder.append(", numberYour=");
		builder.append(numberYour);
		builder.append(", maturityDate=");
		builder.append(maturityDate);
		builder.append(", nominal=");
		builder.append(nominal);
		builder.append(", colletionRate=");
		builder.append(colletionRate);
		builder.append(", otherDebit=");
		builder.append(otherDebit);
		builder.append(", iofValue=");
		builder.append(iofValue);
		builder.append(", abatimentoValue=");
		builder.append(abatimentoValue);
		builder.append(", pagoValue=");
		builder.append(pagoValue);
		builder.append(", descontValue=");
		builder.append(descontValue);
		builder.append(", moraValue=");
		builder.append(moraValue);
		builder.append(", otherCredit=");
		builder.append(otherCredit);
		builder.append(", creditDate=");
		builder.append(creditDate);
		builder.append(", agencyNumber=");
		builder.append(agencyNumber);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", sequencialNumber=");
		builder.append(sequencialNumber);
		builder.append(", contraParteName=");
		builder.append(contraParteName);
		builder.append(", docNumber=");
		builder.append(docNumber);
		builder.append(", arqLineU=");
		builder.append(arqLineU);
		builder.append(", titleCdt=");
		builder.append(titleCdt);
		builder.append(", OccurDate=");
		builder.append(OccurDate);
		builder.append(", liquiValue=");
		builder.append(liquiValue);
		builder.append(", emissDate=");
		builder.append(emissDate);
		builder.append(", codeBarra=");
		builder.append(codeBarra);
		builder.append(", pagName=");
		builder.append(pagName);
		builder.append(", inscTypFavor=");
		builder.append(inscTypFavor);
		builder.append("]");
		return builder.toString();
	}
    
}
