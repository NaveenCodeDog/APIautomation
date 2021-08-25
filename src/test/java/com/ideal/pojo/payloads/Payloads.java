package com.ideal.pojo.payloads;

import com.ideal.pojo.payloads.Compilance.Agency.Agency;
import com.ideal.pojo.payloads.Compilance.Agency.Request;
import com.ideal.pojo.payloads.Compilance.Agency.Response;
import com.ideal.pojo.payloads.Compilance.Agent.DashboardSearch;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateASG;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateAsume;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateCFSE;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateCRIM;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateCitizenDetails;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateCitizenNote;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateCorporateDetails;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateCorporateNote;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateDTOP;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateHacienda;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateJusticia;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateLabor;
import com.ideal.pojo.payloads.Compilance.Certificate.CertificateState;
import com.ideal.pojo.payloads.Compilance.Citizen.CitizenSearch;
import com.ideal.pojo.payloads.Compilance.Corporate.CorporateSearch;
import com.ideal.pojo.payloads.asg.GenTokens;
import com.ideal.pojo.payloads.asg.RulCertificate;
import com.ideal.pojo.payloads.asg.RulCompliance;
import com.ideal.pojo.payloads.asg.RupCertificate;
import com.ideal.pojo.payloads.asg.RupCompliance;
import com.ideal.pojo.payloads.asume.GetIndivisualToken;
import com.ideal.pojo.payloads.asume.GetPatronoToken;
import com.ideal.pojo.payloads.asume.IndivisualCertificate;
import com.ideal.pojo.payloads.asume.PatronCertificate;
import com.ideal.pojo.payloads.cfse.CFSETokenGen;
import com.ideal.pojo.payloads.crim.CrimCertificate;
import com.ideal.pojo.payloads.crim.CrimCompliance;
import com.ideal.pojo.payloads.crim.CrimGenTokens;
import com.ideal.pojo.payloads.dtop.GetLicence;
import com.ideal.pojo.payloads.dtop.GetPhoto;
import com.ideal.pojo.payloads.estado.EstadoCertificate;
import com.ideal.pojo.payloads.estado.EstadoCompliance;
import com.ideal.pojo.payloads.hacienda.Authorize;
import com.ideal.pojo.payloads.hacienda.Compliance;
import com.ideal.pojo.payloads.hacienda.ComplianceDocuments;
import com.ideal.pojo.payloads.hacienda.JusticiaCriminalCheck;

public class Payloads {
	
	// Payload for Hacienda
	
	public Compliance haciendaPayload() {
		Compliance comp = new Compliance();
		comp.idType="2";
		comp.id="990909090";
		comp.firstName="";
		comp.lastName="";
		comp.secondLastName="";
		comp.businessName="Sport   INC";
		comp.merchantId="";
		return comp;			
	}
	
	public Compliance haciendaPayloadInvalidID() {
		Compliance comp = new Compliance();
		comp.idType="2";
		comp.id="1111111111";
		comp.firstName="";
		comp.lastName="";
		comp.secondLastName="";
		comp.businessName="Sport   INC";
		comp.merchantId="";
		return comp;			
	}
	
	
	

	public Authorize haciendaAuthPayload() {
		Authorize auth1 = new Authorize();
		auth1.idType="1";
		auth1.id="019321186";
		auth1.firstName="ROMELIA";
		auth1.lastName="VANTASSEL";
		auth1.secondLastName="";
		auth1.businessName="Sport   INC";		
		auth1.email="dpolanco@prits.pr.gov";
		auth1.agency="PRITS";
		return auth1;			
	}
	
	public ComplianceDocuments haciendaCompDocsPayload() {
		ComplianceDocuments cd = new ComplianceDocuments();
		cd.idType="1";
		cd.id="019321186";
		cd.firstName="ROMELIA";
		cd.lastName="VANTASSEL";
		cd.secondLastName="";
		cd.businessName="";	
		cd.merchantId="";
		cd.filingCertificate=true;
		cd.filingCertificateSUT=true;
		cd.debtCertificate=true;
		cd.merchantCertificate=true;
		cd.waiver=true;
		cd.requestorEmail="dpolanco@prits.pr.gov";		
		return cd;			
	}
	
	// Payload for Estado
	
	public EstadoCompliance EstadoCompPayload() {
		EstadoCompliance e1 = new EstadoCompliance();
		e1.registerNumber="19749";
		e1.corpClass="1";
		e1.corpType="1";
		e1.jurisdiction="1";
		
		return e1;			
	}
	
	public EstadoCertificate EstadoCertPayload() {
		EstadoCertificate e2 = new EstadoCertificate();
		e2.registerNumber="402587";
		e2.corpClass="1";
		e2.corpType="1";
		e2.jurisdiction="1";
		e2.IDEALId="13242384894985198";
		return e2;			
	}
	
	// Payload for Justicia
	
	public JusticiaCriminalCheck criminalCheckPayload() {
		JusticiaCriminalCheck just1 = new JusticiaCriminalCheck();
		
		just1.ssn="597103634";
		
		return just1;			
	}
	
	// Payload for ASG
	
	
	public GenTokens GenTokenPayload() {
		GenTokens t1 = new GenTokens();
		
		t1.username="prits_production";
		t1.password="jMlIv^*7jzj&cTdpQkZOOMC#qyB@IS";
		t1.apiKey="z*^xqGnuvXlpVZ68Lte%pRd@nC#NUlB8Fy5jen^s";
		t1.client="SYW!Pv4scBia7BHrYbY@H@U1i&smQmZG6BSJ^boPBI$LrNfEZd";
		
		return t1;			
	}
	
	public RulCompliance RulCompPayload() {
		RulCompliance t2 = new RulCompliance();
		
		t2.id="386040030";
		return t2;			
	}
	
	
	public RulCertificate RulCertPayload() {
		RulCertificate t3 = new RulCertificate();
		
		t3.id="386040030";			
		return t3;			
	}
	
	
	public RupCompliance RupCompPayload() {
		RupCompliance t4 = new RupCompliance();
		
		t4.id="386040030";		
		return t4;			
	}
	
	
	public RupCertificate RupCertPayload() {
		RupCertificate t5 = new RupCertificate();
		
		t5.id="386040030";
		return t5;			
	}
	
	// Payload for Crim
	
	public CrimGenTokens CrimGenTokenPayload() {
		CrimGenTokens c1 = new CrimGenTokens();
		
		c1.username="prits_development";
		c1.password="97ptR6Q5%aAb4S+8kENH";
		c1.apiKey="o6@c8$u%z22NH/MQa0qmVF7-yqgS.}I00Pee=d8Cm^Ri#M_XwDA{I!Ik=a!YivN";
		c1.client="59E3B963D2FB7E397385D2EEFACBE";
		
		return c1;	
	}
	
	public CrimCompliance CrimCompPayload() {
		CrimCompliance c2 = new CrimCompliance();
		
		c2.id="074463217";
		return c2;			
	}
	
	
	public CrimCertificate CrimCertPayload() {
		CrimCertificate c3 = new CrimCertificate();
		
		c3.id="386040030";	
		c3.firstName="";	
		c3.lastName="";	
		return c3;			
	}
	
	
	
	// Payload for Dtop
	
	
	public GetPhoto GetPhotoPayload() {
		GetPhoto g1 = new GetPhoto();
		return g1;			
	}
	
	public GetLicence GetLicencePayload() {
		GetLicence g2 = new GetLicence();
		return g2;			
	}
	
	// Payload for Asume Patron
	
	
	public GetPatronoToken patronTokenPayload() {
		GetPatronoToken x1 = new GetPatronoToken();
		
		x1.grant_type="password";
		x1.username="dToplicencias";
		x1.Password="aldf@23901FTOPasd23";
		x1.client_id="OGP20180821&*990899XX";
		x1.client_secret="5&t%$xZHpr9800";
		return x1;			
	}
	

	public PatronCertificate patronCertificatePayload() {
		PatronCertificate x11 = new PatronCertificate();
		
		x11.FEIN="660855760";
		x11.EmployerName="Clickup Corp.";
		x11.sendCertificate=true;
		
		return x11;		

		
		
	}
	
		public GetIndivisualToken indTokenPayload() {
		GetIndivisualToken x2 = new GetIndivisualToken();
		
		x2.grant_type="password";
		x2.username="dToplicenciaS";
		x2.Password="aldf@23901FTOPasd23";
		x2.client_id="OGP20180821&*990899XX";
		x2.client_secret="5&t%$xZHpr9800";
		return x2;			
	}
	
	
		public IndivisualCertificate indCertificatePayload() {
			IndivisualCertificate x22 = new IndivisualCertificate();
			
			x22.Name="John";
			x22.MiddleInitial="A";
			x22.LastName="Rodriguez";
			x22.LastName2="";
			x22.NickName="";
			x22.SSN="A";
			x22.BirthDate="1970-02-04";
			x22.EmailAddress="null";
			x22.DriverLicense="";
			x22.DeathDate="null";
			x22.Addresses="[]";
			x22.PhoneNumbers="";
			
			x22.TerminalId="1";
			x22.OGPCorrelationID="";
			x22.OGPATGNumber="";
			x22.Source="IDEAL";
			x22.UserId="";
			x22.IndividualId="";
			x22.sendCertificate=true;
			x22.SendByEmail=false;
			
			return x22;			
		}
		
	
	// Payload for CFSE
		
		public CFSETokenGen CFSETokenGenPayload() {
			CFSETokenGen c1 = new CFSETokenGen();
			
			c1.Username="pritsuser";
			c1.Password="1qaz@wsX";
			
			return c1;			
		}
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	
	// Payload for Agent Save
	
	public Agency AgencySavePayload() {
		
		Agency a1 = new Agency();
		
		Request req1 = new Request();
		req1.FEIN="660962981";
		req1.EmployerName="Code Dog Technology Group LLC";
		req1.sendCertificate=true;
		
			Response res1 =new Response();
			res1.Success=true;
			res1.Message="Success";
			res1.InCompliance=true;
			res1.PaymentPlan="null";
			res1.CertificationPDFBytes="b010e903-5d5d-4391-8b2e-e7d05fd8e2b2";
			a1.request=req1;
			a1.response=res1;
			
		return a1;	
		
		
	}
	
	
	// Payload for Agency
	
		public DashboardSearch AgentPayload() {
			DashboardSearch a2 = new DashboardSearch();
			
			a2.userName="testuser1";
			a2.searchText="";
			a2.sortColumn="";
			a2.sortOrder="";	
			return a2;			
		}
	
	
		// Payload for Certificate APIs
		
		public CertificateCitizenDetails CertificatePayload1() {
			CertificateCitizenDetails a3 = new CertificateCitizenDetails();
			
			a3.referenceId="a0acdcd9-2ea6-4e96-8f4d-89f4614d5dde";
			
			return a3;			
		}
		
		public CertificateCorporateDetails CertificatePayload2() {
			CertificateCorporateDetails a4 = new CertificateCorporateDetails();
			
			a4.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			
			return a4;			
		}
		
	
		public CertificateCitizenNote CertificatePayload3() {
			CertificateCitizenNote a5 = new CertificateCitizenNote();
			
			a5.referenceId="a0acdcd9-2ea6-4e96-8f4d-89f4614d5dde";
			
			return a5;			
		}
		
		public CertificateCorporateNote CertificatePayload4() {
			CertificateCorporateNote a6 = new CertificateCorporateNote();
			
			a6.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			
			return a6;			
		}
		
		
		public CertificateHacienda CertificatePayload5() {
			CertificateHacienda a7 = new CertificateHacienda();
			
			a7.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			a7.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			a7.username= "testuser1";
			
			return a7;			
		}
		
		public CertificateCRIM CertificatePayload6() {
			CertificateCRIM a8 = new CertificateCRIM();
			
			a8.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			a8.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			a8.username= "testuser1";
			
			return a8;			
		}
		
		public CertificateLabor CertificatePayload7() {
			CertificateLabor p7 = new CertificateLabor();
			
			p7.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p7.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p7.username= "testuser1";
			
			return p7;			
		}
		
		public CertificateAsume CertificatePayload8() {
			CertificateAsume p8 = new CertificateAsume();
			
			p8.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p8.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p8.username= "testuser1";
			
			return p8;			
		}
		
		public CertificateJusticia CertificatePayload9() {
			CertificateJusticia p9 = new CertificateJusticia();
			
			p9.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p9.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p9.username= "testuser1";
			
			return p9;			
		}
		
		public CertificateCFSE CertificatePayload10() {
			CertificateCFSE p10 = new CertificateCFSE();
			
			p10.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p10.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p10.username= "testuser1";
			
			return p10;			
		}
		
		public CertificateASG CertificatePayload11() {
			CertificateASG p11 = new CertificateASG();
			
			p11.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p11.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p11.username= "testuser1";
			
			return p11;			
		}
		
		public CertificateDTOP CertificatePayload12() {
			CertificateDTOP p12 = new CertificateDTOP();
			
			p12.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p12.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p12.username= "testuser1";
			
			return p12;			
		}
		
		public CertificateState CertificatePayload13() {
			CertificateState p13 = new CertificateState();
			
			p13.referenceId= "cb530120-288b-45e5-9d1d-56463e7e494f";
			p13.certificateId= "5e62e8ac-7da2-4fc1-bb88-fb6eb9e7918b";
			p13.username= "testuser1";
			
			return p13;			
		}
		
		
	//Payload for Citizen 	
		
		public CitizenSearch Citizen1() {
			CitizenSearch c1 = new CitizenSearch();
			
			c1.firstName= "oscar";
			c1.lastName= "rivera";			
			c1.ssn= "598408444";
			c1.licenseNumber= "4970687";
			c1.dob= "1993-09-21";
			c1.consentEmail= "oscar.rivera@codedog.solutions";			
			c1.consentMobileNumber= "5087408882";
			c1.searchReason= "CitizenServices";
			c1.middleName= "A";
			c1.mothersLastName= "";
			c1.townOfBirth= "San Juan";
					
			return c1;			
		}
		
	
				
		
		
		
		//Payload for Corporate 
		
		public CorporateSearch Corporate1() {
			CorporateSearch c2 = new CorporateSearch();
			
			c2.companyName= "Code Dog Technology Group LLC";
			c2.companyRepresentative= "";			
			c2.ssn= "660962981";
			c2.merchantRegistrationNumber= "";
			c2.stateRegistrationNumber= "411607";
			c2.companyClass= "1";			
			c2.companyType= "2";
			c2.jurisdiction= "1";
			c2.consentEmail= "naveen.kumar@codedog.solutions";
			c2.consentMobileNumber= "5087408882";
			c2.searchReason= "ContractServices";
			c2.choferilSSNPatronal= "";		
			return c2;			
		}
		
		
		
		
		
		
		
		
		
		
}
