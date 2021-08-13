
# Clients Api Loans Disburse Request

## Structure

`ClientsApiLoansDisburseRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DisbursementDate` | `LocalDate` | Optional | Disbursement date to the end customer | LocalDate getDisbursementDate() | setDisbursementDate(LocalDate disbursementDate) |
| `FirstRepaymentDate` | `LocalDate` | Optional | First repayment date as per repayment schedule | LocalDate getFirstRepaymentDate() | setFirstRepaymentDate(LocalDate firstRepaymentDate) |
| `InstrumentNumber` | `String` | Optional | UTR / Cheque Number | String getInstrumentNumber() | setInstrumentNumber(String instrumentNumber) |
| `InstrumentType` | `String` | Optional | RTGS / NEFT / UPI / Cheque | String getInstrumentType() | setInstrumentType(String instrumentType) |
| `LoanAmount` | `Double` | Optional | - | Double getLoanAmount() | setLoanAmount(Double loanAmount) |
| `SanctionAmount` | `Double` | Optional | - | Double getSanctionAmount() | setSanctionAmount(Double sanctionAmount) |
| `DifferentialInterestStartDate` | `LocalDate` | Optional | PreEMI Interest Due Date | LocalDate getDifferentialInterestStartDate() | setDifferentialInterestStartDate(LocalDate differentialInterestStartDate) |
| `DifferentialInterest` | `Double` | Optional | Broken Period Interest Amount (in Rupees) | Double getDifferentialInterest() | setDifferentialInterest(Double differentialInterest) |
| `ProcessingFee` | `Double` | Optional | Processing Fee (Inclusive of GST) | Double getProcessingFee() | setProcessingFee(Double processingFee) |
| `StampDuty` | `Double` | Optional | - | Double getStampDuty() | setStampDuty(Double stampDuty) |
| `InsurancePremiumAmount` | `Double` | Optional | Insurance Premium (Inclusive of GST) | Double getInsurancePremiumAmount() | setInsurancePremiumAmount(Double insurancePremiumAmount) |
| `DocumentationFee` | `Double` | Optional | Documentation Charges (Inclusive of GST) | Double getDocumentationFee() | setDocumentationFee(Double documentationFee) |
| `OtherCharges` | `Double` | Optional | Any Other Charges (Inclusive of GST) | Double getOtherCharges() | setOtherCharges(Double otherCharges) |
| `NetDisbursedAmount` | `Double` | Optional | - | Double getNetDisbursedAmount() | setNetDisbursedAmount(Double netDisbursedAmount) |
| `PennyTestStatus` | `Boolean` | Optional | - | Boolean getPennyTestStatus() | setPennyTestStatus(Boolean pennyTestStatus) |
| `PennyTestReportLink` | `List<String>` | Optional | - | List<String> getPennyTestReportLink() | setPennyTestReportLink(List<String> pennyTestReportLink) |

## Example (as JSON)

```json
{
  "disbursement_date": null,
  "first_repayment_date": null,
  "instrument_number": null,
  "instrument_type": null,
  "loan_amount": null,
  "sanction_amount": null,
  "differential_interest_start_date": null,
  "differential_interest": null,
  "processing_fee": null,
  "stamp_duty": null,
  "insurance_premium_amount": null,
  "documentation_fee": null,
  "other_charges": null,
  "net_disbursed_amount": null,
  "penny_test_status": null,
  "penny_test_report_link": null
}
```

