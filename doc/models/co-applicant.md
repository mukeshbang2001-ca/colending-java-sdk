
# Co Applicant

## Structure

`CoApplicant`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RelationshipWithApplicant` | `String` | Optional | - | String getRelationshipWithApplicant() | setRelationshipWithApplicant(String relationshipWithApplicant) |
| `FirstName` | `String` | Optional | First Name of the CoApplicant | String getFirstName() | setFirstName(String firstName) |
| `MiddleName` | `String` | Optional | Middle Name of the CoApplicant | String getMiddleName() | setMiddleName(String middleName) |
| `LastName` | `String` | Optional | Last Name of the CoApplicant | String getLastName() | setLastName(String lastName) |
| `Gender` | `String` | Optional | M / F / O | String getGender() | setGender(String gender) |
| `DateOfBirth` | `LocalDate` | Optional | Date of Birth (YYYY-MM-DD) | LocalDate getDateOfBirth() | setDateOfBirth(LocalDate dateOfBirth) |
| `Age` | `Integer` | Optional | Age in years | Integer getAge() | setAge(Integer age) |
| `MobileNumber` | `String` | Optional | Mobile Number of the CoApplicant (10 digits) | String getMobileNumber() | setMobileNumber(String mobileNumber) |
| `Email` | `String` | Optional | Personal Email ID of the CoApplicant | String getEmail() | setEmail(String email) |
| `CurrentAddress` | `String` | Optional | Free flowing text | String getCurrentAddress() | setCurrentAddress(String currentAddress) |
| `CurrentCity` | `String` | Optional | City in which CoApplicant is currently residing | String getCurrentCity() | setCurrentCity(String currentCity) |
| `CurrentDistrict` | `String` | Optional | District in which CoApplicant is currently residing | String getCurrentDistrict() | setCurrentDistrict(String currentDistrict) |
| `CurrentState` | `String` | Optional | State in which CoApplicant is currently residing | String getCurrentState() | setCurrentState(String currentState) |
| `CurrentPincode` | `Integer` | Optional | Pincode of the current address | Integer getCurrentPincode() | setCurrentPincode(Integer currentPincode) |
| `ResidenceTypeCurrentAddress` | `String` | Optional | Rented / Owned / Leased | String getResidenceTypeCurrentAddress() | setResidenceTypeCurrentAddress(String residenceTypeCurrentAddress) |
| `YearsOfStayInCurrentAddress` | `Integer` | Optional | How many years stayed in the current address | Integer getYearsOfStayInCurrentAddress() | setYearsOfStayInCurrentAddress(Integer yearsOfStayInCurrentAddress) |
| `PermanentAddress` | `String` | Optional | Free flowing text | String getPermanentAddress() | setPermanentAddress(String permanentAddress) |
| `PermanentCity` | `String` | Optional | City in which CoApplicant is currently residing | String getPermanentCity() | setPermanentCity(String permanentCity) |
| `PermanentDistrict` | `String` | Optional | District in which CoApplicant is currently residing | String getPermanentDistrict() | setPermanentDistrict(String permanentDistrict) |
| `PermanentState` | `String` | Optional | State in which CoApplicant is currently residing | String getPermanentState() | setPermanentState(String permanentState) |
| `PermanentPincode` | `Integer` | Optional | Pincode of the current address | Integer getPermanentPincode() | setPermanentPincode(Integer permanentPincode) |
| `ResidenceTypePermanentAddress` | `String` | Optional | Rented / Owned / Leased | String getResidenceTypePermanentAddress() | setResidenceTypePermanentAddress(String residenceTypePermanentAddress) |
| `YearsOfStayInPermanentAddress` | `Integer` | Optional | How many years stayed in the permanent address | Integer getYearsOfStayInPermanentAddress() | setYearsOfStayInPermanentAddress(Integer yearsOfStayInPermanentAddress) |
| `MaritalStatus` | `String` | Optional | Married / Unmarried | String getMaritalStatus() | setMaritalStatus(String maritalStatus) |
| `Religion` | `String` | Optional | Religion of the CoApplicant | String getReligion() | setReligion(String religion) |
| `Nationality` | `String` | Optional | Nationality of the CoApplicant | String getNationality() | setNationality(String nationality) |
| `FatherName` | `String` | Optional | Father Name of the CoApplicant | String getFatherName() | setFatherName(String fatherName) |
| `MotherName` | `String` | Optional | Mother Name of the CoApplicant | String getMotherName() | setMotherName(String motherName) |
| `SpouseName` | `String` | Optional | Spouse Name of the CoApplicant | String getSpouseName() | setSpouseName(String spouseName) |
| `EducationQualification` | `String` | Optional | Free flowing text | String getEducationQualification() | setEducationQualification(String educationQualification) |
| `AnnualIncome` | `Double` | Optional | Annual Income of the CoApplicant (in Rupees) | Double getAnnualIncome() | setAnnualIncome(Double annualIncome) |
| `IncomeProofLink` | `List<String>` | Optional | - | List<String> getIncomeProofLink() | setIncomeProofLink(List<String> incomeProofLink) |
| `BankStatement12MonthsLink` | `List<String>` | Optional | Savings / Current Bank Account Statement for the Last 12 Months | List<String> getBankStatement12MonthsLink() | setBankStatement12MonthsLink(List<String> bankStatement12MonthsLink) |
| `PanNumber` | `String` | Optional | PAN Number of the CoApplicant (10 digit Alphanumeric) | String getPanNumber() | setPanNumber(String panNumber) |
| `PanLink` | `List<String>` | Optional | PAN Document Link | List<String> getPanLink() | setPanLink(List<String> panLink) |
| `AadharNumber` | `String` | Optional | Aadhar Number of the CoApplicant (12 digits) | String getAadharNumber() | setAadharNumber(String aadharNumber) |
| `AadharLink` | `List<String>` | Optional | Aadhar Document Link | List<String> getAadharLink() | setAadharLink(List<String> aadharLink) |
| `VoterIdNumber` | `String` | Optional | Voter ID Number of the CoApplicant | String getVoterIdNumber() | setVoterIdNumber(String voterIdNumber) |
| `VotingIdLink` | `List<String>` | Optional | Voter Document Link | List<String> getVotingIdLink() | setVotingIdLink(List<String> votingIdLink) |
| `DrivingLicenseNumber` | `String` | Optional | Driving License Number of the CoApplicant | String getDrivingLicenseNumber() | setDrivingLicenseNumber(String drivingLicenseNumber) |
| `DrivingLicenseLink` | `List<String>` | Optional | Driving License Document Link | List<String> getDrivingLicenseLink() | setDrivingLicenseLink(List<String> drivingLicenseLink) |
| `PassportNumber` | `String` | Optional | Passport Number of the CoApplicant | String getPassportNumber() | setPassportNumber(String passportNumber) |
| `PassportLink` | `List<String>` | Optional | Passport Document Link | List<String> getPassportLink() | setPassportLink(List<String> passportLink) |
| `VideoKycLink` | `List<String>` | Optional | Video KYC of the Applicant | List<String> getVideoKycLink() | setVideoKycLink(List<String> videoKycLink) |
| `VideoKycProfileId` | `String` | Optional | Required if video KYC is done. Profile ID of the case as per the video KYC vendor | String getVideoKycProfileId() | setVideoKycProfileId(String videoKycProfileId) |
| `VideoKycAccountId` | `String` | Optional | Required if video KYC is done. Account ID of the case as per the video KYC vendor | String getVideoKycAccountId() | setVideoKycAccountId(String videoKycAccountId) |
| `VideoKycKey` | `String` | Optional | Required if video KYC is done. Key as per the video KYC vendor | String getVideoKycKey() | setVideoKycKey(String videoKycKey) |
| `OtherKycNumber` | `String` | Optional | KYC Number of the CoApplicant | String getOtherKycNumber() | setOtherKycNumber(String otherKycNumber) |
| `OtherKycLink` | `List<String>` | Optional | KYC Image of the CoApplicant | List<String> getOtherKycLink() | setOtherKycLink(List<String> otherKycLink) |
| `RentAgreementLink` | `List<String>` | Optional | Rent Agreement Document Link | List<String> getRentAgreementLink() | setRentAgreementLink(List<String> rentAgreementLink) |
| `UtilityBillsLink` | `List<String>` | Optional | Utility Bills Copies (If any) | List<String> getUtilityBillsLink() | setUtilityBillsLink(List<String> utilityBillsLink) |
| `PhotoLink` | `List<String>` | Optional | Photo Image of the CoApplicant | List<String> getPhotoLink() | setPhotoLink(List<String> photoLink) |
| `BureauScore` | `Integer` | Optional | Bureau Score of the CoApplicant | Integer getBureauScore() | setBureauScore(Integer bureauScore) |
| `BureauReportLink` | `List<String>` | Optional | CoApplicant&#39;s Bureau Report PDF | List<String> getBureauReportLink() | setBureauReportLink(List<String> bureauReportLink) |
| `PartnerScoreOnTheCoapplicant` | `Integer` | Optional | Score Captured by the Partner | Integer getPartnerScoreOnTheCoapplicant() | setPartnerScoreOnTheCoapplicant(Integer partnerScoreOnTheCoapplicant) |

## Example (as JSON)

```json
{
  "relationship_with_applicant": null,
  "first_name": null,
  "middle_name": null,
  "last_name": null,
  "gender": null,
  "date_of_birth": null,
  "age": null,
  "mobile_number": null,
  "email": null,
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
  "annual_income": null,
  "income_proof_link": null,
  "bank_statement_12_months_link": null,
  "pan_number": null,
  "pan_link": null,
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
  "bureau_score": null,
  "bureau_report_link": null,
  "partner_score_on_the_coapplicant": null
}
```

