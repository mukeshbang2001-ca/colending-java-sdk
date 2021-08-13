
# Clients Api Loans Request

## Structure

`ClientsApiLoansRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `String` | Optional | Customer ID as per partner&#39;s CRM/LOS | String getCustomerId() | setCustomerId(String customerId) |
| `ClientLoanId` | `String` | Required | Loan ID as per Partner&#39;s LMS | String getClientLoanId() | setClientLoanId(String clientLoanId) |
| `ApplicationId` | `String` | Optional | Application ID as per Partner&#39;s CRM/LOS | String getApplicationId() | setApplicationId(String applicationId) |
| `PartnerBranchCode` | `String` | Optional | Branch Code as per Partner&#39;s LOS | String getPartnerBranchCode() | setPartnerBranchCode(String partnerBranchCode) |
| `PartnerBranchName` | `String` | Optional | Branch Name as per Partner&#39;s LOS | String getPartnerBranchName() | setPartnerBranchName(String partnerBranchName) |
| `ProductType` | `String` | Optional | - | String getProductType() | setProductType(String productType) |
| `ProductId` | `String` | Optional | Product Code in Co-Lending | String getProductId() | setProductId(String productId) |
| `SchemeCode` | `String` | Optional | - | String getSchemeCode() | setSchemeCode(String schemeCode) |
| `LoanType` | `String` | Optional | Secured / Unsecured | String getLoanType() | setLoanType(String loanType) |
| `LoanSubtype` | `String` | Optional | BT / Top Loan / Fresh | String getLoanSubtype() | setLoanSubtype(String loanSubtype) |
| `Purpose` | `String` | Optional | Free flowing text | String getPurpose() | setPurpose(String purpose) |
| `DisbursementType` | `String` | Optional | Tranche / Single | String getDisbursementType() | setDisbursementType(String disbursementType) |
| `EndBorrowerAmount` | `Double` | Optional | In case of multiple disbursals | Double getEndBorrowerAmount() | setEndBorrowerAmount(Double endBorrowerAmount) |
| `ExistingLenderAmount` | `Double` | Optional | In case of multiple disbursals | Double getExistingLenderAmount() | setExistingLenderAmount(Double existingLenderAmount) |
| `PrincipalAmount` | `Double` | Optional | Total Loan Amount to the Borrower (in Rupees) | Double getPrincipalAmount() | setPrincipalAmount(Double principalAmount) |
| `InterestRate` | `double` | Required | Reducing balance interest rate of the customer in %. This is the interest rate to be mentioned in the sanction letter as well | double getInterestRate() | setInterestRate(double interestRate) |
| `Tenure` | `Integer` | Optional | Tenure of the loan | Integer getTenure() | setTenure(Integer tenure) |
| `TenureFrequency` | `String` | Optional | Daily / Weekly / Monthly | String getTenureFrequency() | setTenureFrequency(String tenureFrequency) |
| `RepaymentFrequency` | `String` | Optional | Daily / Weekly / Monthly / Bullet | String getRepaymentFrequency() | setRepaymentFrequency(String repaymentFrequency) |
| `NumberOfRepayments` | `Integer` | Optional | Number of repayments as per the repayment schedule | Integer getNumberOfRepayments() | setNumberOfRepayments(Integer numberOfRepayments) |
| `FirstRepaymentDate` | `LocalDate` | Optional | First repayment date as per the repayment schedule (YYYY-MM-DD) | LocalDate getFirstRepaymentDate() | setFirstRepaymentDate(LocalDate firstRepaymentDate) |
| `RepaymentMode` | `String` | Optional | Cash / NACH | String getRepaymentMode() | setRepaymentMode(String repaymentMode) |
| `AdvanceEmi` | `Double` | Optional | Advance EMI Amount (If collected any) | Double getAdvanceEmi() | setAdvanceEmi(Double advanceEmi) |
| `Umrn` | `String` | Optional | To update if UMRN generated at this stage, else in PDD stage | String getUmrn() | setUmrn(String umrn) |
| `DifferentialInterestStartDate` | `LocalDate` | Optional | PreEMI Interest Due Date | LocalDate getDifferentialInterestStartDate() | setDifferentialInterestStartDate(LocalDate differentialInterestStartDate) |
| `DifferentialInterest` | `Double` | Optional | Broken Period Interest Amount (in Rupees) | Double getDifferentialInterest() | setDifferentialInterest(Double differentialInterest) |
| `ProcessingFee` | `Double` | Optional | Processing Fee (Inclusive of GST) | Double getProcessingFee() | setProcessingFee(Double processingFee) |
| `StampDuty` | `Double` | Optional | - | Double getStampDuty() | setStampDuty(Double stampDuty) |
| `InsurancePremiumAmount` | `Double` | Optional | Insurance Premium (Inclusive of GST) | Double getInsurancePremiumAmount() | setInsurancePremiumAmount(Double insurancePremiumAmount) |
| `DocumentationFee` | `Double` | Optional | Documentation Charges (Inclusive of GST) | Double getDocumentationFee() | setDocumentationFee(Double documentationFee) |
| `OtherCharges` | `Double` | Optional | Any Other Charges (Inclusive of GST) | Double getOtherCharges() | setOtherCharges(Double otherCharges) |
| `CustomerType` | `String` | Optional | Individual / Non-Individual | String getCustomerType() | setCustomerType(String customerType) |
| `CustomerCategory` | `String` | Optional | Salaried / Self-Empolyed | String getCustomerCategory() | setCustomerCategory(String customerCategory) |
| `FirstName` | `String` | Optional | First Name of the Customer | String getFirstName() | setFirstName(String firstName) |
| `MiddleName` | `String` | Optional | Middle Name of the Customer | String getMiddleName() | setMiddleName(String middleName) |
| `LastName` | `String` | Optional | Last Name of the Customer | String getLastName() | setLastName(String lastName) |
| `Gender` | `String` | Optional | M / F / O | String getGender() | setGender(String gender) |
| `DateOfBirth` | `LocalDate` | Optional | Date of Birth (YYYY-MM-DD) | LocalDate getDateOfBirth() | setDateOfBirth(LocalDate dateOfBirth) |
| `Age` | `Integer` | Optional | Age in years | Integer getAge() | setAge(Integer age) |
| `MobileNumber` | `String` | Optional | Mobile Number of the Customer (10 digits) | String getMobileNumber() | setMobileNumber(String mobileNumber) |
| `PersonalEmailId` | `String` | Optional | Personal Email ID of the Customer | String getPersonalEmailId() | setPersonalEmailId(String personalEmailId) |
| `OfficialEmailId` | `String` | Optional | Official Email ID of the Customer | String getOfficialEmailId() | setOfficialEmailId(String officialEmailId) |
| `CurrentAddress` | `String` | Optional | Free flowing text | String getCurrentAddress() | setCurrentAddress(String currentAddress) |
| `CurrentCity` | `String` | Optional | City in which applicant is currently residing | String getCurrentCity() | setCurrentCity(String currentCity) |
| `CurrentDistrict` | `String` | Optional | District in which applicant is currently residing | String getCurrentDistrict() | setCurrentDistrict(String currentDistrict) |
| `CurrentState` | `String` | Optional | State in which applicant is currently residing | String getCurrentState() | setCurrentState(String currentState) |
| `CurrentPincode` | `Integer` | Optional | Pincode of the current address | Integer getCurrentPincode() | setCurrentPincode(Integer currentPincode) |
| `ResidenceTypeCurrentAddress` | `String` | Optional | Rented / Owned / Leased | String getResidenceTypeCurrentAddress() | setResidenceTypeCurrentAddress(String residenceTypeCurrentAddress) |
| `YearsOfStayInCurrentAddress` | `Integer` | Optional | How many years stayed in the current address | Integer getYearsOfStayInCurrentAddress() | setYearsOfStayInCurrentAddress(Integer yearsOfStayInCurrentAddress) |
| `PermanentAddress` | `String` | Optional | Free flowing text | String getPermanentAddress() | setPermanentAddress(String permanentAddress) |
| `PermanentCity` | `String` | Optional | City in which applicant is currently residing | String getPermanentCity() | setPermanentCity(String permanentCity) |
| `PermanentDistrict` | `String` | Optional | District in which applicant is currently residing | String getPermanentDistrict() | setPermanentDistrict(String permanentDistrict) |
| `PermanentState` | `String` | Optional | State in which applicant is currently residing | String getPermanentState() | setPermanentState(String permanentState) |
| `PermanentPincode` | `Integer` | Optional | Pincode of the current address | Integer getPermanentPincode() | setPermanentPincode(Integer permanentPincode) |
| `ResidenceTypePermanentAddress` | `String` | Optional | Rented / Owned / Leased | String getResidenceTypePermanentAddress() | setResidenceTypePermanentAddress(String residenceTypePermanentAddress) |
| `YearsOfStayInPermanentAddress` | `Integer` | Optional | How many years stayed in the permanent address | Integer getYearsOfStayInPermanentAddress() | setYearsOfStayInPermanentAddress(Integer yearsOfStayInPermanentAddress) |
| `MaritalStatus` | `String` | Optional | Married / Unmarried | String getMaritalStatus() | setMaritalStatus(String maritalStatus) |
| `Religion` | `String` | Optional | Religion of the Customer | String getReligion() | setReligion(String religion) |
| `Nationality` | `String` | Optional | Nationality of the Customer | String getNationality() | setNationality(String nationality) |
| `FatherName` | `String` | Optional | Father Name of the Customer | String getFatherName() | setFatherName(String fatherName) |
| `MotherName` | `String` | Optional | Mother Name of the Customer | String getMotherName() | setMotherName(String motherName) |
| `SpouseName` | `String` | Optional | Spouse Name of the Customer | String getSpouseName() | setSpouseName(String spouseName) |
| `EducationQualification` | `String` | Optional | Free flowing text | String getEducationQualification() | setEducationQualification(String educationQualification) |
| `NetMonthlyIncome` | `Double` | Optional | Monthly Income of the Customer (in Rupees) | Double getNetMonthlyIncome() | setNetMonthlyIncome(Double netMonthlyIncome) |
| `AnnualIncome` | `Double` | Optional | Annual Income of the Customer (in Rupees) | Double getAnnualIncome() | setAnnualIncome(Double annualIncome) |
| `NumberOfDependants` | `Integer` | Optional | - | Integer getNumberOfDependants() | setNumberOfDependants(Integer numberOfDependants) |
| `Occupation` | `String` | Optional | Salaried / Business / Retired / Self-Employed / Others | String getOccupation() | setOccupation(String occupation) |
| `PanNumber` | `String` | Optional | PAN Number of the Customer (10 digit Alphanumeric) | String getPanNumber() | setPanNumber(String panNumber) |
| `PanLink` | `List<String>` | Optional | PAN Document Link | List<String> getPanLink() | setPanLink(List<String> panLink) |
| `Form60Link` | `List<String>` | Optional | Form 60 Doument Link (If applicable) | List<String> getForm60Link() | setForm60Link(List<String> form60Link) |
| `AadharNumber` | `String` | Optional | Aadhar Number of the Customer (12 digits) | String getAadharNumber() | setAadharNumber(String aadharNumber) |
| `AadharLink` | `List<String>` | Optional | Aadhar Document Link | List<String> getAadharLink() | setAadharLink(List<String> aadharLink) |
| `VoterIdNumber` | `String` | Optional | Voter ID Number of the Customer | String getVoterIdNumber() | setVoterIdNumber(String voterIdNumber) |
| `VotingIdLink` | `List<String>` | Optional | Voter Document Link | List<String> getVotingIdLink() | setVotingIdLink(List<String> votingIdLink) |
| `DrivingLicenseNumber` | `String` | Optional | Driving License Number of the Customer | String getDrivingLicenseNumber() | setDrivingLicenseNumber(String drivingLicenseNumber) |
| `DrivingLicenseLink` | `List<String>` | Optional | Driving License Document Link | List<String> getDrivingLicenseLink() | setDrivingLicenseLink(List<String> drivingLicenseLink) |
| `PassportNumber` | `String` | Optional | Passport Number of the Customer | String getPassportNumber() | setPassportNumber(String passportNumber) |
| `PassportLink` | `List<String>` | Optional | Passport Document Link | List<String> getPassportLink() | setPassportLink(List<String> passportLink) |
| `VideoKycLink` | `List<String>` | Optional | Video KYC of the Applicant | List<String> getVideoKycLink() | setVideoKycLink(List<String> videoKycLink) |
| `VideoKycProfileId` | `String` | Optional | Required if video KYC is done. Profile ID of the case as per the video KYC vendor | String getVideoKycProfileId() | setVideoKycProfileId(String videoKycProfileId) |
| `VideoKycAccountId` | `String` | Optional | Required if video KYC is done. Account ID of the case as per the video KYC vendor | String getVideoKycAccountId() | setVideoKycAccountId(String videoKycAccountId) |
| `VideoKycKey` | `String` | Optional | Required if video KYC is done. Key as per the video KYC vendor | String getVideoKycKey() | setVideoKycKey(String videoKycKey) |
| `OtherKycNumber` | `String` | Optional | KYC Number of the Customer | String getOtherKycNumber() | setOtherKycNumber(String otherKycNumber) |
| `OtherKycLink` | `List<String>` | Optional | KYC Image of the Customer | List<String> getOtherKycLink() | setOtherKycLink(List<String> otherKycLink) |
| `RentAgreementLink` | `List<String>` | Optional | Rent Agreement Document Link | List<String> getRentAgreementLink() | setRentAgreementLink(List<String> rentAgreementLink) |
| `UtilityBillsLink` | `List<String>` | Optional | Utility Bills Copies (If any) | List<String> getUtilityBillsLink() | setUtilityBillsLink(List<String> utilityBillsLink) |
| `PhotoLink` | `List<String>` | Optional | Photo Image of the Customer | List<String> getPhotoLink() | setPhotoLink(List<String> photoLink) |
| `EmploymentType` | `String` | Optional | Salaried / Self-Employed | String getEmploymentType() | setEmploymentType(String employmentType) |
| `EmploymentDetailsName` | `String` | Optional | - | String getEmploymentDetailsName() | setEmploymentDetailsName(String employmentDetailsName) |
| `EmploymentDetailsAddress` | `String` | Optional | - | String getEmploymentDetailsAddress() | setEmploymentDetailsAddress(String employmentDetailsAddress) |
| `EmploymentDetailsYearsOfExperience` | `Double` | Optional | Applicant&#39;s years of experience in the current organization | Double getEmploymentDetailsYearsOfExperience() | setEmploymentDetailsYearsOfExperience(Double employmentDetailsYearsOfExperience) |
| `EmploymentDetailsDesignation` | `String` | Optional | Applicant&#39;s Current Designation | String getEmploymentDetailsDesignation() | setEmploymentDetailsDesignation(String employmentDetailsDesignation) |
| `PayslipLink` | `List<String>` | Optional | Last 3 Months Payslips | List<String> getPayslipLink() | setPayslipLink(List<String> payslipLink) |
| `TdsCertificateLink` | `List<String>` | Optional | Last 3 Years TDS Certificate | List<String> getTdsCertificateLink() | setTdsCertificateLink(List<String> tdsCertificateLink) |
| `NameOfBureau` | `String` | Optional | CIBIL / Experian / Himark | String getNameOfBureau() | setNameOfBureau(String nameOfBureau) |
| `BureauVintage` | `Integer` | Optional | Vintage in the bureau. Number of years from the first trade line | Integer getBureauVintage() | setBureauVintage(Integer bureauVintage) |
| `BureauScore` | `Integer` | Optional | - | Integer getBureauScore() | setBureauScore(Integer bureauScore) |
| `BureauReportLink` | `List<String>` | Optional | Bureau Report PDF | List<String> getBureauReportLink() | setBureauReportLink(List<String> bureauReportLink) |
| `CommercialBureauScore` | `Integer` | Optional | - | Integer getCommercialBureauScore() | setCommercialBureauScore(Integer commercialBureauScore) |
| `CommercialBureauScoreLink` | `List<String>` | Optional | Commercial Bureau Document | List<String> getCommercialBureauScoreLink() | setCommercialBureauScoreLink(List<String> commercialBureauScoreLink) |
| `PartnerScoreOnTheCustomer` | `Integer` | Optional | Score Captured by the Partner | Integer getPartnerScoreOnTheCustomer() | setPartnerScoreOnTheCustomer(Integer partnerScoreOnTheCustomer) |
| `TotalExistingObligations` | `Integer` | Optional | Total Existing Obligations basis the Bureau Report | Integer getTotalExistingObligations() | setTotalExistingObligations(Integer totalExistingObligations) |
| `CreditCardLimit` | `Integer` | Optional | Total Credit Card Limit basis the Bureau Report | Integer getCreditCardLimit() | setCreditCardLimit(Integer creditCardLimit) |
| `NumberOfCreditCards` | `Integer` | Optional | Total Number of Credit Cards per Bureau Report | Integer getNumberOfCreditCards() | setNumberOfCreditCards(Integer numberOfCreditCards) |
| `NumberOfUnsecuredLoans` | `Integer` | Optional | Total Number of Unsecured Loans per Bureau Report | Integer getNumberOfUnsecuredLoans() | setNumberOfUnsecuredLoans(Integer numberOfUnsecuredLoans) |
| `ValueOfTotalUnsecuredLoans` | `Double` | Optional | - | Double getValueOfTotalUnsecuredLoans() | setValueOfTotalUnsecuredLoans(Double valueOfTotalUnsecuredLoans) |
| `NumberOfLoans` | `Integer` | Optional | Total Number of Loans per Bureau Report | Integer getNumberOfLoans() | setNumberOfLoans(Integer numberOfLoans) |
| `ValueOfTotalLoans` | `Double` | Optional | - | Double getValueOfTotalLoans() | setValueOfTotalLoans(Double valueOfTotalLoans) |
| `NumberOfEnquiries3months` | `Integer` | Optional | Number of Enquiries in the Last 3 Months per Bureau Report | Integer getNumberOfEnquiries3months() | setNumberOfEnquiries3months(Integer numberOfEnquiries3months) |
| `NumberOfEnquiries6months` | `Integer` | Optional | Number of Enquiries in the Last 6 Months per Bureau Report | Integer getNumberOfEnquiries6months() | setNumberOfEnquiries6months(Integer numberOfEnquiries6months) |
| `NumberOfEnquiries12months` | `Integer` | Optional | Number of Enquiries in the Last 12 Months per Bureau Report | Integer getNumberOfEnquiries12months() | setNumberOfEnquiries12months(Integer numberOfEnquiries12months) |
| `NumberOfWriteoffSuitfiledSettled12months` | `Integer` | Optional | Number of Writeoff Suitfiled Settled in the Last 12 Months | Integer getNumberOfWriteoffSuitfiledSettled12months() | setNumberOfWriteoffSuitfiledSettled12months(Integer numberOfWriteoffSuitfiledSettled12months) |
| `MaxDpdTradeline12months` | `Integer` | Optional | Maximum DPD Tradeline in the Last 12 Months | Integer getMaxDpdTradeline12months() | setMaxDpdTradeline12months(Integer maxDpdTradeline12months) |
| `MaxOverdueTradeline` | `Integer` | Optional | Maximum Overdue Tradeline | Integer getMaxOverdueTradeline() | setMaxOverdueTradeline(Integer maxOverdueTradeline) |
| `TotalOverdueAmount12months` | `Double` | Optional | Total Overdue Amount in the Last 12 Months | Double getTotalOverdueAmount12months() | setTotalOverdueAmount12months(Double totalOverdueAmount12months) |
| `LoanAmountSettled12months` | `Double` | Optional | Loan Amount Settled in the Last 12 Months | Double getLoanAmountSettled12months() | setLoanAmountSettled12months(Double loanAmountSettled12months) |
| `NatureOfLoanSettled1` | `String` | Optional | - | String getNatureOfLoanSettled1() | setNatureOfLoanSettled1(String natureOfLoanSettled1) |
| `NatureOfLoanSettled2` | `String` | Optional | - | String getNatureOfLoanSettled2() | setNatureOfLoanSettled2(String natureOfLoanSettled2) |
| `TotalEmiBounces` | `Integer` | Optional | - | Integer getTotalEmiBounces() | setTotalEmiBounces(Integer totalEmiBounces) |
| `EmiBounces6months` | `Integer` | Optional | EMI Bounces in the Last 6 Months | Integer getEmiBounces6months() | setEmiBounces6months(Integer emiBounces6months) |
| `EmiBounces12months` | `Integer` | Optional | EMI Bounces in the Last 12 Months | Integer getEmiBounces12months() | setEmiBounces12months(Integer emiBounces12months) |
| `BankStatementSavingsAccount12MonthsLink` | `List<String>` | Optional | Savings Bank Account Statement for the Last 12 Months | List<String> getBankStatementSavingsAccount12MonthsLink() | setBankStatementSavingsAccount12MonthsLink(List<String> bankStatementSavingsAccount12MonthsLink) |
| `BankStatementCurrentAccount12MonthsLink` | `List<String>` | Optional | Current Account Bank Account Statement for the Last 12 Months | List<String> getBankStatementCurrentAccount12MonthsLink() | setBankStatementCurrentAccount12MonthsLink(List<String> bankStatementCurrentAccount12MonthsLink) |
| `NoOfInwardChqReturnsSavingsAccount` | `List<Integer>` | Optional | - | List<Integer> getNoOfInwardChqReturnsSavingsAccount() | setNoOfInwardChqReturnsSavingsAccount(List<Integer> noOfInwardChqReturnsSavingsAccount) |
| `NoOfOutwardChqReturnsSavingsAccount` | `List<Integer>` | Optional | - | List<Integer> getNoOfOutwardChqReturnsSavingsAccount() | setNoOfOutwardChqReturnsSavingsAccount(List<Integer> noOfOutwardChqReturnsSavingsAccount) |
| `NoOfInwardChqReturnsCurrentAccount` | `List<Integer>` | Optional | - | List<Integer> getNoOfInwardChqReturnsCurrentAccount() | setNoOfInwardChqReturnsCurrentAccount(List<Integer> noOfInwardChqReturnsCurrentAccount) |
| `NoOfOutwardChqReturnsCurrentAccount` | `List<Integer>` | Optional | - | List<Integer> getNoOfOutwardChqReturnsCurrentAccount() | setNoOfOutwardChqReturnsCurrentAccount(List<Integer> noOfOutwardChqReturnsCurrentAccount) |
| `BankAccountTypeForAssessment` | `String` | Optional | Savings / Current / Overdraft / CC | String getBankAccountTypeForAssessment() | setBankAccountTypeForAssessment(String bankAccountTypeForAssessment) |
| `PerfiosLink` | `List<String>` | Optional | JSON of Perfios/Finbit | List<String> getPerfiosLink() | setPerfiosLink(List<String> perfiosLink) |
| `Abb` | `Double` | Optional | Average Bank Balance maintaiend on the EMI dates (Calculated by the Originator for the Last 12 Months) | Double getAbb() | setAbb(Double abb) |
| `Abd` | `Double` | Optional | Average Monthly Bank Deposits for the Last 12 Months | Double getAbd() | setAbd(Double abd) |
| `AnnualBusinessTurnover` | `Double` | Optional | Annual Business Turnover (in Rupees) | Double getAnnualBusinessTurnover() | setAnnualBusinessTurnover(Double annualBusinessTurnover) |
| `AnnualGrossProfit` | `Double` | Optional | Annual Gross Profit (in Rupees) | Double getAnnualGrossProfit() | setAnnualGrossProfit(Double annualGrossProfit) |
| `AnnualBusinessEbitda` | `Double` | Optional | Annual Business EBITDA (in Rupees) | Double getAnnualBusinessEbitda() | setAnnualBusinessEbitda(Double annualBusinessEbitda) |
| `AnnualNetIncome` | `Double` | Optional | Annual Net Income (in Rupees) | Double getAnnualNetIncome() | setAnnualNetIncome(Double annualNetIncome) |
| `MonthlyNetProfit` | `Double` | Optional | Monthly Net Profit (in Rupees) | Double getMonthlyNetProfit() | setMonthlyNetProfit(Double monthlyNetProfit) |
| `AnnualNetProfit` | `Double` | Optional | Annual Net Profit (in Rupees) | Double getAnnualNetProfit() | setAnnualNetProfit(Double annualNetProfit) |
| `GstReturnYear1Link` | `List<String>` | Optional | GST Return Document for the Last Year | List<String> getGstReturnYear1Link() | setGstReturnYear1Link(List<String> gstReturnYear1Link) |
| `GstReturnYear2Link` | `List<String>` | Optional | GST Return Document for the Last Year - 1 | List<String> getGstReturnYear2Link() | setGstReturnYear2Link(List<String> gstReturnYear2Link) |
| `GstReturnYear3Link` | `List<String>` | Optional | GST Return Document for the Last Year - 2 | List<String> getGstReturnYear3Link() | setGstReturnYear3Link(List<String> gstReturnYear3Link) |
| `ItReturnYear1Link` | `List<String>` | Optional | IT Return Document for the Last Year | List<String> getItReturnYear1Link() | setItReturnYear1Link(List<String> itReturnYear1Link) |
| `ItReturnYear2Link` | `List<String>` | Optional | IT Return Document for the Last Year - 1 | List<String> getItReturnYear2Link() | setItReturnYear2Link(List<String> itReturnYear2Link) |
| `ItReturnYear3Link` | `List<String>` | Optional | IT Return Document for the Last Year - 2 | List<String> getItReturnYear3Link() | setItReturnYear3Link(List<String> itReturnYear3Link) |
| `OtherIncomeAssessmentProofLink` | `List<String>` | Optional | Kachcha/Pucca Bill Copies | List<String> getOtherIncomeAssessmentProofLink() | setOtherIncomeAssessmentProofLink(List<String> otherIncomeAssessmentProofLink) |
| `CamLink` | `List<String>` | Optional | CAM Document Link | List<String> getCamLink() | setCamLink(List<String> camLink) |
| `CfaLink` | `List<String>` | Optional | CFA Document Link | List<String> getCfaLink() | setCfaLink(List<String> cfaLink) |
| `CoApplicants` | [`List<CoApplicant>`](/doc/models/co-applicant.md) | Optional | - | List<CoApplicant> getCoApplicants() | setCoApplicants(List<CoApplicant> coApplicants) |
| `AbbEmiRatio` | `Double` | Optional | - | Double getAbbEmiRatio() | setAbbEmiRatio(Double abbEmiRatio) |
| `Dscr` | `Double` | Optional | Debt Service Coverage Ratio | Double getDscr() | setDscr(Double dscr) |
| `Foir` | `Double` | Optional | Fixed Obligations to Income Ratio | Double getFoir() | setFoir(Double foir) |
| `Ltr` | `Double` | Optional | Loan Transfer Ratio | Double getLtr() | setLtr(Double ltr) |
| `EligibilityLoanAmount` | `Double` | Optional | - | Double getEligibilityLoanAmount() | setEligibilityLoanAmount(Double eligibilityLoanAmount) |
| `CreditInsuranceInsurer` | `String` | Optional | Insurer Name (If Credit Shield Insurance is taken) | String getCreditInsuranceInsurer() | setCreditInsuranceInsurer(String creditInsuranceInsurer) |
| `CreditInsuranceNomineeDetails` | `String` | Optional | Name of the Nominee (If Credit Shield Insurance is taken) | String getCreditInsuranceNomineeDetails() | setCreditInsuranceNomineeDetails(String creditInsuranceNomineeDetails) |
| `CreditInsuranceRelationship` | `String` | Optional | Relationship of the Nominee (If Credit Shield Insurance is taken) | String getCreditInsuranceRelationship() | setCreditInsuranceRelationship(String creditInsuranceRelationship) |
| `CreditInsurancePremium` | `Double` | Optional | Premium Amount (If Credit Shield Insurance is taken) | Double getCreditInsurancePremium() | setCreditInsurancePremium(Double creditInsurancePremium) |
| `CreditInsuranceAmount` | `Double` | Optional | Total Insurance Amount (If Credit Shield Insurance is taken) | Double getCreditInsuranceAmount() | setCreditInsuranceAmount(Double creditInsuranceAmount) |
| `CreditInsurancePolicyNumber` | `String` | Optional | Policy Number (If Credit Shield Insurance is taken) | String getCreditInsurancePolicyNumber() | setCreditInsurancePolicyNumber(String creditInsurancePolicyNumber) |
| `AssetInsuranceInsurer` | `String` | Optional | Insurer Name | String getAssetInsuranceInsurer() | setAssetInsuranceInsurer(String assetInsuranceInsurer) |
| `AssetInsuranceNomineeDetails` | `String` | Optional | Name of the Nominee | String getAssetInsuranceNomineeDetails() | setAssetInsuranceNomineeDetails(String assetInsuranceNomineeDetails) |
| `AssetInsurancePremium` | `Double` | Optional | Premium Amount (in Rupees) | Double getAssetInsurancePremium() | setAssetInsurancePremium(Double assetInsurancePremium) |
| `AssetInsuranceAmount` | `Double` | Optional | Total Insurance Amount (in Rupees) | Double getAssetInsuranceAmount() | setAssetInsuranceAmount(Double assetInsuranceAmount) |
| `AssetInsurancePolicyNumber` | `String` | Optional | - | String getAssetInsurancePolicyNumber() | setAssetInsurancePolicyNumber(String assetInsurancePolicyNumber) |
| `PslFlag` | `String` | Optional | - | String getPslFlag() | setPslFlag(String pslFlag) |
| `PslDescription` | `String` | Optional | - | String getPslDescription() | setPslDescription(String pslDescription) |
| `PslCode` | `String` | Optional | - | String getPslCode() | setPslCode(String pslCode) |
| `PslProofLink` | `List<String>` | Optional | - | List<String> getPslProofLink() | setPslProofLink(List<String> pslProofLink) |
| `DisbursementAccounts` | [`List<DisbursementAccount>`](/doc/models/disbursement-account.md) | Optional | - | List<DisbursementAccount> getDisbursementAccounts() | setDisbursementAccounts(List<DisbursementAccount> disbursementAccounts) |
| `LoanAgreementLink` | `List<String>` | Optional | - | List<String> getLoanAgreementLink() | setLoanAgreementLink(List<String> loanAgreementLink) |
| `SanctionLetterLink` | `List<String>` | Optional | - | List<String> getSanctionLetterLink() | setSanctionLetterLink(List<String> sanctionLetterLink) |
| `LafLink` | `List<String>` | Optional | - | List<String> getLafLink() | setLafLink(List<String> lafLink) |
| `SelfDeclarationLetterLink` | `List<String>` | Optional | - | List<String> getSelfDeclarationLetterLink() | setSelfDeclarationLetterLink(List<String> selfDeclarationLetterLink) |
| `AuthorisationLetterLink` | `List<String>` | Optional | - | List<String> getAuthorisationLetterLink() | setAuthorisationLetterLink(List<String> authorisationLetterLink) |
| `EnachPdcLink` | `List<String>` | Optional | - | List<String> getEnachPdcLink() | setEnachPdcLink(List<String> enachPdcLink) |
| `GuarantorAgreementsLink` | `List<String>` | Optional | - | List<String> getGuarantorAgreementsLink() | setGuarantorAgreementsLink(List<String> guarantorAgreementsLink) |

## Example (as JSON)

```json
{
  "customer_id": null,
  "client_loan_id": "client_loan_id8",
  "application_id": null,
  "partner_branch_code": null,
  "partner_branch_name": null,
  "product_type": null,
  "product_id": null,
  "scheme_code": null,
  "loan_type": null,
  "loan_subtype": null,
  "purpose": null,
  "disbursement_type": null,
  "end_borrower_amount": null,
  "existing_lender_amount": null,
  "principal_amount": null,
  "interest_rate": 101.72,
  "tenure": null,
  "tenure_frequency": null,
  "repayment_frequency": null,
  "number_of_repayments": null,
  "first_repayment_date": null,
  "repayment_mode": null,
  "advance_emi": null,
  "umrn": null,
  "differential_interest_start_date": null,
  "differential_interest": null,
  "processing_fee": null,
  "stamp_duty": null,
  "insurance_premium_amount": null,
  "documentation_fee": null,
  "other_charges": null,
  "customer_type": null,
  "customer_category": null,
  "first_name": null,
  "middle_name": null,
  "last_name": null,
  "gender": null,
  "date_of_birth": null,
  "age": null,
  "mobile_number": null,
  "personal_email_id": null,
  "official_email_id": null,
  "current_address": null,
  "current_city": null,
  "current_district": null,
  "current_state": null,
  "current_pincode": null,
  "residence_type_current_address": null,
  "years_of_stay_in_current_address": null,
  "permanent_address": null,
  "permanent_city": null,
  "permanent_district": null,
  "permanent_state": null,
  "permanent_pincode": null,
  "residence_type_permanent_address": null,
  "years_of_stay_in_permanent_address": null,
  "marital_status": null,
  "religion": null,
  "nationality": null,
  "father_name": null,
  "mother_name": null,
  "spouse_name": null,
  "education_qualification": null,
  "net_monthly_income": null,
  "annual_income": null,
  "number_of_dependants": null,
  "occupation": null,
  "pan_number": null,
  "pan_link": null,
  "form_60_link": null,
  "aadhar_number": null,
  "aadhar_link": null,
  "voter_id_number": null,
  "voting_id_link": null,
  "driving_license_number": null,
  "driving_license_link": null,
  "passport_number": null,
  "passport_link": null,
  "video_kyc_link": null,
  "video_kyc_profile_id": null,
  "video_kyc_account_id": null,
  "video_kyc_key": null,
  "other_kyc_number": null,
  "other_kyc_link": null,
  "rent_agreement_link": null,
  "utility_bills_link": null,
  "photo_link": null,
  "employment_type": null,
  "employment_details_name": null,
  "employment_details_address": null,
  "employment_details_years_of_experience": null,
  "employment_details_designation": null,
  "payslip_link": null,
  "tds_certificate_link": null,
  "name_of_bureau": null,
  "bureau_vintage": null,
  "bureau_score": null,
  "bureau_report_link": null,
  "commercial_bureau_score": null,
  "commercial_bureau_score_link": null,
  "partner_score_on_the_customer": null,
  "total_existing_obligations": null,
  "credit_card_limit": null,
  "number_of_credit_cards": null,
  "number_of_unsecured_loans": null,
  "value_of_total_unsecured_loans": null,
  "number_of_loans": null,
  "value_of_total_loans": null,
  "number_of_enquiries_3months": null,
  "number_of_enquiries_6months": null,
  "number_of_enquiries_12months": null,
  "number_of_writeoff_suitfiled_settled_12months": null,
  "max_dpd_tradeline_12months": null,
  "max_overdue_tradeline": null,
  "total_overdue_amount_12months": null,
  "loan_amount_settled_12months": null,
  "nature_of_loan_settled_1": null,
  "nature_of_loan_settled_2": null,
  "total_emi_bounces": null,
  "emi_bounces_6months": null,
  "emi_bounces_12months": null,
  "bank_statement_savings_account_12_months_link": null,
  "bank_statement_current_account_12_months_link": null,
  "no_of_inward_chq_returns_savings_account": null,
  "no_of_outward_chq_returns_savings_account": null,
  "no_of_inward_chq_returns_current_account": null,
  "no_of_outward_chq_returns_current_account": null,
  "bank_account_type_for_assessment": null,
  "perfios_link": null,
  "abb": null,
  "abd": null,
  "annual_business_turnover": null,
  "annual_gross_profit": null,
  "annual_business_ebitda": null,
  "annual_net_income": null,
  "monthly_net_profit": null,
  "annual_net_profit": null,
  "gst_return_year_1_link": null,
  "gst_return_year_2_link": null,
  "gst_return_year_3_link": null,
  "it_return_year_1_link": null,
  "it_return_year_2_link": null,
  "it_return_year_3_link": null,
  "other_income_assessment_proof_link": null,
  "cam_link": null,
  "cfa_link": null,
  "co_applicants": null,
  "abb_emi_ratio": null,
  "dscr": null,
  "foir": null,
  "ltr": null,
  "eligibility_loan_amount": null,
  "credit_insurance_insurer": null,
  "credit_insurance_nominee_details": null,
  "credit_insurance_relationship": null,
  "credit_insurance_premium": null,
  "credit_insurance_amount": null,
  "credit_insurance_policy_number": null,
  "asset_insurance_insurer": null,
  "asset_insurance_nominee_details": null,
  "asset_insurance_premium": null,
  "asset_insurance_amount": null,
  "asset_insurance_policy_number": null,
  "psl_flag": null,
  "psl_description": null,
  "psl_code": null,
  "psl_proof_link": null,
  "disbursement_accounts": null,
  "loan_agreement_link": null,
  "sanction_letter_link": null,
  "laf_link": null,
  "self_declaration_letter_link": null,
  "authorisation_letter_link": null,
  "enach_pdc_link": null,
  "guarantor_agreements_link": null
}
```

