package com.myjs.doc.documents.Action;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.myjs.doc.documents.model.LDocOtherdocs;
import com.myjs.doc.documents.service.docService;
import com.myjs.cek.recordcheckform.model.LCekSignedCaseInfo;
import com.myjs.commons.AbstractAction;
import com.myjs.commons.ErrorMsgControl;

public class docAction extends AbstractAction {

	private static final long serialVersionUID = -8355626774003201809L;

	private static final Logger log = LogManager.getLogger(docAction.class);

	private docService docService;
	
	public docService getDocService() {
		return docService;
	}


	public void setDocService(docService docService) {
		this.docService = docService;
	}

	public String loadCaseInfo() {
		try {
			log.debug("loadCaseInfo start");
			String caseId = super.getRequest().getParameter("iptsearchcaseId"),
					userId = super.getRequest().getParameter("userId"),
					debtorName = super.getRequest().getParameter("iptsearchdebtorName"),
					debtorId = super.getRequest().getParameter("iptsearchdebtorID"),
					docNo = super.getRequest().getParameter("iptsearchdocNo"),
					legalCaseId = super.getRequest().getParameter("iptsearchLawCaseId");
			log.debug(
					"caseId = {}, userId = {}, customerName = {}, customerId = {} ," + "docNo = {} , legalCaseId = {}",
					caseId, userId, debtorName, debtorId, docNo, legalCaseId);

			List<LCekSignedCaseInfo> LCekSignedCaseInfoList = docService.findByProperty(caseId, debtorName,
					debtorId, docNo, legalCaseId);

			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
			JsonObject jsonResponse = new JsonObject();
			jsonResponse.add("data", gson.toJsonTree(LCekSignedCaseInfoList));
			String responseLCekSignedCaseInfoList = jsonResponse.toString();

			log.debug("responsedata = {}", responseLCekSignedCaseInfoList);
			printToResponse(responseLCekSignedCaseInfoList);
		} catch (Exception e) {
			sendException(e);
			log.error("loadCaseInfo error ms=>", e);
		}
		return NONE;
	}
	
	/**
	 * Add By Jia 2017-06-07 
	 * 初始化下拉選單
	 */
	public String initSelectOption(){
		try{
			log.debug("=====initSelectOption start=====");
			String returnValue = docService.findDocaddSelectOption();
			
			log.debug("returnValue = {}", returnValue);
			printToResponse(returnValue);
		}catch(Exception e){
			sendException(e);
			log.error("initSelectOption error msg==>", e);
		}
		return NONE;
	}
	
	/**
	 * Add By Jia 2017-06-14
	 * 儲存新增文件
	 */
	public String saveaddDoc(){
		try{
			log.debug("=====saveaddDoc start=====");
			String docinfoJson = super.getRequest().getParameter("returnOther"),
					otherdocsJson = super.getRequest().getParameter("returnOther");

			log.debug("other = {}", otherdocsJson);
			
			String response = docService.saveaddDoc(docinfoJson, otherdocsJson);
			printToResponse(response);
			
		}catch(Exception e){
			sendException(e);
			log.error("saveaddDoc error msg===>", e);
		}
		return NONE;
	}
}
