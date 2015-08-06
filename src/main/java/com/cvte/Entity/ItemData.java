package com.cvte.Entity;

public class ItemData {
	private String Des;
	private String ProdModel;
	private String ApplyBu;
	private String FunId;
	private String ProdName;
	private String EditClassify;
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		this.Des = des;
	}
	public String getProdModel() {
		return ProdModel;
	}
	public void setProdModel(String prodModel) {
		this.ProdModel = prodModel;
	}
	public String getApplyBu() {
		return ApplyBu;
	}
	public void setApplyBu(String applyBu) {
		this.ApplyBu = applyBu;
	}
	public String getFunId() {
		return FunId;
	}
	public void setFunId(String funId) {
		this.FunId = funId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		this.ProdName = prodName;
	}
	public String getEditClassify() {
		return EditClassify;
	}
	public void setEditClassify(String editClassify) {
		this.EditClassify = editClassify;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str=Des+"  "+ProdModel+"  "+ApplyBu+"  "+FunId+"  "+ProdName+"  "+EditClassify;
		return str;
	}
	
}
