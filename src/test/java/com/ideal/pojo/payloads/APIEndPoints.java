package com.ideal.pojo.payloads;
//enum is special class in java which has collection of constants or  methods
public enum APIEndPoints {
	
	haciendaPing("/ping"),
	haciendaCompliance("/compliance"),
	haciendaAuth("/authorize"),
	haciendaCompDocs("/complianceDocuments"),
	
	estadoPing("/ping"),
	estadoCompliance("/compliance"),
	estadoCertificate("/certificate"),
	
	asgPing("/ping"),
	genToken("/token"),
	rulCompliance("/rul/compliance"),
	rulCertificate("/rul/certificate"),
	rupCompliance("/rup/compliance"),
	rupCertificate("/rup/certificate"),
	
	crimPing("/ping"),
	crimgenToken("/token"),
	crimCompliance("/compliance"),
	crimCertificate("/certificate"),
	
	patronosToken("/token"),
	indToken("/token"),
	patronosCert("/getemployerstatus"),
	indCert("/getparticipantstatus"),
	
	
	cfsePing("/ping"),
	cfseToken("/account/login"),
	cfseDebt("/debt/660917729"),
	cfseDebtcerts("/certificationrequest/debtcerts/"),
	cfsePolicycerts("/certificationrequest/policycerts/"),
	
	
	
	getPhoto("/photo/4725012"),
	getLicence("/license/4725012"),
	
	
	justiciaCap("/request"),
	justiciaRetrieve(":443/v1/api/rap/retrieve?tx_id=060320210207"),
	justiciaValidate("/retrieve?tx_id=4920211303"),
	justiciaCriminalRecord("/check"),
	
			
	
	
	CompAgentSave("/Save"),
	
	CompDashKPI("/dashboardKPI"),
	CompDashBoardSearch("/dashboardsearch"),
	
	CompilancePing("/Ping"),
	
	CompCertificateCitizenDetails("/Details"),	
	CertificateCorporateDetails("/Details"),
	CompCertificateCitizenNote("/Notes"),
	CertificateCorporateNote("/Notes"),
	
	HaciendaCertificate("/hacienda"),
	CRIMCertificate("/CRIM"),
	LaborCertificate("/Labor"),
	AsumeCertificate("/Asume"),
	JusticiaCertificate("/Justicia"),
	CFSECertificate("/CFSE"),
	ASGCertificate("/ASG"),
	DTOPCertificate("/DTOP"),
	StateCertificate("/State"),
	
	CitizenSearch("/Search"),
	CitizenConsent("/Consent"),
	CitizenResendConsent("/ResendConsent"),
	CitizenManualConsent("/ManualConsent"),
	CitizenRetryAgency("/RetryAgency"),
	
	CorporateSearch("/Search"),
	CorporateConsent("/Consent"),
	CorporateResendConsent("/ResendConsent"),
	CorporateManualConsent("/ManualConsent"),
	CorporateRetryAgency("/RetryAgency"),
	
	
	CompRef_SearchStatus("/SearchStatus"),
	CompRef_CorporateSearchReasons("/CorporateSearchReasons"),
	CompRef_CitizenSearchReasons("CitizenSearchReasons"),
	CompRef_Towns("/Towns"),
	CompRef_CompanyClass("/CompanyClass"),
	CompRef_CompanyType("/CompanyType"),
	CompRef_Jurisdiction("/Jurisdiction");
	
	
	private String resource;
	
	APIEndPoints(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
