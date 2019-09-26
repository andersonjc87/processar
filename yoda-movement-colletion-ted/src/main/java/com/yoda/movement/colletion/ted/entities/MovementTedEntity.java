package com.yoda.movement.colletion.ted.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movimento_ted_doc")
public class MovementTedEntity {

	@Id
	@Column(name = "cd_movimento_ted_doc")
	private Long movTedDocId;
	
	@Column(name = "cd_tipo_produto")
	private Long typeProdut;
	
	@Column(name = "nr_banco_destinatario")
	private Long destBank;
	
	@Column(name = "nr_agencia_destinatario")
	private Long destAgency;
	
	@Column(name = "nr_conta_destinatario")
	private Long destAccount;
	
	@Column(name = "ds_documento")
	private Long documentMov;
	
	@Column(name = "vl_documento")
	private BigDecimal documentDs;
	
	@Column(name = "cd_tipo_transacao")
	private Long typeTransaction;
	
	@Column(name = "nr_inscricao_destinatario")
	private Long nrInscrDestin;
	
	@Column(name = "nm_destinatario")
	private String nmDesty;
	
	@Column(name = "nr_banco_remetente")
	private Long remetBank;
	
	@Column(name = "nr_agencia_remetente")
	private Long remetAgency;
	
	@Column(name = "nr_conta_remetente")
	private Long remetAccount;
	
	@Column(name = "ds_digito_conta_remetente")
	private String remetAccountDigi;
	
	@Column(name = "cd_tipo_inscricao_remetente")
	private Long remetIncriType;
	
	@Column(name = "nr_inscricao_remetente")
	private Long remetIncry;
	
	@Column(name = "nm_remetente")
	private String remetente;
	
	@Column(name = "dt_movimento")
	private LocalDateTime movementDate;
	
	@Column(name = "dt_geracao")
	private LocalDateTime generetDate;
	
	@Column(name = "cd_transferencia_interbancaria")
	private String transfInterbank;
	
	@Column(name = "in_ted_paga")
	private Boolean tedPaga;
	
	@Column(name = "nr_sequencial")
	private Long sequencial;
	
	@Column(name = "dt_criacao")
	private LocalDateTime creationDate;
	
	@Column(name = "dt_alteracao")
	private LocalDateTime alterationDate;
	
	@Column(name = "ds_status")
	private String status;
	
	@Column(name = "cd_arquivo_linha")
	private Long lineArchive;
	
	@Column(name = "cd_subemissor")
	private Long subemitt;
	
	@Column(name = "nr_tipo_conta_destinatario")
	private Long typeAccountDesty;

	@Column (name = "cd_tipo_inscricao_destinatario")
	private Long typeInscrDesty;
	
	@Column(name = "dt_efetiva")
	private LocalDateTime efetiveDate;
	
	@Column (name = "vl_efetivo")
	private Long efetiveValue;
	
	@Column (name = "cd_tipo_inscricao_favorecido") 
	private Long favorInscrTyp;
	
	@Column (name = "nr_inscricao_favorecido")
	private Long inscrFavor;

	public Long getMovTedDocId() {
		return movTedDocId;
	}

	public void setMovTedDocId(Long movTedDocId) {
		this.movTedDocId = movTedDocId;
	}

	public Long getTypeProdut() {
		return typeProdut;
	}

	public void setTypeProdut(Long typeProdut) {
		this.typeProdut = typeProdut;
	}

	public Long getDestBank() {
		return destBank;
	}

	public void setDestBank(Long destBank) {
		this.destBank = destBank;
	}

	public Long getDestAgency() {
		return destAgency;
	}

	public void setDestAgency(Long destAgency) {
		this.destAgency = destAgency;
	}

	public Long getDestAccount() {
		return destAccount;
	}

	public void setDestAccount(Long destAccount) {
		this.destAccount = destAccount;
	}

	public Long getDocumentMov() {
		return documentMov;
	}

	public void setDocumentMov(Long documentMov) {
		this.documentMov = documentMov;
	}

	public BigDecimal getDocumentDs() {
		return documentDs;
	}

	public void setDocumentDs(BigDecimal documentDs) {
		this.documentDs = documentDs;
	}

	public Long getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(Long typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public Long getNrInscrDestin() {
		return nrInscrDestin;
	}

	public void setNrInscrDestin(Long nrInscrDestin) {
		this.nrInscrDestin = nrInscrDestin;
	}

	public String getNmDesty() {
		return nmDesty;
	}

	public void setNmDesty(String nmDesty) {
		this.nmDesty = nmDesty;
	}

	public Long getRemetBank() {
		return remetBank;
	}

	public void setRemetBank(Long remetBank) {
		this.remetBank = remetBank;
	}

	public Long getRemetAgency() {
		return remetAgency;
	}

	public void setRemetAgency(Long remetAgency) {
		this.remetAgency = remetAgency;
	}

	public Long getRemetAccount() {
		return remetAccount;
	}

	public void setRemetAccount(Long remetAccount) {
		this.remetAccount = remetAccount;
	}

	public String getRemetAccountDigi() {
		return remetAccountDigi;
	}

	public void setRemetAccountDigi(String remetAccountDigi) {
		this.remetAccountDigi = remetAccountDigi;
	}

	public Long getRemetIncriType() {
		return remetIncriType;
	}

	public void setRemetIncriType(Long remetIncriType) {
		this.remetIncriType = remetIncriType;
	}

	public Long getRemetIncry() {
		return remetIncry;
	}

	public void setRemetIncry(Long remetIncry) {
		this.remetIncry = remetIncry;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public LocalDateTime getMovementDate() {
		return movementDate;
	}

	public void setMovementDate(LocalDateTime movementDate) {
		this.movementDate = movementDate;
	}

	public LocalDateTime getGeneretDate() {
		return generetDate;
	}

	public void setGeneretDate(LocalDateTime generetDate) {
		this.generetDate = generetDate;
	}

	public String getTransfInterbank() {
		return transfInterbank;
	}

	public void setTransfInterbank(String transfInterbank) {
		this.transfInterbank = transfInterbank;
	}

	public Boolean getTedPaga() {
		return tedPaga;
	}

	public void setTedPaga(Boolean tedPaga) {
		this.tedPaga = tedPaga;
	}

	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
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

	public Long getLineArchive() {
		return lineArchive;
	}

	public void setLineArchive(Long lineArchive) {
		this.lineArchive = lineArchive;
	}

	public Long getSubemitt() {
		return subemitt;
	}

	public void setSubemitt(Long subemitt) {
		this.subemitt = subemitt;
	}

	public Long getTypeAccountDesty() {
		return typeAccountDesty;
	}

	public void setTypeAccountDesty(Long typeAccountDesty) {
		this.typeAccountDesty = typeAccountDesty;
	}

	public Long getTypeInscrDesty() {
		return typeInscrDesty;
	}

	public void setTypeInscrDesty(Long typeInscrDesty) {
		this.typeInscrDesty = typeInscrDesty;
	}

	public LocalDateTime getEfetiveDate() {
		return efetiveDate;
	}

	public void setEfetiveDate(LocalDateTime efetiveDate) {
		this.efetiveDate = efetiveDate;
	}

	public Long getEfetiveValue() {
		return efetiveValue;
	}

	public void setEfetiveValue(Long efetiveValue) {
		this.efetiveValue = efetiveValue;
	}

	public Long getFavorInscrTyp() {
		return favorInscrTyp;
	}

	public void setFavorInscrTyp(Long favorInscrTyp) {
		this.favorInscrTyp = favorInscrTyp;
	}

	public Long getInscrFavor() {
		return inscrFavor;
	}

	public void setInscrFavor(Long inscrFavor) {
		this.inscrFavor = inscrFavor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovementTedEntity [movTedDocId=");
		builder.append(movTedDocId);
		builder.append(", typeProdut=");
		builder.append(typeProdut);
		builder.append(", destBank=");
		builder.append(destBank);
		builder.append(", destAgency=");
		builder.append(destAgency);
		builder.append(", destAccount=");
		builder.append(destAccount);
		builder.append(", documentMov=");
		builder.append(documentMov);
		builder.append(", documentDs=");
		builder.append(documentDs);
		builder.append(", typeTransaction=");
		builder.append(typeTransaction);
		builder.append(", nrInscrDestin=");
		builder.append(nrInscrDestin);
		builder.append(", nmDesty=");
		builder.append(nmDesty);
		builder.append(", remetBank=");
		builder.append(remetBank);
		builder.append(", remetAgency=");
		builder.append(remetAgency);
		builder.append(", remetAccount=");
		builder.append(remetAccount);
		builder.append(", remetAccountDigi=");
		builder.append(remetAccountDigi);
		builder.append(", remetIncriType=");
		builder.append(remetIncriType);
		builder.append(", remetIncry=");
		builder.append(remetIncry);
		builder.append(", remetente=");
		builder.append(remetente);
		builder.append(", movementDate=");
		builder.append(movementDate);
		builder.append(", generetDate=");
		builder.append(generetDate);
		builder.append(", transfInterbank=");
		builder.append(transfInterbank);
		builder.append(", tedPaga=");
		builder.append(tedPaga);
		builder.append(", sequencial=");
		builder.append(sequencial);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", alterationDate=");
		builder.append(alterationDate);
		builder.append(", status=");
		builder.append(status);
		builder.append(", lineArchive=");
		builder.append(lineArchive);
		builder.append(", subemitt=");
		builder.append(subemitt);
		builder.append(", typeAccountDesty=");
		builder.append(typeAccountDesty);
		builder.append(", typeInscrDesty=");
		builder.append(typeInscrDesty);
		builder.append(", efetiveDate=");
		builder.append(efetiveDate);
		builder.append(", efetiveValue=");
		builder.append(efetiveValue);
		builder.append(", favorInscrTyp=");
		builder.append(favorInscrTyp);
		builder.append(", inscrFavor=");
		builder.append(inscrFavor);
		builder.append("]");
		return builder.toString();
	}
}
